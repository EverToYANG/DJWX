package com.gsccs.cms.controller.web;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.FileUtil;
import com.gsccs.cms.bass.utils.OssConfig;
import com.gsccs.cms.bass.utils.ResponseUtil;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.course.model.Course;
import com.gsccs.cms.course.model.CourseFeed;
import com.gsccs.cms.course.model.CourseArticle;
import com.gsccs.cms.course.model.Courselog;
import com.gsccs.cms.course.service.CourseService;
import com.gsccs.cms.course.service.LearnlogService;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.service.MemberService;
import com.gsccs.cms.member.service.PartyUserService;
import com.gsccs.cms.module.service.VoteService;
import com.gsccs.cms.weixin.model.WxApp;

/**
 * 党课管理
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller("WebCourseController")
@RequestMapping("/web/{appid}")
public class WebCourseController extends CmsBaseController {

	@Resource
	private VoteService voteService;
	@Resource
	private CourseService couseService;
	@Resource
	private PartyUserService partyMemberService;
	@Autowired
	private WxMpConfigStorage wxMpConfigStorage;
	@Autowired
	private MemberService memberService;
	@Autowired
	private LearnlogService learnlogService;

	/**
	 * 党课页面
	 * 
	 * @return
	 */
	@RequestMapping("/courses.html")
	public String courses(@PathVariable String appid,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = "addtime desc") String order,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			@RequestParam(defaultValue = "own") String type, ModelMap map) {
		Member member = null;
		WxApp wxApp = null;
		List<Course> courseList = null;
		try {
			wxApp = wxAppService.findById(appid);
			if (StringUtils.isEmpty(openid)) {
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain() + "/web/courses.html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code).getOpenId();
				}
			}

			if (type.equals("all")) {
				Course param = new Course();
				courseList = couseService.find(param, order, page, pageSize);
			} else {
				courseList = couseService.findByUserid(openid, order, page,
						pageSize);
			}
			member = memberService.findById(openid);
			map.put("courseList", courseList);
			map.put("member", member);
			map.put("type", type);
			request.getSession().setAttribute("wxApp", wxApp);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		return "web/courses";
	}

	/**
	 * 党课详细页面
	 * 
	 * @return
	 */
	@RequestMapping("/course-{id}.html")
	public String courseById(@PathVariable String appid,
			@PathVariable Integer id,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid, ModelMap map) {
		List<CourseArticle> infoList = null;
		List<CourseFeed> feedList = null;
		List<PartyMember> memberList = null;
		Course course = null;
		Member member = null;
		WxApp wxApp = null;
		try {
			wxApp = wxAppService.findById(appid);
			if (StringUtils.isEmpty(openid)) {
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain() + "/web/course-" + id + ".html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code).getOpenId();
				}
			}

			course = couseService.getCourse(id);
			infoList = couseService.findInfoList(id);
			feedList = couseService.findFeedList(null, id);
			if (null != feedList && feedList.size() > 0) {
				for (CourseFeed guestbook : feedList) {
					List<CourseFeed> replyList = couseService
							.findByParid(guestbook.getId());
					guestbook.setReplyList(replyList);
				}
			}
			//公开
			if (course.getIsopen().equals("0")){
				PartyMember memberParam = new PartyMember();
				memberParam.setUnitid(course.getUnitid());
				memberList = partyMemberService.find(memberParam, "");
			}
			
			//保存访问记录
			member = memberService.findById(openid);
			if (null != member && StringUtils.isNotEmpty(member.getRealid())){
				Courselog learnlog = new Courselog();
				learnlog.setCourseid(id);
				learnlog.setMemberid(member.getRealid());
				learnlog.setCorpid(appid);
				learnlogService.add(learnlog);
			}
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		map.put("member", member);
		map.put("course", course);
		map.put("infoList", infoList);
		map.put("feedList", feedList);
		map.put("memberList", memberList);
		request.getSession().setAttribute("wxApp", wxApp);
		return "web/course";
	}

	/**
	 * 学习反馈
	 * 
	 * @return
	 */
	@RequestMapping("/fed.html")
	public void courseFed(
			@PathVariable String appid,
			CourseFeed courseFed,
			@RequestParam(value = "imgfile", required = false) MultipartFile[] imgfiles,
			ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		String msg = "";
		String imgurls = "";
		if (null == courseFed) {
			msg = "提交失败，数据有误！";
			ResponseUtil.writeUTF(response, msg);
			return;
		}
		try {
			// 新上传的附件
			if (imgfiles != null && imgfiles.length > 0) {
				MultipartFile currAttch;
				for (int i = 0; i < imgfiles.length; i++) {
					currAttch = imgfiles[i];

					if (currAttch != null && currAttch.getSize() > 0) {// 生成目标文件
						String ext = FileUtil.getExt(
								currAttch.getOriginalFilename()).toLowerCase();

						String filename = new Date().getTime() + ext;
						String filepath = OssConfig.ROOT_PATH
								+ File.separator + appid + File.separator+OssConfig.TYPE_IMAGE+ File.separator;
						File targetFile = new File(filepath
								+ filename);
						File folder = new File(filepath);
						if (!folder.exists()) {
							folder.mkdirs();
						}
						if (!targetFile.exists()) {
							targetFile.createNewFile();
						}
						// 复制到目标文件
						FileUtil.copy(currAttch, targetFile);

						// 生成访问地址
						imgurls = imgurls + "/"+OssConfig.TYPE_IMAGE+"/" + filename + ",";
					}
				}
			}

			if (StringUtils.isNotEmpty(imgurls)) {
				if (imgurls.endsWith(",")) {
					imgurls = imgurls.substring(0, imgurls.length() - 1);
				}
				courseFed.setAlbums(imgurls);
			}
			couseService.addCourseFed(courseFed);
			msg = "保存成功！";
		} catch (Exception e) {
			msg = "保存失败，未知错误！";
		}
		ResponseUtil.writeUTF(response, msg);
		return;
	}

}
