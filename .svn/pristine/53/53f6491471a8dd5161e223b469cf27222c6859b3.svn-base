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
	<form class="form-horizontal" method="post" action="groupEditDo.do"  name="form" id="form"  onsubmit="return formCheck();" >
	<input type="hidden" name="id" value="${membergroup.id }">
	
	<div id="nameDiv" class="control-group">
	      <label class="control-label" style="width:130px">名称：</label>
	      <div class="controls" style="margin-left: 100px;">
			<input type="text" name="name" id="name" style="width:160px" value="${membergroup.name }"/>
			<span  style="color:Red;">*</span>
			<span class="help-inline" id="nameHelp"></span>
	      </div>
	</div>
                                   
     <div id="ordernumDiv" class="control-group">
         <label class="control-label" style="width:130px">序号：</label>
         <div class="controls" style="margin-left: 100px;">
             <input type="text" name="ordernum" id="ordernum" style="width:160px" value="${membergroup.ordernum }"
             oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
			 <span class="help-inline" id="ordernumHelp"></span>
        </div>
    </div>
    </form>
</div>
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/member/js/group.js"></script>
</body>
</html>