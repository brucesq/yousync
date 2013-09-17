<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD --><%@ page contentType="text/html;charset=UTF-8" %><%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%><%@ page import="org.apache.shiro.authc.LockedAccountException "%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><c:set var="ctx" value="${pageContext.request.contextPath}"/><head>
	<meta charset="utf-8" />
	<title>Yousync | Login Page</title>
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
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link href="${ctx}/media/css/login.css" rel="stylesheet" type="text/css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="${ctx}/media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
	<!-- BEGIN LOGO -->
	<div class="logo">
		<img src="${ctx}/media/image/logo-big.png" alt="" /> 
	</div>
	<!-- END LOGO -->
	<!-- BEGIN LOGIN -->
	<div class="content">
		<!-- BEGIN LOGIN FORM -->
		<form class="form-vertical login-form" action="${ctx}/login" method="post">
			<h3 class="form-title">用户登陆</h3>																<%			String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);			if(error != null){		%>
			<div class="alert alert-error">
				<button class="close" data-dismiss="alert"></button>
				<span>			<%				if(error.contains("DisabledAccountException")){					out.print("用户已被屏蔽,请登录其他用户.");				}				else{					out.print("登录失败，请重试.");				}			%>					</span>								
			</div>						<%				}			%>
			<div class="control-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">Username</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Password</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i>
						<input class="m-wrap placeholder-no-fix" type="password" placeholder="Password" name="password"/>
					</div>
				</div>
			</div>
			<div class="form-actions">
				<label class="checkbox">
				<input type="checkbox" id="rememberMe" name="rememberMe"/> 记住登陆状态
				</label>
				<button type="submit" class="btn green pull-right">
				登陆 <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div><!-- 
			<div class="forget-password">			
				<h4>忘记密码 ?</h4>
				<p>
					对不起，现在系统暂时不支持找密码功能
					请联系管理员。
				</p> 		
			</div>				-->	<!-- 
			<div class="create-account">
				<p>
					如果您还没有账户，请联系管理员开通。
				</p>
			</div>	-->
		</form>
		<!-- END LOGIN FORM -->        
		<!-- BEGIN FORGOT PASSWORD FORM -->
		<form class="form-vertical forget-form" action="${ctx}/login">
			<h3 class="">Forget Password ?</h3>
			<p>Enter your e-mail address below to reset your password.</p>
			<div class="control-group">
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<button type="button" id="back-btn" class="btn">
				<i class="m-icon-swapleft"></i> Back
				</button>
				<button type="submit" class="btn green pull-right">
				Submit <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
		</form>
		<!-- END FORGOT PASSWORD FORM -->
		<!-- BEGIN REGISTRATION FORM -->
		<form class="form-vertical register-form" action="${ctx}/login">
			<h3 class="">Sign Up</h3>
			<p>Enter your account details below:</p>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Username</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-user"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Password</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-lock"></i>
						<input class="m-wrap placeholder-no-fix" type="password" id="register_password" placeholder="Password" name="password"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-ok"></i>
						<input class="m-wrap placeholder-no-fix" type="password" placeholder="Re-type Your Password" name="rpassword"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">Email</label>
				<div class="controls">
					<div class="input-icon left">
						<i class="icon-envelope"></i>
						<input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<label class="checkbox">
					<input type="checkbox" name="tnc"/> I agree to the <a href="#">Terms of Service</a> and <a href="#">Privacy Policy</a>
					</label>  
					<div id="register_tnc_error"></div>
				</div>
			</div>
			<div class="form-actions">
				<button id="register-back-btn" type="button" class="btn">
				<i class="m-icon-swapleft"></i>  Back
				</button>
				<button type="submit" id="register-submit-btn" class="btn green pull-right">
				Sign Up <i class="m-icon-swapright m-icon-white"></i>
				</button>            
			</div>
		</form>
		<!-- END REGISTRATION FORM -->
	</div>
	<!-- END LOGIN -->
	<!-- BEGIN COPYRIGHT -->
	<div class="copyright">
		2013 &copy; Yousync. CMS .
	</div>
	<!-- END COPYRIGHT -->
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
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="${ctx}/media/js/jquery.validate.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="${ctx}/media/js/app.js" type="text/javascript"></script>
	<script src="${ctx}/media/js/login.js" type="text/javascript"></script>      
	<!-- END PAGE LEVEL SCRIPTS --> 
	<script>
		jQuery(document).ready(function() {     
		  App.init();
		  $('.login-form').validate({	            errorElement: 'label', //default input error message container	            errorClass: 'help-inline', // default input error message class	            focusInvalid: false, // do not focus the last invalid input	            rules: {	                username: {	                    required: true	                },	                password: {	                    required: true	                },	                remember: {	                    required: false	                }	            },	            messages: {	                username: {	                    required: "Username is required."	                },	                password: {	                    required: "Password is required."	                }	            }		  });
		});							</script>
	</script>
	<!-- END JAVASCRIPTS -->

<!-- END BODY -->
</html>