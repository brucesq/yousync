<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>最新记录列表</title>
	<!-- BEGIN PAGE LEVEL STYLES -->

	<link rel="stylesheet" type="text/css" href="${ctx}/media/css/select2_metro.css" />

	<link rel="stylesheet" href="${ctx}/media/css/DT_bootstrap.css" />

	<!-- END PAGE LEVEL STYLES -->
	
</head>
<body>

<!-- BEGIN PAGE -->

		<div class="page-content">

			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<div id="portlet-config" class="modal hide">

				<div class="modal-header">

					<button data-dismiss="modal" class="close" type="button"></button>

					<h3>portlet Settings</h3>

				</div>

				<div class="modal-body">

					<p>Here will be a configuration form</p>

				</div>

			</div>

			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<!-- BEGIN PAGE CONTAINER-->        

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN STYLE CUSTOMIZER -->

						
						<!-- END BEGIN STYLE CUSTOMIZER -->  

						<!-- BEGIN PAGE TITLE & BREADCRUMB-->

						

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="index.html">主页</a> 

								<i class="icon-angle-right"></i>

							</li>

							<li>

								<a href="#">统计报表</a>

								<i class="icon-angle-right"></i>

							</li>

							<li><a href="#">最新记录</a></li>

						</ul>

						<!-- END PAGE TITLE & BREADCRUMB-->

					</div>

				</div>

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box light-grey">

							<div class="portlet-title">

								<div class="caption"><i class="icon-globe"></i>记录列表</div>

								<div class="tools">

									
								</div>

							</div>

							<div class="portlet-body">

							
								
							
								
								

								<table class="table table-striped table-bordered table-hover" id="sample_1">

									<thead>

										<tr>

											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" /></th>

											<th>用户ID</th>

											<th class="hidden-480">软件名称</th>

											<th class="hidden-480">手机串号</th>

											<th class="hidden-480">手机品牌</th>
											
											<th class="hidden-480">电脑MAC地址</th>
											<th class="hidden-480">安装时间</th>
								

											<th ></th>

										</tr>

									</thead>

						<tbody>
						<c:forEach items="${records}" var="item">
						<tr>
							<td><input type="checkbox" class="checkboxes" value="1" /></td>
							<td>${item.userId}</td>
							<td class="hidden-480">${item.softName}</td>
							<td class="hidden-480">${item.deviceNum}</td>
							<td class="hidden-480">${item.deviceBrand}</td>
							<td class="hidden-480">${item.macAddr}</td>
							<td class="center hidden-480">${item.createTime}</td>
						</tr>
						</c:forEach>
										
						</tbody>

								</table>
								
								
							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

					</div>

				</div>

				

					

				

				<!-- END PAGE CONTENT-->

			</div>

			<!-- END PAGE CONTAINER-->

		</div>

		<!-- END PAGE -->
		
	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script type="text/javascript" src="${ctx}/media/js/select2.min.js"></script>

	<script type="text/javascript" src="${ctx}/media/js/jquery.dataTables.js"></script>

	<script type="text/javascript" src="${ctx}/media/js/DT_bootstrap.js"></script>

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="${ctx}/media/js/app.js"></script>

	<script src="${ctx}/media/js/table-managed.js"></script>     

	<script>

		jQuery(document).ready(function() {       

		   App.init();

		  // TableManaged.init();
		   jQuery('#sample_1 .group-checkable').change(function () {
               var set = jQuery(this).attr("data-set");
               var checked = jQuery(this).is(":checked");
               jQuery(set).each(function () {
                   if (checked) {
                       $(this).attr("checked", true);
                   } else {
                       $(this).attr("checked", false);
                   }
               });
               jQuery.uniform.update(set);
           });

		});
		
		jQuery('#stat').addClass('active');
		jQuery('#stat a').append('<span class="selected"></span>');
		jQuery('#stat .arrow').addClass('open');
		jQuery('#lastrecord').addClass('active');

	</script>

</body>
	
</html>