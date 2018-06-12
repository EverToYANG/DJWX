<%@ page language="java" pageEncoding="UTF-8"%>
<% 
response.setCharacterEncoding("GBK"); 
   response.setContentType("application/download");
response.setHeader("Content-Disposition", "attachment;filename=visitStat.xls");
  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
	<BODY >
		
			<DIV class="column" >
				<div class="columntitle">
					<b>访问频率列表(访问总量:${sum })</b>
				</div>
				<table id="MyDataList" cellspacing="1" cellpadding="1"
					Align="center"  border="1">
					<TR class="summary-title" style="HEIGHT: 25px" align="center">
						<TD >
							<b>日期</b>
						</TD>
						<TD >
							<b>访问量</b>
						</TD>
					</TR>
					
					<c:forEach var="bean" items="${visitList}" varStatus="status">
										<tr>
											
						
						<TD  >${bean.datename }
						</TD>
						<TD  >${bean.countnum }
						</TD>
										</tr>
           					 			</c:forEach>
				</table>

			</DIV>

	</BODY>
</HTML>

