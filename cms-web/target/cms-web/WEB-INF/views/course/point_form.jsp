<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%-- <%@taglib uri="spring.tld" prefix="spring"%> --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>试题管理</title>
<meta name="keywords" content="">
<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" />
<link href="resources/bootstrap/css/bootstrap-huan.css" rel="stylesheet">
<link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">

<link href="resources/css/question-add.css" rel="stylesheet">
<link href="resources/chart/morris.css" rel="stylesheet">
<style>
input.add-ques-amount,input.add-ques-score {
	width: 50px;
	margin-right: 0;
}
</style>
</head>
<body>
	<!-- Slider starts -->

	<div>
		<!-- Slider (Flex Slider) -->

		<div class="container" style="min-height: 500px;">

			<div class="row">
				<div class="col-xs-3">
					<ul class="nav default-sidenav">
						<li><a href="admin/exampaper-list"> <i class="fa fa-list-ul"></i> 试卷管理
						</a></li>
						<li class="active"><a> <i class="fa fa-file-text-o"></i> 创建新试卷
						</a></li>
					</ul>
				</div>
				<div class="col-xs-9">
					<div class="page-header">
						<h1>
							<i class="fa fa-file-text-o"></i> 创建新试卷
						</h1>
					</div>
					<div class="page-content row">
						<form id="point-add-form" style="margin-top: 40px;" action="admin/point-add">
							<div class="form-line form-field" style="display: block;">
								<span class="form-label"><span class="warning-label"></span>题库：</span> <select id="field-input-select" class="df-input-narrow">
									<option value="-1">--请选择--</option>
									<c:forEach items="${fieldList }" var="item">
										<option value="${item.fieldId }">${item.fieldName }</option>
									</c:forEach>
								</select> <span class="form-message"></span> <br>
							</div>
							<div class="form-line form-name" style="display: block;">
								<span class="form-label"><span class="warning-label"></span>知识点名：</span> <input type="text" class="df-input-narrow" id="name"><span class="form-message"></span> <br>
							</div>
							<div class="form-line form-memo" style="display: block;">
								<span class="form-label"><span class="warning-label"></span>知识点描述：</span> <input type="text" class="df-input-narrow" id="memo"><span class="form-message"></span> <br>
							</div>

							<div class="form-line">
								<input id="btn-save" value="确认添加" type="submit" class="df-submit">
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Slider Ends -->

	<!-- Javascript files -->
	<!-- jQuery -->
	<script type="text/javascript" src="resources/js/jquery/jquery-1.9.0.min.js"></script>
	<script type="text/javascript" src="resources/js/all.js"></script>

	<!-- Bootstrap JS -->
	<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/field-2-point.js"></script>
	<script type="text/javascript" src="resources/js/exampaper-add.js"></script>

</body>
</html>