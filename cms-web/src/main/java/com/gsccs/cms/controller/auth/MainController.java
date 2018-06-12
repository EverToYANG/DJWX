package com.gsccs.cms.controller.auth;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.cms.auth.model.Func;
import com.gsccs.cms.auth.service.FuncService;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.bass.controller.CmsBaseController;
import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.core.service.ContentService;
import com.gsccs.cms.core.service.RoleSiteService;
import com.gsccs.cms.core.service.SiteService;
import com.gsccs.cms.core.service.VisitService;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.service.PartyUserService;

/**
 * 后台管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */

@Controller
public class MainController extends CmsBaseController {

	@Resource
	private FuncService funcService;
	@Resource
	private SiteService siteService;
	@Resource
	private RoleSiteService roleSiteService;
	@Resource
	private VisitService visitService;
	@Resource
	private PartyUserService partyUserService;
	@Resource
	private ContentService contentService;

	/**
	 * 管理中心
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/index")
	public String index(String pageFuncId, ModelMap map, HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		List<Func> funcList = null;
		String funcid = null;
		if (subject.hasRole(AuthConst.SYS_ADMIN)) {
			funcList = funcService.selectRoot();
		} else {
			funcList = funcService.selectRootAuth(getLoginUser().getId());
		}
		if (funcList != null && funcList.size() > 0) {
			funcid = funcList.get(0).getId();
		}

		map.put("wxapp", getWxApp());
		map.put("funcList", funcList);
		map.put("funcid", funcid);
		return "sysmg/index";
	}

	/**
	 * 管理中心 欢迎页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/main")
	public String main(String pageFuncId, ModelMap map, HttpServletResponse response) {
		// 图一数据
		PartyMember member = new PartyMember();
		int P1P1 = partyUserService.count(member);
		map.put("P1P1", P1P1);
		// 图二数据
		@SuppressWarnings("deprecation")
		int P2P1 = new Date().getDay();
		map.put("P2P1", P2P1);

		String lists = "";
		for (int i = 0; i < 7; i++) {
			Calendar calendar = Calendar.getInstance();
			Date date = new Date();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_YEAR, i - 7);
			date = calendar.getTime();
			Content info = new Content();
			info.setAddtime(date);
			lists+=contentService.count(info)+",";
		}
		map.put("P2P2", lists);
		//图三数据
		int[] ages=new int[6];
		List<PartyMember> partyMembers=partyUserService.find(member, null);
		for(PartyMember partyMember:partyMembers){
			if(StringUtils.isNotEmpty(partyMember.getIdcode())&&StringUtils.isNotEmpty(partyMember.getBirthday())){
			int ager=Integer.valueOf(partyMember.getBirthday()).intValue();
			@SuppressWarnings("deprecation")
			int today=Integer.parseInt((new Date().getYear()+1900+"")+(new Date().getMonth()+1+"")+(new Date().getDate()+""));
			int age=today-ager;
			if(age<200000)
				ages[0]+=1;
			else if(age>200000&age<300000)
				ages[1]+=1;
			else if(age>300000&age<400000)
				ages[2]+=1;
			else if(age>400000&age<500000)
				ages[3]+=1;
			else if(age>500000&age<600000)
				ages[4]+=1;
			else if(age>600000)
				ages[5]+=1;
			}
		}
		String P3P1="";
		for(int i:ages){
			P3P1+=i+",";
		}
		map.put("P3P1", P3P1);
		//图四数据
		int[] nums=new int[6];
		String P4P1="";
		PartyMember para=new PartyMember();
		para.setEdu("大学");
		nums[0]=partyUserService.count(para);
		para.setEdu("大专");
		nums[1]=partyUserService.count(para);
		para.setEdu("普通高中");
		nums[2]=partyUserService.count(para);
		para.setEdu("初中 ");
		nums[3]=partyUserService.count(para);
		para.setEdu("小学");
		nums[4]=partyUserService.count(para);
		para.setEdu(null);
		nums[5]=partyUserService.count(para)-nums[0]-nums[1]-nums[2]-nums[3]-nums[4];
		for(int i:nums){
			P4P1+=i+",";
		}
		map.put("P4P1", P4P1);
		return "sysmg/main";
	}

	/**
	 * 管理中心 头部
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/head.do")
	public String head(String pageFuncId, ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		// 如果有pageFuncId参数，处理导航
		if (StringUtils.isNotEmpty(pageFuncId)) {
			map.put("funcNav", funcService.getPars(request.getSession(), pageFuncId, null));
			map.put("pageFuncId", pageFuncId);
		}
		return "admin/inc/head";
	}

	/**
	 * 管理中心 菜单
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/menu.do")
	public String menu(String funcid, ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		List<Func> funcList = new ArrayList<Func>();
		if (funcid == null || funcid.trim().length() == 0) {
			if (session.getAttribute("funcid") != null
					&& StringUtils.isNotEmpty(session.getAttribute("funcid").toString())) {
				funcid = session.getAttribute("funcid").toString();
			} else {
				// 设置为第一个根菜单
				// 提取一级菜单
				if (subject.hasRole(AuthConst.SYS_ADMIN)) {
					funcList = funcService.selectRoot();
				} else {
					funcList = funcService.selectRootAuth(getLoginUser().getId());
				}
				if (funcList != null && funcList.size() > 0) {
					funcid = funcList.get(0).getId();
				}
			}
		}
		session.setAttribute("funcid", funcid);
		// 提取权限并放到session中
		if (session.getAttribute("funcs") != null) {
			funcList = (List<Func>) session.getAttribute("funcs");
		} else {
			if (subject.hasRole(AuthConst.SYS_ADMIN)) {
				funcList = funcService.selectAll("1");
			} else {
				funcList = funcService.selectAllAuth(getLoginUser().getId());
			}
			if (funcList != null && funcList.size() > 0) {
				for (int i = 0; i < funcList.size(); i++) {
					if (funcService.haveSon(funcList.get(i).getId())) {
						funcList.get(i).setHasChildren("1");
					}
				}
			}
			session.setAttribute("funcs", funcList);
		}
		map.put("func", funcService.selectById(funcid));
		map.put("menuTree", funcService.createTree(request, funcid, funcList));
		return "sysmg/menu";
	}

	@ResponseBody
	@RequestMapping("/func_json.do")
	public List<Func> menujson(String funcid, ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		List<Func> funcList = new ArrayList<Func>();
		Subject subject = SecurityUtils.getSubject();
		if (StringUtils.isEmpty(funcid)) {
			// 提取一级菜单
			if (subject.hasRole(AuthConst.SYS_ADMIN)) {
				funcList = funcService.selectRoot();
			} else {
				funcList = funcService.selectRootAuth(getLoginUser().getId());
			}
			funcid = funcList.get(0).getId();
		} else {
			if (subject.hasRole(AuthConst.SYS_ADMIN)) {
				funcList = funcService.selectAll("1");
			} else {
				funcList = funcService.selectAllAuth(getLoginUser().getId());
			}
		}
		List<Func> userMenu = funcService.createTree(funcid, funcList);
		return userMenu;
	}
}
