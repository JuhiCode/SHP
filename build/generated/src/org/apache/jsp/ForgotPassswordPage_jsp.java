package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ForgotPassswordPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title> Smart Health App</title>\r\n");
      out.write("\t<meta name=\"description\" content=\"Smart Health App\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("    function myFunction1() {\r\n");
      out.write("        var password1 = document.getElementById(\"password\").value;\r\n");
      out.write("        var password2 = document.getElementById(\"Confirmpassword\").value;\r\n");
      out.write("        var ok=true;\r\n");
      out.write("        if (password1 != password2) {\r\n");
      out.write("            alert(\"Passwords Do not match\");\r\n");
      out.write("            document.getElementById(\"password\").style.borderColor = \"#E34234\";\r\n");
      out.write("            document.getElementById(\"Confirmpassword\").style.borderColor = \"#E34234\";\r\n");
      out.write("             ok=false;\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            //alert(\"Passwords Match!!!\");\r\n");
      out.write("            document.getElementById(\"ForgotPasswordPageServlet\").submit();\r\n");
      out.write("             document.getElementById('submit').disabled = false;\r\n");
      out.write("        }\r\n");
      out.write("        return ok;\r\n");
      out.write("    }\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  \t\t<nav class= \"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t</nav> \r\n");
      out.write("\r\n");
      out.write("  \t\t\r\n");
      out.write("\r\n");
      out.write("  \t\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t\t<div class=\"container text-center\" style=\"max-height: 100px\">\r\n");
      out.write("\t\t\t\t<h1>Disease Prediction</h1>\r\n");
      out.write("\t\t\t\t<p> Using Data Mining</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h1 class=\"text-center\">Forgot Password</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("         <form  action=\"ForgotPasswordPageServlet\" id=\"ForgotPasswordPageServlet\" method=\"post\" onsubmit=\" return myFunction1()\">\r\n");
      out.write("              <p style=\"color: red\">\r\n");
      out.write("                                    ");

                                        String message1=request.getParameter("message1");
                                        if(message1!=null)
                                        {
      out.write("\r\n");
      out.write("                                        ");
      out.print(message1);
      out.write("\r\n");
      out.write("                                     ");
 }
                                    
      out.write("\r\n");
      out.write("                                </p>\r\n");
      out.write("             \r\n");
      out.write("         <div class=\"modal-body\">\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("                 <input type=\"text\" id=\"userName\" name=\"userName\" placeholder=\"Username\" class=\"form-control input-lg\"/>\r\n");
      out.write("             </div>\r\n");
      out.write("\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("                 <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control input-lg\" />\r\n");
      out.write("             </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t <div class=\"form-group\">\r\n");
      out.write("                 <input type=\"password\" id=\"Confirmpassword\" name=\"Confirmpassword\" placeholder=\"Re enter Password\" class=\"form-control input-lg\" />\r\n");
      out.write("             </div>\r\n");
      out.write("\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("              \r\n");
      out.write("                 <input type=\"submit\" class=\"btn btn-block btn-lg btn-primary\"  name=\"submit\" id=\"submit\" value=\"Submit\"/>\r\n");
      out.write("               \r\n");
      out.write("             <!--    <span class=\"center\"><a href=\"LoginPage.jsp\">Login</a></span><span></span> -->\r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("                          </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("  \t\t\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.js\"> </script>\r\n");
      out.write("  \r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"> </script>\r\n");
      out.write("</body>\t\r\n");
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
