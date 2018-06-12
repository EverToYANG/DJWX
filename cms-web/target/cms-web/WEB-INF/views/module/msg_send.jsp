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

<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-edit"></i>
								</span>
								<h5>发送站内信</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="msgSendDo.do" name="form" id="form"  onsubmit="return formCheck();">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
			
                                    <div id="tomembernamesDiv" class="control-group">
                                        <label class="control-label" style="width:160px">收信人</label>
                                        <div class="controls" style="margin-left: 190px;">
                                           <INPUT  id=tomembernames
									type=text name=tomembernames  style="width:160px" >(多个之间用分号隔开)
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="tomembernamesHelp"></span>
                                        </div>
                                    </div>
                                   
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">收信会员组</label>
                                        <div class="controls" style="margin-left: 190px;">
           					 			<c:forEach var="bean" items="${membergroupList}" varStatus="status">
								<c:if test='${"0" == bean.type}'>
									<INPUT name="membergroups"  type="checkbox" value="${bean.id}"/>${bean.name}
								</c:if>
								</c:forEach>
								<br/>
           					 			<c:forEach var="bean" items="${membergroupList}" varStatus="status">
								<c:if test='${"1" == bean.type}'>
									<INPUT name="membergroups"  type="checkbox" value="${bean.id}"/>${bean.name}
								</c:if>
								</c:forEach>
                                        </div>
                                    </div>
                                    
                                    
                                    <div id="titleDiv" class="control-group">
                                        <label class="control-label" style="width:160px">标题</label>
                                        <div class="controls" style="margin-left: 190px;">
                                           <INPUT  id=title
									type=text name=title  style="width:160px" >
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="titleHelp"></span>
                                        </div>
                                    </div>
                                    
                                    <div id="contentDiv" class="control-group">
                                        <label class="control-label" style="width:160px">内容</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea   id=content1 name=content cols="40"  rows="3"></textarea>
      <span class="help-inline" id="contentHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<input type="submit"   class="btn btn-primary" value="发 送" />&nbsp;
											<a  onclick="history.back(-1)" class="btn"  >返 回</a>
                                        </div>
                                    </div>
                                </form>
							</div>
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->


	<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/checkAll.js"></script>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/msg.js"></script>
</body></html>