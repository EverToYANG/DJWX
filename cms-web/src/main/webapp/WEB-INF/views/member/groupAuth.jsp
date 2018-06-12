<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
	<%@include file="/include/loading.jsp" %>
<div class="widget-box">
<!-- 会员权限组开始 -->			
				<div class="widget-content nopadding">
<form class="form-horizontal"  method="post" action="membergroupAuthDo.do"  name="form" id="form"  onsubmit="return formCheck1();">	
<input type="hidden" name="id" id="groupid" value="${groupid }">
<input type="hidden" name="names" id="names" value="">
					<table class="table table-bordered table-striped with-check table-hover">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
								
								<th>
									<fs:order colName="会员权限" col="name"/>
								</th>											
							</tr>
						</thead>
						<tbody>
        					 			<c:forEach var="bean" items="${memberauthlist}" varStatus="status">
        					 			<tr>
								<td>
						 <input type="checkbox"  name="ids" value="${bean.id }" auth="${bean.name }" ${bean.have?"checked":"" }/></td>
								
								<td>${bean.name }</td>
								
							</tr>
        					 			</c:forEach>
						</tbody>
					</table>		
				<div id="errorDiv" class="alert alert-error hide">
		            <span id="errorInfo"></span>
		          </div>	
		          </form>		
				</div>
				<!-- 会员权限结束 -->

				
			</div>
        
        <%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
            <script src="${pageContext.request.contextPath}/static/admin/cms/js/membergroup.js"></script>

</body></html>
