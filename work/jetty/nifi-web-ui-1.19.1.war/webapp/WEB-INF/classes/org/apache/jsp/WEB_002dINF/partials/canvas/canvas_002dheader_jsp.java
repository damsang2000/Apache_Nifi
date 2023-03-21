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

public final class canvas_002dheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<md-toolbar id=\"header\" layout-align=\"space-between center\" layout=\"row\" class=\"md-small md-accent md-hue-1\">\n    <img id=\"nifi-logo\" src=\"images/nifi-logo.svg\">\n    <div flex layout=\"row\" layout-align=\"space-between center\">\n        <div id=\"component-container\">\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.processor}}\"\n                    id=\"processor-component\"\n                    class=\"component-button icon icon-processor\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.processorComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.inputPort}}\"\n                    id=\"port-in-component\"\n                    class=\"component-button icon icon-port-in\"\n");
      out.write("                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.inputPortComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.outputPort}}\"\n                    id=\"port-out-component\"\n                    class=\"component-button icon icon-port-out\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.outputPortComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.processGroup}}\"\n                    id=\"group-component\"\n");
      out.write("                    class=\"component-button icon icon-group\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.groupComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.remoteProcessGroup}}\"\n                    id=\"group-remote-component\"\n                    class=\"component-button icon icon-group-remote\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.remoteGroupComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.funnel}}\"\n");
      out.write("                    id=\"funnel-component\"\n                    class=\"component-button icon icon-funnel\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.funnelComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.template}}\"\n                    id=\"template-component\"\n                    class=\"component-button icon icon-template\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.templateComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n            <button title=\"{{appCtrl.serviceProvider.headerCtrl.toolboxCtrl.config.type.label}}\"\n");
      out.write("                    id=\"label-component\"\n                    class=\"component-button icon icon-label\"\n                    ng-disabled=\"!appCtrl.nf.CanvasUtils.canWriteCurrentGroup();\"\n                    nf-draggable=\"appCtrl.serviceProvider.headerCtrl.toolboxCtrl.draggableComponentConfig(appCtrl.serviceProvider.headerCtrl.toolboxCtrl.labelComponent);\">\n                <span class=\"component-button-grip\"></span>\n            </button>\n        </div>\n        <div layout=\"row\" layout-align=\"space-between center\">\n            <div layout-align=\"space-between end\" layout=\"column\">\n                <div layout=\"row\" layout-align=\"space-between center\" id=\"current-user-container\">\n                    <span id=\"anonymous-user-alert\" class=\"hidden fa fa-warning\"></span>\n                    <div></div>\n                    <div id=\"current-user\"></div>\n                </div>\n                <div id=\"login-link-container\">\n                    <span id=\"login-link\" class=\"link\"\n                          ng-click=\"appCtrl.serviceProvider.headerCtrl.loginCtrl.shell.launch();\">log in</span>\n");
      out.write("                </div>\n                <div id=\"logout-link-container\" style=\"display: none;\">\n                    <span id=\"logout-link\" class=\"link\"\n                          ng-click=\"appCtrl.serviceProvider.headerCtrl.logoutCtrl.logout();\">log out</span>\n                </div>\n            </div>\n            <md-menu md-position-mode=\"target-right target\" md-offset=\"-1 44\">\n                <button md-menu-origin id=\"global-menu-button\" ng-click=\"$mdMenu.open()\">\n                    <div class=\"fa fa-navicon\"></div>\n                </button>\n                <md-menu-content id=\"global-menu-content\">\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"reporting-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.summary.shell.launch();\">\n                            <i class=\"fa fa-table\"></i>Summary\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n");
      out.write("                        <a id=\"counters-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.counters.shell.launch();\"\n                           ng-class=\"{disabled: !appCtrl.nf.Common.canAccessCounters()}\">\n                            <i class=\"icon icon-counter\"></i>Counters\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"bulletin-board-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.bulletinBoard.shell.launch();\">\n                            <i class=\"fa fa-sticky-note-o\"></i>Bulletin Board\n                        </a>\n                    </md-menu-item>\n                    <md-menu-divider></md-menu-divider>\n                    <md-menu-item\n                            layout-align=\"space-around center\">\n                        <a id=\"provenance-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.dataProvenance.shell.launch();\"\n");
      out.write("                           ng-class=\"{disabled: !appCtrl.nf.Common.canAccessProvenance()}\">\n                            <i class=\"icon icon-provenance\"></i>Data Provenance\n                        </a>\n                    </md-menu-item>\n                    <md-menu-divider></md-menu-divider>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"flow-settings-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.controllerSettings.shell.launch();\">\n                            <i class=\"fa fa-wrench\"></i>Controller Settings\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"parameter-contexts-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.parameterContexts.shell.launch();\">\n                            <i class=\"fa\"></i>Parameter Contexts\n                        </a>\n                    </md-menu-item>\n");
      out.write("                    <md-menu-item ng-if=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.cluster.visible();\"\n                                  layout-align=\"space-around center\">\n                        <a id=\"cluster-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.cluster.shell.launch();\"\n                           ng-class=\"{disabled: !appCtrl.nf.Common.canAccessController()}\">\n                            <i class=\"fa fa-cubes\"></i>Cluster\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"history-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.flowConfigHistory.shell.launch();\">\n                            <i class=\"fa fa-history\"></i>Flow Configuration History\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"status-history-link\"\n");
      out.write("                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.nodeStatusHistory.shell.launch();\">\n                            <i class=\"fa fa-area-chart\"></i>Node Status History\n                        </a>\n                    </md-menu-item>\n                    <md-menu-divider ng-if=\"appCtrl.nf.CanvasUtils.isManagedAuthorizer()\"></md-menu-divider>\n                    <md-menu-item layout-align=\"space-around center\" ng-if=\"appCtrl.nf.CanvasUtils.isManagedAuthorizer()\">\n                        <a id=\"users-link\" layout=\"row\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.users.shell.launch();\"\n                           ng-class=\"{disabled: !(appCtrl.nf.Common.canAccessTenants())}\">\n                            <i class=\"fa fa-users\"></i>Users\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\" ng-if=\"appCtrl.nf.CanvasUtils.isManagedAuthorizer()\">\n                        <a id=\"policies-link\" layout=\"row\"\n");
      out.write("                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.policies.shell.launch();\"\n                           ng-class=\"{disabled: !(appCtrl.nf.Common.canAccessTenants() && appCtrl.nf.Common.canModifyPolicies())}\">\n                            <i class=\"fa fa-key\"></i>Policies\n                        </a>\n                    </md-menu-item>\n                    <md-menu-divider></md-menu-divider>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"templates-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.templates.shell.launch();\">\n                            <i class=\"icon icon-template\"></i>Templates\n                        </a>\n                    </md-menu-item>\n                    <md-menu-divider></md-menu-divider>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"help-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.help.shell.launch();\">\n");
      out.write("                            <i class=\"fa fa-question-circle\"></i>Help\n                        </a>\n                    </md-menu-item>\n                    <md-menu-item layout-align=\"space-around center\">\n                        <a id=\"about-link\"\n                           ng-click=\"appCtrl.serviceProvider.headerCtrl.globalMenuCtrl.about.modal.show();\">\n                            <i class=\"fa fa-info-circle\"></i>About\n                        </a>\n                    </md-menu-item>\n                </md-menu-content>\n            </md-menu>\n        </div>\n    </div>\n</md-toolbar>\n");
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
