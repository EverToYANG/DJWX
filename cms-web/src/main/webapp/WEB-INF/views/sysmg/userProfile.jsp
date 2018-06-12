<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="">

<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<%@include file="/include/loading.jsp"%>
	<jsp:include page="/head.do" flush="true" />
	<div class="container-fluid" >
		<div class="row-fluid">

			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-edit"></i>
					</span>
					<h5>个人资料</h5>
				</div>
				<div class="widget-content nopadding">

					<div class="widget-content nopadding">
						<form class="form-horizontal" method="post"
							action="userProfileDo.do" name="form" id="form"
							onsubmit="return formCheck();">
							<input type="hidden" name="id" id="id" value="${user.id }">
							<input type="hidden" id="pageFuncId" name="pageFuncId"
								value="${param.pageFuncId }" />

							<div id="loginnameDiv" class="control-group">
								<label class="control-label" style="width: 160px">登录名</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT id=loginname oninput="checkLoginName(this)"
										${not empty user.loginname ?"readonly":"" } maxLength=50
										type=text name=loginname value="${user.loginname }"
										onpropertychange="checkLoginName(this)"> <span
										style="color: Red;">*</span> <span class="help-inline"
										id="loginnameHelp"></span>
								</div>
							</div>
							<div id="nameDiv" class="control-group">
								<label class="control-label" style="width: 160px">真实姓名</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT id=name maxLength=50 type=text name=name
										value="${user.name }"> <span style="color: Red;">*</span>
									<span class="help-inline" id="nameHelp"></span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" style="width: 160px">性别</label>
								<div class="controls" style="margin-left: 190px;">
									<label style="float: left"><input type="radio"
										name="sex" value="1" checked />男</label> <label style="float: left"><input
										type="radio" name="sex" value="0"
										${"0"==user.sex?"checked":"" } />女</label>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" style="width: 160px">出生日期</label>
								<div class="controls" style="margin-left: 190px;">
									<input name="birthday" id="birthday" type="text" size="14"
										readonly value="${user.birthdayStr }"
										onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd',maxDate:'%y-%M-%d'})" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" style="width: 160px">联系电话</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT maxLength=50 type=text name=tel value="${user.tel }">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" style="width: 160px">手机</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT maxLength=50 type=text name=mobilephone
										value="${user.mobilephone }">
								</div>
							</div>
							<div id="emailDiv" class="control-group">
								<label class="control-label" style="width: 160px">电子邮箱</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT id="email" maxLength=50 type=text name=email
										value="${user.email }"> <span class="help-inline"
										id="emailHelp"></span>
								</div>
							</div>
							<div class="control-group">
								<div class="controls" style="margin-left: 190px;">
									<input type="submit" class="btn btn-primary" value="保 存" />
								</div>
							</div>
						</form>
					</div>
					<%@include file="/include/foot.jsp"%>
					<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
					<script
						src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
					<script
						src="${pageContext.request.contextPath}/static/admin/sys/js/userProfile.js"></script>
					<script
						src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js"></script>

				</div>
			</div>
			<!--/row-->
		</div>
		<!--/span-->
</body>
</html>