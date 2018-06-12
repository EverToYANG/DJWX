<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
	<%@include file="/include/loading.jsp" %>
<jsp:include page="/head.do" flush="true" />
          <div class="container-fluid" >
      <div class="row-fluid">
<div class="widget-box collapsible">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-search"></i>
								</span>
								<h5>${mail.type=="unit"?"部门":"" }${mail.type=="user"?"个人":"" }${mail.type=="other"?"其他":"" }信件搜索</h5>
								<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
							</div>
							<div class="collapse in" id="collapseOne">
							<div class="widget-content">
							<form class="form-search" action="mail.do" method="post">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
		<input type="hidden" id="type" name="type" value="${mail.type }"/>
		查询码:
								
								<input name="querycode" type="text" maxlength="500"
									class="input-medium search-query" value="${param.querycode }"  />
								标题:
								
								<input name="title" type="text" maxlength="500"
									class="input-medium search-query"  value="${param.title }"  />
								写信人:
								
								<input name="writer" type="text" maxlength="500"
									class="input-medium search-query"  value="${param.writer }"  />
							<c:if test="${current_user.loginname == 'admin' and 'unit' == mail.type}">
							部门:<select id="unitid" name="unitid" >
												<option value="">请选择
           					 			<c:forEach var="bean" items="${unitList}" varStatus="status">
												<option value="${bean.id }" ${bean.id==param.unitid?"selected":"" }>${bean.name }
           					 			</c:forEach>
										</select>
							</c:if>
							<c:if test="${current_user.loginname == 'admin' and 'user' == mail.type}">
							收信人:<select id="userid" name="userid" >
												<option value="">请选择
           					 			<c:forEach var="bean" items="${userList}" varStatus="status">
												<option value="${bean.id }" ${bean.id==param.userid?"selected":"" }>${bean.name }
           					 			</c:forEach>
										</select>
							</c:if>
								类型:
								<select name="mailtype" style="width:70px">
								<option value="">全部
           					 			<c:forEach var="bean" items="${mailtypes}" varStatus="status">
												<option value="${bean }" ${bean==param.mailtype?"selected":"" }>${bean }
           					 			</c:forEach>
								</select>
								
								办理状态:
								<select name="state" style="width:70px">
								<option value="">全部
								<option value="0"  ${"0"==param.state?"selected":"" }>办理中
								<option value="1"  ${"1"==param.state?"selected":"" }>已办结
								</select>
								公开:
								<select name="isopen" style="width:70px">
								<option value="">全部
								<option value="1"  ${"1"==param.isopen?"selected":"" }>是
								<option value="0"  ${"0"==param.isopen?"selected":"" }>否
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
								<h5>${mail.type=="unit"?"部门":"" }${mail.type=="user"?"个人":"" }${mail.type=="other"?"其他":"" }信件</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
											<c:if test="${current_user.loginname == 'admin' and 'unit' == mail.type}">
						<th>
							<fs:order colName="部门" col="unitid"/>
						</th>
						</c:if>
						<c:if test="${current_user.loginname == 'admin' and 'user' == mail.type}">
						<th>
							<fs:order colName="收信人" col="userid"/>
						</th>
						</c:if>
						<th>
							<fs:order colName="类型" col="mailtype"/>
						</th>
						<th>
							<fs:order colName="查询码" col="querycode"/>
						</th>
						<th>
							<fs:order colName="信件标题" col="title"/>
						</th>
						<th>
							
							<fs:order colName="发信人" col="writer"/>
						</th>
						<th>
							
							<fs:order colName="写信时间" col="m.addtime"/>
						</th>
						<th>
							
							<fs:order colName="公开" col="isopen"/>
						</th>
						<th>
							
							<fs:order colName="办理状态" col="state"/>
						</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${list}" varStatus="status">
										<tr>
											<td><input type="checkbox" name="ids" value="${bean.id }"/></td>
											<c:if test="${current_user.loginname == 'admin' and 'unit' == mail.type}">
											<TD  >${bean.unitname }</TD>
											</c:if>
											<c:if test="${current_user.loginname == 'admin' and 'user' == mail.type}">
											<TD>${bean.username }</TD>
											</c:if>
											<TD>${bean.mailtype }</TD>
											<TD >${bean.querycode }</TD>
											<TD >${bean.title }</TD>
											<TD>${bean.writer }</TD>
											<TD><fmt:formatDate value="${bean.addtime}" pattern="yyyy-MM-dd" /></TD>
											<TD >
												${"1"==bean.isopen?"是":"否" }
											</TD>
											<TD >
												${"1"==bean.state?"已办结":"办理中" }
											</TD>
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
            <script src="${pageContext.request.contextPath}/static/admin/cms/js/mail.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body></html>