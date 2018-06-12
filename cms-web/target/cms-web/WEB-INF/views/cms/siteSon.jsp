<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="site" items="${sites}" varStatus="status">
<tr treeItemLevel="${level }">
	<td><input type="checkbox" name="ids" value="${site.id }" uniform="true"/></td>
	<td>
	
	<c:forEach begin="1" end="${level}" var="i">
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:forEach>
	<c:if test='${"true" == site.hasChildren}'>
	<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${site.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
	</c:if>
	<c:if test='${"true" != site.hasChildren}'>
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:if>
	<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
	${site.name }</td>
	<td>${site.sourcepath }</td>
	<td>${site.sitedomain }</td>
	<td>
	<c:if test="${not empty site.logo}">
	<img src="${pageContext.request.contextPath}${site.logo }" style="width:160px;height:60px"/>
	</c:if></td>
	<td>${site.stateStr }</td>
	<td>
	<a href="siteOrder.do?pageFuncId=${param.pageFuncId }&type=up&id=${site.id }" rel="tooltip" data-placement="top" title="点击上升"><img src="${pageContext.request.contextPath}/static/unicorn/img/up.gif" /></a>
	&nbsp;&nbsp;&nbsp;
	<a href="siteOrder.do?pageFuncId=${param.pageFuncId }&type=down&id=${site.id }" rel="tooltip" data-placement="bottom" title="点击下降"><img src="${pageContext.request.contextPath}/static/unicorn/img/down.gif" /></a>
	</td>
</tr>
</c:forEach>