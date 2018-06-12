<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>信息管理系统</title>
<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<jsp:include page="/head.do" flush="true" />
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>微信菜单管理</h5>
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
								<th>菜单名称</th>
								<th>URL</th>
								<!-- <th>KEY值</th> -->
								<th>菜单排序</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr treeItemLevel="1">
									<td><input type="checkbox" name="ids" value="${bean.id }" /></td>
									<td><%-- <img align="absmiddle" style="cursor: pointer"
										onClick="displayChildren(this);" isAjax="true" isOpen="false"
										id="${bean.id }"
										src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
										<img align="absmiddle" border="0"
										src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; --%>
										${bean.name }</td>
									<td>${bean.url }</td>
									<%-- <td>${bean.key }</td> --%>
									<td>${bean.orderNum }</td>
								</tr>
								
								<c:forEach var="bean" items="${bean.subMenu}" varStatus="status">
								<tr treeItemLevel="2">
								<td><input type="checkbox" name="ids" value="${bean.id }"
									</td><td><img align="absmiddle"
										src="/static/tree/image/empty.gif" /> <img
										align="absmiddle" src="/static/tree/image/empty.gif" />
										${bean.name }</td>
									<td>${bean.url }</td>
									<%-- <td>${bean.key }</td> --%>
									<td>${bean.orderNum }</td>
								</tr>
								</c:forEach>
								
							</c:forEach>
						</tbody>
					</table>
					<div id="errorDiv" class="alert alert-error hide">
						<span id="errorInfo"></span>
					</div>
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

	<script
		src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
	<script>
		basePath = "${pageContext.request.contextPath}";
		ajaxUrl = "${pageContext.request.contextPath}/cms/menuSon.do?id="
		getCheckOneValue();
		ajaxPara = "";
	</script>

	<script
		src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/wxMenu/js/menu.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body>
</html>