package com.gsccs.cms.bass.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 初始化Spring bean 容器
 * @author x.d zhang
 *
 */
public class InitServlet extends HttpServlet {

	public void init() throws ServletException {
		// 存入spring上下文
		if (SysUtil.wac == null){
			SysUtil.wac = WebApplicationContextUtils
					.getWebApplicationContext(this.getServletContext());
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.init();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
