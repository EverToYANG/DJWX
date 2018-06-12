<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>CMS 错误页面</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/unicorn/css/style.css">

    <style type="text/css">
      body {
        padding-top: 0px;
        padding-bottom: 0px;
      }

    </style>
  </head>

<body>

<jsp:include page="/head.do" flush="true" />
                <div class="error-page">
                    <h1 class="error-code color-red">未选择管理站点错误</h1>
                    <p class="error-description muted">对不起，您没有选择管理站点，请点击右上方的"请选择管理站点"按钮，然后点击"切换站点"进行选择!</p>
                 
                    <a href="#" onclick="history.back(-1)" class="btn btn-small btn-primary"><i class="icon-white icon-arrow-left"></i> 返回上一页</a>
                    <a href="${pageContext.request.contextPath}/"  class="btn btn-small btn-success">返回首页 <i class="icon-white icon-arrow-right"></i></a>
                </div>

	<%@include file="/include/foot.jsp" %>

</body></html>