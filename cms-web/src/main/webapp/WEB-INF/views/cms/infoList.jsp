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
	<div>
		<div class="row-fluid">
			<div class="widget-box collapsible">
				<div class="widget-title">
					<span class="icon"> <i class="icon-search"></i>
					</span>
					<h5>信息搜索 ${channel.name}</h5>
					<div class="buttons">
						<a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i
							class="icon-retweet"></i>展开/关闭</a>
					</div>
				</div>
				<div class="collapse in" id="collapseOne">
					<div class="widget-content">
						<form class="form-search" action="infoList.do" method="post">
							<input type="hidden" id="pageFuncId" name="pageFuncId"
								value="${param.pageFuncId }" /> <input type="hidden"
								id="channel" name="channel" value="${param.channel }" />
							
							信息标题： <input name="title"
								type="text" maxlength="300" class="input-medium search-query"
								value="${param.title }" /> 
							评论: <select name="iscomment" style="width: 140px">
								<option value="">全部</option>
								<option value="0" ${"0"==param.iscomment?"selected":"" }>否</option>
								<option value="1" ${"1"==param.iscomment?"selected":"" }>会员评论</option>
								<option value="2" ${"2"==param.iscomment?"selected":"" }>会员和匿名评论</option>
							</select> 每页显示条数： <select name="pageSize" id="pageSize"
								style="width: 70px">
								<option selected="selected" value="10">10</option>
								<option value="30" ${"30"==param.pageSize?"selected":"" }>
									30</option>
								<option value="50" ${"50"==param.pageSize?"selected":"" }>
									50</option>
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
					<h5>信息</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i
							class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">

					<table
						class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>信息编码</th>
								<th>信息标题</th>
								<th>信息分类</th>
								<th>添加时间</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr>
									<td><input type="checkbox" name="ids" value="${bean.id }" /></td>
									<td>${bean.id }</td>
									<td>${bean.title }</td>
									<td>${bean.channelname }</td>
									<TD>${bean.addtimeStr }</TD>
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
						<fs:operButtons />
					</div>
				</div>

			</div>
		</div>
		<!--/row-->
	</div>
	<!--/span-->

	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script src="${pageContext.request.contextPath}/static/admin/cms/js/info.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>