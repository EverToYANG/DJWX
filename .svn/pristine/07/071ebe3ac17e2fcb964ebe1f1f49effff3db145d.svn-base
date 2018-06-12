<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder"%>
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
					<h5>信息编辑</h5>
				</div>
				<div class="widget-content nopadding">
					<form class="form-horizontal" method="post" enctype="multipart/form-data" action="infoEditDo.do" name="form" id="form" onsubmit="return formCheck();">
						<input type="hidden" name="id" id="id" value="${info.id }" /> 
						<input type="hidden" name="channelid" value="${channel.id }" /> 
						<input type="hidden" name="isShowHead" value="${param.isShowHead }" /> 
						<input type="hidden" name="type" value="<%=((request.getParameter("channelid")!=null || request.getParameter("id")!=null)?"channel":"quick")%>" /> 
						<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }" />
						<ul class="nav nav-tabs">
							<li class="active"><a href="#base" data-toggle="tab">基本信息</a></li>
							<li><a href="#video" data-toggle="tab">视频</a></li>
							<li><a href="#more" data-toggle="tab">其他选项</a></li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane active" id="base">
								<div id="channelDiv" class="control-group">
									<label class="control-label" style="width: 100px">所属栏目</label>
									<div class="controls" style="margin-left: 120px;">
										<input type="hidden" name="channel" id="channelId" value="${channel.id }" /> 
										<input type="hidden" name="oldchannelid" value="${channel.id }" /> 
										<INPUT style="width: 160px" readonly id="channelName" onclick="selectChannel()" 
										style="cursor:hand" rel="tooltip" data-placement="top" title="点击选择栏目" 
										maxLength=50 type=text name=channelname value="${channel.name }" /> 
										<span style="color: Red;">*</span> <span class="help-inline" id="channelHelp"></span>
									</div>
								</div>
								<div id="titleDiv" class="control-group">
									<label class="control-label" style="width: 100px">标题</label>
									<div class="controls" style="margin-left: 120px;">
										<INPUT id="title" maxLength=250 type=text name=title value="${info.title }" /> <span style="color: Red;">*</span> <span class="help-inline" id="titleHelp"></span>
									</div>
								</div>
								
								<div id="descriptionDiv" class="control-group">
									<label class="control-label" style="width: 100px">摘要</label>
									<div class="controls" style="margin-left: 120px;">
										<textarea id=description name=description cols="40" rows="3">${info.description }</textarea>
										<span class="help-inline" id="descriptionHelp"></span>
									</div>
								</div>
								<div id="contentDiv" class="control-group">
									<label class="control-label" style="width: 100px">内容</label>
									<div class="controls" style="margin-left: 120px;">
										<script type="text/plain" id="editor" name="content" style="width: 99%; height: 300px;">${info.content }</script>
										<span class="help-inline" id="contentHelp"></span>
									</div>
								</div>
								
							</div>
							
							
							<div class="tab-pane" id="video">
								<div id="videoDiv" class="control-group">
									<label class="control-label" style="width: 100px">视频地址</label>
									<div class="controls" style="margin-left: 120px;">
										<INPUT id=video rel="tooltip" data-placement="top" title="可以直接输入flv格式的视频地址" maxLength=250 size="45" type=text name=video value="${info.video }"><br> <span class="help-inline" id="videoHelp"></span>
									</div>
								</div>
								<div id="videoDiv" class="control-group">
									<label class="control-label" style="width: 100px">视频上传:</label>
									<div class="controls" style="margin-left: 120px;">
										<INPUT id=videoUpload type=file name=videoUpload value=""> <br />(请上传格式为flv的视频文件,最大支持1G) <span class="help-inline" id="videoHelp"></span>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="more">
								<div id="tagsDiv" class="control-group">
									<label class="control-label" style="width: 100px">Tag标签</label>
									<div class="controls" style="margin-left: 120px;">
										<INPUT id="tags" rel="tooltip" data-placement="top" title="多个标签之间用英文,分隔" maxLength=250 type=text name=tags value="${info.tags }" /> <span class="help-inline" id="tagsHelp"></span>
									</div>
								</div>
								<div id="tagsDiv" class="control-group">
									<label class="control-label" style="width: 100px">信息图片</label>
									<div class="controls" style="margin-left: 120px;">
										<input type="hidden" id="oldImg" name="oldImg" value="${info.img }" /> <input type="hidden" id="img" name="img" value="${info.img }" />
										<c:if test='${info.img!=null && info.img != "" && info.img != "null"}'>
											<span id="oldImgSpan"> 
											<a href="${info.img }?date=<%=UUID.randomUUID() %>" target="_blank"> <img src="${info.img }?date=<%=UUID.randomUUID() %>" style="width: 200px" title="点击查看大图" />
											</a> <a id="imgDelBtn" href="javascript:delOldImg()" class="btn">删除原有图片</a> <br />
											</span>
										</c:if>
										<input type="file" name="imgfile" id="imgfile"> <span class="help-inline" id="tagsHelp"></span>
									</div>
								</div>
								<div id="ishotDiv" class="control-group">
									<label class="control-label" style="width: 100px">是否热点</label>
									<div class="controls" style="margin-left: 120px;">
										<label style="float: left"><input type="radio" name="ishot" value="1" <c:if test="${info.ishot==1 }">checked="checked"</c:if>>是</label> <label style="float: left"><input type="radio" name="ishot" value="0" <c:if test="${info==null || info.ishot==null || info.ishot==0 }">checked="checked"</c:if>>否</label> <span class="help-inline" id="ishotHelp"></span>
									</div>
								</div>
								<div id="istopDiv" class="control-group">
									<label class="control-label" style="width: 100px">是否固顶</label>
									<div class="controls" style="margin-left: 120px;">
										<label style="float: left"><input type="radio" name="istop" value="1" <c:if test="${info.istop==1 }">checked="checked"</c:if>>是</label> <label style="float: left"><input type="radio" name="istop" value="0" <c:if test="${info==null || info.istop==null || info.istop==0 }">checked="checked"</c:if>>否</label> <span class="help-inline" id="istopHelp"></span>
									</div>
								</div>
								<div id="iscommentDiv" class="control-group">
									<label class="control-label" style="width: 100px">是否评论</label>
									<div class="controls" style="margin-left: 120px;">
										<label style="float: left"><input type="radio" id="iscomment0" name="iscomment" value="0" <c:if test="${info==null || info.iscomment==null || info.iscomment==0}">checked="checked"</c:if>>否</label> <label style="float: left"><input type="radio" id="iscomment1" name="iscomment" value="1" <c:if test="${info.iscomment==1}">checked="checked"</c:if>>会员评论</label> <label style="float: left"><input type="radio" id="iscomment2" name="iscomment" value="2" <c:if test="${info.iscomment==2}">checked="checked"</c:if>>会员和匿名评论</label> <span class="help-inline" id="iscommentHelp"></span>
									</div>
								</div>
								
								<div id="urlDiv" class="control-group">
									<label class="control-label" style="width: 100px">外部链接</label>
									<div class="controls" style="margin-left: 120px;">
										<INPUT id="url" rel="tooltip" data-placement="top" title="请输入外部链接,输入后点击此信息标题会直接进入此外部链接" maxLength=250 type=text name=url value="${info.url }" /> <span class="help-inline" id="urlHelp"></span>
									</div>
								</div>
								<div id="addtimeDiv" class="control-group">
									<label class="control-label" style="width: 100px">添加时间</label>
									<div class="controls" style="margin-left: 120px;">
										<input name="addtime" rel="tooltip" data-placement="top" title="请选择添加时间，默认是当前时间" class="Wdate" id="addtime" type="text" style="width: 160px" size="14" readonly value="${info.addtimeStr}" onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss'})" /> <span class="help-inline" id="addtimeHelp"></span>
									</div>
								</div>
							</div>
						</div>

						<div class="control-group">
							<div class="controls" style="margin-left: 120px;">
								<input type="submit" class="btn btn-primary" value="保 存" />&nbsp; <a onclick="history.back(-1)" class="btn">返 回</a>
							</div>
						</div>
					</form>

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
		<script src="${pageContext.request.contextPath}/static/admin/cms/js/info.js"></script>
		<script src="${pageContext.request.contextPath}/static/common/js/Math.uuid.js"></script>
		<script src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" defer="defer"></script>

		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/ueditor.config.js"></script>
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/ueditor.all.min.js"> </script>
		<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
		<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/editor/ueditor/lang/zh-cn/zh-cn.js"></script>
		<script type="text/javascript">
    		var ue = UE.getEditor('editor');
    	</script>
	</body>
</html>