package org.apache.jsp.WEB_002dINF.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/layouts/main_header.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/main_left.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/main_footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\n");
      out.write("\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\n");
      out.write("\n");
      out.write("<!--[if !IE]><!--> <html lang=\"en\"> <!--<![endif]-->\n");
      out.write("\n");
      out.write("<!-- BEGIN HEAD -->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\n");
      out.write("\t<title>YouSync CMS | ");
      if (_jspx_meth_sitemesh_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\n");
      out.write("\t<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("\n");
      out.write("\t<meta content=\"\" name=\"description\" />\n");
      out.write("\n");
      out.write("\t<meta content=\"\" name=\"author\" />\n");
      out.write("\n");
      out.write("\t<!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style-metro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\n");
      out.write("\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\t<!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\n");
      out.write("\n");
      out.write("\t<!-- BEGIN CORE PLUGINS -->\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>      \n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/excanvas.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/respond.min.js\"></script>  \n");
      out.write("\n");
      out.write("\t<![endif]-->   \n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.blockui.min.js\" type=\"text/javascript\"></script>  \n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.cookie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.uniform.min.js\" type=\"text/javascript\" ></script>\n");
      out.write("\n");
      out.write("\t<!-- END CORE PLUGINS -->\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_sitemesh_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/image/favicon.ico\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!-- END HEAD -->\n");
      out.write("\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("\n");
      out.write("<body class=\"page-header-fixed\">\n");
      out.write("\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- BEGIN HEADER -->\n");
      out.write("\n");
      out.write("\t<div class=\"header navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\n");
      out.write("\t\t<!-- BEGIN TOP NAVIGATION BAR -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- BEGIN LOGO -->\n");
      out.write("\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"index.html\">\n");
      out.write("\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/image/logo.png\" alt=\"logo\" />\n");
      out.write("\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- END LOGO -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- BEGIN RESPONSIVE MENU TOGGLER -->\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"btn-navbar collapsed\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/image/menu-toggler.png\" alt=\"\" />\n");
      out.write("\n");
      out.write("\t\t\t\t</a>          \n");
      out.write("\n");
      out.write("\t\t\t\t<!-- END RESPONSIVE MENU TOGGLER -->            \n");
      out.write("\n");
      out.write("\t\t\t\t<!-- BEGIN TOP NAVIGATION MENU -->              \n");
      out.write("\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN NOTIFICATION DROPDOWN -->   \n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- END NOTIFICATION DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN INBOX DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END INBOX DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN TODO DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- END TODO DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"dropdown user\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"username\"> ");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-angle-down\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\"><i class=\"icon-key\"></i> Log Out</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- END USER LOGIN DROPDOWN -->\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- END TOP NAVIGATION MENU --> \n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- END TOP NAVIGATION BAR -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- END HEADER -->");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- BEGIN CONTAINER -->\n");
      out.write("\n");
      out.write("\t<div class=\"page-container row-fluid\">\n");
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- BEGIN SIDEBAR -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"page-sidebar nav-collapse collapse\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- BEGIN SIDEBAR MENU -->        \n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"page-sidebar-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-toggler hidden-phone\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<li id=\"account\" class=\"start \">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/account/user/\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<i class=\"icon-user\"></i> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"title\">用户管理</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li id=\"content\" >\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/soft/\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<i class=\"icon-th\"></i> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"title\">内容管理</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<li  id=\"stat\" class=\"last \">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<i class=\"icon-bar-chart\"></i> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"title\">统计报表</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"arrow \"></span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li id=\"lastrecord\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/stat/newlist\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t最新记录</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li id=\"userstat\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t渠道用户报表</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li id=\"softstat\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t软件安装量报表</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<!-- END SIDEBAR MENU -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- END SIDEBAR -->");
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_sitemesh_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- END CONTAINER -->\n");
      out.write("\n");
      out.write("\t");
      out.write("<!-- BEGIN FOOTER -->\n");
      out.write("\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer-inner\">\n");
      out.write("\n");
      out.write("\t\t\t2013 &copy; YouSync by ZLYD.\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer-tools\">\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"go-top\">\n");
      out.write("\n");
      out.write("\t\t\t<i class=\"icon-angle-up\"></i>\n");
      out.write("\n");
      out.write("\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- END FOOTER -->");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- END BODY -->\n");
      out.write("\n");
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
    // /WEB-INF/layouts/main.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/layouts/main.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/layouts/main.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_005ftitle_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_sitemesh_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_sitemesh_005ftitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_005ftitle_005f0.setParent(null);
    int _jspx_eval_sitemesh_005ftitle_005f0 = _jspx_th_sitemesh_005ftitle_005f0.doStartTag();
    if (_jspx_th_sitemesh_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody.reuse(_jspx_th_sitemesh_005ftitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsitemesh_005ftitle_005fnobody.reuse(_jspx_th_sitemesh_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_005fhead_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_sitemesh_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_sitemesh_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_005fhead_005f0.setParent(null);
    int _jspx_eval_sitemesh_005fhead_005f0 = _jspx_th_sitemesh_005fhead_005f0.doStartTag();
    if (_jspx_th_sitemesh_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody.reuse(_jspx_th_sitemesh_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsitemesh_005fhead_005fnobody.reuse(_jspx_th_sitemesh_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/layouts/main_header.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctx");
    // /WEB-INF/layouts/main_header.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/layouts/main_header.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    // /WEB-INF/layouts/main_header.jsp(64,30) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("name");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent(null);
    // /WEB-INF/layouts/main_left.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("ctx");
    // /WEB-INF/layouts/main_left.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/layouts/main_left.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_sitemesh_005fbody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_sitemesh_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_sitemesh_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_005fbody_005f0.setParent(null);
    int _jspx_eval_sitemesh_005fbody_005f0 = _jspx_th_sitemesh_005fbody_005f0.doStartTag();
    if (_jspx_th_sitemesh_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody.reuse(_jspx_th_sitemesh_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsitemesh_005fbody_005fnobody.reuse(_jspx_th_sitemesh_005fbody_005f0);
    return false;
  }
}
