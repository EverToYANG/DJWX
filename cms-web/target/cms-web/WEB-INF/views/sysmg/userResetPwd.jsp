<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >
<%@include file="/include/loading.jsp" %>
<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="userResetPwdDo.do" name="form" id="form"  onsubmit="return resetPwdFormCheck();"/>
                                   <input type="hidden" name="ids" value="${param.ids }">
                                   <input type="hidden" name="names" value="${param.names }">
                                    <div id="newpwdDiv" class="control-group">
                                        <label class="control-label" style="width:80px">新密码</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="password" name="newpwd" id="newpwd" style="width:160px" value=""/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="newpwdHelp"></span>
                                        </div>
                                    </div>
                                </form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/user.js"></script>
</body></html>