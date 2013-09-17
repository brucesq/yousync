package org.apache.jsp.WEB_002dINF.views.stat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>最新记录列表</title>\n");
      out.write("\t<!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/select2_metro.css\" />\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/css/DT_bootstrap.css\" />\n");
      out.write("\n");
      out.write("\t<!-- END PAGE LEVEL STYLES -->\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- BEGIN PAGE -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"page-content\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"portlet-config\" class=\"modal hide\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<button data-dismiss=\"modal\" class=\"close\" type=\"button\"></button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h3>portlet Settings</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p>Here will be a configuration form</p>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->\n");
      out.write("\n");
      out.write("\t\t\t<!-- BEGIN PAGE CONTAINER-->        \n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- BEGIN PAGE HEADER-->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- BEGIN STYLE CUSTOMIZER -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- END BEGIN STYLE CUSTOMIZER -->  \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- BEGIN PAGE TITLE & BREADCRUMB-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-home\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html\">主页</a> \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-angle-right\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">统计报表</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-angle-right\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">最新记录</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- END PAGE TITLE & BREADCRUMB-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- END PAGE HEADER-->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- BEGIN PAGE CONTENT-->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- BEGIN EXAMPLE TABLE PORTLET-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"portlet box light-grey\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"portlet-title\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\"><i class=\"icon-globe\"></i>记录列表</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tools\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"collapse\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#portlet-config\" data-toggle=\"modal\" class=\"config\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"reload\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"remove\"></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"portlet-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\" id=\"sample_editable_1_new\" class=\"btn green\">Add New <i class=\"icon-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group pull-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">Tools <i class=\"icon-angle-down\"></i>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu pull-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Print</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Save as PDF</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Export to Excel</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"sample_1_wrapper\" class=\"dataTables_wrapper form-inline\" role=\"grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"sample_1_length\" class=\"dataTables_length\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label><select size=\"1\" name=\"sample_1_length\" aria-controls=\"sample_1\" class=\"m-wrap small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\" selected=\"selected\">5</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"15\">15</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"20\">20</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"-1\">All</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select> records per page\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"dataTables_filter\" id=\"sample_1_filter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Search: <input type=\"text\" aria-controls=\"sample_1\" class=\"m-wrap medium\"></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-striped table-bordered table-hover\" id=\"sample_1\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th style=\"width:8px;\"><input type=\"checkbox\" class=\"group-checkable\" data-set=\"#sample_1 .checkboxes\" /></th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>用户ID</th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"hidden-480\">软件名称</th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"hidden-480\">手机串号</th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"hidden-480\">手机品牌</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"hidden-480\">电脑MAC地址</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"hidden-480\">安装时间</th>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th ></th>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"dataTables_info\" id=\"sample_1_info\">Showing 1 to 5 of 25 entries</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"span6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"dataTables_paginate paging_bootstrap pagination\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul><li class=\"prev disabled\"><a href=\"#\">← <span class=\"hidden-480\">Prev</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"next\"><a href=\"#\"><span class=\"hidden-480\">Next</span> → </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- END EXAMPLE TABLE PORTLET-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- END PAGE CONTENT-->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- END PAGE CONTAINER-->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- END PAGE -->\n");
      out.write("\t\t\n");
      out.write("\t<!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/select2.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/jquery.dataTables.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/DT_bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("\n");
      out.write("\t<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/app.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/media/js/table-managed.js\"></script>     \n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\n");
      out.write("\t\tjQuery(document).ready(function() {       \n");
      out.write("\n");
      out.write("\t\t   App.init();\n");
      out.write("\n");
      out.write("\t\t  // TableManaged.init();\n");
      out.write("\t\t   jQuery('#sample_1 .group-checkable').change(function () {\n");
      out.write("               var set = jQuery(this).attr(\"data-set\");\n");
      out.write("               var checked = jQuery(this).is(\":checked\");\n");
      out.write("               jQuery(set).each(function () {\n");
      out.write("                   if (checked) {\n");
      out.write("                       $(this).attr(\"checked\", true);\n");
      out.write("                   } else {\n");
      out.write("                       $(this).attr(\"checked\", false);\n");
      out.write("                   }\n");
      out.write("               });\n");
      out.write("               jQuery.uniform.update(set);\n");
      out.write("           });\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\tjQuery('#stat').addClass('active');\n");
      out.write("\t\tjQuery('#stat a').append('<span class=\"selected\"></span>');\n");
      out.write("\t\tjQuery('#stat .arrow').addClass('open');\n");
      out.write("\t\tjQuery('#lastrecord').addClass('active');\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\t\n");
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
    // /WEB-INF/views/stat/list.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/stat/list.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/stat/list.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/stat/list.jsp(204,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/stat/list.jsp(204,6) '${records}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${records}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/stat/list.jsp(204,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"checkboxes\" value=\"1\" /></td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"hidden-480\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.softName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"hidden-480\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.deviceNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"hidden-480\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.deviceBrand}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"hidden-480\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.macAddr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"center hidden-480\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.createTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
