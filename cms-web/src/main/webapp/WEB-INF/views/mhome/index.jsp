<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>CMS 会员中心</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >

    <style type="text/css">
      body {
        padding-top: 42px;
        padding-bottom: 0px;
  		background-color: #f5f5f5;
      }

    </style>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="${pageContext.request.contextPath}/member/index.do">FreeCMS 会员中心</a>
          <div class="nav-collapse collapse">
          <ul class="nav pull-right">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-white icon-user"></i> ${loginMember.loginname } <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#" onclick="func('profile.do')">个人资料</a></li>
                <li><a href="#" onclick="func('pwd.do')">密码设置</a></li>
                <li class="divider"></li>
                <li><a href="${pageContext.request.contextPath}/mlogout.do">退 出</a></li>
              </ul>
            </li>
          </ul>
          </div><!--/.nav-collapse -->
                
        </div>
      </div>
    </div>
    <center>
    <table width="99%" align="center">
    <tr>
    <td width="250">
	<iframe id="menuFrame" name="menuFrame" src="menu.do" width="99%" height="500" framespacing="0" border="false" frameborder="0" scrolling="auto"></iframe>
    </td>
    <td width="10">
	<iframe id="separatorFrame" name="separatorFrame" src="separator.html" width="99%" height="500" framespacing="0" border="false" frameborder="0" scrolling="auto"></iframe>
    </td>
    <td>
	<iframe id="contentFrame" src="welcome.do" width="99%" height="500" framespacing="0" border="false" frameborder="0" scrolling="auto"></iframe>
    </td>
    </tr>
    </table>
</center>
<span style="float:left">&nbsp;&nbsp;CMS V1.6</span>
<span style="float:right">Copyright &copy;2012-<script>document.write(new Date().getFullYear());</script> FreeCMS. All Rights Reserved&nbsp;&nbsp;</span>
</body>
	<%@include file="/include/bsie_foot.jsp" %>
<script type="text/javascript">
	$("#contentFrame").height($(window).height()-70);
	$("#menuFrame").height($(window).height()-70);
	$("#separatorFrame").height($(window).height()-70);
	function func(url){
	$("#contentFrame",window.parent.document).attr("src",url);
	}
	
	function changeDisplayMode(){
		if($("#menuFrame").width()>0){
			$("#separatorFrame").width(10);
			$("#menuFrame").width(0);
			$("#contentFrame").width($(window).width()-10);
			document.getElementById("separatorFrame").contentWindow.document.getElementById('ImgArrow').src="../img/separator2.gif"
		}else{
			$("#separatorFrame").width(10);
			$("#menuFrame").width(250);
			$("#contentFrame").width($(window).width()-260);
			document.getElementById("separatorFrame").contentWindow.document.getElementById('ImgArrow').src="../img/separator1.gif"
		}
	}
	</script>
</html>