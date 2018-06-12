<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >
<%@include file="/include/loading.jsp" %>
<div class="widget-content nopadding">
		<form class="form-horizontal" method="post" action="menuSave.do" name="form" id="form"  onsubmit="return formCheck();"/>
        <input type="hidden" name="id" value="${model.id }">
        <input type="hidden" name="parId" value="${model.parId }">
        <input type="hidden" name="appId" value="${model.appId }">
        
		<div id="nameDiv" class="control-group">
			<label class="control-label" style="width: 100px">菜单名称</label>
			<div class="controls" style="margin-left: 120px;">
				<input type="text" name="name" id="name" style="width: 160px"
					value="${model.name }" /> <span style="color: Red;">*</span> <span
					class="help-inline" id="nameHelp"></span>
			</div>
		</div>
				<div id="nameDiv" class="control-group">
			<label class="control-label" style="width: 100px">菜单类型</label>
			<div class="controls" style="margin-left: 120px;">
					<select  name="type" id="type" style="width: 160px">
					<option value="view">跳转URL</option>
					<option value="click">点击推事件</option>
					</select>
			</div>
		</div>
				<div id="nameDiv" class="control-group">
			<label class="control-label" style="width: 100px">菜单URL</label>
			<div class="controls" style="margin-left: 120px;">
				<input type="text" name="url" id="url" style="width: 160px"
					value="${model.url }" placeholder="跳转URL必填" /> <span style="color: Red;">*</span> <span
					class="help-inline" id="nameHelp"></span>
			</div>
		</div>
		<div id="nameDiv" class="control-group">
			<label class="control-label" style="width: 100px">菜单KEY值</label>
			<div class="controls" style="margin-left: 120px;">
				<input type="text" name="key" id="key" style="width: 160px"
					value="${model.key }" placeholder="点击推事件必填" /> <span style="color: Red;">*</span> <span
					class="help-inline" id="nameHelp"></span>
			</div>
		</div>
		
		<div id="nameDiv" class="control-group">
			<label class="control-label" style="width: 100px">菜单排序</label>
			<div class="controls" style="margin-left: 120px;">
				<input type="text" name="orderNum" id="orderNum" style="width: 160px"
					value="${model.orderNum }" /> <span style="color: Red;">*</span> <span
					class="help-inline" id="nameHelp"></span>
			</div>
		</div>


		</form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
	<script src="${pageContext.request.contextPath}/static/wxMenu/js/menu.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
</body></html>