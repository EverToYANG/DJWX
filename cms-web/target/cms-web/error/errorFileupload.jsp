<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>CMS 上传文件错误页面</title>
<meta name="description" content="">
<meta name="author" content="">

<%@include file="/include/bsie_head.jsp"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/unicorn/css/style.css">

<style type="text/css">
body {
	padding-top: 0px;
	padding-bottom: 0px;
}
</style>
</head>

<body>

	<%@include file="/include/top.jsp"%>
	<div class="error-page">
		<h1 class="error-code color-red">文件上传错误</h1>
		<p class="error-description muted">对不起，您上传的文件太大，最大支持1G!</p>
		<a href="#" onclick="history.back(-1)" class="btn btn-small btn-primary"><i class="icon-white icon-arrow-left"></i> 返回上一页</a> 
		<a href="${pageContext.request.contextPath}/" class="btn btn-small btn-success">返回首页 <i class="icon-white icon-arrow-right"></i></a>
	</div>

	<%@include file="/include/copyright.jsp"%>
	<%@include file="/include/bsie_foot.jsp"%>
</body>
</html>