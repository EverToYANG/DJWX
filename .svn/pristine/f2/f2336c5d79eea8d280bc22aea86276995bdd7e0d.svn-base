<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fs" uri="/fs-tags" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body>
	<%@include file="/include/loading.jsp" %>
          <div class="container-fluid" >
      <div class="row-fluid">

<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-edit"></i>
								</span>
								<h5>查看站内信</h5>
							</div>
							<div class="widget-content nopadding">
							
								<form class="form-horizontal" method="post" action="msgInfo.do" name="form" id="form"  >
									<div class="widget-content nopadding">
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">发信人</label>
                                        <div class="controls" style="margin-left: 190px;">
								<c:if test='${msg.membername!=null && ""!=msg.membername}'>
							${msg.membername }
							</c:if>
							<c:if test='${msg.membername==null || ""==msg.membername}'>
							<font color='red'>管理员</font> ${msg.username }
							</c:if>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">收信人</label>
                                        <div class="controls" style="margin-left: 190px;">
										<c:if test='${msg.tomembername!=null && ""!=msg.tomembername}'>
							${msg.tomembername}
							</c:if>
							<c:if test='${msg.tomembername==null || ""==msg.tomembername}'>
							<font color='red'>管理员</font> ${msg.tousername}
							</c:if>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">标题</label>
                                        <div class="controls" style="margin-left: 190px;">
												${msg.title }
                                        </div>
                                    </div>
                                    <div id="templetDiv" class="control-group">
                                        <label class="control-label" style="width:160px">内容</label>
                                        <div class="controls" style="margin-left: 190px;">
								${msg.content }
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">已读</label>
                                        <div class="controls" style="margin-left: 190px;">
                                       ${"1"==msg.isread ?"是":"否"}
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">系统站内信</label>
                                        <div class="controls" style="margin-left: 190px;">
								${"1"==msg.issys ?"是":"否"}
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">发送时间</label>
                                        <div class="controls" style="margin-left: 190px;">
							${msg.addtimeStr }
                                        </div>
                                    </div>
                                   
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 190px;">
											<a  onclick="history.back(-1)" class="btn"  >返 回</a>
                                        </div>
                                    </div>
                                </form>
							</div>
	
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->
<%@include file="/include/foot.jsp" %>
							
</body></html>