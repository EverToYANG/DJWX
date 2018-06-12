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

<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-edit"></i>
								</span>
								<h5>留言详情</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="guestbookProDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${guestbook.id }">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
									
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">姓名</label>
                                        <div class="controls" style="margin-left: 190px;">
							${consult.name }
                                        </div>
                                    </div>
                                    
                                    <!-- 
                                    <div id="templetDiv" class="control-group">
                                        <label class="control-label" style="width:160px">内容</label>
                                        <div class="controls" style="margin-left: 190px;">
								${guestbook.content }
                                        </div>
                                    </div> -->
                                    
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">添加时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${consult.addtime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                               
                                   <!-- <div class="control-group">
                                        <label class="control-label" style="width:160px">会员</label>
                                        <div class="controls" style="margin-left: 190px;">
							${guestbook.membername}
								</div>
                                    </div> 
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">审核状态</label>
                                        <div class="controls" style="margin-left: 190px;">
							<input type="radio" name="state" value="0" ${guestbook.state!="1" && guestbook.state!="2" ?"checked":"" }>未审核
							<input type="radio" name="state" value="1" ${guestbook.state=="1"?"checked":"" }>已审核
							<input type="radio" name="state" value="2" ${guestbook.state=="2"?"checked":"" }>审核不通过
                                        </div>
                                    </div> -->
                                    <div id="recontentDiv" class="control-group">
                                        <label class="control-label" style="width:160px">内容</label>
                                        <div class="controls" style="margin-left: 190px;">
									
                                            <textarea   id=recontent name=recontent cols="40"  rows="3">${consult.content }</textarea>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="recontentHelp"></span>
                                        </div>
                                    </div>
									
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<!-- <input type="submit"   class="btn btn-primary" value="回 复" />&nbsp; -->
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
<script src="${pageContext.request.contextPath}/static/admin/cms/js/guestbook.js"></script>
							
</body></html>