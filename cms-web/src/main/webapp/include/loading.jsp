<%@ page language="java"  pageEncoding="UTF-8"%>
<center><div id="loading" style="width:100%;height:100%;">
<img src="${pageContext.request.contextPath}/static/unicorn/img/loading.gif"/></div></center><script> 
 window.onload=function(){
var pageLoad = document.getElementById('loading');
pageLoad.parentNode.removeChild(pageLoad);
}
</script>
