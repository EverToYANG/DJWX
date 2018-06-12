<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
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
											<th style="width:100%">站点名称</th>
										</tr>
									</thead>
									<tbody>
										<tr treeItemLevel="1">
											<td  style="width:100%">
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
											<a href="#" onclick="${param.siteClick }('')">设置为根站点</a></td>
										</tr>
           					 			<c:forEach var="site" items="${sites}" varStatus="status">
           					 			<c:if test="${site.id != param.id}">
										<tr treeItemLevel="1" >
											<td style="width:100%">
											<c:if test='${"true" == site.hasChildren}'>
											<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${site.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
											</c:if>
											<c:if test='${"true" != site.hasChildren}'>
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											</c:if>
											<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
											<a href="#" onclick="${param.siteClick }('${site.id }')">${site.name }</a></td>
										</tr>
										</c:if>
           					 			</c:forEach>
									</tbody>
								</table>		
							
							<input type="button" id="btnSubmit" onclick="btnSubmit()" style="display:none"/>
	<%@include file="/include/bsie_foot.jsp" %>

            <script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
            <script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/cms/siteSonTree.do?id=${param.id}&siteClick=${param.siteClick}";
			ajaxPara="";
            </script>
            <script type="text/javascript">
            //转移
            function pardo(id){
            	location.href="sitePar.do?pageFuncId="+$("#pageFuncId").val()+"&id=${param.id}&pid="+id;
            }
            function btnSubmit(){
				parent.closeWindow();
			}
            </script>
            
</body></html>