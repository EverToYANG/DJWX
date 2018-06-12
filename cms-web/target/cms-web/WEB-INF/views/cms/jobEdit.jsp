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
								<h5>职位编辑</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post"  action="jobEditDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${job.id }">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
			
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">职位名称</label>
                                        <div class="controls" style="margin-left: 190px;">
                                           <INPUT  id=name  
									maxLength=50 type=text name=name value="${job.name }"  style="width:160px">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="nameHelp"></span>
                                        </div>
                                    </div>
                                    <div id="pagemarkDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">所属部门</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  id=unitname type="text" maxLength=50 type=text name=unitname  style="width:160px" value="${job.unitname }">
                                        </div>
                                    </div>
                                    
                                    <div id="pagemarkDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">工作地点</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  id=address type="text" maxLength=50 type=text name=address  style="width:160px" value="${job.address }">
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">招聘人数</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <input type="text" name="num" id="num" style="width:160px"   value="${job.num }"
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />
                                        </div>
                                    </div>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">工作职责</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea   id=duty name=duty cols="40"  rows="3">${job.duty }</textarea>
                                        </div>
                                    </div>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">职位要求</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea   id=jobrequire name=jobrequire cols="40"  rows="3">${job.jobrequire }</textarea>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">添加时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <input name="addtime" rel="tooltip" data-placement="top" title="请选择添加时间，默认是当前时间"
                                        class="Wdate" id="addtime" type="text"  style="width:160px" size="14" readonly value="${job.addtimeStr}"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd'})"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">结束时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <input name="endtime" 
                                        class="Wdate" id="endtime" type="text"  style="width:160px" size="14" readonly value="${job.endtimeStr}"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd'})"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<input type="submit"   class="btn btn-primary" value="保 存" />&nbsp;
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
<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" defer="defer"></script>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/job.js"></script>
							

</body></html>