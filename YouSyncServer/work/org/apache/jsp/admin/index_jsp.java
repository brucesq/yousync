package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mpn.web.framework.AuthenticationHelper;
import com.mpn.sd.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	User user = AuthenticationHelper.getCurrentUser(request);
	if(user == null){
		response.sendRedirect(request.getContextPath()+"/admin/login.html");
		return;
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>内容管理</title>\r\n");
      out.write("     \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../themes/redmond/jquery-ui-1.8.2.custom.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../themes/ui.jqgrid.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../themes/ui.multiselect.css\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("html, body {\r\n");
      out.write("\tmargin: 0;\t\t\t/* Remove body margin/padding */\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\t/* Remove scroll bars on browser window */\t\r\n");
      out.write("    font-size: 75%;\r\n");
      out.write("}\r\n");
      out.write("/*Splitter style */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#LeftPane {\r\n");
      out.write("\t/* optional, initial splitbar position */\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write(" * Right-side element of the splitter.\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("#RightPane {\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write(".ui-tabs-nav li {position: relative;}\r\n");
      out.write(".ui-tabs-selected a span {padding-right: 10px;}\r\n");
      out.write(".ui-tabs-close {display: none;position: absolute;top: 3px;right: 0px;z-index: 800;width: 16px;height: 14px;font-size: 10px; font-style: normal;cursor: pointer;}\r\n");
      out.write(".ui-tabs-selected .ui-tabs-close {display: block;}\r\n");
      out.write(".ui-layout-west .ui-jqgrid tr.jqgrow td { border-bottom: 0px none;}\r\n");
      out.write(".ui-datepicker {z-index:1200;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery-ui-1.8.2.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery.layout.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/i18n/grid.locale-en.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$.jgrid.no_legacy_api = true;\r\n");
      out.write("\t$.jgrid.useJSON = true;\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../js/jquery.jqGrid.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery.tablednd.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery.contextmenu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/ui.multiselect.js\" type=\"text/javascript\"></script>   \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("jQuery(document).ready(function(){\r\n");
      out.write("    //$('#switcher').themeswitcher();\r\n");
      out.write("\r\n");
      out.write("\t$('body').layout({\r\n");
      out.write("\t\tresizerClass: 'ui-state-default',\r\n");
      out.write("        west__onresize: function (pane, $Pane) {\r\n");
      out.write("            jQuery(\"#west-grid\").jqGrid('setGridWidth',$Pane.innerWidth()-2);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t$.jgrid.defaults = $.extend($.jgrid.defaults,{loadui:\"enable\"});\r\n");
      out.write("\tvar maintab =jQuery('#tabs','#RightPane').tabs({\r\n");
      out.write("        add: function(e, ui) {\r\n");
      out.write("            // append close thingy\r\n");
      out.write("            $(ui.tab).parents('li:first')\r\n");
      out.write("                .append('<span class=\"ui-tabs-close ui-icon ui-icon-close\" title=\"Close Tab\"></span>')\r\n");
      out.write("                .find('span.ui-tabs-close')\r\n");
      out.write("                .click(function() {\r\n");
      out.write("                    maintab.tabs('remove', $('li', maintab).index($(this).parents('li:first')[0]));\r\n");
      out.write("                });\r\n");
      out.write("            // select just added tab\r\n");
      out.write("            maintab.tabs('select', '#' + ui.panel.id);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    jQuery(\"#west-grid\").jqGrid({\r\n");
      out.write("        url: \"../admin/tree.xml\",\r\n");
      out.write("        datatype: \"xml\",\r\n");
      out.write("        height: \"auto\",\r\n");
      out.write("        pager: false,\r\n");
      out.write("        loadui: \"disable\",\r\n");
      out.write("        colNames: [\"id\",\"Items\",\"url\"],\r\n");
      out.write("        colModel: [\r\n");
      out.write("            {name: \"id\",width:1,hidden:true, key:true},\r\n");
      out.write("            {name: \"menu\", width:150, resizable: false, sortable:false},\r\n");
      out.write("            {name: \"url\",width:1,hidden:true}\r\n");
      out.write("        ],\r\n");
      out.write("        treeGrid: true,\r\n");
      out.write("\t\tcaption: \"内容管理\",\r\n");
      out.write("        ExpandColumn: \"menu\",\r\n");
      out.write("        autowidth: true,\r\n");
      out.write("        //width: 180,\r\n");
      out.write("        rowNum: 200,\r\n");
      out.write("        ExpandColClick: true,\r\n");
      out.write("        treeIcons: {leaf:'ui-icon-document-b'},\r\n");
      out.write("        onSelectRow: function(rowid) {\r\n");
      out.write("            var treedata = $(\"#west-grid\").jqGrid('getRowData',rowid);\r\n");
      out.write("            if(treedata.isLeaf==\"true\") {\r\n");
      out.write("                //treedata.url\r\n");
      out.write("                var st = \"#t\"+treedata.id;\r\n");
      out.write("\t\t\t\tif($(st).html() != null ) {\r\n");
      out.write("\t\t\t\t\tmaintab.tabs('select',st);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tmaintab.tabs('add',st, treedata.menu);\r\n");
      out.write("\t\t\t\t\t$(st,\"#tabs\").load(treedata.url);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\t\r\n");
      out.write("// end splitter\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("  \t<div id=\"LeftPane\" class=\"ui-layout-west ui-widget ui-widget-content\">\r\n");
      out.write("\t\t<table id=\"west-grid\"></table>\r\n");
      out.write("\t</div> <!-- #LeftPane -->\r\n");
      out.write("\t<div id=\"RightPane\" class=\"ui-layout-center ui-helper-reset ui-widget-content\" ><!-- Tabs pane -->\r\n");
      out.write("    <div id=\"switcher\"></div>\r\n");
      out.write("\t\t<div id=\"tabs\" class=\"jqgtabs\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#tabs-1\">内容管理</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div id=\"tabs-1\" style=\"font-size:12px;\"> 欢迎使用<br/>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\tEnjoy\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> <!-- #RightPane -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
