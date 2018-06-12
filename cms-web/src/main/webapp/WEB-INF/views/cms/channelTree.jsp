<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<%@include file="/include/bsie_head.jsp"%>
</head>
<body>
	<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<div >
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-content nopadding">

					<table class="table table-bordered table-striped  table-hover">
						<thead>
							<tr>
								<th style="min-width: 200px">栏目名称</th>
							</tr>
						</thead>
						<tbody>
							<tr treeItemLevel="1" style="display:"${'1' eq param.isroot ? 'block':'none' }">
								<td style="width: 100%">
								<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" /> 
								<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; 
								<a href="#" onclick="${param.channelClick }('')">设置为根栏目</a></td>
							</tr>
							<c:forEach var="channel" items="${channelList}" varStatus="status">
								<c:if test="${channel.id != param.id}">
									<tr treeItemLevel="1">

										<td><c:if test='${"true" == channel.hasChildren}'>
												<img align="absmiddle" style="cursor: pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${channel.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
											</c:if> 
											<c:if test='${"true" != channel.hasChildren}'>
												<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											</c:if> 
												<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp; 
											<a href="#" onclick="${param.channelClick }('${channel.id }','${channel.name }')">${channel.name }</a>
										</td>
									</tr>
								</c:if>
							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>
			<!--/row-->
		</div>
		<!--/span-->
		<form method="post" id="hiddenForm" action="">
			<input type="hidden" name="ids" id="ids" /> <input type="hidden" name="channelid" id="channelid" />
		</form>
		<input type="button" id="btnSubmit" onclick="btnSubmit()" style="display: none" />
		<%@include file="/include/foot.jsp"%>

		<script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
		<script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/cms/channelSonTree.do?id=${param.id}&channelClick=${param.channelClick}";
			ajaxPara="";
            </script>
		<script type="text/javascript">
            //转移
            function pardo(id,name){
            	location.href="channelPar.do?pageFuncId="+$("#pageFuncId").val()+"&channelClick=${param.channelClick}&id=${param.id}&pid="+id;
            }
            //信息页面选择栏目
            function selectChannel(id,name){
            	$("#channelId",window.parent.document).val(id);
            	$("#channelName",window.parent.document).val(name);
				parent.closeWindow();
            }
            //信息复制
            function infoCopy(id,name){
            	$("#channelid").val(id);
            	var str="";
            	//获取选择的信息
            	$("input[name='ids']",window.parent.document).each(function(){
			　　		if($(this).attr("checked")){
                    str += $(this).val()+";"
                	}
			　　});
			    $("#ids").val(str);
				$("#hiddenForm").attr("action","${pageContext.request.contextPath}/cms/infoCopy.do");
				$("#hiddenForm").submit();
            }
            //信息移动
            function infoMove(id,name){
            	$("#channelid").val(id);
            	var str="";
            	//获取选择的信息
            	$("input[name='ids']",window.parent.document).each(function(){
			　　		if($(this).attr("checked")){
                    str += $(this).val()+";"
                	}
			　　});
			    $("#ids").val(str);
				$("#hiddenForm").attr("action","${pageContext.request.contextPath}/cms/infoMove.do");
				$("#hiddenForm").submit();
            }
            //信息提取
            function infoExtract(id,name){
            	$("#channelid").val(id);
            	var str="";
            	//获取选择的信息
            	$("input[name='ids']",window.parent.document).each(function(){
			　　		if($(this).attr("checked")){
                    str += $(this).val()+";"
                	}
			　　});
			    $("#ids").val(str);
				$("#hiddenForm").attr("action","${pageContext.request.contextPath}/cms/infoExtractDo.do");
				$("#hiddenForm").submit();
            }
            function btnSubmit(){
				parent.closeWindow();
			}
            </script>
</body>
</html>