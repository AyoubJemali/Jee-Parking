package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"./template/vendors/mdi/css/materialdesignicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"./template/vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./template/css/style.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"./template/images/favicon.png\" />\r\n");
      out.write("<script src=\"./script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"./script/login.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-scroller\">\r\n");
      out.write("\t\t<div class=\"container-fluid page-body-wrapper full-page-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"row w-100 m-0\">\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"content-wrapper full-page-wrapper d-flex align-items-center auth login-bg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card col-lg-4 mx-auto\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"card-title text-left mb-3\">Login</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Username</label> <input type=\"text\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control p_input\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>Password *</label> <input type=\"password\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control p_input\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"login\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-block enter-btn\">Login</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- content-wrapper ends -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- row ends -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- page-body-wrapper ends -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- container-scroller -->\r\n");
      out.write("\t<!-- plugins:js -->\r\n");
      out.write("\t<script src=\"../../assets/vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("\t<!-- endinject -->\r\n");
      out.write("\t<!-- Plugin js for this page -->\r\n");
      out.write("\t<!-- End plugin js for this page -->\r\n");
      out.write("\t<!-- inject:js -->\r\n");
      out.write("\t<script src=\"./template/js/off-canvas.js\"></script>\r\n");
      out.write("\t<script src=\"./template/js/hoverable-collapse.js\"></script>\r\n");
      out.write("\t<script src=\"./template/js/misc.js\"></script>\r\n");
      out.write("\t<script src=\"./template/js/settings.js\"></script>\r\n");
      out.write("\t<script src=\"./template/js/todolist.js\"></script>\r\n");
      out.write("\t<!-- endinject -->\r\n");
      out.write("</body>\r\n");
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
