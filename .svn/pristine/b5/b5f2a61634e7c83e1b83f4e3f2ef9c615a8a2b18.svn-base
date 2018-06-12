package com.gsccs.cms.bass.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.ConfigService;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.utils.AuthConst;
import com.gsccs.cms.core.model.Site;
import com.gsccs.cms.core.service.ChannelService;
import com.gsccs.cms.core.service.ContentService;
import com.gsccs.cms.core.service.SiteService;
import com.gsccs.cms.weixin.model.WxApp;
import com.gsccs.cms.weixin.service.WxAppService;

/**
 * 控制器父类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class CmsBaseController extends BaseController {

	@Resource
	protected OperlogService operlogService;
	@Resource
	protected ConfigService configService;
	@Resource
	protected ChannelService channelService;
	@Resource
	protected ContentService contentService;
	@Resource
	protected SiteService siteService;
	@Resource
	protected WxAppService wxAppService;
	
	
	/**
	 * 获取当前管理应用
	 * 
	 * @return
	 */
	public WxApp getWxApp() {
		WxApp wxApp = new WxApp();
		if (session.getAttribute(AuthConst.CURRENT_WXAPP) != null) {
			// 获取当前WXAPP
			wxApp = (WxApp) session.getAttribute(AuthConst.CURRENT_WXAPP);
		}else{
			Subject subject = SecurityUtils.getSubject();
			String accountid = (String) subject.getPrincipal();
			Users users = userService.findById(accountid);
			wxApp = wxAppService.findById(users.getCorpid());
			session.setAttribute(AuthConst.CURRENT_WXAPP, wxApp);
		}
		return  wxApp;
	}

	
	/**
	 * 获取配置
	 * 
	 * @return
	 */
	public Map<String, Object> getConfig() {
		if (getApplication().getAttribute("config") != null) {
			return (Map<String, Object>) getApplication()
					.getAttribute("config");
		} else {
			// 重新生成
			return setConfig();
		}
	}

	/**
	 * 获取配置值
	 * 
	 * @return
	 */
	public String getConfigVal(String name) {
		Map<String, Object> config = getConfig();
		if (config != null && config.get(name) != null) {
			return config.get(name).toString();
		}
		return "";
	}

	/**
	 * 设置静态化参数
	 * 
	 * @param data
	 */
	public void setData(Map<String, Object> data, Site site) {
		// 传递site参数
		data.put("site", site);
		data.put("contextPath", getContextPath());
		data.put("contextPathNo", getContextPathNo());
		data.put("request_remoteAddr", request.getRemoteAddr());
		// 获取参数并放入data
		Enumeration<String> paramNames = request.getParameterNames();
		if (paramNames != null && paramNames.hasMoreElements()) {
			String name;
			while (paramNames.hasMoreElements()) {
				name = paramNames.nextElement();
				if (name != null && !name.equals("site")
						&& !name.equals("contextPath")
						&& !name.equals("currChannelid")
						&& !name.equals("currInfoid")) {
					data.put(name, request.getParameter(name));
				}
			}
		}
		
		// 获取seesion中存放的变量
		Enumeration<String> sessionNames = session.getAttributeNames();
		if (sessionNames != null && sessionNames.hasMoreElements()) {
			String name;
			while (sessionNames.hasMoreElements()) {
				name = sessionNames.nextElement();
				if (name != null) {
					// session变量名称改为session_变量名，避免重名
					data.put("session_" + name, session.getAttribute(name));
				}
			}
		}
	}
}
