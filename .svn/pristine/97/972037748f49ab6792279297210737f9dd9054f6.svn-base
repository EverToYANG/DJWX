<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<div class="container-fluid"
		style="padding-left: 5px; padding-right: 5px;">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>选项管理</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i
							class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">

					<table class="table table-bordered table-striped table-hover"
						id="rows">
						<thead>
							<tr>
								<th style="min-width: 160px">选项</th>
								<th style="min-width: 80px">有效</th>
								<th style="min-width: 80px">默认选中</th>
								<th>排序</th>
								<th>选择次数</th>
								<th style="min-width: 120px">操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="text" style="width: 90%" id="name"
									name="name" size="8" MAXLENGTH="50"></td>
								<td><label style="float: left"><input type="radio"
										id="isok1" name="isok" value="1" checked="checked" />是</label> <label
									style="float: left"><input type="radio" id="isok0"
										name="isok" value="0" />否</label></td>
								<td><label style="float: left"><input type="radio"
										id="isselect1" name="isselect" value="1" />是</label> <label
									style="float: left"><input type="radio" id="isselect0"
										name="isselect" value="0" checked="checked" />否</label></td>

								<td><input type="text" style="width: 80%" id="order"
									oninput=if(!isInt(value))value=
									''   onpropertychange=if(!isInt(value))execCommand(
									'undo') onkeyup=if(!isInt(value))execCommand(
									'undo') onafterpaste=if(!isInt(value))execCommand(
									'undo')  name="order" MAXLENGTH="4"></td>
								<td></td>
								<td><input type="button" class="btn" value="添加"
									onclick="add('${param.questionid }')"></td>
							</tr>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr id="tr${bean.id}">
									<td><input type="text" style="width: 90%"
										value="${bean.name }" size="8" id="name${bean.id}"
										name="name${bean.id}" MAXLENGTH="50"></td>
									<td><label style="float: left"><input
											type="radio" id="isok${bean.id}1" name="isok${bean.id}"
											value="1" checked="checked" />是</label> <label style="float: left"><input
											type="radio" id="isok${bean.id}0" name="isok${bean.id}"
											value="0" ${"1" != bean.isok?"checked":""} />否</label></td>
									<td><label style="float: left"><input
											type="radio" id="isselect${bean.id}1"
											name="isselect${bean.id}" value="1" checked="checked" />是</label> <label
										style="float: left"><input type="radio"
											id="isselect${bean.id}0" name="isselect${bean.id}" value="0"
											${"1" != bean.isselect?"checked":""} />否</label></td>
									<td><input type="text" style="width: 80%"
										onkeyup=if(!isInt(value))execCommand(
										'undo') onafterpaste=if(!isInt(value))execCommand(
										'undo')  value="${bean.ordernum }" id="order${bean.id}"
										name="order${bean.id}" MAXLENGTH="4" size="1"></td>
									<td>${bean.selectnum }</td>
									<td><input type="button" value="修改"
										onclick="update('${bean.id}')" class="btn"> <input
										type="button" value="删除" onclick="del('${bean.id}')"
										class="btn"></td>
								</tr>

							</c:forEach>
						</tbody>
					</table>
					<div id="errorDiv" class="alert alert-error hide">
						<span id="errorInfo"></span>
					</div>

					<span id="state" style="display: none">正在操作中...</span>
				</div>
			</div>
		</div>
		<!--/row-->


	</div>
	<!--/span-->
	<button id="btnSubmit" type="button" style="display: none"
		onclick="parent.closeWindow();">确 定</button>
	<%@include file="/include/bsie_foot.jsp"%>
	<script
		src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/admin/cms/js/voteitem.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>