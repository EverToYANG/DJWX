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
<div class="container-fluid" >
	<div class="row-fluid">
		<div class="widget-box collapsible">
			<div class="widget-title">
				<span class="icon">
									<i class="icon-search"></i>
				</span>
				<h5>会员权限搜索</h5>
				<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
			</div>
			<div class="collapse in" id="collapseOne">
				<div class="widget-content">
							<form class="form-search" action="memberauth.do">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
			
			编码:<input name="code" type="text" maxlength="500" class="input-medium search-query"  value="${param.code }"/>
			名称:<input name="name" type="text" maxlength="500" class="input-medium search-query"  value="${param.name }"/>
			
								每页显示条数：
								<select name="pageSize" id="pageSize" style="width:70px">
									<option selected="selected" value="10">
										10
									</option>
									<option value="30" ${"30"==param.pageSize?"selected":"" }>
										30
									</option>
									<option value="50" ${"50"==param.pageSize?"selected":"" }>
										50
									</option>
									<option value="100" ${"100"==param.pageSize?"selected":"" }>
										100
									</option>
									<option value="200" ${"200"==param.pageSize?"selected":"" }>
										200
									</option>
									<option value="500" ${"500"==param.pageSize?"selected":"" }>
										500
									</option>
									<option value="1000" ${"1000"==param.pageSize?"selected":"" }>
										1000
									</option>

								</select>
								
							<button type="submit" class="btn"><i class="icon-search"></i> 搜 索</button>
							</form>
				</div>
			</div>
		</div>
		<div class="widget-box">
			<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>会员权限列表</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
			</div>
			<div class="widget-content nopadding">
				<table class="table table-bordered table-striped with-check table-hover">
					<thead>
						<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
											
											<th>
												<fs:order colName="编码" col="code"/>
											</th>
											<th>
												<fs:order colName="名称" col="name"/>
											</th>
											<th>
												<fs:order colName="排序号" col="ordernum"/>
											</th>
						</tr>
					</thead>
					<tbody>
           				<c:forEach var="bean" items="${list}" varStatus="status">
										<tr>
											<td><input type="checkbox" name="ids" value="${bean.id }"/></td>
											<td>${bean.code }</td>
											<td>${bean.name }</td>
											<td>${bean.ordernum }</td>
										</tr>
           				</c:forEach>
					</tbody>
				</table>		
				<div id="errorDiv" class="alert alert-error hide">
					            <span id="errorInfo"></span>
				</div>			
			</div>
							
			<div class="navbar">	
					<div class="navbar-inner">
						${pageStr }
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
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/memberauth.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body>
</html>