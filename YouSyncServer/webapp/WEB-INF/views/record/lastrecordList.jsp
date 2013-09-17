<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>最新记录</title>
</head>

<body>
	<h1>最新安装记录</h1>
	
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success">
			<button data-dismiss="alert" class="close">×</button>
			${message}
		</div>
	</c:if>
	
	
	<div class="row">
	   
	</div>
	
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>用户ID</th><th>软件名称</th><th>手机串号</th><th>手机品牌</th><th>电脑MAC地址</th><th>安装时间</th></tr></thead>
		<tbody>
		<c:forEach items="${records}" var="item">
			<tr>
				<td>${item.userId}</td>
				<td>${item.softName}</td>
				<td>${item.deviceNum}</td>
				<td>${item.deviceBrand}</td>
				<td>${item.macAddr}</td>
				<td>${item.createTime}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
