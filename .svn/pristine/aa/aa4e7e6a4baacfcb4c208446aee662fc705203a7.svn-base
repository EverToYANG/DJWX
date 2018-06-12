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
		<form class="form-horizontal" method="post" action="articleAddDo.do" name="form" id="form"  onsubmit="return articleFormCheck();">
				<input type="hidden" name="courseid" value="${course.id }">
				<div id="articleidDiv" class="control-group">
					<label class="control-label" style="width:100px">文章编号</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="articleid" id="articleid" style="width:160px"   value=""
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />
					    <span  style="color:Red;">*</span>
					    <span class="help-inline" id="articleidHelp"></span>
					</div>
                </div>
				
				<div class="control-group">
					<label class="control-label" style="width:100px">文章排序</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="ordernum" id="ordernum" style="width:160px"   value=""
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />
					</div>
				</div>
		</form>
	</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/course/js/course.js"></script>
</body>
</html>