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
								<form class="form-horizontal" method="post" action="roleEditDo.do" name="form" id="form"  onsubmit="return formCheck();"/>
                                   <input type="hidden" name="id" value="${role.id }">
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:80px">角色</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="text" name="name" id="name" style="width:160px" value="${role.name }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="nameHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:80px">有效</label>
                                        <div class="controls" style="margin-left: 100px;">
											<label style="float:left"><input type="radio" name="isok" value="1" checked/>是</label>
											<label style="float:left"><input type="radio" name="isok" value="0" ${"0"==role.isok?"checked":"" }/>否</label>
                                        </div>
                                    </div>
                                </form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/sys/js/role.js"></script>
</body></html>