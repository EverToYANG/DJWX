<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body style="margin-top:10px">
<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
	<%@include file="/include/loading.jsp" %>
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr >
											<th style='width:100%'>会员服务导航</th>
										</tr>
									</thead>
									<tbody>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("creditlog.do")'>积分记录</a></td></tr>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("comment.do")'>我的评论</a></td></tr>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("guestbook.do")'>我的留言</a></td></tr>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("store.do")'>我的收藏</a></td></tr>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("resume.do")'>我的简历</a></td></tr>
           					 			<tr treeItemLevel='1'><td  style='width:100%'><img align='absmiddle' style='cursor:pointer' onClick='displayChildren(this);' isAjax='false' isOpen='false' id='cb42d736-3386-42b8-a9f7-62840c4ecefa' src='${pageContext.request.contextPath}/static/tree/image/plus.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;站内信</td></tr>
           					 			<tr treeItemLevel='2' style='display:none'><td style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("msgSend.do")'>写信</a></td></tr>
           					 			<tr treeItemLevel='2' style='display:none'><td style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("msgTolist.do")'>收件箱</a></td></tr>
           					 			<tr treeItemLevel='2' style='display:none'><td style='width:100%'><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' src='${pageContext.request.contextPath}/static/tree/image/empty.gif' /><img align='absmiddle' border='0' src='${pageContext.request.contextPath}/static/tree/image/folder.gif' />&nbsp;<a href='#' onclick='func("msgSendlist.do")'>发件箱</a></td></tr>

									</tbody>
								</table>	

	<%@include file="/include/foot.jsp" %>

            <script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
            <script>
            basePath="${pageContext.request.contextPath}";
            </script>
<script type="text/javascript">
	function func(url){
	$("#contentFrame",window.parent.document).attr("src",url);
	}
	</script>
</body></html>