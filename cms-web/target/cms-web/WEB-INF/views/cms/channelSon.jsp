<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="channel" items="${channelList}" varStatus="status">
<tr treeItemLevel="${level }">
	<td>
	<c:if test='${siteAdmin || "true" == channel.haveChannelRole }'>
	<input type="checkbox" name="ids" value="${channel.id }" uniform="true"/>
	</c:if>
	</td>
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
	${channel.name }</td>
	<td>${channel.pagemark }</td>
	<td>${channel.stateStr }</td>
	<td>${channel.navigationStr }</td>
	<td>
	<c:if test="${not empty channel.img}">
	<img src="${pageContext.request.contextPath}${channel.img }" style="width:160px;height:60px" />
	</c:if></td>
	<td>${channel.templet }</td>
	<td>${channel.contenttemplet }</td>
	<td>
	<c:if test='${siteAdmin || "true" == channel.haveChannelRole }'>
	<a href="channelOrder.do?pageFuncId=${param.pageFuncId }&type=up&id=${channel.id }" rel="tooltip" data-placement="top" title="点击上升"><img src="${pageContext.request.contextPath}/static/unicorn/img/up.gif" /></a>
	&nbsp;&nbsp;&nbsp;
	<a href="channelOrder.do?pageFuncId=${param.pageFuncId }&type=down&id=${channel.id }" rel="tooltip" data-placement="bottom" title="点击下降"><img src="${pageContext.request.contextPath}/static/unicorn/img/down.gif" /></a>
	</c:if>
	</td>
</tr>
</c:forEach>