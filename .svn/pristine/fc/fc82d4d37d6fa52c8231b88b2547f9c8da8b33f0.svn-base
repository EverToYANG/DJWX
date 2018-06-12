<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >
<%@include file="/include/loading.jsp" %>
<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="sensitiveEditDo.do" name="form" id="form"  onsubmit="return formCheck();"/>
                                   <input type="hidden" name="id" value="${sensitive.id }">
                                    <div id="sensitivewordDiv" class="control-group">
                                        <label class="control-label" style="width:80px">敏感词</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="text" name="sensitiveword" id="sensitiveword" style="width:160px" value="${sensitive.sensitiveword }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="sensitivewordHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:80px">替换为</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="text" name="replaceto" id="replaceto" style="width:160px" value="${sensitive.replaceto }"/>
                                        </div>
                                    </div>
                                </form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/sensitive.js"></script>
</body></html>