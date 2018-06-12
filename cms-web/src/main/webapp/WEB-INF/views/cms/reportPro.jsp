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
								<h5>办理申报项目</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="reportProDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${report.id }">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
									
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">项目名称</label>
                                        <div class="controls" style="margin-left: 190px;">
							${report.name }
                                        </div>
                                    </div>
                                    <div id="pagemarkDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">申报单位</label>
                                        <div class="controls" style="margin-left: 190px;">
								${report.unit }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">申报文件名称</label>
                                        <div class="controls" style="margin-left: 190px;">
											${report.filename }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">申报文件文号</label>
                                        <div class="controls" style="margin-left: 190px;">
											${report.filenum }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">申报文件附件</label>
                                        <div class="controls" style="margin-left: 190px;">
                                          <c:if test='${report.attch!=null && report.attch!=""}'>
										<a href="${pageContext.request.contextPath}${report.attch }" target="_blank">附件下载</a>
										</c:if>
                                        </div>
                                    </div>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">签发人</label>
                                        <div class="controls" style="margin-left: 190px;">
								${report.issuer }
                                        </div>
                                    </div>
                                    <div id="templetDiv" class="control-group">
                                        <label class="control-label" style="width:160px">查询码</label>
                                        <div class="controls" style="margin-left: 190px;">
								${report.querycode }
                                        </div>
                                    </div>
                                    <div id="contenttempletDiv" class="control-group">
                                        <label class="control-label" style="width:160px">联系人</label>
                                        <div class="controls" style="margin-left: 190px;">
								${report.linkman}
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">联系电话</label>
                                        <div class="controls" style="margin-left: 190px;">
                                       ${report.tel }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">添加时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${report.addtime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">IP</label>
                                        <div class="controls" style="margin-left: 190px;">
								${report.ip }
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">办理状态</label>
                                        <div class="controls" style="margin-left: 190px;">
                                          ${"1"==report.state?"已办结":"办理中" }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">转办流程</label>
                                        <div class="controls" style="margin-left: 190px;">
									${report.proflow }
                                        </div>
                                    </div>
                                    <div id="recontentDiv" class="control-group">
                                        <label class="control-label" style="width:160px">办理结果</label>
                                        <div class="controls" style="margin-left: 190px;">
									
                                            <textarea   id=recontent name=recontent cols="40"  rows="3">${report.recontent }</textarea>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="recontentHelp"></span>
                                        </div>
                                    </div>
						<c:if test="${report.retime != null}">
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">办理时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${report.retime}" pattern="yyyy-MM-dd" />
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
<script src="${pageContext.request.contextPath}/static/admin/cms/js/report.js"></script>
							
</body></html>