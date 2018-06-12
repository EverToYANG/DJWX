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
<jsp:include page="/head.do" flush="true" />
<div class="container-fluid" >
      <div class="row-fluid">
		<div class="widget-box">
			<div class="widget-content nopadding">
				<div class="widget-content nopadding">
					<form class="form-horizontal" method="post" action="isManager.do" name="form" id="form"  onsubmit="return formCheck();">
                        <input type="hidden" name="id" id="id" value="${member.id }">
                        <input type="hidden" name="corpid" id="corpid" value="${member.wxappid }">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                        <div id="nameDiv" class="control-group">
                            <label class="control-label" style="width:160px">用户名称</label>
                            <div class="controls" style="margin-left: 190px;">
                                <INPUT  id="name"  type="hidden" name="name" value="${partyMember.name }"  style="width:160px">
                            </div>
                        </div>
                        
                        <div id="loginnameDiv" class="control-group">
                            <label class="control-label" style="width:160px">登录帐号</label>
                            <div class="controls" style="margin-left: 190px;">
                                <INPUT  id="loginname"  maxLength=50 type=text name="loginname" value="${partyMember.phone }"  style="width:160px">
									<span  style="color:Red;">*</span>
									<span class="help-inline" id="loginnameHelp"></span>
                            </div>
                        </div>
                        
                        <div id="pwdDiv"  class="control-group">
                        	<label class="control-label" style="width:160px">登录密码</label>
                            <div class="controls" style="margin-left: 190px;">
                            	<INPUT  id="pwd"  maxLength=50 type=text name="pwd" value=""  style="width:160px">
								<span  style="color:Red;">*</span>
								<span class="help-inline" id="pwdHelp"></span>
                            </div>
                        </div>
                      </form>
				</div>
			</div>
	     </div><!--/row-->
	</div><!--/span-->
</div>
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/member/js/member.js"></script>
</body>
</html>