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

public final class new_002dparameter_002dcontext_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<div id=\"parameter-context-dialog\" layout=\"column\" class=\"hidden read-only\">\n    <div id=\"parameter-context-status-bar\"></div>\n    <div class=\"parameter-context-tab-container dialog-content\">\n        <div id=\"parameter-context-tabs\" class=\"tab-container\"></div>\n        <div id=\"parameter-context-tabs-content\">\n            <div id=\"parameter-context-standard-settings-tab-content\" class=\"split-65-35 configuration-tab\">\n                <div class=\"settings-left\">\n                    <div id=\"parameter-context-id-setting\" class=\"setting hidden\">\n                        <div class=\"setting-name\">Id</div>\n                        <div class=\"setting-field\">\n                            <div id=\"parameter-context-id-field\" class=\"ellipsis\"></div>\n                        </div>\n                    </div>\n                    <div id=\"parameter-context-provider-setting\" class=\"setting hidden\"></div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">Name</div>\n                        <div id=\"parameter-context-name-container\" class=\"setting-field\">\n");
      out.write("                            <input type=\"text\" id=\"parameter-context-name\" class=\"edit-mode\" name=\"parameter-context-name\"/>\n                            <div id=\"parameter-context-name-read-only\" class=\"read-only ellipsis\"></div>\n                        </div>\n                    </div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">Description</div>\n                        <div class=\"setting-field parameter-context-description-container\">\n                            <textarea id=\"parameter-context-description-field\" class=\"edit-mode\" rows=\"6\"></textarea>\n                            <div id=\"parameter-context-description-read-only\" class=\"read-only\"></div>\n                        </div>\n                        <div class=\"clear\"></div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n");
      out.write("                            Referencing Components\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Other components referencing this parameter context.\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"parameter-context-referencing-components\"></div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n            <div id=\"parameter-context-parameters-tab-content\" class=\"split-65-35 configuration-tab\">\n                <div class=\"settings-left\">\n                    <div class=\"edit-mode\">\n                        <div id=\"add-parameter\"><button class=\"button fa fa-plus\"></button></div>\n                        <div class=\"clear\"></div>\n                    </div>\n                    <div id=\"parameter-table\"></div>\n                    <div id=\"parameter-context-update-status\" class=\"hidden\">\n                        <div class=\"setting\">\n                            <div class=\"setting-name\">\n");
      out.write("                                Steps to update parameters\n                            </div>\n                            <div class=\"setting-field\">\n                                <ol id=\"parameter-context-update-steps\"></ol>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"spacer\">&nbsp;</div>\n                <div id=\"parameter-context-usage\" class=\"settings-right\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Parameter\n                            <div class=\"referencing-components-loading\"></div>\n                        </div>\n                        <div class=\"setting-field\">\n                            <div id=\"parameter-referencing-components-context\" class=\"ellipsis\"></div>\n                        </div>\n                    </div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Referencing Components\n");
      out.write("                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Components referencing this parameter grouped by process group.\"></div>\n                        </div>\n                        <div id=\"parameter-referencing-components-container\" class=\"setting-field\">\n                        </div>\n                    </div>\n                </div>\n            </div>\n            <div id=\"parameter-context-inheritance-tab-content\" class=\"configuration-tab\">\n                <div id=\"parameter-context-inheritance-container\">\n                    <div class=\"settings-left\">\n                        <div class=\"setting\">\n                            <div class=\"setting-name\">\n                                Available Parameter Contexts\n                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Available Parameter Contexts that could be inherited from.\"></div>\n                            </div>\n                            <div class=\"setting-field\">\n                                <ol id=\"parameter-context-available\"></ol>\n");
      out.write("                            </div>\n                        </div>\n                    </div>\n                    <div class=\"spacer\">&nbsp;</div>\n                    <div class=\"settings-right\">\n                        <div class=\"setting\">\n                            <div class=\"setting-name\">\n                                Selected Parameter Context\n                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Parameter Contexts selected for inheritance.\"></div>\n                            </div>\n                            <div class=\"setting-field\">\n                                <ol id=\"parameter-context-selected\"></ol>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n                <div id=\"parameter-context-inheritance-container-read-only\" style=\"display: none;\">\n                    <div class=\"settings-left\">\n                        <div class=\"setting\">\n                            <div class=\"setting-name\">\n                                Selected Parameter Context\n");
      out.write("                                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Parameter Contexts selected for inheritance.\"></div>\n                            </div>\n                            <div class=\"setting-field\">\n                                <ol id=\"parameter-context-selected-read-only\"></ol>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n    <div id=\"inherited-parameter-contexts-message\" class=\"ellipsis hidden\">\n        Inherited Parameter Contexts have been modified. Updated listing of Parameters is pending apply.\n    </div>\n</div>\n<div id=\"parameter-dialog\" class=\"dialog cancellable hidden\">\n    <div class=\"dialog-content\">\n        <div class=\"setting\">\n            <div class=\"setting-name\">Name</div>\n            <div class=\"setting-field new-parameter-name-container\">\n                <input id=\"parameter-name\" type=\"text\"/>\n            </div>\n            <div class=\"clear\"></div>\n");
      out.write("        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">\n                Value\n                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Parameter values do not support Expression Language or embedded parameter references.\"></div>\n            </div>\n            <div class=\"setting-field new-parameter-value-container\">\n                <textarea id=\"parameter-value-field\"></textarea>\n                <div class=\"string-check-container\">\n                    <div id=\"parameter-set-empty-string-field\" class=\"nf-checkbox string-check checkbox-unchecked\"></div>\n                    <span class=\"string-check-label nf-checkbox-label\">Set empty string</span>\n                </div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-field new-parameter-sensitive-value-container\">\n                <div class=\"setting-name\">Sensitive value</div>\n                <input id=\"parameter-sensitive-radio-button\" type=\"radio\" name=\"sensitive\" value=\"sensitive\"/> Yes\n");
      out.write("                <input id=\"parameter-not-sensitive-radio-button\" type=\"radio\" name=\"sensitive\" value=\"plain\" checked=\"checked\" style=\"margin-left: 20px;\"/> No\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">Description</div>\n            <div class=\"setting-field new-parameter-description-container\">\n                <textarea id=\"parameter-description-field\" rows=\"6\"></textarea>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n    </div>\n    <div id=\"parameter-context-updating-status\">\n        <div class='parameter-context-step ajax-loading'></div>\n        <div class='status-message ellipsis'>Updating parameter context</div>\n    </div>\n</div>\n<div id=\"referencing-components-template\" class=\"referencing-components-template hidden clear\">\n    <div class=\"setting\">\n        <div class=\"setting-name\">\n            Referencing Processors\n        </div>\n        <div class=\"setting-field\">\n            <ul class=\"parameter-context-referencing-processors\"></ul>\n");
      out.write("        </div>\n    </div>\n    <div class=\"setting\">\n        <div class=\"setting-name\">\n            Referencing Controller Services\n        </div>\n        <div class=\"setting-field\">\n            <ul class=\"parameter-context-referencing-controller-services\"></ul>\n        </div>\n    </div>\n    <div class=\"setting\">\n        <div class=\"setting-name\">\n            Unauthorized referencing components\n        </div>\n        <div class=\"setting-field\">\n            <ul class=\"parameter-context-referencing-unauthorized-components\"></ul>\n        </div>\n    </div>\n</div>\n");
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
