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
		<div class="widget-box collapsible">
			<div class="widget-title">
				<span class="icon">
						<i class="icon-search"></i>
				</span>
				<h5>试卷搜索</h5>
				<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
			</div>
			<div class="collapse in" id="collapseOne">
				<div class="widget-content">
					<form class="form-search" action="member/list.do">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
							名称:
							<input name="name" type="text" maxlength="500"
									class="input-medium search-query"  value="${param.name }"  />
							试卷类型:
							<select name="isok" style="width:70px">
									<option value="" >全部
									<option value="1" ${"1"==param.isok?"selected":"" }>是
									<option value="0" ${"0"==param.isok?"selected":"" }>否
							</select>
								
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
					<h5>试卷列表</h5>
					<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
				</div>
				<div class="widget-content nopadding">
					<table class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
								<th>试卷名称</th>
								<th>考试时间</th>
								<th>试卷类型</th>
								<th>创建人</th>
								<th>状态</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
           					 <c:forEach var="bean" items="${list}" varStatus="status">
								<tr>
									<td><input type="checkbox" name="ids" id="id${bean.id }" show="${bean.id }" value="${bean.id }"/></td>
									<td><a href="paper-preview/${bean.id }" target="_blank" title="预览" class="td-paper-name">${bean.name }</a></td>
									<td><span class="td-paper-duration">${bean.duration}</span>分钟</td>
									<td>
										<c:if test="${bean.paper_type == '1' }">
											<span class="td-paper-type" data-id="${bean.paper_type}">
												随机组卷
											</span>
										</c:if>
										<c:if test="${bean.paper_type == '2' }">
											<span class="td-paper-type" data-id="${bean.paper_type}">
												模拟考试
											</span>
										</c:if>
										<c:if test="${bean.paper_type == '3' }">
											<span class="td-paper-type" data-id="${bean.paper_type}">
												专家试卷
											</span>
										</c:if>
									</td>
									<td>${bean.creator }</td>
									<td>
										<c:choose>
											<c:when test="${bean.status == 0 }">
															未上线
											</c:when>
											<c:when test="${bean.status == 1 }">
															已上线
											</c:when>
											<c:when test="${bean.status == 2 }">
															已下线
											</c:when>
										</c:choose>
									</td>
									<td>
									<c:choose>
										<c:when test="${bean.status == 0 }">
											<a href="paperedit/${bean.id}">修改内容</a>
											<a class="change-property">修改属性</a>
											<a class="publish-paper">上线</a>
											<a class="delete-paper">删除</a>
										</c:when>
										<c:when test="${bean.status == 1 }">
											<a class="offline-paper">下线</a>
										</c:when>
									</c:choose>
									</td>
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
					<div class="navbar-inner"><fs:operButtons /></div>
				</div>
			</div>
      </div><!--/row-->
</div><!--/span-->
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
<script src="${pageContext.request.contextPath}/static/exam/js/exam.js"></script>
</body>
</html>