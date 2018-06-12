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
<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">
<div class="container-fluid" >
	<div class="row-fluid">
		<div class="widget-box collapsible">
			<div class="widget-title">
				<span class="icon">
					<i class="icon-search"></i>
				</span>
				<h5>学习记录搜索</h5>
				<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
			</div>
			<div class="collapse in" id="collapseOne">
				<div class="widget-content">
					<form class="form-search" action="creditlog.do">
						<input type="hidden" name="pageFuncId" value="${param.pageFuncId }"/>
						会员:
						<input name="membername" type="text" maxlength="500"
									value="${param.membername }"  class="input-medium search-query" />
								类型:
							<select name="type" style="width:70px">
								<option value="" >全部</option>
								<option value="1" ${"1"==param.type?"selected":"" }>奖励</option>
								<option value="0" ${"0"==param.type?"selected":"" }>惩罚</option>
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
				<h5>党员学习记录</h5>
				<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
			</div>
			<div class="widget-content nopadding">
								<table class="table table-bordered table-striped table-hover">
									<thead>
										<tr>
											<th>党员姓名</th>
											<th>学习内容</th>
											<th>学习时间</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${list}" varStatus="status">
										<tr>
											<TD>${bean.membername }</TD>
											<TD>${bean.coursename }</TD>
											<TD>${bean.logtimeStr }</TD>
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
							
			</div>
      </div><!--/row-->
</div><!--/span-->
<%@include file="/include/foot.jsp" %>
</body>
</html>