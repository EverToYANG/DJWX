package com.gsccs.cms.controller.web;

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

import com.gsccs.cms.bass.utils.ResponseUtil;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.model.PartyMember;
import com.gsccs.cms.member.service.MemberService;
import com.gsccs.cms.member.service.MembergroupService;
import com.gsccs.cms.member.service.PartyUserService;
import com.gsccs.cms.module.model.Collect;
import com.gsccs.cms.module.service.CollectService;
import com.gsccs.cms.weixin.model.WxApp;
import com.gsccs.cms.weixin.service.WxAppService;

/**
 * 会员相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Controller("WebMemberController")
@RequestMapping("/web/{appid}")
public class WebMemberController {

	@Resource
	private MemberService memberService;
	@Resource
	private WxAppService wxAppService;
	@Resource
	private MembergroupService membergroupService;
	@Resource
	private PartyUserService partyMemberService;
	@Autowired
	private WxMpConfigStorage wxMpConfigStorage;
	@Autowired
	private CollectService collectService;
	

	
	/**
	 * 会员中心
	 * 
	 * @return
	 */
	@RequestMapping("/home.html")
	public String home(@PathVariable String appid,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			ModelMap map,HttpServletRequest request) {
		Member member = null;
		PartyMember partyMember = null;
		WxApp wxApp = null;
		List<Collect> collectList = null;
		try {
			wxApp = wxAppService.findById(appid);
			if (StringUtils.isEmpty(openid)){
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain() + "/web/home.html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code)
							.getOpenId();
				}
			}
			member = memberService.findById(openid);
			if (null != member && StringUtils.isNotEmpty(member.getRealid())){
				partyMember = partyMemberService.findById(member.getRealid());
			}
			Collect collectparam = new Collect();
			collectparam.setSiteid(appid);
			collectparam.setMemberid(openid);
			collectList = collectService.find(collectparam, "addtime desc", 1, 5);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		map.put("member", member);
		map.put("partyMember", partyMember);
		map.put("wxApp", wxApp);
		map.put("collectList", collectList);
		return "web/home";
	}

	
	/**
	 * 会员认证
	 * 
	 * @return
	 */
	@RequestMapping("/auth.html")
	public String auth(@PathVariable String appid, 
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			ModelMap map,
			HttpServletRequest request) {
		Member member = null;
		WxApp wxApp = null;
		try {
			wxApp = wxAppService.findById(appid);
			if (StringUtils.isEmpty(openid)){
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain()  + "/web/auth.html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code)
							.getOpenId();
				}
			}
			member = memberService.findById(openid);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		map.put("member", member);
		return "web/auth";
	}
	
	/**
	 * 会员认证
	 * 
	 * @return
	 */
	@RequestMapping("/authDo.html")
	public String memberAuthDo(@PathVariable String appid,String openid, String phone,String idcode,String authtype,
			HttpServletResponse response) {
		String msg="";
		WxApp wxApp = wxAppService.findById(appid);;
		if (StringUtils.isEmpty(openid)){
			String redirectURI = wxApp.getDomain()  + "/web/auth.html";
			return "redirect:" + redirectURI;
		}
		
		List<PartyMember> list = null;
		if (authtype.equals("1")){
			PartyMember param = new PartyMember();
			param.setPhone(phone);
			list = partyMemberService.find(param, "");
		} else{
			PartyMember param = new PartyMember();
			param.setIdcode(idcode);
			list = partyMemberService.find(param, "");
		}
		
		if (null == list || list.size()<=0){
			//认证失败，未找到人员信息
			msg = "认证失败，未找到人员信息";
		}
		
		if (list.size()>1){
			//认证失败，该手机号码已绑定
			msg = "认证失败，该手机号码已绑定";
		}
		
		if (list.size()==1){
			//认证成功
			Member member = memberService.findById(openid);
			member.setRealid(list.get(0).getId());
			memberService.update(member);
			msg = "认证成功";
		}
		ResponseUtil.writeUTF(response, msg);
		return null;
	}
	
}
