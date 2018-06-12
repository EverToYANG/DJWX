<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<%@include file="/include/bsie_head.jsp" %>
</head>

<body>
<div class="container-fluid" >
      <div class="row-fluid">
		<div class="widget-box">
			<div class="widget-title">
				<span class="icon">
					<i class="icon-edit"></i>
				</span>
				<h5>党员资料</h5>
			</div>
			<div class="widget-content nopadding">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#base" data-toggle="tab">基本信息</a></li>
					<li><a href="#learn" data-toggle="tab">学习记录</a></li>
					<li><a href="#actit" data-toggle="tab">活动记录</a></li>
					<li><a href="#exam" data-toggle="tab">考试记录</a></li>
					<li><a href="#more" data-toggle="tab">其他选项</a></li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="base">
                    	<div id="nameDiv" class="control-group">
                        	<label class="control-label" style="width:160px">真实姓名</label>
                        	<div class="controls" style="margin-left: 190px;">
							<INPUT  id=name maxLength=50 type=text name=name value="${loginMember.name }">
								<span  style="color:Red;">*</span>
								<span class="help-inline" id="nameHelp"></span>
                            </div>
                        </div>
                        <div class="control-group">
                                        <label class="control-label" style="width:160px">性别</label>
                                        <div class="controls" style="margin-left: 190px;">
											<label style="float:left"><input type="radio" name="sex" value="1" checked/>男</label>
											<label style="float:left"><input type="radio" name="sex" value="0" ${"0"==loginMember.sex?"checked":"" }/>女</label>
                                        </div>
                        </div>
                        <div class="control-group">
                             <label class="control-label" style="width:160px">出生日期</label>
                             <div class="controls" style="margin-left: 190px;">
                             	<input name="birthday" id="birthday" type="text" size="14" readonly value="${loginMember.birthdayStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd',maxDate:'%y-%M-%d'})"/>
                            </div>
                        </div>
                        <div class="control-group">
                        	<label class="control-label" style="width:160px">联系电话</label>
                            <div class="controls" style="margin-left: 190px;">
							<INPUT  maxLength=50 type=text name=tel value="${loginMember.tel }"></div>
                        </div>
                        <div class="control-group">
                        	<label class="control-label" style="width:160px">手机</label>
                        	<div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name=mobilephone value="${loginMember.mobilephone }"></div>
                                    </div>
                                    <div id="emailDiv" class="control-group">
                                        <label class="control-label" style="width:160px">电子邮箱</label>
                                        <div class="controls" style="margin-left: 190px;">
										<INPUT id="email"
											maxLength=50 type=text name=email value="${loginMember.email }">
		      							<span class="help-inline" id="emailHelp"></span>
                                        </div>
                                    </div>
                                   
                                    <div id="introDiv" class="control-group">
                                        <label class="control-label" style="width:160px">简介</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea   id=intro name=intro cols="40"  rows="3">${loginMember.intro }</textarea>
      										<span class="help-inline" id="introHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<input type="submit"   class="btn btn-primary" value="保 存" />
                                        </div>
                                    </div>
					</div>
					<div class="tab-pane" id="learn"></div>
					<div class="tab-pane" id="exam"></div>
				</div>
			</div><!--/row-->
		</div>
	</div><!--/span-->
	</div>

	<%@include file="/include/foot.jsp" %>
	<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
	<script src="${pageContext.request.contextPath}/static/member/js/profile.js"></script>
	<script src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js"></script>

</body>
</html>