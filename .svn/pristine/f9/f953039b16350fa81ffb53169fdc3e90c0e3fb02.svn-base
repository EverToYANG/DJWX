package com.gsccs.cms.bass.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {

	public static void writeGBK(HttpServletResponse response, String content) {
		response.setContentType("text/html;charset=GBK");
		try {
			response.getWriter().print(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeUTF(HttpServletResponse response, String content) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().print(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void writeUTF(HttpServletResponse response, String content,String content2) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().print("今日访问量:"+content+";");
			response.getWriter().print("总访问量:"+content2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
