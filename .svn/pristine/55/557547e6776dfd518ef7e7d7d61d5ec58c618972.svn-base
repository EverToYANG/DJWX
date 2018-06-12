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

					<table
						class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>站点名称</th>
							</tr>
						</thead>
						<tbody>${treeHtml }
						</tbody>
					</table>
				</div>
			</div>
			<!--/row-->


		</div>
		<!--/span-->

		<input type="button" id="btnSubmit" onclick="btnSubmit()"
			style="display: none" />
		<%@include file="/include/foot.jsp"%>

		<script
			src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
		<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/cms/siteSon.do?type=siteSelectPage";
			ajaxPara="";
			function btnSubmit(){
				var sites=document.getElementsByName("ids");
				var siteids="";
				var sitenames="";
				if(sites!=null && sites.length>0){
					for(var i=0;i<sites.length;i++){
						if(sites[i].checked){
							sitenames=sitenames+$("#"+sites[i].id).attr("site")+";";
							siteids=siteids+sites[i].value+";";
						}
					}
				}
				if($("#siteids",parent.document).length>0){
					$("#siteids",parent.document).val(siteids);
				}
				if($("#sitenames",parent.document).length>0){
					$("#sitenames",parent.document).val(sitenames);
				}
				parent.closeWindow();
				
			}
            </script>

		<script
			src="${pageContext.request.contextPath}/static/admin/cms/js/selectSite.js"></script>
</body>
</html>