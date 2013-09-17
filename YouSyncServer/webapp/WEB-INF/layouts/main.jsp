<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

	<meta charset="utf-8" />

	<title>YouSync CMS | <sitemesh:title/></title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="${ctx}/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="${ctx}/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="${ctx}/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->
	
	

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->

	<script src="${ctx}/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="${ctx}/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="${ctx}/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="${ctx}/media/js/bootstrap.min.js" type="text/javascript"></script>

	<!--[if lt IE 9]>

	<script src="${ctx}/media/js/excanvas.min.js"></script>

	<script src="${ctx}/media/js/respond.min.js"></script>  

	<![endif]-->   

	<script src="${ctx}/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="${ctx}/media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="${ctx}/media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="${ctx}/media/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<!-- END CORE PLUGINS -->

	<sitemesh:head />

	<link rel="shortcut icon" href="${ctx}/media/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed">

	<%@ include file="/WEB-INF/layouts/main_header.jsp"%>

	<!-- BEGIN CONTAINER -->

	<div class="page-container row-fluid">

		<%@ include file="/WEB-INF/layouts/main_left.jsp"%>
		<sitemesh:body />
	</div>



	<!-- END CONTAINER -->

	<%@ include file="/WEB-INF/layouts/main_footer.jsp"%>

</body>

<!-- END BODY -->

</html>