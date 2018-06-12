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
								<form class="form-horizontal" method="post" action="linkClazzEditDo.do" name="form" id="form"  onsubmit="return formCheck();"/>
                                   <input type="hidden" name="id" value="${link.id }">
                                   <input type="hidden" name="type" value="${param.type }">
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:90px">链接分类名称</label>
                                        <div class="controls" style="margin-left: 110px;">
                                            <input type="text" name="name" id="name" style="width:160px" value="${link.name }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="nameHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:90px">页面标识</label>
                                        <div class="controls" style="margin-left: 110px;">
                                            <input rel="tooltip" data-placement="top" title="用于唯一区分此链接分类在页面中的位置"
                                             type="text" name="pagemark" id="pagemark" style="width:160px" value="${link.pagemark }"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:90px">有效</label>
                                        <div class="controls" style="margin-left: 110px;">
											<label style="float:left"><input type="radio" name="isok" value="1" checked/>是</label>
											<label style="float:left"><input type="radio" name="isok" value="0" ${"0"==link.isok?"checked":"" }/>否</label>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:90px">排序</label>
                                        <div class="controls" style="margin-left: 110px;">
                                            <input type="text" name="ordernum" id="ordernum" style="width:160px"   value="${link.ordernum }"
                                          oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />
                                        </div>
                                    </div>
                                </form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/linkClazz.js"></script>
</body></html>