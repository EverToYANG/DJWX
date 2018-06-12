<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@include file="/include/bsie_head.jsp"%>

<script type="text/javascript">
function changeIsOpen(isopenObj){
	if(isopenObj.value=='1'){
		$("#unitdiv").hide();
	}else{
		$("#unitdiv").show();
	}
}
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"><i class="icon-edit"></i></span>
					<h5>课程编辑</h5>
				</div>
				<div class="widget-content nopadding">
					<div class="widget-content nopadding">
						<form class="form-horizontal" method="post" action="save.do" name="form"
							id="form" onsubmit="return formCheck();">
							<input type="hidden" name="id" id="id" value="${course.id }">
							<div id="nameDiv" class="control-group">
								<label class="control-label" style="width: 160px">课程名称:</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT id="name" maxLength=50 type=text name="name"
										value="${course.name }" style="width: 160px"> <span
										style="color: Red;">*</span> <span class="help-inline"
										id="nameHelp"></span>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" style="width: 160px">开课时间</label>
								<div class="controls" style="margin-left: 190px;">
									<input name="addtime" class="Wdate" id="addtime" type="text"
										style="width: 160px" size="14" readonly
										value="${course.addtimestr }"
										onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1990-09-09'})" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" style="width:160px">是否公开</label>
								<div class="controls" style="margin-left: 190px;">
									<label style="float:left"><input type="radio" name="isopen" value="1" checked onchange="changeIsOpen(this)" />是</label>&nbsp;&nbsp;
									<label style="float:left"><input type="radio" name="isopen" value="0" ${"0"==course.isopen?"checked":"" } onchange="changeIsOpen(this)"/>否</label>
								</div>
							</div>
							
							<div id="unitdiv" class="control-group" style="display: none;">
								<label class="control-label" style="width: 160px">党支部</label>
								<div class="controls" style="margin-left: 190px;">
									<ul>
										<c:forEach items="${unitList }" var="unit">
											<li><input type="radio" name="unitid" value="${unit.id }">${unit.name } </li>
										</c:forEach>
									</ul>
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" style="width: 160px">开课地点:</label>
								<div class="controls" style="margin-left: 190px;">
									<INPUT  maxLength=50 type=text name="address" style="width: 160px">
								</div>
							</div>

							<div id="introDiv" class="control-group">
								<label class="control-label" style="width: 160px">课程简介</label>
								<div class="controls" style="margin-left: 190px;">
									<textarea name="content" cols="40" rows="6">${course.content }</textarea>
									<span class="help-inline" id="introHelp"></span>
								</div>
							</div>
							<div class="control-group">
								<div class="controls" style="margin-left: 190px;">
									<input type="submit" class="btn btn-primary" value="保 存" />&nbsp;
									<a onclick="history.back(-1)" class="btn">返 回</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!--/row-->
		</div>
		<!--/span-->
	</div>

	<!-- 党员选择对话框 -->
	<div class="modal fade" id="partyMember" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">人员选择</h4>
				</div>
				<div class="modal-body">
					<div>
						<c:forEach items="${partyMember }" var="member" varStatus="index">
							<label class="checkbox inline"> 
							<input type="checkbox" value="${member.id} " name="partyName"
								data-member="${member.name}">${member.name}
							</label>
						</c:forEach>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">放弃</button>
					<button type="button" class="btn btn-primary" onclick="partyChoice()">选择</button>
				</div>
			</div>
		</div>
	</div>
	
	<%@include file="/include/foot.jsp"%>
	<script
		src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/course/js/course.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js"
		defer="defer"></script>
</body>
</html>