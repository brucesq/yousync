<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>软件包管理</title>
	<!-- BEGIN PAGE LEVEL STYLES -->

	<link rel="stylesheet" type="text/css" href="${ctx}/media/css/select2_metro.css" />

	<link rel="stylesheet" href="${ctx}/media/css/DT_bootstrap.css" />

	<!-- END PAGE LEVEL STYLES -->
</head>

<body>
<!-- BEGIN PAGE -->

		<div class="page-content">

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

								管理平台

								<i class="icon-angle-right"></i>

							</li>


							<li><a href="#">软件包管理</a></li>

						</ul>

						<!-- END PAGE TITLE & BREADCRUMB-->

					</div>

				</div>
				
				
				<c:if test="${not empty message}">
				<div id="message" class="alert alert-success">
					<button data-dismiss="alert" class="close">×</button>
						${message}
				</div>
				</c:if>
				

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box light-grey">

							<div class="portlet-title">

								<div class="caption"><i class="icon-globe"></i>记录列表</div>

								<div class="tools">
									<a href="${ctx}/soft/create" >新增</a>
									<a href="${ctx}/soft/offline?page=${page.totalPages}&sortType=${sortType}&${searchParams}" id="offline">下线</a>
									<a href="${ctx}/soft/publish?page=${page.totalPages}&sortType=${sortType}&${searchParams}" id="publish">发布</a>
								</div>

							</div>

						
								
								
								
								
								
					<div class="row-fluid">
							<div>						
									
								<form class="form-search" action="#">
						
								<label>名称：</label> <input type="text" name="search_LIKE_name" class="input-medium" value="${param.search_LIKE_name}"> 
								<button type="submit" class="btn" id="search_btn">Search</button>
					    
								</form>
 								
					
							</div>
						</div>
								
								

								<table class="table table-striped table-bordered table-hover" id="table1">

									<thead>

										<tr>

											
											<tr>
											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#table1 .checkboxes" /></th>
											<th>名称</th><th>版本</th><th>类型</th><th>价格</th><th>状态</th><th>渠道</th><th>图标</th>
											</tr>

										</tr>

									</thead>

						<tbody>
						
						
						<c:forEach items="${softs.content}" var="soft">
							<tr>
								<td><input type="checkbox" class="checkboxes" value="${soft.id}" /></td>
								<td><a href="${ctx}/soft/update/${soft.id}">${soft.name}</a></td>
								<td>${soft.version}</td>
								<td>${soft.softType}</td>
								<td>${soft.price}</td>
								<td>${soft.statusName}</td>
								<td>${soft.channelNames}&nbsp;</td>
								<td><img src="${iconPrefix}${soft.iconUrl}" height="90" /></td>
							</tr>
						</c:forEach>
						
					
										
						</tbody>

								</table>
								
								<div class="row-fluid">
									<div class="span6">
										<div class="dataTables_info" id="sample_1_info"></div>
									</div>
									<div class="span6">
										<tags:tablepage page="${softs}" paginationSize="5"/>
									</div>
								</div>

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
		   jQuery('#table1 .group-checkable').change(function () {
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
		   
		   
		   jQuery('#publish').click(function (){
			   var postUrl = $(this).attr("href");
			   var set = jQuery('#table1 .checkboxes');
				 jQuery(set).each(function () {
					 var isChecked = $(this).attr("checked");
					 if(isChecked == "checked"){
						 var value = $(this).attr("value");
						 postUrl += "&checkedid="+value;
					 }
	                                
	            });
				$(this).attr("href",postUrl); 
			});
		   
		   jQuery('#offline').click(function (){
			   var postUrl = $(this).attr("href");
			   var set = jQuery('#table1 .checkboxes');
				 jQuery(set).each(function () {
					 var isChecked = $(this).attr("checked");
					 if(isChecked == "checked"){
						 var value = $(this).attr("value");
						 postUrl += "&checkedid="+value;
					 }
	                                
	            });
				$(this).attr("href",postUrl); 
			});
		});
		
		jQuery('#content').addClass('active');
		jQuery('#content a').append('<span class="selected"></span>');
		
		
	
		
</script>
	

</body>
</html>
