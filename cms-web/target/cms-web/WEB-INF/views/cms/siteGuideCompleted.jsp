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
	<%@include file="/include/loading.jsp" %>
<jsp:include page="/head.do" flush="true" />
          <div class="container-fluid" >
      <div class="row-fluid">
<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-hand-right"></i>
								</span>
								<h5>建站向导:创建站点 &gt; 选择模板 &gt; <font color="blue">完成</font></h5>
							</div>
						<div class="alert alert-info">
							<button class="close" data-dismiss="alert">×</button>
							<strong>恭喜!</strong> 您已完成站点的创建，您可以对此站点进行以下操作。
						</div>
							
							<div class="navbar">	
								<div class="navbar-inner">
<input type="button" class="btn btn-primary" value="站点设置" onclick="location.href='siteConfig.do?pageFuncId=6c561fe7-2013-4ce5-bf9a-42874b07a99e';"/>
<input type="button" class="btn" value="栏目管理" onclick="location.href='channel.do?pageFuncId=c0ac116b-2b2a-4a09-ba25-0c2fffc12b4d';"/>
<input type="button" class="btn" value="预览站点" onclick="preview('${site.id}');"/>
								</div>
								</div>	
								
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->

	<%@include file="/include/foot.jsp" %>

            
            <script src="${pageContext.request.contextPath}/static/admin/cms/js/siteGuide.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body></html>