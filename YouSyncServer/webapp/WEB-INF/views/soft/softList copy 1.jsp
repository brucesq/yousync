<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>软件包管理</title>
</head>

<body>
	<h1>软件包管理</h1>
	
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success">
			<button data-dismiss="alert" class="close">×</button>
			${message}
		</div>
	</c:if>
	
	
	<div class="row">
	
	
	<div class="offset3">
			

			<form class="form-search" action="#">
						
				<label>名称：</label> <input type="text" name="search_LIKE_name" class="input-medium" value="${param.search_LIKE_name}"> 
				<button type="submit" class="btn" id="search_btn">Search</button>
					    
			</form>
 			<tags:sort/>

		</div>
	   
	</div>
	
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>名称</th><th>版本</th><th>类型</th><th>价格</th><th>状态</th><th>图标</th></tr></thead>
		<tbody>
		<c:forEach items="${softs.content}" var="soft">
			<tr>
				<td><a href="${ctx}/soft/update/${soft.id}">${soft.name}</a></td>
				<td>${soft.version}</td>
				<td>${soft.softType}</td>
				<td>${soft.price}</td>
				<td>${soft.statusName}</td>
				<td><img src="${iconPrefix}${soft.iconUrl}" height="90" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<tags:pagination page="${softs}" paginationSize="5"/>
</body>
</html>
