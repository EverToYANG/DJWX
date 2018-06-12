<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="channel" items="${channelList}" varStatus="status">
<tr treeItemLevel="${level }">
	<td>
	<c:forEach begin="1" end="${level}" var="i">
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:forEach>
	<c:if test='${"true" == channel.hasChildren}'>
	<img align="absmiddle" style="cursor:pointer" onClick="displayChildren(this);" isAjax="true" isOpen="false" id="${channel.id }" src="${pageContext.request.contextPath}/static/tree/image/plus.gif" />
	</c:if>
	<c:if test='${"true" != channel.hasChildren}'>
	<img align="absmiddle" src="${pageContext.request.contextPath}/static/tree/image/empty.gif" />
	</c:if>
	<img align="absmiddle" border="0" src="${pageContext.request.contextPath}/static/tree/image/folder.gif" />&nbsp;
	<c:if test='${siteAdmin || "true" == channel.haveChannelRole }'>
	<a href="#" onclick="infoSelectChannel('${channel.id }','${channel.name }')">${channel.name }</a>
	</c:if>
	<c:if test='${!siteAdmin && "true" != channel.haveChannelRole }'>
	${channel.name }
	</c:if>
	</td>
</tr>
</c:forEach>