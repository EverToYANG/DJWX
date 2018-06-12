package com.gsccs.cms.auth.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 类功能说明 TODO:自定义Token
 * 
 * @author x.d zhang
 * @version V2.0
 */

public class UserPwdCaptchaToken extends UsernamePasswordToken {
	private static final long serialVersionUID = -3217596468830869181L;
	private String captcha;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public UserPwdCaptchaToken(String username, String password, String captcha) {
		super(username, password);
		this.captcha = captcha;
	}

	public UserPwdCaptchaToken() {
		super();
	}
}
