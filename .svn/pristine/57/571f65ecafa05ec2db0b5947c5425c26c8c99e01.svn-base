<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
	
	<style type="text/css">
	.feed_box{
		margin: 0px 20px;
	}
	</style>
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
					<h5>学习交流</h5>
					<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
			</div>
			<div class="collapse in" id="collapseOne">
				<div class="widget-content">
					<form class="form-search" action="#">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
						名称:
						<input name="name" type="text" maxlength="500"
									class="input-medium search-query"  value="${param.name }"  />
						有效:
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
					<h5>反馈列表</h5>
					<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
				</div>
				<div class="widget-content nopadding">
					<c:forEach var="feed" items="${list}" varStatus="status">
						<div class="feed_box">
							<dl class="feed_dl">
								<dt>${feed.name }</dt>
								<dd>${feed.content }</dd>
								<dd>
								<c:forEach items="${feed.albums }" var="album">
									<span type="img-1" class="img-btn">+
									<a rel="gallery" href="http://wxpc.lzglglj.cn:70/22634000286/resources/${album }"><img src="http://wxpc.lzglglj.cn:70/22634000286/resources/${album }" style="height: 50px;width: 50px;"></a>
									</span>
								</c:forEach>
								</dd>
							</dl>
							<c:forEach items="${feed.replyList }" var="apply">
							<dl class="reply_dl">
								<dt><c:if test="${not empty apply.name}">${apply.name }：</c:if></dt>
								<dd>${apply.content }</dd>
							</dl>
							</c:forEach>
						</div>
						<div style="background: white;height: 20px;"></div>
           			</c:forEach>
					<div id="errorDiv" class="alert alert-error hide">
					    <span id="errorInfo"></span>
					</div>			
				</div>
							
				<div class="navbar">	
					<div class="navbar-inner">${pageStr }</div>
				</div>	
			</div>
      </div><!--/row-->
</div><!--/span-->
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/course/js/course.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body>
</html>