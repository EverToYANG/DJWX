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
						建站向导:<font color="blue">创建站点</font> &gt; 选择模板 &gt; 完成
					</h5>
				</div>
				<div class="alert alert-info">
					<button class="close" data-dismiss="alert">×</button>
					<strong>创建站点!</strong> 欢迎使用新建站点向导，在此设置新建站点的名称、文件夹等信息。
				</div>
				<div class="widget-content nopadding">

					<form class="form-horizontal" method="post" action="siteGuideSite.do" name="form" id="form" />
					<input type="hidden" name="pageFuncId" id="pageFuncId" value="${param.pageFuncId }">
					<div class="control-group">
						<label class="control-label" style="width: 100px">父站点</label>
						<div class="controls" style="margin-left: 120px;">
							<input type="hidden" name="parid" id="siteid" /> <INPUT style="width: 160px" id=sitename title="点击选择父站点" style="cursor:hand" rel="tooltip" data-placement="top" maxLength=50 type=text value="" readonly onClick="selectSite()" />
						</div>
					</div>
					<div id="nameDiv" class="control-group">
						<label class="control-label" style="width: 100px">名称</label>
						<div class="controls" style="margin-left: 120px;">
							<input type="text" name="name" id="name" style="width: 160px" value="${site.name }" /> <span style="color: Red;">*</span> <span class="help-inline" id="nameHelp"></span>
						</div>
					</div>

					<div id="sourcepathDiv" class="control-group">
						<label class="control-label" style="width: 100px">源文件目录名</label>
						<div class="controls" style="margin-left: 120px;">
							<!-- modify @20140619 oninput="checkLoginName(this)" onpropertychange="checkLoginName(this)"-->
							<INPUT id=sourcepath  ${site!=null && site.id!=null && site.id !=""?"readonly":"" } style="width: 160px" maxLength=50 type=text name=sourcepath value="${site.sourcepath }" rel="tooltip" data-placement="top" title="请输入站点的源文件目录名，此站点的相关文件将放在此目录下" /> <span style="color: Red;">*</span> <span class="help-inline" id="sourcepathHelp"></span>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" style="width: 100px">域名</label>
						<div class="controls" style="margin-left: 120px;">
							<input type="text" name="sitedomain" id="sitedomain" style="width: 160px" value="${site.sitedomain }" rel="tooltip" data-placement="top" title="请输入站点域名,设置后可以通过此域名直接访问此站点" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" style="width: 100px">排序</label>
						<div class="controls" style="margin-left: 120px;">
							<input type="text" name="ordernum" id="ordernum" style="width: 160px" value="${site.ordernum }" oninput=if(!isInt(value))value= ''   onpropertychange=if(!isInt(value))execCommand( 'undo')  onkeyup=if(!isInt(value))execCommand( 'undo') onafterpaste=if(!isInt(value))execCommand( 'undo') />
						</div>
					</div>

					</form>
				</div>
				<div class="navbar">
					<div class="navbar-inner">
						<button onclick="saveSite()" class="btn btn-primary" data-loading-text="提交中...">下一步</button>

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