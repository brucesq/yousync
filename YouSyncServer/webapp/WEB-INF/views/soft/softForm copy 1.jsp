<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springside.org.cn/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>安装包管理</title>
</head>

<body>
	<form id="inputForm" action="${ctx}/soft/update" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${soft.id}"/>
		<input type="hidden" name="iconUrl" value="${soft.iconUrl}"/>
		<input type="hidden" name="apkFile" value="${soft.apkFile}"/>
		<input type="hidden" name="packageName" value="${soft.packageName}"/>
		<input type="hidden" name="version" value="${soft.version}"/>
		<fieldset>
			<legend><small>管理应用包</small></legend>
			<div class="control-group">
				<label for="task_title" class="control-label">名称:</label>
				<div class="controls">
					<input type="text" id="task_title" name="name"  value="${soft.name}" class="input-large required" minlength="3"/>
				</div>
			</div>	
			<div class="control-group">
				<label for="softType" class="control-label">类型:</label>
				<div class="controls">
					<input type="text" id="softType" name="softType"  value="${soft.softType}" class="input-large required" minlength="3"/>
				</div>
			</div>	
			<div class="control-group">
				<label for="price" class="control-label">价格:</label>
				<div class="controls">
					<input type="text" id="price" name="price"  value="${soft.price}" class="input-large required" minlength="3"/>
				</div>
			</div>	
			<div class="control-group">
				<label for="status" class="control-label">状态:</label>
				<div class="controls">
					<form:bsradiobuttons path="soft.status" items="${allStatus}" labelCssClass="inline"/>
				</div>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#task_title").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate();
		});
	</script>
</body>
</html>
