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
								<h5>用户编辑</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="userEditDo.do" name="form" id="form"  onsubmit="return formCheck();">
                                   <input type="hidden" name="id" id="id" value="${user.id }">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">单位</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea  rel="tooltip" data-placement="top" title="点击选择所属单位" readonly="readonly" onclick="unitSelect()"
									maxLength=50 id=unitnames name=unitNames cols="40" style="width:160px" rows="3">${user.unitNames }</textarea>
									<a href="javascript:clearUnit()"  rel="tooltip" class="btn" data-placement="top" title="点击清除所有单位" >清除</a>
									
									<input type="hidden" name="unitid" id="unitids" value="${user.unitIds }"/>
                                        </div>
                                    </div>
                                    <div id="loginnameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">登录名</label>
                                        <div class="controls" style="margin-left: 190px;">
                                           <INPUT  id=loginname oninput="checkLoginName(this)" 
									maxLength=50 type=text name=loginname value="${user.loginname }"  style="width:160px" onpropertychange="checkLoginName(this)">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="loginnameHelp"></span>
                                        </div>
                                    </div>
                                    <div id="pwdDiv" class="control-group" style="display:${not empty user.id?"none":"block" }">
                                        <label class="control-label" style="width:160px">登录密码</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT id=pwd type="password" maxLength=50 type=text name=pwd  style="width:160px" value="">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="pwdHelp"></span>
                                        </div>
                                    </div>
                                    <div id="repwdDiv" class="control-group" style="display:${not empty user.id?"none":"block" }">
                                        <label class="control-label" style="width:160px">确认登录密码</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  id=repwd type="password" maxLength=50 type=text   style="width:160px" value="">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="repwdHelp"></span>
                                        </div>
                                    </div>
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">真实姓名</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  id=name maxLength=50 type=text name=name  style="width:160px" value="${user.name }">
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="nameHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">性别</label>
                                        <div class="controls" style="margin-left: 190px;">
											<label style="float:left"><input type="radio" name="sex" value="1" checked/>男</label>
											<label style="float:left"><input type="radio" name="sex" value="0" ${"0"==user.sex?"checked":"" }/>女</label>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">出生日期</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <input name="birthday" class="Wdate" id="birthday" type="text"  style="width:160px" size="14" readonly value="${user.birthdayStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd',maxDate:'%y-%M-%d'})"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">联系电话</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name=tel value="${user.tel }" style="width:160px" ></div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">手机</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name=mobilephone value="${user.mobilephone }" style="width:160px" ></div>
                                    </div>
                                    <div id="emailDiv" class="control-group">
                                        <label class="control-label" style="width:160px">电子邮箱</label>
                                        <div class="controls" style="margin-left: 190px;">
								<INPUT id="email" style="width:260px" 
									maxLength=50 type=text name=email value="${user.email }">
      <span class="help-inline" id="emailHelp"></span>
                                        </div>
                                    </div>
                                     <div  class="control-group" style="display:${not empty user.id?"none":"block" }">
                                        <label class="control-label" style="width:160px">角色</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea  rel="tooltip" data-placement="top" title="点击选择角色进行授权" readonly="readonly" onclick="roleSelect()"
									maxLength=50 id=rolenames name=roleNames cols="40" style="width:160px"  rows="3">${user.roleNames }</textarea>
									<a href="javascript:clearRole()"  rel="tooltip" class="btn" data-placement="top" title="点击清除所有角色" title="">清除</a>
									<input type="hidden" name="roleid" id="roleids" value=""/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">是否接收互动信件</label>
                                        <div class="controls" style="margin-left: 190px;">
											<label style="float:left"><input type="radio" name="ismail" value="1" checked/>是</label>
											<label style="float:left"><input type="radio" name="ismail" value="0" ${"0"==user.ismail?"checked":"" }/>否</label>
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
<script src="${pageContext.request.contextPath}/static/admin/sys/js/user.js"></script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" defer="defer"></script>
</body></html>