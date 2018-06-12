package com.gsccs.cms.auth.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.gsccs.cms.auth.model.Users;
import com.gsccs.cms.auth.service.UserService;
import com.gsccs.cms.auth.utils.AuthConst;

/**
 * 
 * @author x.d zhang
 * 
 */
public class SysUserFilter extends PathMatchingFilter {

	@Autowired
	private UserService userService;

	@Override
	protected boolean onPreHandle(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		String accountid = (String) subject.getPrincipal();
		Users user = userService.findById(accountid);
		session.setAttribute(AuthConst.CURRENT_USER, user);
		return true;
	}
}
