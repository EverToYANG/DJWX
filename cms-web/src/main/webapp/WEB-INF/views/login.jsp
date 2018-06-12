<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/common/css/login.css">

<!--[if IE]>
    <link rel="stylesheet" type="text/css" href="https://res.wx.qq.com/mpres/htmledition/style/wxm_ie1c6cc2.css"/>
  <![endif]-->
<title>党建服务平台</title>
<script type="text/javascript">
if(window !=top){  
    top.location.href=location.href;  
}  
</script>
</head>
<body>
	<div id="header">
		<div class="wrapper1">
			<a href="#" class="dib"><h1><font style="color: #000000">个性化建站</font></h1><!-- <img src="./login/logo.png"> --></a>
			<span class="hd_login_info"> </span>
		</div>
	</div>
	<div id="banner">
		<div class="wrapper">
			<div class="login-panel">
				<h3>登录</h3>
				<div class="login-mod">
					<c:if test="${not empty error }">
					<div id="err_area" class="login-err-panel" >
						<span class="icon-wrapper">
						<i class="icon24-login err" style="margin-top: -.2em; *margin-top: 0;"></i>&nbsp;&nbsp;&nbsp;&nbsp;</span>
						<span id="err_tips">${error}</span>
					</div>
					</c:if>

					<form class="login-form" id="login-form" action="${pageContext.request.contextPath}/loginvalid.do"  method="post" >
						<div class="login-un">
							<span class="icon-wrapper"><i class="icon24-login un"></i></span>
							<input type="text" id="username" name="username"
								placeholder="登陆账号" value="<shiro:principal/>" autocomplete="off" >
						</div>
						<div class="login-pwd">
							<span class="icon-wrapper"><i class="icon24-login pwd"></i></span>
							<input type="password" id="password" name="password" placeholder="密码" value="" autocomplete="off">
						</div>
					
					<div class="login-code-panel" id="verify_area">
						<input type="text" id="captcha" name="captcha"
							style="width: 70px" maxlength="6" placeholder="验证码" value=""> 
						<img id="kaptchaImage" src="${pageContext.request.contextPath}/kaptcha.do"
							title="点击重新获取验证码" style="cursor: hand;vertical-align: middle;height: 30px;"
							onclick="this.src='${pageContext.request.contextPath}/kaptcha.do?date='+new Date();"
							/>
					</div>

					<div class="login-help-panel">
						<input id="RememberMe" class="login-remember-pwd" type="checkbox" name="rememberMe" onclick="RememberMeClick()" checked="checked"/>
						记住帐号
					</div>


					<div class="login-btn-panel">
						<button class="login-btn" title="点击登录" type="submit"  id="login_button">登录</button>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<span>Copyright&nbsp;© 2013-2014 甘肃中通申信科技有限公司. All Rights Reserved.</span>
	</div>
	<script src="${pageContext.request.contextPath}/static/common/js/jquery-1.7.2.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/cookie.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/login.js"></script>
	<script type="text/javascript">
	function changeCode() {  
	    $('#kaptchaImage').hide().attr('src', '/kaptcha.htm?' + Math.floor(Math.random()*100) ).fadeIn();  
	    event.cancelBubble=true;  
	}  
	</script>
</body>
</html>