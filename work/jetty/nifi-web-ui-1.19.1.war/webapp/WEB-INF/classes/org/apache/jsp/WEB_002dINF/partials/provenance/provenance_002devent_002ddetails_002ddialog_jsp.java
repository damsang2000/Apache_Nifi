/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2022-12-05 17:14:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.provenance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class provenance_002devent_002ddetails_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<div id=\"event-details-dialog\" class=\"hidden large-dialog\">\n    <div id=\"event-details-dialog-content\"class=\"dialog-content\">\n        <div id=\"event-details-tabs\" class=\"tab-container\"></div>\n        <div id=\"event-details-tabs-content\">\n            <div id=\"event-details-tab-content\" class=\"details-tab\">\n                <span id=\"provenance-event-id\" class=\"hidden\"></span>\n                <span id=\"provenance-event-cluster-node-id\" class=\"hidden\"></span>\n                <div class=\"settings-left\">\n                    <div id=\"event-details\">\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Time</div>\n                            <div id=\"provenance-event-time\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Event Duration</div>\n                            <div id=\"provenance-event-duration\" class=\"detail-value\"></div>\n");
      out.write("                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Lineage Duration</div>\n                            <div id=\"provenance-lineage-duration\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Type</div>\n                            <div id=\"provenance-event-type\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">FlowFile Uuid</div>\n                            <div id=\"provenance-event-flowfile-uuid\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n");
      out.write("                            <div class=\"detail-name\">File Size</div>\n                            <div id=\"provenance-event-file-size\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Component Id</div>\n                            <div id=\"provenance-event-component-id\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Component Name</div>\n                            <div id=\"provenance-event-component-name\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Component Type</div>\n                            <div id=\"provenance-event-component-type\" class=\"detail-value\"></div>\n");
      out.write("                            <div class=\"clear\"></div>\n                        </div>\n                        <div id=\"additional-provenance-details\"></div>\n                        <div class=\"event-detail\">\n                            <div class=\"detail-name\">Details</div>\n                            <div id=\"provenance-event-details\" class=\"detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div class=\"settings-right\">\n                    <div id=\"parent-flowfiles\">\n                        <div class=\"event-header\">Parent FlowFiles (<span id=\"parent-flowfile-count\"></span>)</div>\n                        <div id=\"parent-flowfiles-container\" class=\"flowfile-container\"></div>\n                    </div>\n                    <div id=\"child-flowfiles\">\n                        <div class=\"event-header\">Child FlowFiles (<span id=\"child-flowfile-count\"></span>)</div>\n");
      out.write("                        <div id=\"child-flowfiles-container\"class=\"flowfile-container\"></div>\n                    </div>\n                </div>\n                <div class=\"clear\"></div>\n            </div>\n            <div id=\"attributes-tab-content\" class=\"details-tab\">\n                <div id=\"attributes-details\">\n                    <div id=\"attributes-header\" class=\"event-header\">Attribute Values</div>\n                    <div id=\"modified-attribute-toggle-container\">\n                        <div id=\"modified-attribute-toggle\" class=\"nf-checkbox checkbox-unchecked\"></div>\n                        <div id=\"modified-attribute-toggle-label\" class=\"nf-checkbox-label\">Show modified attributes only</div>\n                        <div class=\"clear\"></div>\n                    </div>\n                    <div class=\"clear\"></div>\n                    <div id=\"attributes-container\"></div>\n                </div>\n            </div>\n            <div id=\"content-tab-content\" class=\"details-tab\">\n                <div class=\"settings-left\">\n");
      out.write("                    <div id=\"input-content-details\" class=\"content-details\">\n                        <div id=\"input-content-header\" class=\"event-header\">Input Claim</div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Container</div>\n                            <div id=\"input-content-container\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Section</div>\n                            <div id=\"input-content-section\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Identifier</div>\n                            <div id=\"input-content-identifier\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n");
      out.write("                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Offset</div>\n                            <div id=\"input-content-offset\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Size</div>\n                            <div id=\"input-content-size\" class=\"content-detail-value\"></div>\n                            <div id=\"input-content-bytes\" class=\"content-detail-value hidden\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div id=\"input-content-download\" class=\"secondary-button hidden fa fa-download button-icon\"><span>Download</span></div>\n                            <div id=\"input-content-view\" class=\"secondary-button fa fa-eye button-icon hidden\"><span>View</span></div>\n");
      out.write("                            <div class=\"clear\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div class=\"settings-right\">\n                    <div id=\"output-content-details\" class=\"content-details\">\n                        <div class=\"event-header\">Output Claim</div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Container</div>\n                            <div id=\"output-content-container\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Section</div>\n                            <div id=\"output-content-section\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n");
      out.write("                            <div class=\"content-detail-name\">Identifier</div>\n                            <div id=\"output-content-identifier\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Offset</div>\n                            <div id=\"output-content-offset\" class=\"content-detail-value\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div class=\"content-detail-name\">Size</div>\n                            <div id=\"output-content-size\" class=\"content-detail-value\"></div>\n                            <div id=\"output-content-bytes\" class=\"content-detail-value hidden\"></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                        <div class=\"event-detail\">\n                            <div id=\"output-content-download\" class=\"secondary-button fa fa-download button-icon hidden\"><span>Download</span></div>\n");
      out.write("                            <div id=\"output-content-view\" class=\"secondary-button fa fa-eye button-icon hidden\"><span>View</span></div>\n                            <div class=\"clear\"></div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"clear\"></div>\n                <div id=\"replay-details\" class=\"content-details hidden\">\n                    <div class=\"event-header\">Replay</div>\n                    <div id=\"replay-content-connection\" class=\"event-detail\">\n                        <div class=\"content-detail-name\">Connection Id</div>\n                        <div id=\"replay-connection-id\" class=\"content-detail-value\"></div>\n                        <div class=\"clear\"></div>\n                    </div>\n                    <div id=\"replay-content-message\" class=\"hidden\"></div>\n                    <div class=\"event-detail\">\n                        <div id=\"replay-content\" class=\"secondary-button fa fa-repeat button-icon\"><span>Replay</span></div>\n                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
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
