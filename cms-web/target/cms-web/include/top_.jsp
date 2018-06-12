<%@ page language="java"  pageEncoding="UTF-8"%>
<div id="topdiv" class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
        </div>
      </div>
<script> 
 if (window.top!=window){
 	document.getElementById("topdiv").style.display="none"; 
 }
</script>