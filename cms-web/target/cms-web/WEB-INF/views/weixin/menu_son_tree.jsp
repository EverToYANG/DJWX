<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="unit" items="${list}" varStatus="status">
<tr treeItemLevel="2">
	<td>
	<c:forEach begin="1" end="${level}" var="i">
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:forEach>
	<c:if test='${"true" == unit.hasChildren}'>
	<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${unit.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
	</c:if>
	<c:if test='${"true" != unit.hasChildren}'>
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:if>
	<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
	<a href="#" onclick="${param.unitClick }('${unit.id }')">${unit.name }</a></td>
</tr>
</c:forEach>