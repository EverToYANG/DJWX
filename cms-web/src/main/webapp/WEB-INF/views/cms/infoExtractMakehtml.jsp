<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
          <div >
      <div class="row-fluid">

<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-edit"></i>
								</span>
								<h5>静态化</h5>
							</div>
							<div class="widget-content nopadding">
							
									<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="infoExtractMakehtml.do" name="form" id="form"  >
				<input type="hidden" name="pageFuncId" id="pageFuncId" value="${param.pageFuncId }"/>
			<input type="hidden" name="channelid" value="${param.channelid }"/>
			
									<div  class="control-group">
                                        <div class="controls" style="margin-left: 10px;">
				操作成功，请选择需要静态化的内容。
                                        </div>
                                    </div>
                                    
									<div  class="control-group">
                                        <div class="controls" style="margin-left: 10px;">
				<input type="checkbox" name="htmlChannel" value="1" checked/>目标栏目页面静态化
                                        </div>
                                    </div>
									<div  class="control-group">
                                        <div class="controls" style="margin-left: 10px;">
				<input type="checkbox" name="htmlChannelPar" value="1"  checked/>目标栏目所有父栏目页面静态化
                                        </div>
                                    </div>
									<div  class="control-group">
                                        <div class="controls" style="margin-left: 10px;">
				<input type="checkbox" name="htmlIndex" value="1"  checked/>站点首页静态化
                                        </div>
                                    </div>
                                   
                                    
                                    <div class="control-group">
                                        <div class="controls" style="margin-left: 10px;">
											<input type="submit"   class="btn btn-primary" value="立即静态化" />
                                        </div>
                                    </div>
                                    
                                    
                                    
                                </form>
							</div>
	<%@include file="/include/bsie_foot.jsp" %>
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->


</body></html>