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

<body>
	<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<%@include file="/include/loading.jsp"%>
	<div>
		<div class="row-fluid">
			<div class="widget-box">

				<div class="widget-content nopadding">

					<table class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th style="width: 100%">站点名称</th>
							</tr>
							<tr>
								<td><input id="siteName" type="text" name="siteName" value="" onchange="querySite(this.value);"> </td>
							</tr>
						</thead>
						<tbody id="siteTree">
							<c:forEach var="site" items="${siteList}" varStatus="status">
								<tr treeItemLevel="1">
									<td style="width: 100%">
										<c:if test='${isSysAdmin && "true" == site.hasChildren}'>
											<img align="absmiddle" style="cursor: pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${site.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
										</c:if> 
										<c:if test='${!isSysAdmin || "true" != site.hasChildren}'>
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
										</c:if> 
										<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; 
										<c:if test="${not empty param.siteClick}">
											<a href="#" onclick="${param.siteClick }('${site.id }','${site.name }')">${site.name }</a>
										</c:if> 
										<c:if test="${empty param.siteClick}">
											<a href="${pageContext.request.contextPath}/cms/siteSwitch.do?id=${site.id }">${site.name }</a>
										</c:if>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<!--/row-->


		</div>
		<!--/span-->

		<%@include file="/include/foot.jsp"%>

		<script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
		<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/cms/siteSon.do?type=siteSelectPage";
			ajaxPara="";
			function selectSite(id,name){
				if(id!=$("#siteid",window.parent.document).val()){
					$("#channelid",window.parent.document).val("");
					$("#channelname",window.parent.document).val("");
				}
				$("#siteid",window.parent.document).val(id);
				$("#sitename",window.parent.document).val(name);
				parent.closeWindow();
			}
			//模板栏目从站点导入
			function importSiteChannel(id,name){
				location.href="templetChannelImportSite.do?siteid="+id+"&templetid=${param.templetid}";
			}
			//模板链接分类从站点导入
			function importSiteLink(id,name){
				location.href="templetLinkImportSite.do?siteid="+id+"&templetid=${param.templetid}";
			}
            </script>

		<script src="${pageContext.request.contextPath}/static/admin/cms/js/selectSite.js"></script>
</body>
</html>