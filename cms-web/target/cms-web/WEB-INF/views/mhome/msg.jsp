<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >

<div class="container-fluid" style="margin-top:-10px">
      <div class="row-fluid">

<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-heart"></i>
								</span>
								<h5>温馨提示!</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<div class="alert fade in">
            <p>${msg }</p>
            <c:if test='${forwardUrl!="" && forwardSeconds!="" && forwardSeconds>0}'>
			<script>
				setTimeout("window.location.href ='${forwardUrl}';", 1000*${forwardSeconds});
			</script>
			<p><a href="${forwardUrl}">页面跳转中...</a></p>
			</c:if>
            <p>
              <button id="btnSubmit" type="button" class="btn btn-primary" onclick="ok()">确 定</button>
            </p>
    </div>
							</div>
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->
							
							
	
	<%@include file="/include/bsie_foot.jsp" %>
	<script>
	${autojs}
	//自动刷新父窗口
	if("true"=="${autoRefresh}"){
		parent.location.reload();
	}
	//自动关闭模态对话框
	if("true"=="${autoCloseWindow}"){
		parent.closeWindow();
	}
	function ok(){
		${js}
		//刷新父窗口
		if("true"=="${isRefresh}"){
		parent.location.reload();
		}
		//如果有跳转页面，点击确定后直接跳转
		if(""!="${forwardUrl}"){
			location.href="${forwardUrl}";
		}
		//返回
		if("true"=="${isBack}"){
			history.back();
		}
		//关闭模态对话框
		if("true"=="${isCloseWindow}"){
			parent.closeWindow();
		}
	}
	</script>
</body></html>