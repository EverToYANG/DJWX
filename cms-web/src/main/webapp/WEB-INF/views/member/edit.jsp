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
			<div class="widget-title">
				<span class="icon"><i class="icon-edit"></i></span>
				<h5>会员信息编辑</h5>
			</div>
			<div class="widget-content nopadding">
				<div class="widget-content nopadding">
					<form class="form-horizontal" method="post" enctype="multipart/form-data" action="memberEditDo.do" name="form" id="form"  onsubmit="return formCheck();">
                        <input type="hidden" name="id" id="id" value="${member.id }">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                        <div  class="control-group">
                        	<label class="control-label" style="width:160px">党员类型</label>
                            <div class="controls" style="margin-left: 190px;">
								<input type="radio" id="type0" onclick="typeChange(0)" name="grouptype" value="0" >经验党员
								<input type="radio" id="type1" onclick="typeChange(1)" name="grouptype" value="1" >特殊党员
                            </div>
                        </div>
                        <div id="nameDiv" class="control-group">
                            <label class="control-label" style="width:160px">姓名</label>
                            <div class="controls" style="margin-left: 190px;">
                                <INPUT  id=name  maxLength=50 type=text name=name value="${member.name }"  style="width:160px">
									<span  style="color:Red;">*</span>
									<span class="help-inline" id="nameHelp"></span>
                            </div>
                        </div>
                        <div class="control-group">
                        	<label class="control-label" style="width:160px">性别</label>
                            <div class="controls" style="margin-left: 190px;">
								<label style="float:left"><input type="radio" name="sex" value="1" checked/>男</label>
								<label style="float:left"><input type="radio" name="sex" value="0" ${"0"==member.sex?"checked":"" }/>女</label>
                            </div>
                        </div>
                       
                        
                        <div class="control-group">
							<label class="control-label" style="width:160px">手机</label>
								<div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name=mobilephone value="${member.phone }" style="width:160px" ></div>
                                    </div>
                                    <div id="emailDiv" class="control-group">
                                        <label class="control-label" style="width:160px">电子邮箱</label>
                                        <div class="controls" style="margin-left: 190px;">
										<INPUT id="email" style="width:260px" 
											maxLength=50 type=text name=email value="${member.email }">
		      							<span class="help-inline" id="emailHelp"></span>
                                        </div>
                                    </div>
                        <div  class="control-group">
                        	<label class="control-label" style="width:160px">党员分组</label>
                            <div class="controls" style="margin-left: 190px;">
                            <c:forEach var="bean" items="${groupList}" varStatus="status">
								<input type="checkbox" name="groupid" value="${bean.ide }" checked="checked">${bean.name }	
							</c:forEach>
                            </div>
                        </div>
                                    
                        <div class="control-group">
                                        <label class="control-label" style="width:160px">头像</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <input type="hidden" id="oldImg" name="oldImg" value="${member.img }"/>
											<c:if test='${member.img!=null && member.img != "" && member.img != "null"}'>
											<span id="oldImgSpan">
											<a href="${pageContext.request.contextPath}${member.img }?date=<%=UUID.randomUUID() %>" target="_blank"  title="点击查看大图" rel="tooltip" data-placement="top">
											<img src="${pageContext.request.contextPath}${member.img }?date=<%=UUID.randomUUID() %>" style="width:200px" />
											</a>
											<a href="javascript:delImg()" class="btn">删除原有头像</a>
											<br/>
											</span>
											</c:if>
											<input type="file" name="imgfile"  id="imgfile">
                                        </div>
                                    </div>
                                    
                                    <div id="introDiv" class="control-group">
                                        <label class="control-label" style="width:160px">简介</label>
                                        <div class="controls" style="margin-left: 190px;">
                                            <textarea   id=intro name=intro cols="40"  rows="3">${member.intro }</textarea>
     										<span class="help-inline" id="introHelp"></span>
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
<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
<script src="${pageContext.request.contextPath}/static/member/js/member.js"></script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" defer="defer"></script>

</body>
</html>