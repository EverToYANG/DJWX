<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >
<%@include file="/include/loading.jsp" %>

<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="creditruleEditDo.do"  name="form" id="form"  onsubmit="return formCheck();" >
                                   <input type="hidden" name="id" value="${creditrule.id }">
                                    <div id="codeDiv" class="control-group">
                                        <label class="control-label" style="width:110px">积分规则编码：</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="text" name="code" id="code" style="width:160px" value="${creditrule.code }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="codeHelp"></span>
                                        </div>
                                    </div>
                                     <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:110px">积分规则名称：</label>
                                        <div class="controls" style="margin-left: 100px;">
                                            <input type="text" name="name" id="name" style="width:160px" value="${creditrule.name }"/>
      <span  style="color:Red;">*</span>
      <span class="help-inline" id="nameHelp"></span>
                                        </div>
                                    </div>
                                    
                                      <div class="control-group" id="ordernumDiv">
                                        <label class="control-label" style="width:110px">序号：</label>
                                        <div class="controls" style="margin-left: 100px;">
											 <input type="text" name="ordernum" id="ordernum" style="width:160px" value="${creditrule.ordernum }"
											 oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
											  <span class="help-inline" id="ordernumHelp"></span>
                                        </div>
                                    </div>
                                                                                                        
                                    <div class="control-group" id="rewardtypeDiv">
                             <label class="control-label" style="width:110px">类型：</label>
                               <div class="controls" style="margin-left: 100px;">
<label style="float:left"><input type="radio" name="rewardtype" value="1"
<c:if test='${!empty creditrule || (creditrule.rewardtype == 1 && !empty creditrule.rewardtype)}'> checked="checked"</c:if>/>奖励</label>
<label style="float:left"><input type="radio" name="rewardtype" value="0"
<c:if test='${creditrule.rewardtype == 0 && !empty creditrule.rewardtype}'>checked="checked"</c:if> />惩罚</label>
                           </div>					
                             </div>
                             
                                <div class="control-group" id="ordernumDiv">
                                        <label class="control-label" style="width:110px">周期：</label>
                                        <div class="controls" style="margin-left: 100px;">
											<select name="cycletype" id="cycletype" style="width:110px" onchange="cycletypeChange(this)">
									<option value="0" ${"0"==creditrule.cycletype?"selected":"" }>
										一次性
									</option>
									<option value="1" ${"1"==creditrule.cycletype?"selected":"" }>
										每天一次
									</option>
									<option value="2" ${"2"==creditrule.cycletype?"selected":"" }>
										按间隔时间
									</option>
									<option value="3" ${"3"==creditrule.cycletype?"selected":"" }>
										不限制
									</option>
									</select>
											  <span class="help-inline" id="cycletypeHelp"></span>
                                        </div>
                                    </div>
                                    <div class="control-group" id="cycletimeDiv" style="display:${2 == creditrule.cycletype?"block":"none" }">
                                        <label class="control-label" style="width:110px">间隔时间(分)：</label>
                                        <div class="controls" style="margin-left: 100px;">
											 <input type="text" name="cycletime" id="cycletime" style="width:160px" value="${creditrule.cycletime }"
											 oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
											  <span class="help-inline" id="cycletimeHelp"></span>
                                        </div>
                                    </div>
                                       <div class="control-group" id="rewardnumDiv">
                                        <label class="control-label" style="width:110px">最多奖励次数：</label>
                                        <div class="controls" style="margin-left: 100px;">
											 <input type="text" name="rewardnum" id="rewardnum" style="width:160px" value="${creditrule.rewardnum }"
											 oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
											  <span class="help-inline" id="rewardnumHelp"></span>
                                        </div>
                                    </div>
                                    
                                       <div class="control-group" id="creditDiv">
                                        <label class="control-label" style="width:110px">积分值：</label>
                                        <div class="controls" style="margin-left: 100px;">
											 <input type="text" name="credit" id="credit" style="width:160px" value="${creditrule.credit }"
											 oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
											  <span class="help-inline" id="creditHelp"></span>
                                        </div>
                                    </div>
                                    
                                       <div class="control-group" id="experienceDiv">
                                        <label class="control-label" style="width:110px">经验值：</label>
                                        <div class="controls" style="margin-left: 100px;">
											 <input type="text" name="experience" id="experience" style="width:160px" value="${creditrule.experience }"
											 oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo')  onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')/>
											  <span class="help-inline" id="experienceHelp"></span>
                                        </div>
                                    </div>
                                    
                                </form>
							</div>
	<%@include file="/include/foot.jsp" %>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/creditrule.js"></script>
</body></html>