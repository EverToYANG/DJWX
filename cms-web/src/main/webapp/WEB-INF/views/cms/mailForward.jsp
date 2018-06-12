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
								<form class="form-horizontal" method="post" action="mailForwardDo.do" name="form" id="form"  />
			<input type="hidden" name="pageFuncId" id="pageFuncId" value="${param.pageFuncId }"/>
			<input type="hidden" name="id" value="${mail.id }"/>
			<input type="hidden" name="type" value="${mail.type }"/>
                                    <div class="control-group">
                                        <label class="control-label" style="width:90px">转交给</label>
                                        <div class="controls" style="margin-left: 110px;">
                                            
										<select id="forwardtype" name="forwardtype" onchange="typechange(this.value)">
										<option value="unit">部门
										<option value="user" ${"user" == mail.type ?"selected":""}>个人
										</select>
                                        </div>
                                    </div>
                                    <div id="unitdiv" class="control-group"  style="display:${"user" != mail.type ?"block":"none"}">
                                        <label class="control-label" style="width:90px">部门</label>
                                        <div class="controls" style="margin-left: 110px;">
           					 			<c:forEach var="bean" items="${unitList}" varStatus="status">
												<c:if test='${0==status.index}'>
										<input type="hidden" name="unitname" id="unitname" value="${bean.name }"/>
												</c:if>
           					 			</c:forEach>
										<select id="unitid" name="unitid" onchange="$('#unitname').val(this.options[this.selectedIndex].text);">
											
           					 			<c:forEach var="bean" items="${unitList}" varStatus="status">
												<option value="${bean.id }">${bean.name }
           					 			</c:forEach>
										</select>
                                        </div>
                                    </div>
                                    <div id="userdiv" class="control-group"  style="display:${"user" == mail.type ?"block":"none"}">
                                        <label class="control-label" style="width:90px">个人</label>
                                        <div class="controls" style="margin-left: 110px;">
                                        
           					 			<c:forEach var="bean" items="${userList}" varStatus="status">
												<c:if test='${0==status.index}'>
										<input type="hidden" name="username" id="username" value="${bean.name }"/>
												</c:if>
           					 			</c:forEach>
										<select id="userid" name="userid" onchange="$('#username').val(this.options[this.selectedIndex].text);">
           					 			<c:forEach var="bean" items="${userList}" varStatus="status">
												<option value="${bean.id }">${bean.name }
           					 			</c:forEach>
										</select>
                                        </div>
                                    </div>
                                </form>
							</div>
<%@include file="/include/bsie_foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/mail.js"></script>
</body></html>