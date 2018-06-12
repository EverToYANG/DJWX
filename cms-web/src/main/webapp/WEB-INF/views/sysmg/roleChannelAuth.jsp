<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>信息管理系统</title>
<meta name="description" content="">
<meta name="author" content="">

<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
<form action="roleChannelAuthDo.do" method="post" name="form" id="form">
		<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"> 
		<input type="hidden" id="roleid" name="roleid" value="${param.roleid }"> 
		<input type="hidden" id="siteid" name="siteid" value="${param.siteid }">
		<%@include file="/include/loading.jsp"%>
		<div>
			<div class="row-fluid">
				<div class="widget-box">

					<div class="widget-title">
						<span class="icon"> <i class="icon-th"></i>
						</span>
						<h5>${site.name }</h5>
						<div class="buttons">
							<input type="checkbox" id="manageSiteChecked" name="manageSiteChecked" ${roleSite!=null?"checked":"" } value="1" />选中则可以管理此站点
						</div>
					</div>
					<div class="widget-content nopadding">
						<div class="navbar">
							<div class="navbar-inner">
								<button type="submit" class="btn btn-primary">授 权</button>
							</div>
						</div>
						<table class="table table-bordered table-striped with-check table-hover">
							<thead>
								<tr>
									<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
									<th>站点栏目</th>
								</tr>
							</thead>
							<tbody>${treeHtml }</tbody>
						</table>
					</div>
				</div>
				<!--/row-->
			</div>
			<!--/span-->
	</form>
	<%@include file="/include/foot.jsp"%>

	<script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>

	<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/funcAuthSon.do";
			ajaxPara="";
    </script>
	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script src="${pageContext.request.contextPath}/static/admin/sys/js/role.js"></script>
</body>
</html>