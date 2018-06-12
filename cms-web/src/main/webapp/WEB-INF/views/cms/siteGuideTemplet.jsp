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
						建站向导:创建站点 &gt; <font color="blue">选择模板</font> &gt; 完成
					</h5>
				</div>
				<div class="alert alert-info">
					<button class="close" data-dismiss="alert">×</button>
					<strong>选择模板!</strong> 您可以选择使用站点模板作为新建站点的基础。
				</div>
				<div class="widget-content nopadding">

					<form class="form-horizontal" method="post" action="siteGuideTemplet.do" name="form" id="form" />
					<input type="hidden" name="pageFuncId" id="pageFuncId" value="${param.pageFuncId }"> <input type="hidden" name="siteid" value="${site.id }" />
					<div class="control-group">
						<label class="control-label" style="width: 100px"></label>
						<div class="controls" style="margin-left: 120px;">
							<label style="float: left"><input type="radio" id="type0" name="type" value="0" onclick="radioClick(this.value);" checked />选择现有模板</label> <label style="float: left"><input type="radio" name="type" value="1" onclick="radioClick(this.value);" />创建新模板</label>
						</div>
					</div>
					<div id="selectDiv" class="control-group">
						<label class="control-label" style="width: 100px">选择模板：</label>
						<div class="controls" style="margin-left: 120px;">
							<input type="hidden" name="id" id="templet" /> 
							<INPUT id=templetName title="点击选择站点模板" onclick="selectTemplet('${site.id }')" rel="tooltip" data-placement="top" style="width: 160px" style="cursor:hand" maxLength=50 type=text value="" readonly /> <span style="color: Red;">*</span> <span class="help-inline" id="selectHelp"></span>
						</div>
					</div>

					<div id="newDiv" class="control-group" style="display: none">
						<label class="control-label" style="width: 100px">新模板名称</label>
						<div class="controls" style="margin-left: 120px;">
							<INPUT id=name style="width: 160px" maxLength=50 type=text name=name value=""> <span style="color: Red;">*</span> <span class="help-inline" id="newHelp"></span>
						</div>
					</div>
					</form>
				</div>
				<div class="navbar">
					<div class="navbar-inner">
						<button onclick="saveTemplet()" class="btn btn-primary" data-loading-text="提交中...">下一步</button>

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