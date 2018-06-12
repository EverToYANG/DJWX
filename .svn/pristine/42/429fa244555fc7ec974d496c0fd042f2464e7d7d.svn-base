<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
<jsp:include page="/head.do" flush="true" />
          <div class="container-fluid" >
      			<div class="row-fluid">
      				<div class="widget-box collapsible">
						<div class="widget-title">
							<span class="icon"> <i class="icon-search"></i>
							</span>
							<h5>站点搜索</h5>
							<div class="buttons">
								<a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a>
							</div>
						</div>
						
						<div class="collapse in" id="collapseOne">
							<div class="widget-content">
								<form class="form-search" action="site.do" method="post">
								    <input type="hidden" id="siteList" name="siteList" value="${siteList }" />
								    <input type="hidden" id="siteId" name="siteId" value="${siteId }" />
									<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }" /> 
									站点名称： <input name="name" type="text" maxlength="500" class="input-medium search-query" value="${param.name }" />
									站点类型： <select name="sitetype" id="sitetype" style="width: 150px">
										<option selected="selected" value="">----请选择----</option>
										<option value="1">PC站点</option>
										<option value="2">WAP站点</option>
										<option value="3">微官网</option>
									</select> 
									每页显示条数： <select name="pageSize" id="pageSize" style="width: 70px">
										<option selected="selected" value="10">10</option>
										<option value="30" ${"30"==param.pageSize?"selected":"" }>30</option>
										<option value="50" ${"50"==param.pageSize?"selected":"" }>50</option>
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
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>站点管理</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
											<th style="min-width:200px">站点名称</th>
											<th>站点路径</th>
											<th>域名</th>
											<th>类型</th>
											<th>创建时间</th>
											<th>LOGO</th>
											<th>有效</th>
											<th>排序</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="site" items="${siteList}" varStatus="status">
										<tr treeItemLevel="1">
											<td><input type="checkbox" name="ids" value="${site.id }"/></td>
											<td>
											
											<c:if test='${isSysAdmin && "true" == site.hasChildren}'>
											<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${site.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
											</c:if>
											<c:if test='${!isSysAdmin || "true" != site.hasChildren}'>
											<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
											</c:if>
											<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
											${site.name }</td>
											<td>${site.sourcepath }</td>
											<td>${site.sitedomain }</td>
											<td>${site.sitetype }</td>
											<td>${site.addtimeStr }</td>
											<td><!-- site.setSourcepath("site_" + siteService.maxNum(site.getParid()) ); -->
											<c:if test="${not empty site.logo}">
											<img src="/${site.sourcepath}${site.logo }" style="width:160px;height:60px" />
											</c:if></td>
											<td>${site.stateStr }</td>
											<td>
											<a href="siteOrder.do?pageFuncId=${param.pageFuncId }&type=up&id=${site.id }" rel="tooltip" data-placement="top" title="点击上升"><img src="${pageContext.request.contextPath}/static/unicorn/img/up.gif" /></a>
											&nbsp;&nbsp;&nbsp;
											<a href="siteOrder.do?pageFuncId=${param.pageFuncId }&type=down&id=${site.id }" rel="tooltip" data-placement="bottom" title="点击下降"><img src="${pageContext.request.contextPath}/static/unicorn/img/down.gif" /></a>
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
									<div class="navbar-inner">
										<fs:operButtons />
									</div>
								</div>	
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->

	<%@include file="/include/foot.jsp" %>

            <script src="${pageContext.request.contextPath}/static/tree/bootstraptree.js"></script>
            <script>
            basePath="${pageContext.request.contextPath}";
			ajaxUrl="${pageContext.request.contextPath}/cms/siteSon.do";
			ajaxPara="";
            </script>
            
            <script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
            <script src="${pageContext.request.contextPath}/static/admin/cms/js/site.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body></html>