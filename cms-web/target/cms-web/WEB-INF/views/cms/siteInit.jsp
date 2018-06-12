<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
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
							
<form action="siteInit.do" >
<input type="hidden" name="id" value="${site.id }"/>
<input type="hidden" name="templet" value="${site.templet }"/>
									<div class="widget-content nopadding">
								<div class="alert fade in">
            <p>您选择的站点模板有初始化数据，是否对此站点进行初始化?</p>
            <p>
<input type="submit" class="btn btn-primary" value=" 是(推荐) " />
<input type="button" class="btn" value=" 否 " onclick="ok()"/>
            </p>
    </div>
							</div>
							</form>
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->
							
							
	
	<%@include file="/include/bsie_foot.jsp" %>
	<script>
	function ok(){
		//关闭模态对话框\
		parent.closeWindow();
	}
	</script>
</body></html>