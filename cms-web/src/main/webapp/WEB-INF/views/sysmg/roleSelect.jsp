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
          <div >
      <div class="row-fluid">
<div class="widget-box">
							
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>角色选择</h5>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
											<th>角色名称</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${roles}" varStatus="status">
										<tr>
											<td><input type="checkbox" name="ids" value="${bean.id }" id="${bean.id }" rolename="${bean.name }" ${fn:indexOf(param.selectRoleIds, bean.id)>-1?"checked":""}/></td>
											<td>${bean.name }</td>
										</tr>
           					 			</c:forEach>
									</tbody>
								</table>		
							
								
							<input type="button" id="btnSubmit" onclick="btnSubmit()" style="display:none"/>
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->
	<%@include file="/include/foot.jsp" %>

            
            <script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
            <script src="${pageContext.request.contextPath}/static/admin/sys/js/roleSelect.js"></script>
</body></html>