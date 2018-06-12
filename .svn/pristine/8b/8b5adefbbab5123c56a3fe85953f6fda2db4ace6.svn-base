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
	<jsp:include page="/head.do" flush="true" />
	<div class="container-fluid" >
		<div class="row-fluid">
			<div class="widget-box collapsible">
				<div class="widget-title">
					<span class="icon"> <i class="icon-search"></i>
					</span>
					<h5>通知搜索</h5>
					<div class="buttons">
						<a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a>
					</div>
				</div>
				<div class="collapse in" id="collapseOne">
					<div class="widget-content">
						<form class="form-search" action="message/list.do">
							<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }" /> 
								发信人 <input name="membername" size="10" type="text" maxlength="50" class="input-medium search-query" value="${param.membername }" /> 
								收信人 <input name="tomembername" size="10" type="text" maxlength="50" class="input-medium search-query" value="${param.tomembername }" /> 
								标题 <input name="title" size="10" type="text" maxlength="50" class="input-medium search-query" value="${param.title }" /> 
								已读: <select name="isread" style="width: 70px">
								<option value="">全部
								<option value="0" ${"0"==param.isread?"selected":"" }>否
								<option value="1" ${"1"==param.isread?"selected":"" }>是
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
					<h5>通知列表</h5>
					<div class="buttons">
						<a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a>
					</div>
				</div>
				<div class="widget-content nopadding">

					<table class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>


								<th><fs:order colName="发信人" col="membername" /></th>

								<th><fs:order colName="收信人" col="tomembername" /></th>
								<th><fs:order colName="标题" col="title" /></th>
								<th><fs:order colName="已读" col="isread" /></th>
								<th><fs:order colName="系统站内信" col="issys" /></th>
								<th>时间</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="bean" items="${list}" varStatus="status">
								<tr>
									<td><input type="checkbox" name="ids" value="${bean.id }" /></td>
									<TD><c:if test='${bean.membername!=null && ""!=bean.membername}'>
												${bean.membername}
												</c:if> <c:if test='${bean.membername==null || ""==bean.membername}'>
											<font color='red'>管理员</font> ${bean.username}
												</c:if></TD>
									<TD><c:if test='${bean.tomembername!=null && ""!=bean.tomembername}'>
												${bean.tomembername}
												</c:if> <c:if test='${bean.tomembername==null || ""==bean.tomembername}'>
											<font color='red'>管理员</font> ${bean.tousername}
												</c:if></TD>
									<TD><a href="msgInfo.do?id=${bean.id}">${bean.title}</a></TD>
									<TD>${"1" == bean.isread ?"是":"否" }</TD>
									<TD>${"1" == bean.issys ?"是":"否" }</TD>
									<TD>${bean.addtimeStr}</TD>
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
	<script src="${pageContext.request.contextPath}/static/admin/sys/js/msg.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>