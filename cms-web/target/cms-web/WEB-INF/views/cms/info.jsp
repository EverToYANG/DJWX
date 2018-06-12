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
	<div class="container-fluid" >
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>信息管理</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">
					<table width="99%" align="center" valign="top">
						<tr>
							<td width="20%" valign="top">
								<div class="widget-box">
									<div class="widget-title">
										<span class="icon"> <i class="icon-th"></i>
										</span>
										<h5>栏目选择</h5>
										<div class="buttons">
											<a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a>
										</div>
									</div>
									<div class="widget-content nopadding">

										<table class="table table-bordered table-striped table-hover">
											<tbody>
												<c:forEach var="channel" items="${channelList}" varStatus="status">
													<tr treeItemLevel="1">

														<td><c:if test='${"true" == channel.hasChildren}'>
																<img align="absmiddle" style="cursor: pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${channel.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
															</c:if> <c:if test='${"true" != channel.hasChildren}'>
																<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
															</c:if> <img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; <c:if test='${siteAdmin || "true" == channel.haveChannelRole }'>
																<a href="#" onclick="infoSelectChannel('${channel.id }','${channel.name }')">${channel.name }</a>
															</c:if> <c:if test='${!siteAdmin && "true" != channel.haveChannelRole }'>
											${channel.name }
											</c:if></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>




									</div>
								</div> <!--/row-->
							</td>
							<td valign="top"><iframe width="100%" height="0" name="infoFrame" src="infoList.do?pageFuncId=${param.pageFuncId}" id="infoFrame" framespacing="0" border="false" frameborder="0"></iframe></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<!--/row-->
	</div>
	<!--/span-->
	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
	<script>
		basePath = "${pageContext.request.contextPath}";
		ajaxUrl = "${pageContext.request.contextPath}/cms/infoChannelSon.do";
		ajaxPara = "";
		$(function() {
			$("#infoFrame").load(function() {
				$(this).height($(this).contents().find("body").height());
			});
		});
	</script>

	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script src="${pageContext.request.contextPath}/static/admin/cms/js/info.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body>
</html>