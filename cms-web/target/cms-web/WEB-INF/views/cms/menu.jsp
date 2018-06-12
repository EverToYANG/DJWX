<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="">

<%@include file="/include/bsie_head.jsp"%>

</head>

<body style="margin-top: 10px">
	<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<%@include file="/include/loading.jsp"%>
	<table
		class="table table-bordered table-striped with-check table-hover">
		<thead>
			<tr>
				<th style='width: 100%'>${func.name }</th>
			</tr>
		</thead>
		<tbody>${menuTree }
		</tbody>
	</table>

	<%@include file="/include/foot.jsp"%>

	<script
		src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
	<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/admin/funcSon.do";
			ajaxPara="";
            </script>
	<script type="text/javascript">
	function func(url){
		$("#contentFrame",window.parent.document).attr("src",url);
	}
	</script>
</body>
</html>