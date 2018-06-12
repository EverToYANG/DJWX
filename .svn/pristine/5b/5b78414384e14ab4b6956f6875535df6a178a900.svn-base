<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
</head>

<body>
<form action="roleWxappAuthDo.do" method="post" name="form" onsubmit="return userAuthSubmit();">
<input type="hidden" name="roleid" value="${role.id }"/>
<input type="hidden" name="pageFuncId" value="${param.pageFuncId }"/>
<div class="row-fluid">
	<div class="widget-box">
		<div class="widget-content nopadding">
			<table class="table table-bordered table-striped with-check table-hover">
				<thead>
					<tr>
						<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
						<th>应用名称</th>
					</tr>
				</thead>
				<tbody>
           			<c:forEach var="bean" items="${appList}" varStatus="status">
						<tr>
							<td><input type="checkbox" name="ids" value="${bean.id }" id="${bean.id }" rolename="${bean.name }" ${bean.haveRoleUser?"checked":"" }/></td>
							<td>${bean.name }</td>
						</tr>
           			</c:forEach>
				</tbody>
			</table>		
		</div>
	</div><!--/row-->
</div><!--/span-->
</form>
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/userAuth.js"></script>
</body>
</html>