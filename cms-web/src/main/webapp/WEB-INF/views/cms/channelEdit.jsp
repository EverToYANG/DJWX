<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@include file="/include/bsie_head.jsp"%>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-edit"></i>
					</span>
					<h5>栏目编辑</h5>
				</div>
				<div class="widget-content nopadding">
					<div class="widget-content nopadding">
						<form class="form-horizontal" method="post" action="channelEditDo.do" name="form" id="form" onsubmit="return formCheck();" enctype="multipart/form-data">
							<input type="hidden" name="id" id="id" value="${channel.id }"> <input type="hidden" name="parid" value="${channel.parid }"> <input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }" />
							<ul class="nav nav-tabs">
								<li class="active"><a href="#base" data-toggle="tab">基本信息</a></li>
								<li><a href="#other" data-toggle="tab">高级选项</a></li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="base">
									<c:if test="${channel.id!=null}">
										<div class="control-group">
											<label class="control-label" style="width: 100px">栏目ID</label>
											<div class="controls" style="margin-left: 130px;">
												<INPUT maxLength=50 type=text value="${channel.id }" readonly style="width: 160px">
											</div>
										</div>
									</c:if>
									<c:if test="${channel.indexnum!=null && channel.indexnum > 0}">
										<div class="control-group">
											<label class="control-label" style="width: 100px">索引号</label>
											<div class="controls" style="margin-left: 130px;">
												<INPUT maxLength=50 type=text value="${channel.indexnum }" readonly style="width: 160px">
											</div>
										</div>
									</c:if>
									<div id="nameDiv" class="control-group">
										<label class="control-label" style="width: 100px">栏目名称</label>
										<div class="controls" style="margin-left: 130px;">
											<INPUT id=name maxLength=50 type=text name=name value="${channel.name }" style="width: 160px"> <span style="color: Red;">*</span> <span class="help-inline" id="nameHelp"></span>
										</div>
									</div>
									
									<div class="control-group">
										<label class="control-label" style="width: 100px">有效</label>
										<div class="controls" style="margin-left: 130px;">
											<label style="float: left"><input type="radio" name="state" value="1" checked />是</label> <label style="float: left"><input type="radio" name="state" value="0" ${"0"==channel.state?"checked":"" } />否</label>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="width: 100px">导航</label>
										<div class="controls" style="margin-left: 130px;">
											<label style="float: left"><input type="radio" name="navigation" value="1" checked />是</label> <label style="float: left"><input type="radio" name="navigation" value="0" ${"0"==channel.navigation?"checked":"" } />否</label>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="width: 100px">排序</label>
										<div class="controls" style="margin-left: 130px;">
											<input type="text" name="ordernum" id="ordernum" style="width: 160px" value="${channel.ordernum }" oninput=if(!isInt(value))value= ''   onpropertychange=if(!isInt(value))execCommand( 'undo')  onkeyup=if(!isInt(value))execCommand( 'undo') onafterpaste=if(!isInt(value))execCommand( 'undo') />
										</div>
									</div>
									

									<div class="control-group">
										<label class="control-label" style="width: 100px">栏目描述</label>
										<div class="controls" style="margin-left: 130px;">
											<script type="text/plain" id="editor" name="description" style="height: 300px;">${channel.content }</script>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="other">
									<div id="templetDiv" class="control-group">
										<label class="control-label" style="width: 100px">栏目模板</label>
										<div class="controls" style="margin-left: 130px;">
											<INPUT id=templet readonly style="cursor: hand" title="请选择此栏目的页面模板，默认为站点所选模板中的channel.html" rel="tooltip" data-placement="top" onclick="selectTempletFile('${manageSite.templet }','templet')" type=text name=templet value="${channel.templet }" style="width:160px"> <span class="help-inline" id="templetHelp"></span>
										</div>
									</div>
									
									<div class="control-group">
										<label class="control-label" style="width: 100px">栏目图片</label>
										<div class="controls" style="margin-left: 130px;">
											<input type="hidden" id="oldImg" name="oldImg" value="${channel.img }" />
											<c:if test='${channel.img!=null && channel.img != "" && channel.img != "null"}'>
												<span id="oldImgSpan"> <a href="/${site.sourcepath}${channel.img }?date=<%=UUID.randomUUID() %>" target="_blank" title="点击查看大图" rel="tooltip" data-placement="top"> <img src="/${site.sourcepath}${channel.img }?date=<%=UUID.randomUUID() %>" style="width: 200px" />
												</a> <a href="javascript:delImg()" class="btn">删除原有栏目图片</a> <br />
												</span>
											</c:if>
											<input type="file" name="imgfile" id="imgfile">
										</div>
									</div>
									<!-- 对页面隐藏 -->
									<div style="display:none;">
									
										<div class="control-group">
											<label class="control-label" style="width: 100px">生成静态页面最大页数</label>
											<div class="controls" style="margin-left: 130px;">
												<input type="text" name="maxpage" id="maxpage" style="width: 160px" value="${channel.maxpage }" title="请输入栏目的生成静态页面最大页数,0表示不限制。" rel="tooltip" data-placement="top" onkeyup=if(!isInt(value))execCommand( 'undo') onafterpaste=if(!isInt(value))execCommand( 'undo') />
											</div>
										</div>
										
										<div class="control-group">
											<label class="control-label" style="width: 100px">静态化调度</label>
											<div class="controls" style="margin-left: 130px;">
												<input type="hidden" name="htmlquartz_id" value="${htmlquartz.id }" />
												<table>
													<tr>
														<td><select id="htmlquartzType" name="htmlquartz_type" style="width: 150px" onchange="htmlquartzTypeChange(this)">
																<option value="">无</option>
																<option value="0" ${"0" == htmlquartz.type ?"selected":"" }>定时生成首页</option>
																<option value="1" ${"1" == htmlquartz.type ?"selected":"" }>间隔重复生成首页</option>
														</select></td>
														<td id="exetimeTd" style="display:${"0" == htmlquartz.type ?"block":"none" }"><select id="exetimehour" style="width: 55px" name="htmlquartz_exetimehour">
																<c:forEach var="obj" items="${hours}" varStatus="status">
																	<option value="${obj }" ${obj == htmlquartz.exetimehour ?"selected":"" }>${obj }</option>
																</c:forEach>
														</select>时 <select id="exetimemin" style="width: 55px" name="htmlquartz_exetimemin">
																<c:forEach var="obj" items="${mins}" varStatus="status">
																	<option value="${obj }" ${obj == htmlquartz.exetimemin ?"selected":"" }>${obj }</option>
																</c:forEach>
														</select>分</td>
														<td id="intervalTd" style="display:${"1" == htmlquartz.type ?"block":"none" }">
															<table>
																<tr>
																	<td>间隔单位: <select id="intervalType" style="width: 65px" name="htmlquartz_intervaltype" onchange="intervalTypeChange(this)">
																			<option value="0" ${"0" == htmlquartz.intervaltype ?"selected":"" }>小时</option>
																			<option value="1" ${"1" == htmlquartz.intervaltype ?"selected":"" }>分钟</option>
																	</select>
																	</td>
																	<td id="intervalhourTd" style="display:${"1" != htmlquartz.intervaltype ?"block":"none" }"><select id="intervalhour" style="width: 55px" name="htmlquartz_intervalhour">
																			<c:forEach var="obj" items="${hours}" varStatus="status">
																				<option value="${obj }" ${obj == htmlquartz.intervalhour ?"selected":"" }>${obj }</option>
																			</c:forEach>
																	</select>时</td>
																	<td id="intervalminTd" style="display:${"1" == htmlquartz.intervaltype ?"block":"none" }"><select id="intervalmin" style="width: 55px" name="htmlquartz_intervalmin">
																			<c:forEach var="obj" items="${mins}" varStatus="status">
																				<option value="${obj }" ${obj == htmlquartz.intervalmin ?"selected":"" }>${obj }</option>
																			</c:forEach>
																	</select>分</td>
																</tr>
															</table>
														</td>
													</tr>
												</table>
											</div>
										</div>
									
									</div>
								</div>
							</div>

							<div class="control-group">
								<div class="controls" style="margin-left: 130px;">
									<input type="submit" class="btn btn-primary" value="保 存" />&nbsp; <a onclick="history.back(-1)" class="btn">返 回</a>
								</div>
							</div>
						</form>
					</div>

				</div>
			</div>
			<!--/row-->


		</div>
		<!--/span-->
		<%@include file="/include/foot.jsp"%>
		<script>
            basePath="${pageContext.request.contextPath}";
        </script>
		<script src="${pageContext.request.contextPath}/static/common/js/check.js"></script>
		<script src="${pageContext.request.contextPath}/static/common/js/checkLoginName.js"></script>
		<script src="${pageContext.request.contextPath}/static/admin/cms/js/channel.js"></script>

		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/ueditor.config.js"></script>
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/ueditor.all.min.js"> </script>
		<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
		<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/lang/zh-cn/zh-cn.js"></script>

		<script type="text/javascript">
	    //实例化编辑器
	    var ue = UE.getEditor('editor');
	    </script>
</body>
</html>