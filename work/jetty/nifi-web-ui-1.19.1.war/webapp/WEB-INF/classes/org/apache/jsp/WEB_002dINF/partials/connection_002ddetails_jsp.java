/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2022-12-05 17:14:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connection_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<div id=\"connection-details\">\n    <div class=\"connection-details-tab-container dialog-content\">\n        <div id=\"connection-details-tabs\" class=\"tab-container\"></div>\n        <div id=\"connection-details-tabs-content\">\n            <div id=\"read-only-connection-details-tab-content\" class=\"configuration-tab\">\n                <div class=\"settings-left\">\n                    <div class=\"setting\">\n                        <div id=\"read-only-connection-source-label\" class=\"setting-name\"></div>\n                        <div class=\"setting-field connection-terminal-label\">\n                            <div id=\"read-only-connection-source\" class=\"ellipsis\"></div>\n                        </div>\n                    </div>\n                    <div id=\"read-only-connection-source-group\" class=\"setting\">\n                        <div class=\"setting-name\">Within group</div>\n                        <div class=\"setting-field\">\n                            <div id=\"read-only-connection-source-group-name\"></div>\n                        </div>\n");
      out.write("                        <div class=\"setting-field\">\n                            <div id=\"read-only-connection-remote-source-url\" class=\"hidden\"></div>\n                        </div>\n                    </div>\n                    <div id=\"read-only-relationship-names-container\" class=\"setting\">\n                        <div class=\"setting-name\">\n                            Relationships\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Selected relationships are in bold.\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"read-only-relationship-names\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div id=\"read-only-connection-target-label\" class=\"setting-name\"></div>\n                        <div class=\"setting-field connection-terminal-label\">\n");
      out.write("                            <div id=\"read-only-connection-target\" class=\"ellipsis\"></div>\n                        </div>\n                    </div>\n                    <div id=\"read-only-connection-target-group\" class=\"setting\">\n                        <div class=\"setting-name\">Within group</div>\n                        <div class=\"setting-field\">\n                            <div id=\"read-only-connection-target-group-name\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"read-only-connection-remote-target-url\" class=\"hidden\"></div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n            <div id=\"read-only-connection-settings-tab-content\" class=\"configuration-tab\">\n                <div class=\"settings-left\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">Name</div>\n                        <div class=\"setting-field\">\n                            <span id=\"read-only-connection-name\"></span>\n");
      out.write("                        </div>\n                    </div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">Id</div>\n                        <div class=\"setting-field\">\n                            <span id=\"read-only-connection-id\"></span>\n                        </div>\n                    </div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            FlowFile expiration\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The maximum amount of time an object may be in the flow before it will be automatically aged out of the flow.\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <span id=\"read-only-flow-file-expiration\"></span>\n                        </div>\n                        <div class=\"clear\"></div>\n                    </div>\n                    <div class=\"multi-column-settings\">\n                        <div class=\"setting\">\n");
      out.write("                            <div class=\"setting-name\">\n                                Back Pressure<br/>Object threshold\n                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The maximum number of objects that can be queued before back pressure is applied.\"></div>\n                            </div>\n                            <div class=\"setting-field\">\n                                <span id=\"read-only-back-pressure-object-threshold\"></span>\n                            </div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"separator\">&nbsp;</div>\n                        <div class=\"setting\">\n                            <div class=\"setting-name\">\n                                &nbsp;<br/>Size threshold\n                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The maximum data size of objects that can be queued before back pressure is applied.\"></div>\n                            </div>\n");
      out.write("                            <div class=\"setting-field\">\n                                <span id=\"read-only-back-pressure-data-size-threshold\"></span>\n                            </div>\n                            <div class=\"clear\"></div>\n                        </div>\n                    </div>\n                    <div>\n                        <div class=\"multi-column-settings\">\n                            <div class=\"setting\">\n                                <div class=\"setting-name\">\n                                    Load Balance Strategy\n                                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"How to load balance the data in this Connection across the nodes in the cluster.\"></div>\n                                </div>\n                                <div class=\"setting-field\">\n                                    <div id=\"read-only-load-balance-strategy\"></div>\n                                </div>\n                            </div>\n                            <div class=\"separator\">&nbsp;</div>\n");
      out.write("                            <div id=\"read-only-load-balance-partition-attribute-setting\" class=\"setting\">\n                                <div class=\"setting-name\">\n                                    Attribute Name\n                                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The FlowFile Attribute to use for determining which node a FlowFile will go to.\"></div>\n                                </div>\n                                <div class=\"setting-field\">\n                                    <span id=\"read-only-load-balance-partition-attribute\"></span>\n                                </div>\n                            </div>\n                        </div>\n                        <div id=\"read-only-load-balance-compression-setting\" class=\"setting\">\n                            <div class=\"setting-name\">\n                                Load Balance Compression\n                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Whether or not data should be compressed when being transferred between nodes in the cluster.\"></div>\n");
      out.write("                            </div>\n                            <div class=\"setting-field\">\n                                <div id=\"read-only-load-balance-compression\"></div>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Prioritizers\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Prioritizers that have been selected to reprioritize FlowFiles in this processors work queue.\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"read-only-prioritizers\"></div>\n                        </div>\n                        <div class=\"clear\"></div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n");
      out.write("</div>");
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
