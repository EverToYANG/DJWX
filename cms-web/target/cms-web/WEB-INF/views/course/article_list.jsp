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
					<h5>学习交流</h5>
					<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
			</div>
			<div class="collapse in" id="collapseOne">
				<div class="widget-content">
					<form class="form-search" action="articleList.do?id=${course.id}">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
						名称:
						<input name="title" type="text" maxlength="500"
									class="input-medium search-query"  value="${param.title }"  />
								
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
				<h5>课程资料</h5><!--  -->
				<div class="buttons"><a href="#" onclick="addArticle(${course.id});" class="btn btn-mini"><i class="icon-edit"></i> 新增</a></div>
				<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷新</a></div>
			</div>
			
			<div class="widget-content nopadding">
				<table class="table table-bordered table-striped with-check table-hover">
					<thead>
						<tr>
							<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
							<th>标题</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
           				<c:forEach var="bean" items="${list}" varStatus="status">
							<tr>
								<td><input type="checkbox" name="ids" id="id${bean.id }" show="${bean.id }" value="${bean.id }"/></td>
								<td>${bean.title }</td>
								<td>
									[<a href="javascript:void(0);" onclick="delArticle(${bean.id});">删除</a>]&nbsp;&nbsp;
								</td>
							</tr>
           				</c:forEach>
					</tbody>
				</table>		
			</div>
	</div><!--/row-->
</div><!--/span-->
</div>
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/course/js/course.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>