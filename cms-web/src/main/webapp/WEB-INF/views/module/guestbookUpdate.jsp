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
<jsp:include page="/head.do" flush="true" />
          <div class="container-fluid" >
      <div class="row-fluid">
<div class="widget-box collapsible">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-search"></i>
								</span>
								<h5>留言频率搜索</h5>
								<div class="buttons"><a href="#collapseOne" data-toggle="collapse" class="btn btn-mini"><i class="icon-retweet"></i>展开/关闭</a></div>
							</div>
							<div class="collapse in" id="collapseOne">
							<div class="widget-content">
							<form class="form-search" action="statGuestbookUpdate.do">
			<input type="hidden" id="pageFuncId" name="pageFuncId" value="${param.pageFuncId }"/>
			<input type="hidden" name="export" id="export" value=""/>
			
								 更新周期:
								 <label ><input type="radio" name="statType" value="year" ${(statType==null || statType=="" || statType=="year")?"checked":"" }/>年</label>
								 <label ><input type="radio" name="statType" value="month" ${(statType=="month")?"checked":"" }/>月</label>
								 <label ><input type="radio" name="statType" value="day" ${(statType=="day")?"checked":"" }/>日</label>
								 <label ><input type="radio" name="statType" value="week" ${(statType=="week")?"checked":"" }/>星期</label>
								 审核状态:
								<select name="guestbookstate" style="width:110px">
								<option value="">全部
								<option value="0" ${"0"==guestbook.guestbookstate?"selected":"" }>未审核
								<option value="1" ${"1"==guestbook.guestbookstate?"selected":"" }>已审核
								<option value="2" ${"2"==guestbook.guestbookstate?"selected":"" }>审核不通过
								</select>
								 
									时间范围：
									<input name="starttime" id="starttime"  class="input-medium search-query Wdate"  type="text" size="24" value="${guestbook.starttimeStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
									至
									<input name="endtime" id="endtime"  class="input-medium search-query Wdate"  type="text" size="24" value="${guestbook.endtimeStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
									
			
		
								每页显示条数：
								<select name="pageSize" id="pageSize" style="width:70px">
									<option selected="selected" value="10">
										10
									</option>
									<option value="30" ${"30"==param.pageSize?"selected":"" }>
										30
									</option>
									<option value="50" ${"50"==param.pageSize?"selected":"" }>
										50
									</option>
									<option value="100" ${"100"==param.pageSize?"selected":"" }>
										100
									</option>
									<option value="200" ${"200"==param.pageSize?"selected":"" }>
										200
									</option>
									<option value="500" ${"500"==param.pageSize?"selected":"" }>
										500
									</option>
									<option value="1000" ${"1000"==param.pageSize?"selected":"" }>
										1000
									</option>

								</select>
								
							<button type="button" class="btn" onclick="$('#export').val('');this.form.submit();"><i class="icon-search"></i> 搜 索</button>
							<button type="button" class="btn" onclick="$('#export').val('1');this.form.submit();"><i class="icon-download-alt"></i> 导 出</button>
							</form>
							</div>
							</div>
							</div>
<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>留言频率列表(留言总量:${sum })</h5>
								<div class="buttons"><a href="#" onclick="location.reload();" class="btn btn-mini"><i class="icon-refresh"></i> 刷 新</a></div>
							</div>
							<div class="widget-content nopadding">
							
    <div>
        <div id="jqChart" style="width: 99%; height: 300px;">
        </div>
    </div>
								<table class="table table-bordered table-striped table-hover">
									<thead>
										<tr>
											
						<th >
							日期
						</th>
						<th >
							留言量
						</th>
										</tr>
									</thead>
									<tbody>
           					 			<c:forEach var="bean" items="${guestbookList}" varStatus="status">
										<tr>
											
						
						<TD  >${bean.datename }
						</TD>
						<TD  >${bean.countnum }
						</TD>
										</tr>
           					 			</c:forEach>
									</tbody>
								</table>		
							<div id="errorDiv" class="alert alert-error hide">
					            <span id="errorInfo"></span>
					          </div>			
							</div>
							
								<div class="navbar">	
								<div class="navbar-inner">
							<c:if test="${totalCount>pageSize}">
							总共有${totalCount }条数据，只显示前${pageSize }条，如果没有您要统计的数据，您可以尝试缩小统计范围。
							</c:if>
								</div>
								</div>	
								
							
						</div>
      </div><!--/row-->
          
          
        </div><!--/span-->

	<%@include file="/include/foot.jsp" %>
		<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/My97DatePicker/WdatePicker.js" ></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/js/jquery.jqChart.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/js/jquery.jqRangeSlider.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/smoothness/jquery-ui-1.8.21.css" />
    <script src="${pageContext.request.contextPath}/static/common/js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/static/common/js/jquery.jqChart.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/static/common/js/jquery.jqRangeSlider.min.js" type="text/javascript"></script>
    <!--[if IE]><script lang="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/excanvas.js"></script><![endif]-->
<script lang="javascript" type="text/javascript">
        $(document).ready(function () {
            $('#jqChart').jqChart({
                title: { text: '留言频率统计' },
                axes: [
                        {
                            type: 'category',
                            location: 'bottom',
                            zoomEnabled: true
                        }
                      ],
                series: [
                            {
								title:'留言量',
                                type: 'column',
                                data: [
           					 			<c:forEach var="bean" items="${guestbookList}" varStatus="status">
								<c:if test="${status.index>0}">
								,
								</c:if>
								['${bean.datename}', ${bean.countnum}]
								</c:forEach>
								]
                            },
                        ]
            });
        });
    </script>
</body></html>