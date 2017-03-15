package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PatientRegistration1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title> Smart Health App</title>\n");
      out.write("\t<meta name=\"description\" content=\"Smart Health App\">\n");
      out.write("\n");
      out.write("\t<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("\t<style> \n");
      out.write("\tbody{\n");
      out.write("\t\tpadding-top: 10px;\n");
      out.write("   \t\t\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \t\t<nav class= \"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t</nav> \n");
      out.write("  \t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<div class=\"container text-center\" style=\"max-height: 100px\">\n");
      out.write("\t\t\t\t<h1>Disease Prediction</h1>\n");
      out.write("\t\t\t\t<p> Using Data Mining</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write(" <div class=\"container\">\n");
      out.write("      <div class=\"row main\">\n");
      out.write("       \n");
      out.write("        <div class=\"main-login main-center\">\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"name\" class=\"cols-sm-2 control-label\">Your Name</label>\n");
      out.write("              <div class=\"cols-sm-10\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                  <input type=\"text\" name=\"name\" id=\"name\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your Name\"/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"email\" class=\"cols-sm-2 control-label\">Your Email</label>\n");
      out.write("              <div class=\"cols-sm-10\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                  <input type=\"text\"  name=\"email\" id=\"email\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your Email\"/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"username\" class=\"cols-sm-2 control-label\">Address</label>\n");
      out.write("              <div class=\"cols-sm-10\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                  <input type=\"text\"  name=\"address\" id=\"address\"  required=\"required\"  class=\"form-control\"  placeholder=\"Enter your Address\"/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"username\" class=\"cols-sm-2 control-label\">Gender</label>\n");
      out.write("              <div class=\"cols-sm-10\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                  <input type=\"radio\" name=\"gender\" value=\"M\" />Male\n");
      out.write("<input type=\"radio\" name=\"gender\" value=\"F\" />Female\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"username\" class=\"cols-sm-2 control-label\">Age</label>\n");
      out.write("              <div class=\"cols-sm-10\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                  \n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>  \n");
      out.write("                \n");
      out.write("                  <input type=\"text\" name=\"age\" id=\"age\" required = \"required\"  class=\"form-control\"   placeholder=\"Enter your Age\"/>                    \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <form action=\"PatientRegistration\" method=\"post\" >\n");
      out.write("            <div class=\"form-group \">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-block btn-lg btn-primary\" value=\"Register\"/>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-register\">\n");
      out.write("                    <a href=\"loginPage.jsp\">Login</a>\n");
      out.write("                 </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("  \t\t\n");
      out.write("  \t\t<script src=\"https://code.jquery.com/jquery-3.1.1.js\" </script>\n");
      out.write("  <!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" </script>\n");
      out.write("</body>\t\n");
      out.write("</html> \n");
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
