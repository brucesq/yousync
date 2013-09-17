package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainContainer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<title>äºè®¡è´¹ç®¡çç³»ç»</title>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"resources/js/dump.js\"></script>\r\n");
      out.write("\t\t<!--å¯¼å¥Ext-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"ext-3.2.0/adapter/ext/ext-base.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"ext-3.2.0/ext-all-debug.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"ext-3.2.0/ext-lang-zh_CN.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"ext-3.2.0/resources/css/ext-all.css\" />\r\n");
      out.write("\t\t<!-- èªå®ä¹åå®¹ -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/common.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"MainContainer.css\" />\r\n");
      out.write("\t\t<!-- å®¢æ·ç®¡çæ¨¡å -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"usermng/resources/css/UserMng.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"usermng/UserTree.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"usermng/UserGrid.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"usermng/UserDetailWindow.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"usermng/UserMngPanel.js\"></script>\r\n");
      out.write("\t\t<!-- äº§åç®¡çæ¨¡å -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"productmng/ProductTree.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"productmng/ProductMngPanel.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"MainContainer.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t</body>\r\n");
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
