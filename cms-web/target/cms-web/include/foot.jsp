<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/include/bsie_foot.jsp"%>
<%@include file="/include/openWindow.jsp"%>
<script src="${pageContext.request.contextPath}/static/admin/cms/js/selectSite.js"></script>
<a href="#" class="go-top">
<img src="${pageContext.request.contextPath}/static/unicorn/img/gotop.png"></a>
<script>  
  $(window).scroll(function() {
     if ($(this).scrollTop() > 10) {  
       $('.go-top').fadeIn(200);  
      } else {  
       $('.go-top').fadeOut(200);  
	  }  
	});  
  $('.go-top').click(function(event) {  
	event.preventDefault();  
      $('html, body').animate({scrollTop: 0}, 300);  
    })  
	if($("#menuUl").length>0){
		$("#menuUl").width($(window).width()/6-10);
	}

  (function($) {
    $(document).ready(function () {
      $('a[rel=tooltip]').tooltip({});
      $('input[rel=tooltip]').tooltip({});
      $('textarea[rel=tooltip]').tooltip({});
      $(".popover").show();
    });
  })(jQuery);

</script>