package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/include/css.jsp");
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/sidebar.jsp");
    _jspx_dependants.add("/include/footer.jsp");
    _jspx_dependants.add("/include/js.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <title>Mon template</title>\r\n");
      out.write("        ");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/mdi/css/materialdesignicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/jvectormap/jquery-jvectormap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/flag-icon-css/css/flag-icon.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/owl-carousel-2/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/owl-carousel-2/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/css/style.css\">\r\n");
      out.write("    <!-- End layout styles -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/template/images/favicon.png\" />\t");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-scroller\">\r\n");
      out.write("            ");
      out.write("<nav class=\"navbar p-0 fixed-top d-flex flex-row\">\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center\">\r\n");
      out.write("\t\t<a class=\"navbar-brand brand-logo-mini\" href=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"assets/images/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"navbar-menu-wrapper flex-grow d-flex align-items-stretch\">\r\n");
      out.write("\t\t<button class=\"navbar-toggler navbar-toggler align-self-center\"\r\n");
      out.write("\t\t\ttype=\"button\" data-toggle=\"minimize\">\r\n");
      out.write("\t\t\t<span class=\"mdi mdi-menu\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<ul class=\"navbar-nav navbar-nav-right\">\r\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\tid=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-profile\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"mb-0 d-none d-sm-block navbar-profile-name\">Ayoub\r\n");
      out.write("\t\t\t\t\t\t\tJemali</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\r\n");
      out.write("\t\t<a class=\"sidebar-brand brand-logo\" href=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/template/images/logo.svg\"\r\n");
      out.write("\t\t\talt=\"logo\" /></a> <a class=\"sidebar-brand brand-logo-mini\"\r\n");
      out.write("\t\t\thref=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/template/images/logo-mini.svg\"\r\n");
      out.write("\t\t\talt=\"logo\" /></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<ul class=\"nav\">\r\n");
      out.write("\t\t<li class=\"nav-item menu-items\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\thref=\"index.html\"> <span class=\"menu-icon\"> <i\r\n");
      out.write("\t\t\t\t\tclass=\"mdi mdi-speedometer\"></i>\r\n");
      out.write("\t\t\t</span> <span class=\"menu-title\">Dashboard</span>\r\n");
      out.write("\t\t</a></li>\r\n");
      out.write("\t\t<li class=\"nav-item menu-items\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\thref=\"pages/forms/basic_elements.html\"> <span class=\"menu-icon\">\r\n");
      out.write("\t\t\t\t\t<i class=\"mdi mdi-playlist-play\"></i>\r\n");
      out.write("\t\t\t</span> <span class=\"menu-title\">Place</span>\r\n");
      out.write("\t\t</a></li>\r\n");
      out.write("\t\t<li class=\"nav-item menu-items\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\thref=\"pages/tables/basic-table.html\"> <span class=\"menu-icon\">\r\n");
      out.write("\t\t\t\t\t<i class=\"mdi mdi-table-large\"></i>\r\n");
      out.write("\t\t\t</span> <span class=\"menu-title\">Section</span>\r\n");
      out.write("\t\t</a></li>\r\n");
      out.write("\t\t<li class=\"nav-item menu-items\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\thref=\"pages/icons/mdi.html\"> <span class=\"menu-icon\"> <i\r\n");
      out.write("\t\t\t\t\tclass=\"mdi mdi-contacts\"></i>\r\n");
      out.write("\t\t\t</span> <span class=\"menu-title\">Deconnecter</span>\r\n");
      out.write("\t\t</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"main-panel\">\r\n");
      out.write("                <div class=\"content-wrapper\">\r\n");
      out.write("                    <div class=\"page-header\">\r\n");
      out.write("                        <h3 class=\"page-title\"> Basic Tables </h3>\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Tables</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Basic tables</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6 grid-margin stretch-card\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h4 class=\"card-title\">Basic Table</h4>\r\n");
      out.write("                                    <p class=\"card-description\"> Add class <code>.table</code>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Profile</th>\r\n");
      out.write("                                                    <th>VatNo.</th>\r\n");
      out.write("                                                    <th>Created</th>\r\n");
      out.write("                                                    <th>Status</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      out.write("   <footer class=\"footer\">\r\n");
      out.write("            <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\r\n");
      out.write("              <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright © bootstrapdash.com 2020</span>\r\n");
      out.write("              <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\"> Free <a href=\"https://www.bootstrapdash.com/bootstrap-admin-template/\" target=\"_blank\">Bootstrap admin templates</a> from Bootstrapdash.com</span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </footer>");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    -->\r\n");
      out.write("    ");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("    <!-- Plugin js for this page -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/progressbar.js/progressbar.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/jvectormap/jquery-jvectormap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/vendors/owl-carousel-2/owl.carousel.min.js\"></script>\r\n");
      out.write("    <!-- End plugin js for this page -->\r\n");
      out.write("    <!-- inject:js -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/off-canvas.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/hoverable-collapse.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/misc.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/settings.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/todolist.js\"></script>\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("    <!-- Custom js for this page -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/template/js/dashboard.js\"></script>");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
