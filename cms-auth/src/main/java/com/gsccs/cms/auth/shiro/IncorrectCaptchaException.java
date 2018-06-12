package com.gsccs.cms.auth.shiro;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 验证码错误自定义异常类
 * 
 * @author x.d zhang
 * @version V1.0
 */
public class IncorrectCaptchaException extends AuthenticationException {
	private static final long serialVersionUID = -1313703243328340861L;

	public IncorrectCaptchaException() {
		super();
	}

	public IncorrectCaptchaException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectCaptchaException(String message) {
		super(message);
	}

	public IncorrectCaptchaException(Throwable cause) {
		super(cause);
	}
}
