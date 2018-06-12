<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
</head>

<body >
	<div class="widget-content nopadding">
		<form class="form-horizontal" method="post" action="saveDo.do" name="form" id="form"  onsubmit="return formCheck();">
				<input type="hidden" name="id" value="${unit.id }">
				<input type="hidden" name="corpid" value="${unit.corpid }" >
				
				<div id="nameDiv" class="control-group">
					<label class="control-label" style="width:100px">支部名称</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="name" id="name" style="width:160px" value="${unit.name }"/>
					    <span  style="color:Red;">*</span>
					    <span class="help-inline" id="nameHelp"></span>
					</div>
                </div>
				
				<div class="control-group">
					<label class="control-label" style="width:100px">有效</label>
					<div class="controls" style="margin-left: 120px;">
						<label style="float:left"><input type="radio" name="isok" value="1" checked/>是</label>
						<label style="float:left"><input type="radio" name="isok" value="0" ${"0"==unit.isok?"checked":"" }/>否</label>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width:100px">排序</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="ordernum" id="ordernum" style="width:160px"   value="${unit.ordernum }"
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />
					</div>
				</div>
		</form>
	</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/unit.js"></script>
</body>
</html>