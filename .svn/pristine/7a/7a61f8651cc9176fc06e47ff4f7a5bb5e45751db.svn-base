<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<%@include file="/include/loading.jsp"%>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box collapsible">
				<div class="widget-title">
					<span class="icon"> <i class="icon-search"></i>
					</span>
					<h5>我的评论搜索</h5>
					<div class="buttons">
						<a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a>
					</div>
				</div>
				<div class="collapse in" id="collapseOne">
					<div class="widget-content">
						<form class="form-search" action="comment.do">
							匿名: <select name="isanonymous" style="width: 70px">
								<option value="">全部
								<option value="1" ${"1"==param.isanonymous?"selected":"" }>是
								<option value="0" ${"0"==param.isanonymous?"selected":"" }>否
							</select> 对象: <select name="objtype" style="width: 120px">
								<option value="">全部
									<c:forEach var="bean" items="${objtypes}" varStatus="status">
										<option value="${bean.key }" ${bean.key==param.objtype?"selected":"" }>${bean.value }
									</c:forEach>
							</select> 对象ID: <input name="objid" size="10" type="text" maxlength="50" class="input-medium search-query" value="${param.objid }" /> 内容: <input name="content" size="10" type="text" maxlength="500" class="input-medium search-query" value="${param.content }" /> 状态: <select name="state" style="width: 70px">
								<option value="">全部
								<option value="0" ${"0"==param.state?"selected":"" }>未审核
								<option value="1" ${"1"==param.state?"selected":"" }>已审核
							</select> 每页显示条数： <select name="pageSize" id="pageSize" style="width: 70px">
								<option selected="selected" value="10">10</option>
								<option value="30" ${"30"==param.pageSize?"selected":"" }>30</option>
								<option value="50" ${"50"==param.pageSize?"selected":"" }>50</option>
								<option value="100" ${"100"==param.pageSize?"selected":"" }>100</option>
								<option value="200" ${"200"==param.pageSize?"selected":"" }>200</option>
								<option value="500" ${"500"==param.pageSize?"selected":"" }>500</option>
								<option value="1000" ${"1000"==param.pageSize?"selected":"" }>1000</option>

							</select>

							<button type="submit" class="btn">
								<i class="icon-search"></i> 搜 索
							</button>
						</form>
					</div>
				</div>
			</div>
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>我的评论</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">

					<table class="table table-bordered table-striped table-hover with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>

								<th><fs:order colName="匿名" col="isanonymous" /></th>
								<th><fs:order colName="评论对象" col="objtype" /></th>
								<th><fs:order colName="评论内容" col="content" /></th>
								<th><fs:order colName="时间" col="addime" /></th>
								<th><fs:order colName="状态" col="state" /></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr>
									<td><input type="checkbox" name="ids" value="${bean.id }" /></td>
									<TD>${bean.isanonymousStr }</TD>
									<TD>${bean.objtypeStr }</TD>
									<TD><textarea readonly="readonly" type=text cols="60" rows="3">${bean.content }</textarea></TD>
									<TD>${bean.addtimeStr }</TD>
									<TD>${bean.stateStr }</TD>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div id="errorDiv" class="alert alert-error hide">
						<span id="errorInfo"></span>
					</div>
				</div>

				<div class="navbar">
					<div class="navbar-inner">${pageStr }</div>
				</div>

				<div class="navbar">
					<div class="navbar-inner">
						<button onclick="del()" class="btn btn-danger">删 除</button>
					</div>
				</div>
			</div>
		</div>
		<!--/row-->


	</div>
	<!--/span-->

	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script src="${pageContext.request.contextPath}/member/js/comment.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>