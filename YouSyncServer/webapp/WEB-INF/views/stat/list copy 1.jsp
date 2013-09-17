<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>用户列表</title>
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

								<a href="#">Data Tables</a>

								<i class="icon-angle-right"></i>

							</li>

							<li><a href="#">Managed Tables</a></li>

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

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

									<a href="javascript:;" class="remove"></a>

								</div>

							</div>

							<div class="portlet-body">

								<div class="clearfix">

									<div class="btn-group">

										<a href="" id="sample_editable_1_new" class="btn green">Add New <i class="icon-plus"></i></a>
										
									</div>

									<div class="btn-group pull-right">

										<button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="icon-angle-down"></i>

										</button>

										<ul class="dropdown-menu pull-right">

											<li><a href="#">Print</a></li>

											<li><a href="#">Save as PDF</a></li>

											<li><a href="#">Export to Excel</a></li>

										</ul>

									</div>

								</div>
								
								
								<div id="sample_1_wrapper" class="dataTables_wrapper form-inline" role="grid">
									<div class="row-fluid">
										<div class="span6">
											<div id="sample_1_length" class="dataTables_length">
											<label><select size="1" name="sample_1_length" aria-controls="sample_1" class="m-wrap small">
												<option value="5" selected="selected">5</option>
												<option value="15">15</option>
												<option value="20">20</option>
												<option value="-1">All</option>
											</select> records per page
											</label>
											</div>
										</div>
									<div class="span6">
										<div class="dataTables_filter" id="sample_1_filter">
										<label>Search: <input type="text" aria-controls="sample_1" class="m-wrap medium"></label>
										</div>
									</div>
								</div>
								
								

								<table class="table table-striped table-bordered table-hover" id="sample_1">

									<thead>

										<tr>

											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" /></th>

											<th>Username</th>

											<th class="hidden-480">Email</th>

											<th class="hidden-480">Points</th>

											<th class="hidden-480">Joined</th>

											<th ></th>

										</tr>

									</thead>

									<tbody>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>shuxer</td>

											<td class="hidden-480"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>

											<td class="hidden-480">120</td>

											<td class="center hidden-480">12 Jan 2012</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>looper</td>

											<td class="hidden-480"><a href="mailto:looper90@gmail.com">looper90@gmail.com</a></td>

											<td class="hidden-480">120</td>

											<td class="center hidden-480">12.12.2011</td>

											<td ><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@yahoo.com">userwow@yahoo.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>user1wow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td ><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>restest</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>foopl</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>weep</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>coop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>pppol</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td ><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>goop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>weep</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">15.11.2011</td>

											<td ><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>toopl</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">16.11.2010</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">9.12.2012</td>

											<td ><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>tes21t</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">14.12.2012</td>

											<td ><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>fop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">13.11.2010</td>

											<td ><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>kop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">17.11.2010</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>vopl</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.11.2010</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>wap</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">12.12.2012</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">19.12.2010</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>toop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">17.12.2010</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>weep</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td class="hidden-480">20</td>

											<td class="center hidden-480">15.11.2011</td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

									</tbody>

								</table>
								
								<div class="row-fluid">
									<div class="span6">
										<div class="dataTables_info" id="sample_1_info">Showing 1 to 5 of 25 entries</div>
									</div>
									<div class="span6">
										<div class="dataTables_paginate paging_bootstrap pagination">
										<ul><li class="prev disabled"><a href="#">← <span class="hidden-480">Prev</span></a></li>
										<li class="active"><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">5</a></li>
										<li class="next"><a href="#"><span class="hidden-480">Next</span> → </a></li>
										</ul>
										</div>
									</div>
								</div>

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

					</div>

				</div>

				<div class="row-fluid">

					<div class="span6 responsive" data-tablet="span12 fix-offset" data-desktop="span6">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box grey">

							<div class="portlet-title">

								<div class="caption"><i class="icon-user"></i>Table</div>

								<div class="actions">

									<a href="#" class="btn blue"><i class="icon-pencil"></i> Add</a>

									<div class="btn-group">

										<a class="btn green" href="#" data-toggle="dropdown">

										<i class="icon-cogs"></i> Tools

										<i class="icon-angle-down"></i>

										</a>

										<ul class="dropdown-menu pull-right">

											<li><a href="#"><i class="icon-pencil"></i> Edit</a></li>

											<li><a href="#"><i class="icon-trash"></i> Delete</a></li>

											<li><a href="#"><i class="icon-ban-circle"></i> Ban</a></li>

											<li class="divider"></li>

											<li><a href="#"><i class="i"></i> Make admin</a></li>

										</ul>

									</div>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-striped table-bordered table-hover" id="sample_2">

									<thead>

										<tr>

											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" /></th>

											<th>Username</th>

											<th class="hidden-480">Email</th>

											<th class="hidden-480">Status</th>

										</tr>

									</thead>

									<tbody>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>shuxer</td>

											<td class="hidden-480"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>looper</td>

											<td class="hidden-480"><a href="mailto:looper90@gmail.com">looper90@gmail.com</a></td>

											<td><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@yahoo.com">userwow@yahoo.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>user1wow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>restest</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>foopl</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>weep</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>coop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>pppol</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

									</tbody>

								</table>

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

					</div>

					<div class="span6 responsive" data-tablet="span12 fix-offset" data-desktop="span6">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box purple">

							<div class="portlet-title">

								<div class="caption"><i class="icon-cogs"></i>Table</div>

								<div class="actions">

									<a href="#" class="btn green"><i class="icon-plus"></i> Add</a>

									<a href="#" class="btn yellow"><i class="icon-print"></i> Print</a>

								</div>

							</div>

							<div class="portlet-body">

								<table class="table table-striped table-bordered table-hover" id="sample_3">

									<thead>

										<tr>

											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_3 .checkboxes" /></th>

											<th>Username</th>

											<th class="hidden-480">Email</th>

											<th class="hidden-480">Status</th>

										</tr>

									</thead>

									<tbody>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>shuxer</td>

											<td class="hidden-480"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>looper</td>

											<td class="hidden-480"><a href="mailto:looper90@gmail.com">looper90@gmail.com</a></td>

											<td><span class="label label-warning">Suspended</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@yahoo.com">userwow@yahoo.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>user1wow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>restest</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>foopl</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>weep</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>coop</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>pppol</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">good@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>userwow</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">userwow@gmail.com</a></td>

											<td><span class="label label-inverse">Blocked</span></td>

										</tr>

										<tr class="odd gradeX">

											<td><input type="checkbox" class="checkboxes" value="1" /></td>

											<td>test</td>

											<td class="hidden-480"><a href="mailto:userwow@gmail.com">test@gmail.com</a></td>

											<td><span class="label label-success">Approved</span></td>

										</tr>

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

		});

	</script>

</body>
	
</html>