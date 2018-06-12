package com.gsccs.cms.bass.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;

/**
 * 字符串处理标签
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class StringTag extends BaseTag {

	private String str = "";// 字符串内容

	private int len = 10;// 字符串显示长度

	public int doStartTag() throws JspException {
		if (str != null && str.trim().length() > 0) {
			if (str.length() > len) {
				str = str.substring(0, len);
			}
			try {
				pageContext.getOut().println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this.SKIP_BODY;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
