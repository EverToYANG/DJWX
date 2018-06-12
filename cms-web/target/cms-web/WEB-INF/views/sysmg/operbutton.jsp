<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>信息管理系统</title>
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
<input type="hidden" id="pageFuncId" value="${param.pageFuncId }">

	<%@include file="/include/loading.jsp" %>
          <div class="container-fluid" style="padding-left:5px;padding-right:5px;>
      <div class="row-fluid">
<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>操作按钮管理</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
								<table class="table table-bordered table-striped table-hover" id="rows">
									<thead>
										<tr>
											<th style="min-width:160px">操作按钮</th>
											<th>样式</th>
											<th style="min-width:80px">有效</th>
											<th >排序</th>
											<th>执行JS代码</th>
											<th style="min-width:120px">操作</th>
										</tr>
									</thead>
									<tbody>
									<tr >
								      <td >
								    <input type="text"  style="width:90%" id="name" name="name" size="8" MAXLENGTH="50" >
								      </td>
								      <td >
											<select id="css" name="css">
												<option value=""/>默认:带渐变的标准灰色按钮
												<option value="btn-primary"/>主要:提供额外的视觉感, 可在一系列的按钮中指出主要操作
												<option value="btn-info"/>信息:默认样式的替代样式
												<option value="btn-success"/>成功:表示成功或积极的动作
												<option value="btn-warning"/>警告:提醒应该谨慎采取这个动作
												<option value="btn-danger"/>危险:表示这个动作危险或存在危险
												<option value="btn-inverse"/>反向:备用的暗灰色按钮
												<option value="btn-link"/>链接:简化一个按钮, 使它看起来像一个链接，同时保持按钮的行为
											</select>
								      </td>
								      <td >
								     <label style="float:left"><input type="radio" id="isok1" name="isok" value="1" checked="checked"/>是</label>
								    <label style="float:left"><input type="radio" id="isok0" name="isok" value="0" />否</label>
								      </td>
								      
								      <td >
								     
								    <input type="text" style="width:80%" id="order" oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo') onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')  name="order" MAXLENGTH="4"  >
								      </td>
								      <td >
								    <input type="text" style="width:96%" size="40" id="code" name="code" MAXLENGTH="500" >
								      </td>
								      <td >
								    <input type="button" class="btn" value="添加" onclick="addOperbutton('${param.funcid }')">
								      </td>
								    </tr>
           					 			<c:forEach var="operbutton" items="${list}" varStatus="status">
										<tr id="tr${operbutton.id}">
									      <td >
									     
									    <input type="text" style="width:90%" value="${operbutton.name }" size="8" id="name${operbutton.id}" name="name${operbutton.id}" MAXLENGTH="50" >
									      </td><td >
											<select id="css${operbutton.id}" name="css${operbutton.id}">
												<option value=""/>默认:带渐变的标准灰色按钮
												<option value="btn-primary" ${"btn-primary" == operbutton.css?"selected":"" }/>主要:提供额外的视觉感, 可在一系列的按钮中指出主要操作
												<option value="btn-info" ${"btn-info" == operbutton.css?"selected":"" }/>信息:默认样式的替代样式
												<option value="btn-success" ${"btn-success" == operbutton.css?"selected":"" }/>成功:表示成功或积极的动作
												<option value="btn-warning" ${"btn-warning" == operbutton.css?"selected":"" }/>警告:提醒应该谨慎采取这个动作
												<option value="btn-danger" ${"btn-danger" == operbutton.css?"selected":"" }/>危险:表示这个动作危险或存在危险
												<option value="btn-inverse" ${"btn-inverse" == operbutton.css?"selected":"" }/>反向:备用的暗灰色按钮
												<option value="btn-link" ${"btn-link" == operbutton.css?"selected":"" }/>链接:简化一个按钮, 使它看起来像一个链接，同时保持按钮的行为
											</select>
								      </td>
									      <td >
									     <label style="float:left"><input type="radio"  id="isok${operbutton.id}1" name="isok${operbutton.id}" value="1" checked="checked"/>是</label>
									     <label style="float:left"><input type="radio" id="isok${operbutton.id}0" name="isok${operbutton.id}"  value="0" ${"1" != operbutton.isok?"checked":""}/>否</label>
									      </td>
									      <td >
									     
									    <input type="text" style="width:80%" onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')  value="${operbutton.ordernum }" id="order${operbutton.id}" name="order${operbutton.id}" MAXLENGTH="4" size="1" >
									      </td>
									      <td >
									    <input type="text" style="width:96%" value="${operbutton.code }" id="code${operbutton.id}" name="code${operbutton.id}" MAXLENGTH="500" >
									      </td>
									      <td >
									    <input type="button" value="修改" onclick="updateOperbutton('${operbutton.id}')" class="btn">
									    <input type="button" value="删除" onclick="delOperbutton('${operbutton.id}')" class="btn">
									      </td>
									    </tr>
										
           					 			</c:forEach>
									</tbody>
								</table>		
							<div id="errorDiv" class="alert alert-error hide">
					            <span id="errorInfo"></span>
					          </div>
					          
  <span id="state" style="display:none"><img src="../img/loading.gif">正在操作中...</span>			
							</div>
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->
<button id="btnSubmit" type="button" style="display:none" onclick="parent.closeWindow();">确 定</button>
	<%@include file="/include/bsie_foot.jsp" %>
            <script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
            <script src="${pageContext.request.contextPath}/static/admin/sys/js/operbutton.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
            <script src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>

</body></html>