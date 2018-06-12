<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
</head>

<body>
	<div class="widget-content nopadding">
		<form class="form-horizontal" method="post" action="save.do" name="form" id="form"  onsubmit="return formCheck();">
				<input type="hidden" name="id" id="id" value="${iclass.id }">
				
				<div id="nameDiv" class="control-group">
					<label class="control-label" style="width:100px">事项名称</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="title" id="name" style="width:160px" value="${iclass.title }"/>
					    <span  style="color:Red;">*</span>
					    <span class="help-inline" id="nameHelp"></span>
					</div>
                </div>
                                    
				<div class="control-group">
					<label class="control-label" style="width:100px">有效</label>
					<div class="controls" style="margin-left: 120px;">
						<label style="float:left"><input type="radio" name="state" value="1" checked/>是</label>
						<label style="float:left"><input type="radio" name="state" value="0" ${"0"==iclass.state?"checked":"" }/>否</label>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width:100px">处理人</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="openid" id="openid" style="width:160px" value="${iclass.openid }"/>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" style="width:100px">事项说明</label>
					<div class="controls" style="margin-left: 120px;">
						<textarea name="content" style="width:160px" >${iclass.content }</textarea>
					</div>
				</div>
		</form>
	</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/iclass.js"></script>
</body>
</html>