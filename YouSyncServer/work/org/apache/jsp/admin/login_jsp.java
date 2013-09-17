package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table id=\"main\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<table id=\"headers\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>Log In</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<table id=\"input\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>username:</th>\r\n");
      out.write("\t\t\t\t<td><input id=\"name\" size=\"15\" maxLength=\"12\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>password:</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"password\" size=\"15\"\r\n");
      out.write("\t\t\t\t\tmaxLength=\"12\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"buttons\"><input type=\"button\" id=\"loginbutton\"\r\n");
      out.write("\t\t\tvalue=\"Login\" /></div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"bottom1\"><span id=\"message\"></span></div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(\"#loginbutton\").click(function() {\r\n");
      out.write(" \tvar name = $(\"#name\").val();\r\n");
      out.write("  \tvar password = $(\"#password\").val();\r\n");
      out.write("  \t$.ajax({\r\n");
      out.write("  \t\turl: \"../ajax/login?username=\"+name+\"&password=\"+password,\r\n");
      out.write("  \t\tcache: false,\r\n");
      out.write("  \t\tsuccess: function(o){\r\n");
      out.write("    \t\tvar msg = $.parseJSON(o);  \r\n");
      out.write("    \t\t\r\n");
      out.write("\t\t\tif(msg.result=='true'){\r\n");
      out.write("\t\t\t\talert(2);\r\n");
      out.write("\t\t\t\tdocument.location.href = '");
      out.print(request.getContextPath());
      out.write("/admin/index.html';\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(3);\r\n");
      out.write("\t\t\t\t $(\"#message\")[0].innerHTML = msg.message;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t});\r\n");
      out.write("  \t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
