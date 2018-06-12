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
			<div class="widget-box collapsible">
				<div class="widget-title">
					<span class="icon"> <i class="icon-search"></i>
					</span>
					<h5>咨询搜索</h5>
					<div class="buttons">
						<a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i
							class="icon-retweet"></i>展开/关闭</a>
					</div>
				</div>
				<div class="collapse in" id="collapseOne">
					<div class="widget-content">
						<form class="form-search" action="list.do" method="post">
							<input type="hidden" id="pageFuncId" name="pageFuncId"
								value="${param.pageFuncId }" />  
							关键词: <input name="content"
								type="text" maxlength="50" class="input-medium search-query"
								value="${param.content }" /> 
							分类: <select name="iclassid" style="width: 90px">
								<option value="">全部</option>
								<c:forEach items="${iclasseList }" var="iclass">
								<option value="${iclass.id }" ${"0"==param.iclass?"selected":"" }>${iclass.title }</option>
								</c:forEach>
							</select> 

							<button type="submit" class="btn">
								<i class="icon-search"></i> 搜 索
							</button>
						</form>
					</div>
				</div>
			</div>
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>咨询列表</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i
							class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">

					<table
						class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>姓名</th>
								<th>电话</th>
								<th>事项内容</th>
								<th>提交时间</th>
								<th>状态</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr>
									<td><input type="checkbox" name="ids" value="${bean.id }" /></td>
									<TD>${bean.name }</TD>
									<TD>${bean.tel }</TD>
									<TD>${bean.content }</TD>
									<TD><fmt:formatDate value="${bean.addtime}"
											pattern="yyyy-MM-dd HH:mm:ss" /></TD>
									<TD>${bean.stateStr }</TD>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div id="errorDiv" class="alert alert-error hide">
						<span id="errorInfo"></span>
					</div>
				</div>

				<div class="navbar">
					<div class="navbar-inner">${pageStr }</div>
				</div>
				<div class="navbar">
					<div class="navbar-inner">
						<fs:operButtons />
					</div>
				</div>

			</div>
		</div>
		<!--/row-->
	</div>
	<!--/span-->

	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/admin/cms/js/guestbook.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>