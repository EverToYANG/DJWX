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
								<h5>办理信件</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="mailProDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${mail.id }">
			<input type="hidden" name="type" value="${mail.type }"/>
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
									
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">收信人</label>
                                        <div class="controls" style="margin-left: 190px;">
							<c:if test="${'unit' == mail.type}">
							部门: ${mail.unitname }
							</c:if>
							<c:if test="${'user' == mail.type}">
							个人: ${mail.username }
							</c:if>
                                        </div>
                                    </div>
                                    <div id="pagemarkDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">信件类型</label>
                                        <div class="controls" style="margin-left: 190px;">
								${mail.mailtype }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">信件标题</label>
                                        <div class="controls" style="margin-left: 190px;">
											${mail.title }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">写信人姓名</label>
                                        <div class="controls" style="margin-left: 190px;">
											${mail.writer }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">联系电话</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            ${mail.tel }
                                        </div>
                                    </div>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">联系地址</label>
                                        <div class="controls" style="margin-left: 190px;">
								${mail.address }
                                        </div>
                                    </div>
                                    <div id="templetDiv" class="control-group">
                                        <label class="control-label" style="width:160px">电子信箱</label>
                                        <div class="controls" style="margin-left: 190px;">
								${mail.email }
                                        </div>
                                    </div>
                                    <div id="contenttempletDiv" class="control-group">
                                        <label class="control-label" style="width:160px">是否公开</label>
                                        <div class="controls" style="margin-left: 190px;">
								${"1"==mail.isopen?"是":"否" }
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">信件内容</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        ${mail.content }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">添加时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${mail.addtime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">IP</label>
                                        <div class="controls" style="margin-left: 190px;">
								${mail.ip }
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">办理状态</label>
                                        <div class="controls" style="margin-left: 190px;">
                                          ${"1"==mail.state?"已办结":"办理中" }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">转办流程</label>
                                        <div class="controls" style="margin-left: 190px;">
									${mail.proflow }
                                        </div>
                                    </div>
                                    <div id="recontentDiv" class="control-group">
                                        <label class="control-label" style="width:160px">办理结果</label>
                                        <div class="controls" style="margin-left: 190px;">
									
                                            <textarea   id=recontent name=recontent cols="40"  rows="3">${mail.recontent }</textarea>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="recontentHelp"></span>
                                        </div>
                                    </div>
						<c:if test="${mail.retime != null}">
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">办理时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${mail.retime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                                     </c:if>
                                    
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<input type="submit"   class="btn btn-primary" value="办 结" />&nbsp;
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
<script src="${pageContext.request.contextPath}/static/admin/cms/js/mail.js"></script>
							
</body></html>