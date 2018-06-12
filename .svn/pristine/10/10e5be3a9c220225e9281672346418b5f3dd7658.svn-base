<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<div class="wrapper1" style="margin-left:0px;">
			<a href="#" class="dib"><h1><font style="color: #DF0404">“O2O”党建微信服务平台</font></h1><!-- <img src="./login/logo.png"> --></a>
			<span class="hd_login_info"> </span>
		</div>
	</div>
	<div id="banner">
		<div class="wrapper">
			<div class="login-panel">
				<h3>登录</h3>
				<div class="login-mod">
					<div class="login-err-panel dn" id="err_area">
						<span class="icon-wrapper">
						<i class="icon24-login err" style="margin-top: -.2em; *margin-top: 0;"></i>&nbsp;&nbsp;&nbsp;&nbsp;</span>
						<span id="err_tips"></span>
					</div>

					<form class="login-form" id="login-form" method="post" action="${pageContext.request.contextPath}/login.do" onsubmit="return submitForm();">
						<div class="login-un">
							<span class="icon-wrapper"><i class="icon24-login un"></i></span>
							<input type="text" id="username" name="username" maxlength="20"
								placeholder="登陆账号" autocomplete="off" >
						</div>
						<div class="login-pwd">
							<span class="icon-wrapper"><i class="icon24-login pwd"></i></span>
							<input type="password" id="password" name="password" placeholder="密码" value="" autocomplete="off" maxlength="50">
						</div>
						
						<div class="login-code-panel" id="verify_area">
							<input type="text" id="captcha" name="captcha"
								style="width: 70px" placeholder="验证码" value="" maxlength="4"> 
							<img id="kaptchaImage" src="${pageContext.request.contextPath}/kaptcha.do"
								title="点击重新获取验证码" style="cursor: hand;vertical-align: middle;height: 40px;"
								onclick="this.src='${pageContext.request.contextPath}/kaptcha.do?date='+new Date();"
								/>
						</div>
	
						<div class="login-help-panel">
							<input id="RememberMe" class="login-remember-pwd" type="checkbox" name="rememberMe" onclick="RememberMeClick()" checked="checked"/>
							记住帐号
						</div>
	
						<div class="login-btn-panel">
							<button type="submit" class="login-btn" title="点击登录" id="login_button">登录</button>
						</div>
						
					</form>
					
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<span>Copyright&nbsp;© 2013-2016 甘肃中通申信科技有限公司. All Rights Reserved.</span>
	</div>
	<script src="${pageContext.request.contextPath}/static/common/js/jquery-1.7.2.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/cookie.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/login.js"></script>
	<script type="text/javascript">
	var error="${param.error}";
	if (error != ""){
		$("#err_area").removeClass("dn");
		$("#err_tips").html(error); 
	}
	</script>
</body>
</html>