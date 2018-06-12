<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="bean" items="${list}" varStatus="status">
	<tr treeItemLevel="2">
		<td><input type="checkbox" name="ids" value="${bean.id }"
			uniform="true" /></td>
		<td>${bean.name }</td>
		<td>${bean.url }</td>
		<td>${bean.orderNum }</td>
	</tr>
</c:forEach>