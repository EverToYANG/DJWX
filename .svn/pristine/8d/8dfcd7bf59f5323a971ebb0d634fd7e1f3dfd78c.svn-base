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

import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.core.model.Channel;
import com.gsccs.cms.core.model.Content;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.service.ChannelService;
import com.gsccs.cms.core.service.ContentService;
import com.gsccs.cms.core.service.SiteService;
import com.gsccs.cms.member.model.Member;
import com.gsccs.cms.member.service.MemberService;
import com.gsccs.cms.module.service.CollectService;
import com.gsccs.cms.weixin.model.WxApp;
import com.gsccs.cms.weixin.service.WxAppService;

/**
 * 关于站点的相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 * nginx zzb.pcdjw.cn 映射到 http://127.0.0.1/web/{wxappid}/
 * 
 */

@Controller("WebSiteController")
@RequestMapping("/web/{appid}")
public class WebSiteController extends BaseController {

	@Resource
	private SiteService siteService;
	@Resource
	private ChannelService channelService;
	@Resource
	private ContentService contentService;
	@Resource
	private MemberService memberService;
	@Resource
	private CollectService collectService;
	@Autowired
	private WxMpConfigStorage wxMpConfigStorage;
	@Autowired
	private WxAppService wxAppService;

	/**
	 * 站点预览
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/site.html")
	public String index(@PathVariable String appid,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			ModelMap map,
			HttpServletRequest request) {
		Member member = null;
		Site site = null;
		WxApp wxApp = null;
		try {
			site = siteService.findById(appid);
			wxApp = wxAppService.findById(appid);
			if (StringUtils.isEmpty(openid)) {
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = site.getSitedomain() + "/web/site.html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code).getOpenId();
				}
			}
			member = memberService.findById(openid);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		
		request.getSession().setAttribute("wxApp", wxApp);
		map.put("member", member);
		map.put("site", site);
		map.put("wxApp", wxApp);
		return "web/index";
	}

	/**
	 * 栏目页
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/c-{id}.html")
	public String channel(@PathVariable String appid,
			@PathVariable Long id,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			@RequestParam(defaultValue = "addtime desc") String order,
			ModelMap map,
			HttpServletResponse response) {
		Member member = null;
		Site site = null;
		Channel channel = null;
		List<Content> infoList = null;
		WxApp wxApp = null;
		try {
			site = siteService.findById(appid);
			wxApp = wxAppService.findById(appid);
			site = siteService.findById(appid);
			if (StringUtils.isEmpty(openid)) {
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain() + "/web/c-"
							+ id + ".html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code).getOpenId();
				}
			}
			member = memberService.findById(openid);
			channel = channelService.findById(id);
			Content param = new Content();
			param.setChannel(id);
			param.setSite(appid);
			infoList = contentService.find(param, order, 1,
					Integer.MAX_VALUE);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		map.put("site", site);
		map.put("channel", channel);
		map.put("infoList", infoList);
		map.put("member", member);
		request.getSession().setAttribute("wxApp", wxApp);
		return "web/channel";
	}

	/**
	 * 栏目页
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/clist-{channelid}.html")
	public String channelList(@PathVariable String appid,
			@PathVariable Integer channelid, ModelMap map,
			HttpServletResponse response) {
		return "web/channel";
	}

	/**
	 * 信息页
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/i-{id}.html")
	public String info(@PathVariable String appid,
			@PathVariable Long id,
			@RequestParam(defaultValue = "") String code,
			@RequestParam(defaultValue = "") String openid,
			ModelMap map,
			HttpServletResponse response) {
		Site site = null;
		Channel channel = null;
		Member member = null;
		Content content = null;
		WxApp wxApp = null;
		try {
			site = siteService.findById(appid);
			wxApp = wxAppService.findById(appid);
			site = siteService.findById(appid);
			if (StringUtils.isEmpty(openid)) {
				wxMpConfigStorage.init(appid);
				WxMpService wxMpService = new WxMpServiceImpl();
				wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

				if (StringUtils.isEmpty(code)) {
					String redirectURI = wxApp.getDomain() + "/web/i-"
							+ id + ".html";
					String authurl = wxMpService.oauth2buildAuthorizationUrl(
							redirectURI, WxConsts.OAUTH2_SCOPE_BASE, null);
					return "redirect:" + authurl;
				} else {
					openid = wxMpService.oauth2getAccessToken(code).getOpenId();
				}
			}
			member = memberService.findById(openid);
			content = contentService.findById(id);
			channel = channelService.findById(content.getChannel());
			request.getSession().setAttribute("wxApp", wxApp);
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
		map.put("site", site);
		map.put("channel", channel);
		map.put("member", member);
		map.put("content", content);
		
		return "web/info";
	}
}
