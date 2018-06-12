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
<jsp:include page="/head.do" flush="true" />
          <div class="container-fluid" >
      <div class="row-fluid">
<div class="widget-box collapsible">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-search"></i>
								</span>
								<h5>信息搜索</h5>
								<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
							</div>
							<div class="collapse in" id="collapseOne">
							<div class="widget-content">
							<form class="form-search" action="infoExtract.do">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
			站点：
								<input type="hidden" id="siteid" name="site" value="${param.site }"/>
								<input name="sitename1" id="sitename" type="text" maxlength="500" readonly onclick="selectSite()"
								rel="tooltip" data-placement="bottom"	 value="${param.sitename1 }" style="cursor:hand" title="点击选择站点"/>
								栏目：
								<input type="hidden" id="channelId" name="channel" value="${param.channel }"/>
								<input name="channelname1" id="channelName" type="text" maxlength="500" readonly onclick="selectChannel()"
								rel="tooltip" data-placement="bottom"	 value="${param.channelname1 }" style="cursor:hand" title="点击选择栏目"/>
								信息关键字：
								
								<input name="searchKey" type="text" maxlength="500" value="${param.searchKey }"/>
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
								<h5>信息</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped with-check table-hover">
									<thead>
										<tr>
											<th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
											
											<th>
							<fs:order colName="html索引号" col="htmlIndexnum"/>
											</th>
											<th>
							<fs:order colName="信息标题" col="title"/>
											</th>
											<th>
							<fs:order colName="签收" col="issign"/>
											</th>
											<th>
							<fs:order colName="评论" col="iscomment"/>
											</th>
											<th>
							<fs:order colName="添加时间" col="addtime"/>
											</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${list}" varStatus="status">
										<tr>
											<td><input type="checkbox" name="ids" value="${bean.id }"/></td>
											<td>${bean.htmlIndexnum }</td>
											<td>
							<a rel="tooltip" data-placement="top" title="点击打开信息页面" href='infoPreview.do?id=${bean.id }' target="_blank">${bean.title }</a></td>
											
											
						<TD >
							<c:if test='${"1" == bean.issign }'>
							<a rel="tooltip" data-placement="top" href='#' onclick='infosign("${bean.id }")' title="点击查看签收统计">是</a>
							</c:if>
							<c:if test='${"1" != bean.issign }'>
							否
							</c:if>
						</TD>
						<TD>
							${bean.iscommentStr }
						</TD>
						<TD >
							${bean.addtimeStr }
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
            <script src="${pageContext.request.contextPath}/static/admin/cms/js/infoExtract.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body></html>