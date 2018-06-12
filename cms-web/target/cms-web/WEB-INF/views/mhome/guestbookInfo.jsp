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
								<h5>查看留言</h5>
							</div>
							<div class="widget-content nopadding">
							
								<form class="form-horizontal" method="post" action="guestbookInfo.do" name="form" id="form"  >
									<div class="widget-content nopadding">
                                    <div id="nameDiv" class="control-group">
                                        <label class="control-label" style="width:160px">姓名</label>
                                        <div class="controls" style="margin-left: 190px;">
							${guestbook.name }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">性别</label>
                                        <div class="controls" style="margin-left: 190px;">
										${guestbook.sexStr }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">Email</label>
                                        <div class="controls" style="margin-left: 190px;">
											${guestbook.email }
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">QQ</label>
                                        <div class="controls" style="margin-left: 190px;">
                                          ${guestbook.qq }
                                        </div>
                                    </div>
                                    <div  class="control-group">
                                        <label class="control-label" style="width:160px">电话</label>
                                        <div class="controls" style="margin-left: 190px;">
								${guestbook.tel }
                                        </div>
                                    </div>
                                    <div id="templetDiv" class="control-group">
                                        <label class="control-label" style="width:160px">内容</label>
                                        <div class="controls" style="margin-left: 190px;">
								${guestbook.content }
                                        </div>
                                    </div>
                                    
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">添加时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${guestbook.addtime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">IP</label>
                                        <div class="controls" style="margin-left: 190px;">
								${guestbook.ip }
								</div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">审核状态</label>
                                        <div class="controls" style="margin-left: 190px;">
							${guestbook.stateStr }
                                        </div>
                                    </div>
                                    <div id="recontentDiv" class="control-group">
                                        <label class="control-label" style="width:160px">回复内容</label>
                                        <div class="controls" style="margin-left: 190px;">
									${guestbook.recontent }
                                        </div>
                                    </div>
						<c:if test="${guestbook.retime != null}">
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">回复时间</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        <fmt:formatDate value="${guestbook.retime}" pattern="yyyy-MM-dd" />
                                        </div>
                                    </div>
                                     </c:if>
                                    
						<c:if test="${guestbook.reusername != null}">
                                    <div class="control-group">
                                        <label class="control-label" style="width:160px">回复人</label>
                                        <div class="controls" style="margin-left: 190px;">
                                        	${guestbook.reusername}
                                        </div>
                                    </div>
						</c:if>
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