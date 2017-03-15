package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PatientHomePage1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>Smart health predictor App </title>\r\n");
      out.write("\t\t<meta name=\"description\" content=\"Wiredeiki App\">\r\n");
      out.write("\t\t<!-- LAtest compiled and minified CSS-->\r\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<!--Navbar -->\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"navbar-header\">\r\n");
      out.write("\t<button type=\"button\" class=\"navbar-toogle\" data-toogle=\"collapse\" data-target=\"#navbar-collapse\">\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t<a href=\"\" class=\"navbar-brand\">Smart Health Predictor</a>\r\n");
      out.write("\t</div><!--navbar header-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\r\n");
      out.write("\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t <li><a href=\"#myprofile\">MY PROFILE</a>\r\n");
      out.write("\t <li><a href=\"#searchdoctor\">SEARCH DOCTOR</a>\r\n");
      out.write("\t <li><a href=\"#feedback\">FEEDBACK</a>\r\n");
      out.write("\t <li><a href=\"#logout\">LOGOUT</a>\r\n");
      out.write("\t \r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div><!--End container-->\r\n");
      out.write("\t</nav><!--End navbar-->\r\n");
      out.write("\t<!--jumbotron-->\r\n");
      out.write("\t<div class=\"jumbotron\">\r\n");
      out.write("\t<div class=\"container text-center\">\r\n");
      out.write("\t<h1>Disease Prediction</h1>\r\n");
      out.write("\t<p>Using Data Mining</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div><!-- End jumbotron-->\r\n");
      out.write("\t\r\n");
      out.write("<!--\t</div class=\"container\">\r\n");
      out.write("\t<section>\r\n");
      out.write("\t<div class=\"page-header\" id=\"navbar-collapse#feedback\">\r\n");
      out.write("\t<h2>Feedback </h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t</div><!-- End container--> \r\n");
      out.write("\t<!-- call to action-->\r\n");
      out.write("\t<section>\r\n");
      out.write("\t<div class=\"container text-center\">\r\n");
      out.write("\t<form action=\"\" class=\"form-inline\">\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t<label for=\"symptom\">Please enter any one symptom  </label>\r\n");
      out.write("\t<input type=\"text\" class=\"form-control\" id=\"symptom\" placeholder=\"Symptom\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div><!-- End container-->\r\n");
      out.write("\t<div class=\"container text-center\" id=\"#next\">\r\n");
      out.write("\t<form action=\"NextPageOfPatient.html\" class=\"form\" >\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-info\">Next</button>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    </section>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--jumbotron-->\r\n");
      out.write("\t<div class=\"jumbotron\">\r\n");
      out.write("\t<div class=\"container text-center\">\r\n");
      out.write("\t<h3>Are you experiencing any of these symptoms too?</h3>\r\n");
      out.write("\t<h4>Please Select:</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t  <div class=\"dropdown\">\r\n");
      out.write("    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Select\r\n");
      out.write("    <span class=\"caret\"></span></button>\r\n");
      out.write("    <ul class=\"dropdown-menu\">\r\n");
      out.write("      <li><a href=\"#\">fever</a></li>\r\n");
      out.write("      <li><a href=\"#\">chills</a></li>\r\n");
      out.write("      <li><a href=\"#\">joint Pains</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div><!-- div end dropdown -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div><!--End div container -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container text-center\">\r\n");
      out.write("\t<form action=\"\" class=\"form-inline\" >\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-default\">Next</button>\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-default\">I have None Of Above Symptoms</button>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div><!-- End jumbotron-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
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
