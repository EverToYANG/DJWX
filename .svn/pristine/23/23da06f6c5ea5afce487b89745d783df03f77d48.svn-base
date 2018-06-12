package com.gsccs.cms.controller.member;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.WxMpUserService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.chanjar.weixin.mp.bean.result.WxMpUserList;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.bass.utils.MD5;
import com.gsccs.cms.bass.utils.Pager;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.service.MemberService;
import com.gsccs.cms.member.service.MembergroupService;
import com.gsccs.cms.member.service.PartyUserService;
import com.gsccs.cms.weixin.model.WxApp;
import com.gsccs.cms.weixin.service.WxAppService;

/**
 * 会员相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("/member")
public class MemberController extends CmsBaseController {

	@Resource
	private MemberService memberService;
	@Resource
	private PartyUserService partyMemberService;
	@Resource
	private MembergroupService membergroupService;
	@Autowired
	private UserService userService;
	@Resource
	private WxMpConfigStorage wxMpConfigStorage;
	@Resource
	private WxAppService wxAppService;
	

	@RequestMapping("/follow.do")
	public String followUsers(String appid,ModelMap map) {
		
		if (StringUtils.isEmpty(appid)) {
			map.put("msg", "无权限操作，请用公众号管理员帐号登录");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		
		WxApp wxApp = wxAppService.findById(appid);
		if (null==wxApp || wxApp.getStatus().equals("0")){
			map.put("msg", "公众账号关闭,请联系系统管理员");
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			return "admin/msg";
		}
		
		wxMpConfigStorage.init(appid);
		WxMpService wxMpService = new WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

		WxMpUserService wxMpUserService = null;
		try {
			wxMpUserService = wxMpService.getUserService();
			WxMpUserList wxMpUserList = wxMpUserService.userList(null);
			List<String> openids = wxMpUserList.getOpenIds();
			if (null != openids && openids.size() > 0) {
				for (String openid : openids) {
					WxMpUser wxMpUser = wxMpUserService.userInfo(
							openid, null);
					Member member = new Member();
					member.setId(openid);
					member.setName(wxMpUser.getNickname());
					member.setSex(wxMpUser.getSex());
					member.setWxappid(appid);
					member.setImg(wxMpUser.getHeadImgUrl());
					memberService.add(member);
				}
			}
			map.put("msg", "会员同步成功");
		} catch (WxErrorException e) {
			map.put("msg", "会员同步失败:"+e.getLocalizedMessage());
		}
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}

	/**
	 * 列表
	 * 
	 * @return
	 */
	@RequestMapping("/list.do")
	public String memberList(Member member,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(defaultValue = " ") String order, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		
		Subject subject = SecurityUtils.getSubject();
		if (!subject.hasRole(AuthConst.SYS_ADMIN)) {
			member.setWxappid(getWxApp().getId());
		} 
		List<Member> memberList = memberService.find(member, order, currPage,
				pageSize);
		int totalCount = memberService.count(member);
		Pager pager = new Pager(request);
		pager.appendParam("name");
		pager.appendParam("wxappid");
		pager.appendParam("isok");
		pager.appendParam("pageSize", "" + pageSize);
		pager.appendParam("pageFuncId");
		pager.setCurrPage(currPage);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		pager.setOutStrBootstrap("list.do");
		map.put("pageStr", pager.getOutStrBootstrap());
		map.put("list", memberList);
		map.put("order", order);
		return "member/list";
	}

	/**
	 * 设置管理员
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/setmanager.do")
	public String memberEdit(String id, ModelMap map,
			HttpServletRequest request, HttpServletResponse response) {
		Member member = null;
		PartyMember partyMember = null;
		if (StringUtils.isNotEmpty(id)) {
			member = memberService.findById(id);
			if (null == member || StringUtils.isEmpty(member.getWxappid())){
				msg = "操作失败,会员信息有误!" ;
				map.put("msg", msg);
				map.put("isCloseWindow", true);
				map.put("isRefresh", true);
				return "admin/msg";
			}
			
			if (StringUtils.isEmpty(member.getRealid())){
				msg = "操作失败,会员未认证，不能作为管理员!" ;
				map.put("msg", msg);
				map.put("isCloseWindow", true);
				map.put("isRefresh", true);
				return "admin/msg";
			}
			
			Users user = userService.findById(member.getId());
			if (null != user){
				msg = "操作失败，会员已设置为管理员!" ;
				map.put("msg", msg);
				map.put("isCloseWindow", true);
				map.put("isRefresh", true);
				return "admin/msg";
			}
			partyMember = partyMemberService.findById(member.getRealid());
		}
		map.put("member", member);
		map.put("partyMember", partyMember);
		return "member/setmanager";
	}

	

	/**
	 * 设置管理员
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/isManager.do")
	public String isManager(Users user, String pageFuncId, 
			ModelMap map, HttpServletRequest request,
			HttpServletResponse response) {
		if (null == user) {
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
			msg = "操作失败,信息有误";
			return "admin/msg";
		}
			
		try {
			user.setPwd(MD5.MD5(user.getPwd()));
			user.setIsok("1");
			userService.save(user);
			msg = "操作成功!";
			map.put("isCloseWindow", true);
			map.put("isRefresh", true);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("forwardSeconds", 0);
			msg = "操作失败:" + e.toString() + "!";
		}
		map.put("msg", msg);
		map.put("isCloseWindow", true);
		map.put("isRefresh", true);
		return "admin/msg";
	}
	
	
	
	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/del.do")
	public String memberDel(String pageFuncId, String ids,
			HttpServletRequest request, ModelMap map,
			HttpServletResponse response) {
		if (ids != null && ids.trim().length() > 0) {
			String[] idArr = ids.split(";");
			if (idArr != null && idArr.length > 0) {
				Member member;
				for (int i = 0; i < idArr.length; i++) {
					if (idArr[i].trim().length() > 0) {
						member = memberService.findById(idArr[i]);
						if (member != null) {
							try {
								memberService.del(idArr[i]);
								operlogService.log(getLoginName(), "删除会员成功:"
										+ member.getId(), request);
							} catch (Exception e) {
								operlogService.log(
										getLoginName(),
										"删除会员失败:" + member.getId() + " "
												+ e.getMessage(), request);
							}
						}
					}
				}
			}
		}
		map.put("msg", "操作成功");
		map.put("forwardUrl", "member/list.do?pageFuncId=" + pageFuncId);
		map.put("forwardSeconds", 3);
		return "admin/msg";
	}

	/**
	 * 日期型数据转换，将页面上的表示日期限的字符串，转换为Date型
	 * **/
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}
}
