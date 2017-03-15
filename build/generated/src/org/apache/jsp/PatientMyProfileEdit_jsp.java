package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Service.Service;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import bean.PatientBean;

public final class PatientMyProfileEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Service service = new Service();
    String s = (String) session.getAttribute("userName");
  PatientBean al = service.retrievePatientData(s);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title> Smart Health App</title>\n");
      out.write("\t<meta name=\"description\" content=\"Smart Health App\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \t\t<nav class= \"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t</nav> \n");
      out.write("\n");
      out.write("  \t\t\n");
      out.write("\n");
      out.write("  \t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<div class=\"container text-center\" style=\"max-height: 100px\">\n");
      out.write("\t\t\t\t<h1>Disease Prediction</h1>\n");
      out.write("\t\t\t\t<p> Using Data Mining</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h1 class=\"text-center\">My Profile</h1>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"form-horizontal\" id=\"patientReg\" method=\"post\" action=\"\" >\n");
      out.write("       <!--  <form  action=\"PatientRegistration\" method=\"post\">  -->\n");
      out.write("             <p style=\"color: red\">\n");
      out.write("                     <!--               ");

                                        String message=request.getParameter("message");
                                        if(message!=null)
                                        {
      out.write("\n");
      out.write("                                        ");
      out.print(message);
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("  -->\n");
      out.write("                                </p>\n");
      out.write("       \n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-1 col-lg-1 \" align=\"center\">  </div>\n");
      out.write("                \n");
      out.write("                   <div class=\" col-md-11 col-lg-11 \" align=\"right\"> \n");
      out.write("                  <table class=\"table table-user-information\">\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td name=\"Name\">Name</td>\n");
      out.write("                       \n");
      out.write("                        <td>   <input type=\"text\" value=\"");
      out.print(al.getName());
      out.write("\"> </input></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td ><input type =\"text\" value=\"");
      out.print(al.getEmail());
      out.write("\"></input></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Age</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(al.getAge());
      out.write("\"></input></td>\n");
      out.write("                      </tr>\n");
      out.write("                   \n");
      out.write("                         <tr>\n");
      out.write("                             <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(al.getGender());
      out.write("\"></input></td>\n");
      out.write("                      </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.print(al.getAddress());
      out.write("\"</input></td>\n");
      out.write("                      </tr>\n");
      out.write("                        \n");
      out.write("                     \n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                  <div class=\"form-inline\">\n");
      out.write("                  <input type=\"submit\" class=\"\" value=\"Save\"/>\n");
      out.write("             </div>\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  \t\t\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.js\"> </script>\n");
      out.write("  \n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"> </script>\n");
      out.write("</body>\t\n");
      out.write("</html> ");
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
