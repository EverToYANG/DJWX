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
								<form class="form-horizontal" method="post" enctype="multipart/form-data"  action="linkEditDo.do" name="form" id="form"  onsubmit="return formCheck();"/>
                                   <input type="hidden" name="id" value="${link.id }">
                                   <input type="hidden" name="type" id="type" value="${param.type }">
                                    <div id="classDiv" class="control-group">
                                        <label class="control-label" style="width:90px">所属链接分类</label>
                                        <div class="controls" style="margin-left: 110px;">
								<select id="linkSelect" name="parid">
           					 			<c:forEach var="bean" items="${linkList}" varStatus="status">
										<option value="${bean.id }" ${bean.id eq linkClass.id ?"selected":"" } show="${bean.name }">${bean.name }
           					 			</c:forEach>
								</select>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="classHelp"></span>
                                        </div>
                                    </div>
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:90px">链接名称</label>
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
                                    <div id="imgDiv" class="control-group"  style="display:${link.type=='2'?'block':'none' }">
                                        <label class="control-label" style="width:90px">图片</label>
                                        <div class="controls" style="margin-left: 110px;">
                                        
                                        <input type="hidden" id="oldImg" name="oldImg" value="${link.img }"/>
							<c:if test='${link.img!=null && link.img != "" && link.img != "null"}'>
							<span id="oldImgSpan">
							<a href="/${link.img }?date=<%=UUID.randomUUID() %>" target="_blank"  title="点击查看大图" rel="tooltip" data-placement="top">
							<img src="/${link.img }?date=<%=UUID.randomUUID() %>" style="width:200px" />
							</a>
							<a href="javascript:delImg()" class="btn">删除原有图片</a>
							<br/>
							</span>
							</c:if>
									<input type="file" name="imgfile"  id="img">
                                        
                                        
                                        
                                        
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="imgHelp"></span>
                                        </div>
                                    </div>
                                    <div id="urlDiv" class="control-group">
                                        <label class="control-label" style="width:90px">链接地址</label>
                                        <div class="controls" style="margin-left: 110px;">
                                            <input type="text" name="url" id="url" style="width:160px" value="${link.url }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="urlHelp"></span>
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
<script src="${pageContext.request.contextPath}/static/admin/cms/js/link.js"></script>
</body></html>