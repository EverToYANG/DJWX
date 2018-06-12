<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<%@include file="/include/loading.jsp" %>
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr>
											<th style="width:100%">单位名称</th>
										</tr>
									</thead>
									<tbody>
										<tr treeItemLevel="1">
											<td style="width:100%">
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
											<a href="#" onclick="${param.unitClick }('')">设置为根单位</a></td>
										</tr>
           					 			<c:forEach var="unit" items="${list}" varStatus="status">
           					 			<c:if test="${unit.id != param.id}">
										<tr treeItemLevel="1">
											<td style="width:100%">
											<c:if test='${"true" == unit.hasChildren}'>
											<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${unit.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
											</c:if>
											<c:if test='${"true" != unit.hasChildren}'>
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											</c:if>
											<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
											<a href="#" onclick="${param.unitClick }('${unit.id }')">${unit.name }</a></td>
										</tr>
										</c:if>
           					 			</c:forEach>
									</tbody>
								</table>		
							
	
	<%@include file="/include/bsie_foot.jsp" %>

            <script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
            <script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/unitSonTree.do?id=${param.id}&unitClick=${param.unitClick}";
			ajaxPara="";
            </script>
            <script type="text/javascript">
            //转移
            function pardo(id){
            	location.href="unitPar.do?pageFuncId="+$("#pageFuncId").val()+"&id=${param.id}&pid="+id;
            }
            </script>
            
</body></html>