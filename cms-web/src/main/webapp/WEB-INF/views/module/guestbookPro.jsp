<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<div class="container-fluid">
		<div class="row-fluid">

			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-edit"></i>
					</span>
					<h5>事项处理</h5>
				</div>
				<div class="widget-content nopadding">

					<div class="widget-content nopadding">
						<form class="form-horizontal" method="post" action="proDo.do"
							name="form" id="form" onsubmit="return formCheck();">
						<input type="hidden" name="id" id="id_" value="${guestbook.id }">
						<input type="hidden" id="pageFuncId" name="pageFuncId"
							value="${param.pageFuncId }" />

						<div id="nameDiv" class="control-group">
							<label class="control-label" style="width: 160px">姓名</label>
							<div class="controls" style="margin-left: 190px;">
								${guestbook.name }</div>
						</div>
						<div class="control-group">
							<label class="control-label" style="width: 160px">电话</label>
							<div class="controls" style="margin-left: 190px;">
								${guestbook.tel }</div>
						</div>
						<div class="control-group">
							<label class="control-label" style="width: 160px">事项内容</label>
							<div class="controls" style="margin-left: 190px;">
								${guestbook.content }</div>
						</div>

						<div class="control-group">
							<label class="control-label" style="width: 160px">添加时间</label>
							<div class="controls" style="margin-left: 190px;">
								<fmt:formatDate value="${guestbook.addtime}"
									pattern="yyyy-MM-dd HH:mm:ss" />
							</div>
						</div>
						
							<div id="recontentDiv" class="control-group">
								<label class="control-label" style="width: 160px">处理结果</label>
								<div class="controls" style="margin-left: 190px;">
									<textarea  id="recontent" name="content" cols="40" rows="3"></textarea>
								</div>
							</div>
							
							<div class="control-group">
								<div class="controls" style="margin-left: 190px;">
									<input type="submit" class="btn btn-primary" value="回 复" />&nbsp;
									<a onclick="history.back(-1)" class="btn">返 回</a>
								</div>
							</div>
						</form>
					</div>

				</div>
			</div>
			<!--/row-->
		</div>
</div>
		<!--/span-->
		<%@include file="/include/foot.jsp"%>
		<script
			src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
		<script
			src="${pageContext.request.contextPath}/static/admin/cms/js/guestbook.js"></script>
</body>
</html>