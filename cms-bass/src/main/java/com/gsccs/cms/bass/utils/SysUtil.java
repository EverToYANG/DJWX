package com.gsccs.cms.bass.utils;

import org.springframework.web.context.WebApplicationContext;

/**
 * 系统工具类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class SysUtil {

	/**
	 * SPRING上下文
	 * */
	public static WebApplicationContext wac;

	/**
	 * 获取上下文目录
	 * 
	 * @return
	 */
	public static String getContextPath() {
		if (wac != null) {
			return wac.getServletContext().getContextPath();
		}
		return "";
	}
}
