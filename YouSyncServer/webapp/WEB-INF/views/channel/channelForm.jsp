<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springside.org.cn/tags/form"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>渠道管理</title>
<!-- BEGIN PAGE LEVEL STYLES -->

<link rel="stylesheet" type="text/css"
	href="${ctx}/media/css/select2_metro.css" />

<!-- END PAGE LEVEL SCRIPTS -->

</head>

<body>

	<!-- BEGIN PAGE -->

	<div class="page-content">
		<!-- BEGIN PAGE CONTAINER-->

		<div class="container-fluid">

			<!-- BEGIN PAGE HEADER-->

			<div class="row-fluid">
				<div class="span12">
					
					<ul class="breadcrumb">

						<li><i class="icon-home"></i> YouSync <span
							class="icon-angle-right"></span></li>

						<li><a href="${ctx}/channel/">渠道管理</a> <span class="icon-angle-right"></span>

						</li>

						<li>维护渠道</li>

					</ul>

				</div>

			</div>

			<!-- END PAGE HEADER-->
			
			<div class="row-fluid">

					<div class="span12">
					<!-- BEGIN VALIDATION STATES-->

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-reorder"></i>渠道维护</div>

								<div class="tools">

									

								</div>

							</div>

							<div class="portlet-body form">

								<!-- BEGIN FORM-->

								
								
								<form:form id="form_sample_1" modelAttribute="item" action="${ctx}/channel/update" method="post"  class="form-horizontal">		
									
									<input type="hidden" name="id" value="${item.id}"/>
									
									<div class="alert alert-error hide">

										<button class="close" data-dismiss="alert"></button>

										输入有误，请先更正。

									</div>

									<div class="alert alert-success hide">

										<button class="close" data-dismiss="alert"></button>

										输入正确!

									</div>
									
									<div class="control-group">

										<label class="control-label">名称<span class="required">*</span></label>

										<div class="controls">

											<input type="text" id="name" name="name" value="${item.name}" data-required="1" class="span6 m-wrap"/>

										</div>

									</div>

									<div class="control-group">

										<label class="control-label">描述<span class="required">*</span></label>

										<div class="controls">

											<input type="text" id="channelDesc" name="channelDesc" value="${item.channelDesc}" data-required="1" class="span6 m-wrap"/>

										</div>

									</div>

									

									

									<div class="form-actions">

										<button type="submit" class="btn blue">Save</button>

										<button type="button" class="btn">Cancel</button>

									</div>

								</form:form>

								<!-- END FORM-->

							</div>

						</div>

						<!-- END VALIDATION STATES-->

					</div>

				</div>
			
			
		</div>

	</div>



	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script type="text/javascript" src="${ctx}/media/js/jquery.validate.min.js"></script>

	<script type="text/javascript" src="${ctx}/media/js/additional-methods.min.js"></script>

	<script type="text/javascript" src="${ctx}/media/js/select2.min.js"></script>

	<script type="text/javascript" src="${ctx}/media/js/chosen.jquery.min.js"></script>

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="${ctx}/media/js/app.js"></script>
	<!-- END PAGE LEVEL SCRIPTS -->

	<script>
		jQuery(document).ready(function() {

			// initiate layout and plugins

			App.init();
			
			var form1 = $('#form_sample_1');
	        var error1 = $('.alert-error', form1);
	        var success1 = $('.alert-success', form1);
	        form1.validate({
                errorElement: 'span', //default input error message container
                errorClass: 'help-inline', // default input error message class
                focusInvalid: false, // do not focus the last invalid input
                ignore: "",
                rules: {
                	channelDesc: {
                        minlength: 2,
                        required: true
                    },
                    
                    name: {
                        required: true,
                        
                    }
                },

                errorPlacement: function (error, element) { // render error placement for each input type
                    if (element.attr("name") == "status") { // for uniform checkboxes, insert the after the given container
                        error.addClass("no-left-padding").insertAfter("#form_status_error");
                    } else {
                        error.insertAfter(element); // for other inputs, just perform default behavoir
                    }
                },
                invalidHandler: function (event, validator) { //display error alert on form submit              
                    success1.hide();
                    error1.show();
                    App.scrollTo(error1, -200);
                },

                highlight: function (element) { // hightlight error inputs
                    $(element)
                        .closest('.help-inline').removeClass('ok'); // display OK icon
                    $(element)
                        .closest('.control-group').removeClass('success').addClass('error'); // set error class to the control group
                },

                unhighlight: function (element) { // revert the change dony by hightlight
                    $(element)
                        .closest('.control-group').removeClass('error'); // set error class to the control group
                },

                success: function (label) {
                    label
                        .addClass('valid').addClass('help-inline ok') // mark the current input as valid and display OK icon
                    .closest('.control-group').removeClass('error').addClass('success'); // set success class to the control group
                }

               
            });

			
		});
		jQuery('#channel').addClass('active');
		jQuery('#channel a').append('<span class="selected"></span>');
	</script>

	<!-- END JAVASCRIPTS -->

</body>
</html>
