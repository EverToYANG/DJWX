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
				<h5>党员信息</h5>
			</div>
			<div class="widget-content nopadding">
				<div class="widget-content nopadding">
					<form class="form-horizontal" method="post" action="editDo.do" name="form" id="form"  onsubmit="return formCheck();">
                        <input type="hidden" name="id" id="id" value="${partyMember.id }">
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
                        <div id="nameDiv" class="control-group">
                            <label class="control-label" style="width:160px">姓名</label>
                            <div class="controls" style="margin-left: 190px;">
                                <INPUT id="name"  maxLength=50 type=text name="name" value="${partyMember.name }"  style="width:160px">
								<span style="color:Red;">*</span>
								<span class="help-inline" id="nameHelp"></span>
                            </div>
                        </div>
                        
                        <div id="idcodeDiv" class="control-group">
                             <label class="control-label" style="width:160px">身份证号码</label>
                             <div class="controls" style="margin-left: 190px;">
								<INPUT maxLength=18 type=text id="idcode" name="idcode" value="${partyMember.idcode }" style="width:160px" >
								<span style="color:Red;">*</span>
								<span class="help-inline" id="idcodeHelp"></span>
							</div>
                        </div>
                        
                        <div class="control-group">
                             <label class="control-label" style="width:160px">联系电话</label>
                             <div class="controls" style="margin-left: 190px;">
								<INPUT  maxLength=50 type=text name="phone" value="${partyMember.phone }" style="width:160px" ></div>
                        </div>
                                    
                        <div id="eduDiv" class="control-group">
                             <label class="control-label" style="width:160px">学       历</label>
                             <div class="controls" style="margin-left: 190px;">
								<select id="edu" name="edu">
									<option value="1">博士研究生</option>
									<option value="2">硕士研究生</option>
									<option value="3">大学本科</option>
									<option value="4">大专</option>
								</select>
		      					<span class="help-inline" id="eduHelp"></span>
                             </div>
                        </div>
                        
                        <div class="control-group">
                            <label class="control-label" style="width:160px">入党时间</label>
                            <div class="controls" style="margin-left: 190px;">
                                 <input name="jointime" class="Wdate" id="jointime" type="text"  style="width:160px" size="14" readonly value="${partyMember.jointime }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd',maxDate:'%y-%M-%d'})"/>
                            </div>
                        </div>
                        
                        <div id="unitidDiv" class="control-group">
                             <label class="control-label" style="width:160px">党支部</label>
                             <div class="controls" style="margin-left: 190px;">
								<c:forEach var="bean" items="${unitList}" varStatus="status">
								<input type="radio" name="unitid" value="${bean.id }"  >${bean.name }&nbsp;&nbsp;	
								</c:forEach>
		      					<span class="help-inline" id="unitidHelp"></span>
                             </div>
                        </div>
                        
                        <div  class="control-group">
                        	<label class="control-label" style="width:160px">党员类型</label>
                            <div class="controls" style="margin-left: 190px;">
                            <c:forEach var="bean" items="${groupList}" varStatus="status">
								<input type="radio" name="groupid" value="${bean.id }" >${bean.name }&nbsp;&nbsp;	
							</c:forEach>
                            </div>
                        </div>
                                    
                        <div id="introDiv" class="control-group">
                             <label class="control-label" style="width:160px">简介</label>
                             <div class="controls" style="margin-left: 190px;">
                                    <textarea id=intro name=intro cols="40"  rows="3">${partyMember.intro }</textarea>
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
<script src="${pageContext.request.contextPath}/static/member/js/partym.js"></script>
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" defer="defer"></script>
</body>
</html>