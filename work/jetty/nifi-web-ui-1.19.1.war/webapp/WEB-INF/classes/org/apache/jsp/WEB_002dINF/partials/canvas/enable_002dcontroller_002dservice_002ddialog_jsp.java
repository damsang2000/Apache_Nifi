/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2022-12-05 17:14:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enable_002dcontroller_002dservice_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<div id=\"enable-controller-service-dialog\" layout=\"column\" class=\"hidden large-dialog\">\n    <div class=\"dialog-content\">\n        <div class=\"settings-left\">\n            <div id=\"enable-controller-service-service-container\" class=\"setting\">\n                <div class=\"setting-name\">Service</div>\n                <div class=\"setting-field\">\n                    <span id=\"enable-controller-service-id\" class=\"hidden\"></span>\n                    <div id=\"enable-controller-service-name\"></div>\n                    <div id=\"enable-controller-service-bulletins\"></div>\n                    <div class=\"clear\"></div>\n                </div>\n            </div>\n            <div id=\"enable-controller-service-scope-container\" class=\"setting\">\n                <div class=\"setting-name\">Scope</div>\n                <div class=\"setting-field\">\n                    <div id=\"enable-controller-service-scope\"></div>\n                </div>\n            </div>\n            <div id=\"enable-controller-service-progress-container\" class=\"setting hidden\">\n");
      out.write("                <div id=\"enable-progress-label\" class=\"setting-name\"></div>\n                <div class=\"setting-field\">\n                    <ol id=\"enable-controller-service-progress\">\n                        <li>\n                            Enabling this controller service\n                            <div id=\"enable-controller-service\" class=\"enable-referencing-components\"></div>\n                            <div class=\"clear\"></div>\n                        </li>\n                        <li class=\"referencing-component\">\n                            Enabling referencing controller services\n                            <div id=\"enable-referencing-services\" class=\"enable-referencing-components\"></div>\n                            <div class=\"clear\"></div>\n                        </li>\n                        <li class=\"referencing-component\">\n                            Starting referencing processors and reporting tasks\n                            <div id=\"enable-referencing-schedulable\" class=\"enable-referencing-components\"></div>\n");
      out.write("                            <div class=\"clear\"></div>\n                        </li>\n                    </ol>\n                </div>\n            </div>\n        </div>\n        <div class=\"spacer\">&nbsp;</div>\n        <div class=\"settings-right\">\n            <div class=\"setting\">\n                <div class=\"setting-name\">\n                    Referencing Components\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Other components referencing this controller service.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <div id=\"enable-controller-service-referencing-components\"></div>\n                </div>\n            </div>\n        </div>\n    </div>\n    <div class=\"controller-service-canceling hidden unset\">\n        Canceling...\n    </div>\n</div>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
