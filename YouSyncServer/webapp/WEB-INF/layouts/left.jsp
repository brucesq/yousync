<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="leftbar" class="span2">
	<h1>账户管理</h1>
	<div class="submenu">
		<a id="account-tab"href="${ctx}/account/user/">帐号管理</a>
		<shiro:hasPermission name="user:edit">
		<a id="account-tab"href="${ctx}/account/user/update/add">添加帐号</a>
		 </shiro:hasPermission>
	</div>
	<h1>内容管理</h1>
	<div class="submenu">
		<a id="web-tab" href="${ctx}/soft/">软件包管理</a>
		<a id="web-tab" href="${ctx}/soft/create">添加软件包</a>
	</div>
	<h1>统计报表</h1>
	<div class="submenu">
		<a id="persistence-tab" href="${ctx}/record/lastrecordlist">最近记录</a>		
	</div>
</div>