<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >
	<div class="widget-content nopadding">
		<form class="form-horizontal" method="post" action="funcEditDo.do" name="form" id="form"  onsubmit="return formCheck();"/>
			<input type="hidden" name="parid" value="${func.parid }">
			<input type="hidden" name="id" value="${func.id }">
			<div id="nameDiv" class="control-group">
				<label class="control-label" style="width:80px">菜单名称</label>	
				<div class="controls" style="margin-left: 100px;">
					<input type="text" name="name" id="name" style="width:160px" value="${func.name }"/>
      				<span  style="color:Red;">*</span>
      				<span class="help-inline" id="nameHelp"></span>
				</div>
			</div>
                                    
			<div class="control-group">
					<label class="control-label" style="width:80px">菜单代码</label>
					<div class="controls" style="margin-left: 100px;">
						<input type="text" name="code" id="code" style="width:160px" value="${func.code }"/>
					</div>
			</div>
			<div class="control-group">
				<label class="control-label" style="width:80px">有效</label>
				<div class="controls" style="margin-left: 100px;">
				<label style="float:left"><input type="radio" name="isok" value="1" checked/>是</label>
				<label style="float:left"><input type="radio" name="isok" value="0" ${"0"==func.isok?"checked":"" }/>否</label>
				</div>
             </div>
			<div class="control-group">
				<label class="control-label" style="width:80px">链接地址</label>
				<div class="controls" style="margin-left: 100px;">
					<input type="text" name="urlpath" id="url" style="width:260px" value="${func.urlpath }"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" style="width:80px">菜单排序</label>
				<div class="controls" style="margin-left: 100px;">
				<input type="text" name="ordernum" id="ordernum" style="width:160px"   value="${func.ordernum }"
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />	
				</div>
			</div>
		</form>
</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/func.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
</body></html>