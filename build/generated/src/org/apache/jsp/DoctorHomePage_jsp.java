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

public final class DoctorHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ArrayList<PatientBean> appointedPatientList = service.getAllPatient();

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("            <title>Doctor Home</title>\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                <!-- Latest compiled and minified CSS -->\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("                    <!-- Optional theme -->\n");
      out.write("                    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("                        </head>\n");
      out.write("                        <style>\n");
      out.write("                            table {\n");
      out.write("                                margin-left: auto;\n");
      out.write("                                margin-right: auto;\n");
      out.write("                            }\n");
      out.write("                            tr {\n");
      out.write("                                \n");
      out.write("                                text-align: center;\n");
      out.write("                            }\n");
      out.write("                        </style>\n");
      out.write("                        <body>\n");
      out.write("                            <nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"navbar-header\">\n");
      out.write("                                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <a href=\"\" class=\"navbar-brand\">Smart Health Prediction</a>\n");
      out.write("                                    </div> <!-- navbar header-->\n");
      out.write("                                    <div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("                                        <ul class=\"nav navbar-nav\">\n");
      out.write("                                            <li><a href=\"\">My Profile</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                            <li><a class=\"\" href=\"\">Logout</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div> <!-- container-->\n");
      out.write("\n");
      out.write("                            </nav> <!-- black nav bar-->\n");
      out.write("                            <!--jumbotron-->\n");
      out.write("                            <div class=\"jumbotron\" style=\"padding-bottom:0px; margin-bottom:0px\">\n");
      out.write("                                <div class=\"container text-center\">\n");
      out.write("                                    <h1>Disease Prediction</h1>\n");
      out.write("                                    <p>Using Data Mining</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!-- End jumbotron-->\n");
      out.write("\n");
      out.write("                            <span style=\"text-align: center\"><h2>Appointment Details</h2></span> \n");
      out.write("                            <form  name=\"DoctorHomePage\" id=\"\" action=\"DoctorHomePage\" method=\"get\" onsubmit=\"\">\n");
      out.write("                                <fieldset class=\"row1\">\n");
      out.write("                                    <legend style=\"color: #066A75\">\n");
      out.write("                                    </legend>\n");
      out.write("                                    <table border=\"1\">\n");
      out.write("                                        <tr style=\"color: #066A75\" style=\"border: #066A75\" >\n");
      out.write("                                            <td style=\"color: #066A75\" style=\"border: #066A75\">Name</td>\n");
      out.write("                                            <td style=\"color: #066A75\" style=\"border: #066A75\">Age</td>\n");
      out.write("                                            <td style=\"color: #066A75\" style=\"border: #066A75\">Gender</td>\n");
      out.write("                                            <td style=\"color: #066A75\" style=\"border: #066A75\">Address</td>\n");
      out.write("                                            <td style=\"color: #066A75\" style=\"border: #066A75\">Email</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr></tr>\n");
      out.write("                                        ");

                                            for (int i = 0; i < appointedPatientList.size(); i++) {
                                                PatientBean bean = appointedPatientList.get(i);
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td style=\"color: #000\">");
      out.print(bean.getName());
      out.write("</td>\n");
      out.write("                                            <td style=\"color: #000\">");
      out.print(bean.getAge());
      out.write("</td>\n");
      out.write("                                            <td style=\"color: #000\">");
      out.print(bean.getGender());
      out.write("</td>\n");
      out.write("                                            <td style=\"color: #000\">");
      out.print(bean.getAddress());
      out.write("</td>\n");
      out.write("                                            <td style=\"color: #000\">");
      out.print(bean.getEmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </table> \n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>\n");
      out.write("                            <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("                            <!-- Latest compiled and minified JavaScript -->\n");
      out.write("                            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\">\n");
      out.write("                            </script>\n");
      out.write("                        </body>\n");
      out.write("                        </html>");
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
