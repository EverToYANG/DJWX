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
	<jsp:include page="/head.do" flush="true" />
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-hand-right"></i>
					</span>
					<h5>
						建站向导:创建站点 &gt; 选择模板 &gt; <font color="blue">站点初始化</font> &gt; 完成
					</h5>
				</div>
				<div class="alert alert-info">
					<button class="close" data-dismiss="alert">×</button>
					<strong>提示!</strong> 您选择的站点模板有初始化数据，是否对此站点进行初始化?
				</div>
				<div class="widget-content nopadding"></div>
				<div class="navbar">
					<div class="navbar-inner">
						<form action="siteGuideInit.do">
							<input type="hidden" name="id" value="${site.id }" /> 
							<input type="hidden" name="templet" value="${site.templet }" /> 
							<input type="submit" class="btn btn-primary" value=" 立即初始化(推荐) " /> 
							<input type="button" class="btn" value=" 跳 过 " onclick="location.href='siteGuideCompleted.do?siteid=${site.id }';" />
						</form>
					</div>
				</div>
			</div>
		</div>
		<!--/row-->
	</div>
	<!--/span-->

	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/admin/cms/js/siteGuide.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body>
</html>