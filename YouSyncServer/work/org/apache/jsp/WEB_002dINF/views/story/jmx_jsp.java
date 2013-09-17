package org.apache.jsp.WEB_002dINF.views.story;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jmx_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<title>JMX演示用例</title>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#jmx-tab\").addClass(\"active\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1>JMX演示用例</h1>\n");
      out.write("\n");
      out.write("\t<h2>技术说明：</h2>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>演示使用Spring annotation将POJO定义为MBean</li>\n");
      out.write("\t\t<li>演示使用jolokia将JMX输出为Restul JSON Monitor API</li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\t<h2>MBean介绍:</h2>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>Application Statistics Mbean, 当用户在综合演示里查看/更新用户时，计数器将会递增, name为showcase:name=ApplicationStatistics</li>\n");
      out.write("\t\t<li>Tomcat JDBC 和  Logback同样提供JMX支持</li>\n");
      out.write("\t</ul>\n");
      out.write("\t\n");
      out.write("\t<h2>使用Jconsole或其他JMX客户端:</h2>\n");
      out.write("\t<ul>\n");
      out.write("\t<li>如果JConsole与应用在同一台机器，直接选择该进程。</li>\n");
      out.write("\t<li>否则远程进程URL为 localhost:2099 或完整版的service:jmx:rmi:///jndi/rmi://localhost:2099/jmxrmi</li>\n");
      out.write("\t</ul>\n");
      out.write("\t\n");
      out.write("\t<hr/>\n");
      out.write("\t<h2>与国际接轨的JMX Resultful API:</h2>\n");
      out.write("\t<p>以下种种，成本就是在web.xml里添加一个jolokia的servlet而已。</p>\n");
      out.write("\t查询：\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>列出showcase域下的所有MBean及其描述: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/list/showcase\">/jolokia/list/showcase</a></li>\n");
      out.write("\t\t<li>获取showcase域下的所有MBean的属性: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/read/showcase:name=*\">/jolokia/read/showcase:name=*</a></li>\n");
      out.write("\t\t<li>获取应用统计MBean的所有属性: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/read/showcase:name=ApplicationStatistics\">/jolokia/read/showcase:name=ApplicationStatistics</a></li>\n");
      out.write("\t\t<li>只获取应用统计MBean的展示用户列表次数属性: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/read/showcase:name=ApplicationStatistics/ListUserTimes\">/jolokia/read/showcase:name=ApplicationStatistics/ListUserTimes</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t设置：\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>设置jolokia的属性: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/write/jolokia:type=Config/HistoryMaxEntries/20\">/jolokia/write/jolokia:type=Config/HistoryMaxEntries/20</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t\n");
      out.write("\t执行：\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>执行重置清零统计信息的命令: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/exec/showcase:name=ApplicationStatistics/resetStatistics\">/jolokia/exec/showcase:name=ApplicationStatistics/resetStatistics</a></li>\n");
      out.write("\t\t<li>执行获取特定Logger的Level的命令: <br/><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jolokia/exec/ch.qos.logback.classic:Name=default,Type=ch.qos.logback.classic.jmx.JMXConfigurator/getLoggerEffectiveLevel/org.springframework\">/jolokia/exec/ch.qos.logback.classic:Name=default,Type=ch.qos.logback.classic.jmx.JMXConfigurator/getLoggerEffectiveLevel/org.springframework</a></li>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/story/jmx.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("baseUrl");
    // /WEB-INF/views/story/jmx.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/story/jmx.jsp(3,0) 'http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
