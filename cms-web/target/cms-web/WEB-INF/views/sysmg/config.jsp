<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
</head>

<body>
<jsp:include page="/head.do" flush="true" />
<div class="container-fluid" >
	<div class="row-fluid">
		<div class="widget-box">
			<div class="widget-title">
				<span class="icon">
					<i class="icon-th"></i>
				</span>
				<h5>系统配置管理</h5>
				<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
			</div>
			<div class="widget-content nopadding">
				<form action="configDo.do" method="post" name="form" id="form">
					<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }">
					<table class="table table-bordered table-striped  table-hover">
						<thead>
							<tr>
								<th>配置编码</th>
								<th>配置名称</th>
								<th>配置值</th>
							</tr>
						</thead>
						<tbody>
           					<c:forEach var="config" items="${list}" varStatus="status">
							<tr>
								<td>${config.code }</td>
								<td>${config.name }</td>
								<td><input type="text" style="width:96%" value="${config.codeval }" name="${config.code}" MAXLENGTH="500" ></td>
							</tr>
           					</c:forEach>
						</tbody>
				 	</table>	
				</form>	
				<div id="errorDiv" class="alert alert-error hide">
					<span id="errorInfo"></span>
				</div>			
			</div>
							
			<div class="navbar">	
				<div class="navbar-inner">
					<fs:operButtons />
				</div>
			</div>	
		</div>
	</div><!--/row-->
</div><!--/span-->

<%@include file="/include/foot.jsp" %>
<script>
	function save(){
		$("#form").submit();
	}
</script>
</body>
</html>