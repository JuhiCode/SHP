package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t\t<title>Smart health predictor App </title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Wiredeiki App\">\n");
      out.write("\t\t<!-- LAtest compiled and minified CSS-->\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("\t<!--Navbar -->\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<div class=\"navbar-header\">\n");
      out.write("\t<button type=\"button\" class=\"navbar-toogle\" data-toogle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("\t\t</button>\n");
      out.write("\t<a href=\"\" class=\"navbar-brand\">Smart Health Predictor</a>\n");
      out.write("\t</div><!--navbar header-->\n");
      out.write("\t\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t <li><a href=\"#myprofile\">MY PROFILE</a>\n");
      out.write("\t <li><a href=\"#searchdoctor\">SEARCH DOCTOR</a>\n");
      out.write("\t <li><a href=\"#feedback\">FEEDBACK</a>\n");
      out.write("\t <li><a href=\"#logout\">LOGOUT</a>\n");
      out.write("\t \n");
      out.write("\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t</div><!--End container-->\n");
      out.write("\t</nav><!--End navbar-->\n");
      out.write("\t<!--jumbotron-->\n");
      out.write("\t<div class=\"jumbotron\">\n");
      out.write("\t<div class=\"container text-center\">\n");
      out.write("\t<img src=\"health.jpg\" class=\"img-responsive\" alt=\"Cinque Terre\" > \n");
      out.write("\t<h1>Disease Prediction</h1>\n");
      out.write("\t<p>Using Data Mining</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div><!-- End jumbotron-->\n");
      out.write("\t\n");
      out.write("\t<!-- call to action-->\n");
      out.write("\t<section>\n");
      out.write("\t<div class=\"container text-center\">\n");
      out.write("\t<form name=\"searchdoctorform\" action=\"searchDoctorResult.jsp\" class=\"form-inline\" method=\"post\">\n");
      out.write("\t<div class=\"form-group\">\n");
      out.write("\t\n");
      out.write("\t<label for=\"location\">Location  </label>\n");
      out.write("\t<input type=\"text\" class=\"form-control\" name=\"location\"  placeholder=\"Please provide the location\">\n");
      out.write("\t<hr> \n");
      out.write("\t<p style=\"font-family:verdana\"> Gender\n");
      out.write("\t<label class=\"radio-inliine\"><input type=\"radio\" name=\"optradio\" value=\"M\">Male</label>\n");
      out.write("        <label class=\"radio-inliine\"><input type=\"radio\" name=\"optradio\" value=\"F\">Female</label>\n");
      out.write("  \t<hr>\n");
      out.write("\t<!--</div><!-- End container-->\n");
      out.write("\t<!--<div class=\"container text-center\" name=\"#searchdoctor\">-->\n");
      out.write("\t<!--<form action=\"search\" class=\"form\" method=\"\"post>-->\n");
      out.write("\t<button type=\"submit\" class=\"btn-lg btn-info\">Search Doctor</button>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <a href=\"HomePagePatient.html\" class=\"btn-lg btn-warning\" >Home</a>\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("    </section>\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
