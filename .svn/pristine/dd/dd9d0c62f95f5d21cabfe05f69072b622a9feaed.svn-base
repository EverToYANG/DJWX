package com.gsccs.cms.controller.auth;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.ConfigService;
import com.gsccs.cms.auth.service.OperlogService;
import com.gsccs.cms.auth.shiro.annotation.CurrentUser;
import com.gsccs.cms.bass.controller.BaseController;
import com.gsccs.cms.bass.exception.AuthException;
import com.gsccs.cms.bass.exception.SiteCheckException;

/**
 * 系统配置管理相关操作
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller
@RequestMapping("/sysmg")
public class ConfigController extends BaseController {

	@Resource
	private ConfigService configService;
	@Resource
	private OperlogService operlogService;

	/**
	 * 系统配置管理页面
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/config.do")
	public String config(ModelMap map) throws AuthException {
		// 提取所有系统配置项目
		map.put("list", configService.find());
		return "sysmg/config";
	}

	/**
	 * 系统配置处理
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/configDo.do")
	public String configDo(@CurrentUser Users user,String pageFuncId, ModelMap map,
			HttpServletRequest request) throws 
			AuthException, SiteCheckException {
		String msg = "";
		try {
			Enumeration<String> paramNames = request.getParameterNames();
			while (paramNames.hasMoreElements()) {
				String paramName = (String) paramNames.nextElement();
				// 更新配置项
				configService
						.update(paramName, request.getParameter(paramName));
			}
			// 更新application中的配置
			setConfig();
			msg = "更新系统配置成功!";
			map.put("forwardSeconds", 3);
		} catch (Exception e) {
			msg = "更新系统配置失败:" + e.getMessage();
			map.put("forwardSeconds", 0);
		}
		operlogService.log(user.getLoginname(), msg, request);
		map.put("msg", msg);
		map.put("forwardUrl", "config.do?pageFuncId=" + pageFuncId);
		return "admin/msg";
	}
}
