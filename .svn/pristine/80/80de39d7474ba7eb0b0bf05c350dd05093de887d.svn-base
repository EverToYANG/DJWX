<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="">

<%@include file="/include/bsie_head.jsp"%>

</head>

<body>
	<div class="widget-content nopadding">
		<form class="form-horizontal" enctype="multipart/form-data"
			method="post" action="siteEditDo.do" name="form" id="form"
			onsubmit="return formCheck();" />
		<input type="hidden" name="parid" value="${site.parid }"> <input
			type="hidden" name="id" id="siteId" value="${site.id }">
			
		<ul class="nav nav-tabs">
			<li class="active"><a href="#base" data-toggle="tab">基本信息</a></li>
			<li><a href="#other" data-toggle="tab">高级选项</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane active" id="base">
				<div id="nameDiv" class="control-group">
					<label class="control-label" style="width: 100px">名称</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="name" id="name" style="width: 160px"
							value="${site.name }" /> <span style="color: Red;">*</span> <span
							class="help-inline" id="nameHelp"></span>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">域名</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="sitedomain" id="sitedomain"
							style="width: 160px" value="${site.sitedomain }" rel="tooltip"
							data-placement="top" title="请输入站点域名,设置后可以通过此域名直接访问此站点" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">LOGO</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="hidden" id="oldLogo" name="oldLogo"
							value="${site.logo }" />
						<c:if
							test='${site.logo!=null && site.logo != "" && site.logo != "null"}'>
							<span id="oldLogoSpan"> <a
								href="${site.logo }?date=<%=UUID.randomUUID() %>"
								target="_blank"> <img
									src="/${site.sourcepath}${site.logo }?date=<%=UUID.randomUUID() %>"
									style="width: 200px" title="点击查看大图" />
							</a> 
							<a href="javascript:delLogo()" class="btn">删除原有LOGO</a> <br />
							</span>
						</c:if>
						<input type="file" name="logofile" id="logofile">
					</div>
				</div>
			
			</div>
			<div class="tab-pane" id="other">
				<div id="sourcepathDiv" class="control-group">
					<label class="control-label" style="width: 100px">源文件目录名</label>
					<div class="controls" style="margin-left: 120px;">
						<INPUT id=sourcepath 
							${site!=null && site.id!=null && site.id !=""?"readonly":"" }
							style="width: 160px" maxLength=50 type=text name=sourcepath
							value="${site.sourcepath }" rel="tooltip" data-placement="top"
							title="请输入站点的源文件目录名，此站点的相关文件将放在此目录下" /> <span style="color: Red;">*</span>
						<span class="help-inline" id="sourcepathHelp"></span>
					</div>
				</div>
				
				
				<div class="control-group">
					<label class="control-label" style="width: 100px">排序</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="ordernum" id="ordernum"
							style="width: 160px" value="${site.ordernum }"
							oninput=if(!isInt(value))value=
							''   onpropertychange=if(!isInt(value))execCommand(
							'undo')    onkeyup=if(!isInt(value))execCommand(
							'undo') onafterpaste=if(!isInt(value))execCommand( 'undo') />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">有效</label>
					<div class="controls" style="margin-left: 120px;">
						<label style="float: left"><input type="radio" name="state"
							value="1" checked />是</label> <label style="float: left"><input
							type="radio" name="state" value="0"
							${"0"==site.state?"checked":"" } />否</label>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" style="width: 100px">是否需要审核</label>
					<div class="controls" style="margin-left: 120px;">
						<label style="float: left"><input type="radio"
							name="auditState" value="1" checked />是</label> <label style="float: left">
							<input type="radio" name="auditState" value="0"
							${"0"==site.auditState?"checked":"" } />否</label>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">站点类型</label>
					<div class="controls" style="margin-left: 120px;">
						<select name="sitetype" id="sitetype" style="width: 150px">
							<option selected="selected" value="">----请选择----</option>
							<option value="1">PC站点</option>
							<option value="2">WAP站点</option>
							<option value="3">微官网</option>
						</select>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" style="width: 100px">版权</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="copyright" id="copyright"
							style="width: 160px" value="${site.copyright }" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">备案号</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="text" name="recordcode" id="recordcode"
							style="width: 160px" value="${site.recordcode }" />
					</div>
				</div>
				<div id="templetDiv" class="control-group">
					<label class="control-label" style="width: 100px">站点模板</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="hidden" name="templet"
							value="${site.templet }" id="templet"> <input
							type="text" id=templetName
							onclick="selectTemplet('${site.id }')" readonly
							style="cursor: hand; width: 160px" rel="tooltip"
							data-placement="top" title="请选择站点的页面模板" name=site.templetName
							value="${site.templetName }" /> 
							<!-- <a href="#" class="btn"
							onclick="syncRes()" rel="tooltip" data-placement="top"
							title="点击后将把模板资源文件(resources文件夹)复制并覆盖到此站点">同步资源文件</a> --> <span
							class="help-inline" id="templetHelp"></span>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" style="width: 100px">静态化调度</label>
					<div class="controls" style="margin-left: 120px;">
						<input type="hidden" name="htmlquartz_id" value="${htmlquartz.id }" />
						<table>
							<tr>
								<td><select id="htmlquartzType" name="htmlquartz_type"
									style="width: 150px" onchange="htmlquartzTypeChange(this)">
										<option value="">无</option>
										<option value="0" ${"0" == htmlquartz.type ?"selected":"" }>定时生成首页</option>
										<option value="1" ${"1" == htmlquartz.type ?"selected":"" }>间隔重复生成首页</option>
								</select></td>
								<td id="exetimeTd" style="display:${"0" == htmlquartz.type ?"block":"none" }">
									<select id="exetimehour" style="width: 55px"
									name="htmlquartz_exetimehour">
										<c:forEach var="obj" items="${hours}" varStatus="status">
											<option value="${obj }"
												${obj == htmlquartz.exetimehour ?"selected":"" }>${obj }</option>
										</c:forEach>
								</select>时 <select id="exetimemin" style="width: 55px"
									name="htmlquartz_exetimemin">
										<c:forEach var="obj" items="${mins}" varStatus="status">
											<option value="${obj }"
												${obj == htmlquartz.exetimemin ?"selected":"" }>${obj }</option>
										</c:forEach>
								</select>分
								</td>
								<td id="intervalTd" style="display:${"1" == htmlquartz.type ?"block":"none" }">
									<table>
										<tr>
											<td>间隔单位: <select id="intervalType" style="width: 65px"
												name="htmlquartz_intervaltype"
												onchange="intervalTypeChange(this)">
													<option value="0"
														${"0" == htmlquartz.intervaltype ?"selected":"" }>小时</option>
													<option value="1"
														${"1" == htmlquartz.intervaltype ?"selected":"" }>分钟</option>
											</select>
											</td>
											<td id="intervalhourTd" style="display:${"1" != htmlquartz.intervaltype ?"block":"none" }">
												<select id="intervalhour" style="width: 55px"
												name="htmlquartz_intervalhour">
													<c:forEach var="obj" items="${hours}" varStatus="status">
														<option value="${obj }"
															${obj == htmlquartz.intervalhour ?"selected":"" }>${obj }</option>
													</c:forEach>
											</select>时
											</td>
											<td id="intervalminTd" style="display:${"1" == htmlquartz.intervaltype ?"block":"none" }">
												<select id="intervalmin" style="width: 55px"
												name="htmlquartz_intervalmin">
													<c:forEach var="obj" items="${mins}" varStatus="status">
														<option value="${obj }"
															${obj == htmlquartz.intervalmin ?"selected":"" }>${obj }</option>
													</c:forEach>
											</select>分
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</div>
				</div>
			
			</div>
		</div>
		

		
		</from>
	</div>
	<%@include file="/include/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/static/admin/cms/js/site.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
	<script src="${pageContext.request.contextPath}/static/common/js/sco.modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/sco.confirm.js"></script>
</body>
</html>