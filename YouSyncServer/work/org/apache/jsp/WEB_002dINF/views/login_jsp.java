package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.authc.LockedAccountException;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\r\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\r\n");
      out.write("<!--[if !IE]><!--> <html lang=\"en\"> <!--<![endif]-->\r\r\n");
      out.write("<!-- BEGIN HEAD -->\r\r\r\r\r\r");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r<head>\r\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\r\n");
      out.write("\t<title>Yousync | Login Page</title>\r\r\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\r\n");
      out.write("\t<meta content=\"\" name=\"description\" />\r\r\n");
      out.write("\t<meta content=\"\" name=\"author\" />\r\r\n");
      out.write("\t<!-- BEGIN GLOBAL MANDATORY STYLES -->\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style-metro.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<!-- END GLOBAL MANDATORY STYLES -->\r\r\n");
      out.write("\t<!-- BEGIN PAGE LEVEL STYLES -->\r\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\r\n");
      out.write("\t<!-- END PAGE LEVEL STYLES -->\r\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/image/favicon.ico\" />\r\r\n");
      out.write("</head>\r\r\n");
      out.write("<!-- END HEAD -->\r\r\n");
      out.write("<!-- BEGIN BODY -->\r\r\n");
      out.write("<body class=\"login\">\r\r\n");
      out.write("\t<!-- BEGIN LOGO -->\r\r\n");
      out.write("\t<div class=\"logo\">\r\r\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/image/logo-big.png\" alt=\"\" /> \r\r\n");
      out.write("\t</div>\r\r\n");
      out.write("\t<!-- END LOGO -->\r\r\n");
      out.write("\t<!-- BEGIN LOGIN -->\r\r\n");
      out.write("\t<div class=\"content\">\r\r\n");
      out.write("\t\t<!-- BEGIN LOGIN FORM -->\r\r\n");
      out.write("\t\t<form class=\"form-vertical login-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login\" method=\"post\">\r\r\n");
      out.write("\t\t\t<h3 class=\"form-title\">用户登陆</h3>\r\t\t\t\r\t\t\t\r\t\t\r\t\t\t\t\r\t\t\r\t\t");
			String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);			if(error != null){		
      out.write("\r\n");
      out.write("\t\t\t<div class=\"alert alert-error\">\r\r\n");
      out.write("\t\t\t\t<button class=\"close\" data-dismiss=\"alert\"></button>\r\r\n");
      out.write("\t\t\t\t<span>\r\t\t\t");
				if(error.contains("DisabledAccountException")){					out.print("用户已被屏蔽,请登录其他用户.");				}				else{					out.print("登录失败，请重试.");				}			
      out.write("\t\t\r\t\t\t</span>\r\t\t\t\t\r\t\t\t\t\r\r\n");
      out.write("\t\t\t</div>\r\t\t\t\r\t\t\t");
				}			
      out.write("\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Username</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"Username\" name=\"username\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Password</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-lock\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"password\" placeholder=\"Password\" name=\"password\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"form-actions\">\r\r\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\r\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"rememberMe\" name=\"rememberMe\"/> 记住登陆状态\r\r\n");
      out.write("\t\t\t\t</label>\r\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn green pull-right\">\r\r\n");
      out.write("\t\t\t\t登陆 <i class=\"m-icon-swapright m-icon-white\"></i>\r\r\n");
      out.write("\t\t\t\t</button>            \r\r\n");
      out.write("\t\t\t</div>\r<!-- \r\n");
      out.write("\t\t\t<div class=\"forget-password\">\r\t\t\t\r\n");
      out.write("\t\t\t\t<h4>忘记密码 ?</h4>\r\r\n");
      out.write("\t\t\t\t<p>\r\r\n");
      out.write("\t\t\t\t\t对不起，现在系统暂时不支持找密码功能\r\r\n");
      out.write("\t\t\t\t\t请联系管理员。\r\r\n");
      out.write("\t\t\t\t</p>\r \t\t\r\n");
      out.write("\t\t\t</div>\r\t\t\t\t-->\r\t<!-- \r\n");
      out.write("\t\t\t<div class=\"create-account\">\r\r\n");
      out.write("\t\t\t\t<p>\r\r\n");
      out.write("\t\t\t\t\t如果您还没有账户，请联系管理员开通。\r\r\n");
      out.write("\t\t\t\t</p>\r\r\n");
      out.write("\t\t\t</div>\r\t-->\r\n");
      out.write("\t\t</form>\r\r\n");
      out.write("\t\t<!-- END LOGIN FORM -->        \r\r\n");
      out.write("\t\t<!-- BEGIN FORGOT PASSWORD FORM -->\r\r\n");
      out.write("\t\t<form class=\"form-vertical forget-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login\">\r\r\n");
      out.write("\t\t\t<h3 class=\"\">Forget Password ?</h3>\r\r\n");
      out.write("\t\t\t<p>Enter your e-mail address below to reset your password.</p>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"Email\" name=\"email\" />\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"form-actions\">\r\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"back-btn\" class=\"btn\">\r\r\n");
      out.write("\t\t\t\t<i class=\"m-icon-swapleft\"></i> Back\r\r\n");
      out.write("\t\t\t\t</button>\r\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn green pull-right\">\r\r\n");
      out.write("\t\t\t\tSubmit <i class=\"m-icon-swapright m-icon-white\"></i>\r\r\n");
      out.write("\t\t\t\t</button>            \r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t</form>\r\r\n");
      out.write("\t\t<!-- END FORGOT PASSWORD FORM -->\r\r\n");
      out.write("\t\t<!-- BEGIN REGISTRATION FORM -->\r\r\n");
      out.write("\t\t<form class=\"form-vertical register-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login\">\r\r\n");
      out.write("\t\t\t<h3 class=\"\">Sign Up</h3>\r\r\n");
      out.write("\t\t\t<p>Enter your account details below:</p>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Username</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"Username\" name=\"username\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Password</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-lock\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"password\" id=\"register_password\" placeholder=\"Password\" name=\"password\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Re-type Your Password</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-ok\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"password\" placeholder=\"Re-type Your Password\" name=\"rpassword\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\r\r\n");
      out.write("\t\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">Email</label>\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<div class=\"input-icon left\">\r\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\r\r\n");
      out.write("\t\t\t\t\t\t<input class=\"m-wrap placeholder-no-fix\" type=\"text\" placeholder=\"Email\" name=\"email\"/>\r\r\n");
      out.write("\t\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"control-group\">\r\r\n");
      out.write("\t\t\t\t<div class=\"controls\">\r\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox\">\r\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"tnc\"/> I agree to the <a href=\"#\">Terms of Service</a> and <a href=\"#\">Privacy Policy</a>\r\r\n");
      out.write("\t\t\t\t\t</label>  \r\r\n");
      out.write("\t\t\t\t\t<div id=\"register_tnc_error\"></div>\r\r\n");
      out.write("\t\t\t\t</div>\r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t\t<div class=\"form-actions\">\r\r\n");
      out.write("\t\t\t\t<button id=\"register-back-btn\" type=\"button\" class=\"btn\">\r\r\n");
      out.write("\t\t\t\t<i class=\"m-icon-swapleft\"></i>  Back\r\r\n");
      out.write("\t\t\t\t</button>\r\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"register-submit-btn\" class=\"btn green pull-right\">\r\r\n");
      out.write("\t\t\t\tSign Up <i class=\"m-icon-swapright m-icon-white\"></i>\r\r\n");
      out.write("\t\t\t\t</button>            \r\r\n");
      out.write("\t\t\t</div>\r\r\n");
      out.write("\t\t</form>\r\r\n");
      out.write("\t\t<!-- END REGISTRATION FORM -->\r\r\n");
      out.write("\t</div>\r\r\n");
      out.write("\t<!-- END LOGIN -->\r\r\n");
      out.write("\t<!-- BEGIN COPYRIGHT -->\r\r\n");
      out.write("\t<div class=\"copyright\">\r\r\n");
      out.write("\t\t2013 &copy; Yousync. CMS .\r\r\n");
      out.write("\t</div>\r\r\n");
      out.write("\t<!-- END COPYRIGHT -->\r\r\n");
      out.write("\t<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\r\n");
      out.write("\t<!-- BEGIN CORE PLUGINS -->\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>      \r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<!--[if lt IE 9]>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/excanvas.min.js\"></script>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/respond.min.js\"></script>  \r\r\n");
      out.write("\t<![endif]-->   \r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.blockui.min.js\" type=\"text/javascript\"></script>  \r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.cookie.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.uniform.min.js\" type=\"text/javascript\" ></script>\r\r\n");
      out.write("\t<!-- END CORE PLUGINS -->\r\r\n");
      out.write("\t<!-- BEGIN PAGE LEVEL PLUGINS -->\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<!-- END PAGE LEVEL PLUGINS -->\r\r\n");
      out.write("\t<!-- BEGIN PAGE LEVEL SCRIPTS -->\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/app.js\" type=\"text/javascript\"></script>\r\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/login.js\" type=\"text/javascript\"></script>      \r\r\n");
      out.write("\t<!-- END PAGE LEVEL SCRIPTS --> \r\r\n");
      out.write("\t<script>\r\r\n");
      out.write("\t\tjQuery(document).ready(function() {     \r\r\n");
      out.write("\t\t  App.init();\r\r\n");
      out.write("\t\t  $('.login-form').validate({\r\t            errorElement: 'label', //default input error message container\r\t            errorClass: 'help-inline', // default input error message class\r\t            focusInvalid: false, // do not focus the last invalid input\r\t            rules: {\r\t                username: {\r\t                    required: true\r\t                },\r\t                password: {\r\t                    required: true\r\t                },\r\t                remember: {\r\t                    required: false\r\t                }\r\t            },\r\r\t            messages: {\r\t                username: {\r\t                    required: \"Username is required.\"\r\t                },\r\t                password: {\r\t                    required: \"Password is required.\"\r\t                }\r\t            }\r\t\t  });\r\r\n");
      out.write("\t\t});\r\t\t\r\t\t\r\t\t\r\t</script>\r\r\n");
      out.write("\t</script>\r\r\n");
      out.write("\t<!-- END JAVASCRIPTS -->\r\r\n");
      out.write("\r\n");
      out.write("<!-- END BODY -->\r\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/login.jsp(5,282) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/login.jsp(5,282) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/login.jsp(5,282) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
