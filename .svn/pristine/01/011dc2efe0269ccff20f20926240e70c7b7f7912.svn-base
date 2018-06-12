<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="func" items="${funcs}" varStatus="status">
<tr treeItemLevel="${level }">
	<td>
	<input type="checkbox" name="ids" value="${func.id }" uniform="true"/>
	</td>
	<td>
	<c:forEach begin="1" end="${level}" var="i">
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:forEach>
	<c:if test='${"true" == func.hasChildren}'>
	<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${func.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
	</c:if>
	<c:if test='${"true" != func.hasChildren}'>
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:if>
	<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
	${func.name }</td>
	<td>${func.code }</td>
	<td>${func.isokStr }</td>
	<td>${func.urlpath }</td>
	<td>
	<a href="funcOrder.do?type=up&id=${func.id }" rel="tooltip" data-placement="top" title="点击上升"><img src="${pageContext.request.contextPath}/static/unicorn/img/up.gif" /></a>
	&nbsp;&nbsp;&nbsp;
	<a href="funcOrder.do?type=down&id=${func.id }" rel="tooltip" data-placement="bottom" title="点击下降"><img src="${pageContext.request.contextPath}/static/unicorn/img/down.gif" /></a>
	</td>
</tr>
</c:forEach>