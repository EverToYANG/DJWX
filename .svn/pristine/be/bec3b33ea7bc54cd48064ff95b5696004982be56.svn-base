package com.gsccs.cms.bass.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TagSupport;

import com.gsccs.cms.auth.model.Users;

/**
 * 标签公用
 * 
 * @author x.d zhang
 * @version 1.0
 */
public class BaseTag extends TagSupport {

	public HttpServletRequest getRequest() {
		return (HttpServletRequest) pageContext.getRequest();
	}

	public HttpSession getSession() {
		return getRequest().getSession();
	}

	/**
	 * 获取session中的当有登录用户
	 * 
	 * @return
	 */
	public Users getLoginUser() {
		if (getSession().getAttribute("loginAdmin") != null) {
			return (Users) getSession().getAttribute("loginAdmin");
		}
		return null;
	}

	/**
	 * 获取session中的当有登录用户名
	 * 
	 * @return
	 */
	public String getLoginName() {
		if (getLoginUser() != null) {
			return getLoginUser().getLoginname();
		}
		return "";
	}
}