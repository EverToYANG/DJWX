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
		<input type="hidden" id="roleid" name="roleid" value="${role.id }">

		<%@include file="/include/loading.jsp"%>
		<div>
			<div class="row-fluid">
				<table width="99%" align="center" valign="top">
					<tr>
						<td width="30%" valign="top">

							<div class="widget-box">

								<div class="widget-title">
									<span class="icon"> <i class="icon-th"></i>
									</span>
									<h5>站点</h5>
									<div class="buttons">
										<a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a>
									</div>
								</div>
								<div class="widget-content nopadding">

									<table class="table table-bordered table-striped with-check table-hover">
										<tbody>
											<c:forEach var="bean" items="${list}" varStatus="status">
												<tr treeItemLevel="1">
													<td style="width: 100%"><c:if test='${"true" == bean.hasChildren}'>
															<img align="absmiddle" style="cursor: pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${bean.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
														</c:if> <c:if test='${"true" != bean.hasChildren}'>
															<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
														</c:if> 
														<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; 
														<a target="siteFrame" href="roleChannelAuth.do?roleid=${role.id }&siteid=${bean.id }" rel="tooltip" data-placement="top" title="点击进入详细设置">${bean.name } ${bean.haveSiteRole }</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>

								</div>
							</div>
						</td>
						<td valign="top">
						<iframe width="100%" height="0" name="siteFrame" id="siteFrame" framespacing="0" border="false" frameborder="0"></iframe></td>
					</tr>
				</table>
			</div>
	</form>
	<%@include file="/include/foot.jsp"%>
	<button id="btnSubmit" onclick="parent.closeWindow()" style="display: none" />
	<script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
	<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/sysmg/roleSiteAuthSon.do?roleid=${role.id}";
			ajaxPara="";
			$(function(){ 
				$("#siteFrame").load(function(){ 
					$(this).height($(this).contents().find("body").height()); 
				}); 
			}); 
    </script>
	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script src="${pageContext.request.contextPath}/static/admin/sys/js/role.js"></script>
</body>
</html>