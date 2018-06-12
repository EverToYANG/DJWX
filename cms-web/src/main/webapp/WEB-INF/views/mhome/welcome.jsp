<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@include file="/include/bsie_head.jsp" %>

  </head>

<body >

	<%@include file="/include/loading.jsp" %>

    <div class="container-fluid" >
      <div class="row-fluid">
        <div class="span12">
          <div class="hero-unit" style="padding: 5px;margin-bottom: 0px;">
            <h1>
            <script>
		var hour = (new Date()).getHours();
		if (hour < 4) {
			hello = "夜深了，";
		}
		else if (hour < 7) {
			hello = "早安，";
		}
		else if (hour < 9) {
			hello = "早上好，"; 
		}
		else if (hour < 12) {
			hello = "上午好，";
		}
		else if (hour < 14) {
			hello = "中午好，";
		}
		else if (hour < 17) {
			hello = "下午好，";
		}
		else if (hour < 19) {
			hello = "您好，";
		}
		else if (hour < 22) {
			hello = "晚上好，";
		}
		else {
			hello = "夜深了，";
		}
		document.write(hello);
		</script>
				${loginMember.loginname }</h1>
            <p>
            欢迎使用CMS! 
           </p>
           <p>
           CMS是为了致力于打造更好的中国开源CMS而发起的。这个项目的目标是提供一个安全，实用有效和可扩展的CMS系统。
           </p>
            <p><a class="btn btn-primary btn-large" target="_blank" href="${pageContext.request.contextPath}">了解更多 »</a></p>
          </div>
          <div class="row-fluid">
            <div class="span6">
              <h2>提供源码</h2>
              <p>购买CMS授权的用户可以获取CMS源码和更好的技术支持!</p>
              <p><a class="btn" href="${pageContext.request.contextPath}/site/FreeCMS/buy/index.html" target="_blank">现在购买 »</a></p>
            </div>
            <div class="span6">
              <h2>二次开发</h2>
              <p>FreeCMS的源码通俗易懂、注释详细、面向二次开发友好! 您可以方便的进行二次开发!</p>
              <p><a class="btn" href="${pageContext.request.contextPath}/site/FreeCMS/buy/index.html" target="_blank">我要二次开发 »</a></p>
            </div>
          </div><!--/row-->
        </div><!--/span-->
      </div><!--/row-->


    </div><!--/.fluid-container-->

	<%@include file="/include/foot.jsp" %>
 
</body></html>