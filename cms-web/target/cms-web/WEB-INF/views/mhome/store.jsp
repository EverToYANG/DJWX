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
	<%@include file="/include/loading.jsp" %>
          <div class="container-fluid" >
      <div class="row-fluid">
<div class="widget-box collapsible">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-search"></i>
								</span>
								<h5>我的收藏搜索</h5>
								<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
							</div>
							<div class="collapse in" id="collapseOne">
							<div class="widget-content">
							<form class="form-search" action="store.do">
							对象标题
								
								<input name="objtitle" size="10" type="text" maxlength="500"
									class="input-medium search-query" value="${param.objtitle }"  />
								对象类型:
								<select name="objtype" style="width:120px">
									<option value="" >全部
           					 			<c:forEach var="bean" items="${objtypes}" varStatus="status">
									<option value="${bean.key }" ${bean.key==param.objtype?"selected":"" }>${bean.value }
									</c:forEach>
								</select>
								站点
								
								<input name="sitename" size="10" type="text" maxlength="50"
									class="input-medium search-query" value="${param.sitename }"  />
								栏目
								
								<input name="channelname" size="10" type="text" maxlength="50"
									class="input-medium search-query" value="${param.channelname }"  />
							
							
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
								<h5>我的收藏</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped table-hover with-check">
									<thead>
										<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
					
<th >
	<b><fs:order colName="标题" col="objtitle"/></b>
</th>
<th >
	<b><fs:order colName="类型" col="objtype"/></b>
</th>
<th >
	<b><fs:order colName="站点" col="sitename"/></b>
</th>
<th >
	<b><fs:order colName="栏目" col="channelname"/></b>
</th>
<th>
	<b><fs:order colName="时间" col="storeime"/></b>
</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${list}" varStatus="status">
										<tr>
											<td><input type="checkbox" name="ids" value="${bean.id }"/></td>
											<TD   >
		<c:if test='${"info" == bean.objtype}'>
		<a href="${pageContext.request.contextPath}/infoPreview.do?id=${bean.objid }" target="_blank">
		</c:if>
		${bean.objtitle }</a>
	</TD>
	<TD   >
		${bean.objtypeStr}
	</TD>
	<TD   >
		${bean.sitename}
	</TD>
	<TD   >
		${bean.channelname}
	</TD>
	<TD   >
		${bean.storetimeStr}
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
									<button  onclick="del()" class="btn btn-danger"  >删 除</button>
								</div>
								</div>
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->

	<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
            <script src="${pageContext.request.contextPath}/member/js/store.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body></html>