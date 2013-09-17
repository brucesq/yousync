package org.apache.jsp.WEB_002dINF.views.story;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>定时任务演示</title>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#schedule-tab\").addClass(\"active\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1>定时任务演示</h1>\n");
      out.write("\n");
      out.write("\t<h2>技术说明：</h2>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>JDK5.0 ScheduledExecutorService的Timer式任务定义, 支持Graceful Shutdown演示.</li>\n");
      out.write("\t\t<li>Spring的Cront式任务定义, 支持Graceful Shutdown演示.</li>\n");
      out.write("\t\t<li>Quartz的Timer式与Cron式任务定义.</li>\n");
      out.write("\t\t<li>Quartz的任务在内存或数据库中存储, 单机或集群执行演示.</li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\t<h2>用户故事：</h2>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>简单的定时在Console打印当前用户数量.</li>\n");
      out.write("\t\t<li>设法同时运行两个实例, 演示Quartz集群运行的效果.</li>\n");
      out.write("\t</ul>\n");
      out.write("</body>\n");
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
