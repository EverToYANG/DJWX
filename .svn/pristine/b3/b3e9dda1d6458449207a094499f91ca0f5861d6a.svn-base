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
									<i class="icon-lock"></i>
								</span>
								<h5>密码设置</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="userPwdDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${user.id }">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                                    
                                    <div id="loginnameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">登录名</label>
                                        <div class="controls" style="margin-left: 190px;">
                                           <INPUT  id=loginname oninput="checkLoginName(this)" readonly
									maxLength=50 type=text name=loginname value="${user.loginname }" onpropertychange="checkLoginName(this)">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="loginnameHelp"></span>
                                        </div>
                                    </div>
                                    <div id="oldpwdDiv" class="control-group">
                                        <label class="control-label" style="width:160px">原密码</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT id=oldpwd type="password" maxLength=50 type=text name=oldpwd value="">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="oldpwdHelp"></span>
                                        </div>
                                    </div>
                                    <div id="pwdDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">新密码</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT id=pwd type="password" maxLength=50 type=text name=pwd value="">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="pwdHelp"></span>
                                        </div>
                                    </div>
                                    <div id="repwdDiv" class="control-group" >
                                        <label class="control-label" style="width:160px">确认新密码</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  id=repwd type="password" maxLength=50 type=text  value="">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="repwdHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<input type="submit"   class="btn btn-primary" value="保 存" />
                                        </div>
                                    </div>
                                </form>
							</div>
	<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/userPwd.js"></script>
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->


</body></html>