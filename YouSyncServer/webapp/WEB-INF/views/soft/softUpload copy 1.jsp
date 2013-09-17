<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springside.org.cn/tags/form" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>上传软件包</title>
	<script src="${ctx}/static/jquery-validation/1.11.1/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/jquery-validation/1.11.1/messages_bs_zh.js" type="text/javascript"></script>
	<link href="${ctx}/static/jquery-validation/1.11.1/validate.css" type="text/css" rel="stylesheet" />
	
</head>

<body>
	<h1>上传软件包</h1>
	<form:form id="inputForm" action="${ctx}/soft/upload" method="post" enctype="multipart/form-data" class="form-horizontal">
		<fieldset>
			<legend><small>软件包上传</small></legend>
			
			
			<div class="control-group">
				<label for="name" class="control-label">类型:</label>
				<div class="controls">
					<input type="text" id="softType" name="softType"  value="" class="input-large required"/>
				</div>
			</div>
			
			<div class="control-group">
				<label for="name" class="control-label">价格:</label>
				<div class="controls">
					<input type="text" id="price" name="price"  value="" class="input-large required"/>
				</div>
			</div>
			
			<div class="control-group">
				<label for="name" class="control-label">文件:</label>
				<div class="controls">
					<input  id="apkFile" name="apkFile"  value="" type="file"/>
				</div>
			</div>
			
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>	
			</div>
		</fieldset>
	</form:form>
</body>
</html>
