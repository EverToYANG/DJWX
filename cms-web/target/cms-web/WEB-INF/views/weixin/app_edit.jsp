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
				<span class="icon"><i class="icon-edit"></i></span>
				<h5>信息编辑</h5>
			</div>
			<div class="widget-content nopadding">
				<div class="widget-content nopadding">
					<form class="form-horizontal" method="post" action="editDo.do" name="form" id="form"  onsubmit="return formCheck();">
                        <input type="hidden" name="id" id="id" value="${wxapp.id }">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                        
                        <div id="nameDiv" class="control-group">
                            <label class="control-label" style="width:160px">名称</label>
                            <div class="controls" style="margin-left: 190px;">
                                <INPUT  id=name  maxLength=50 type=text name="title" value="${wxapp.title }"  style="width:160px">
								<span  style="color:Red;">*</span>
								<span class="help-inline" id="nameHelp"></span>
                            </div>
                        </div>
                        
                        <div class="control-group">
							<label class="control-label" style="width:160px">token</label>
							<div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name="token" value="${wxapp.token }" style="width:160px" ></div>
						</div>
						
						<div class="control-group">
							<label class="control-label" style="width:160px">aesKey</label>
							<div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name="aesKey" value="${wxapp.aesKey }" style="width:160px" ></div>
						</div>
						
						<div class="control-group">
							<label class="control-label" style="width:160px">域名</label>
							<div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name="domain" value="${wxapp.domain }" style="width:160px" ></div>
						</div>
						
                        <div class="control-group">
							<label class="control-label" style="width:160px">状态</label>
							<div class="controls" style="margin-left: 190px;">
								<label style="float:left"><input type="radio" name="status" value="1" checked/>启用</label>
								<label style="float:left"><input type="radio" name="status" value="0" ${"0"==wxapp.status?"checked":"" }/>关闭</label>
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
</div>
<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/wxapp.js"></script>

</body>
</html>