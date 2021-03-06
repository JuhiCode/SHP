package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DocRegPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("        var password1 = document.getElementById(\"password\").value;\n");
      out.write("        var password2 = document.getElementById(\"confirmpassword\").value;\n");
      out.write("        var ok=true;\n");
      out.write("        if (password1 != password2) {\n");
      out.write("            alert(\"Passwords Do not match\");\n");
      out.write("            document.getElementById(\"password\").style.borderColor = \"#E34234\";\n");
      out.write("            document.getElementById(\"confirmpassword\").style.borderColor = \"#E34234\";\n");
      out.write("            ok=false;\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            //alert(\"Passwords Match!!!\");\n");
      out.write("            document.getElementById(\"DocRegPageServlet\").submit();\n");
      out.write("        }\n");
      out.write("    return ok;\n");
      out.write("    }\n");
      out.write("</script>\t\n");
      out.write("\n");
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
      out.write("          <h1 class=\"text-center\">Register Yourself</h1>\n");
      out.write("        </div>\n");
      out.write("         <form  id=\"DoctorReg\" method=\"post\" action=\"DocRegPageServlet\" onsubmit=\" return myFunction()\">\n");
      out.write("             <p style=\"color: red\">\n");
      out.write("                                    ");

                                        String message=request.getParameter("message");
                                        if(message!=null)
                                        {
      out.write("\n");
      out.write("                                        ");
      out.print(message);
      out.write("\n");
      out.write("                                     ");
 }
                                    
      out.write("\n");
      out.write("                                </p>\n");
      out.write("         <div class=\"modal-body\">\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                 <input type=\"text\" name=\"name\" id=\"name\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your Name\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <input type=\"text\"  name=\"email\" id=\"email\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your Email\"/>\n");
      out.write("                </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" name=\"phonenumber\" id=\"phonenumber\" required = \"required\"  class=\"form-control\"   placeholder=\"Enter your phonenumber\"/>                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\"  name=\"address\" id=\"address\"  required=\"required\"  class=\"form-control\"  placeholder=\"Enter your Clinic Address\"/>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"M\" />Male\n");
      out.write("<input        type=\"radio\" name=\"gender\" value=\"F\" />Female\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                           \n");
      out.write("             <input type=\"date\"  name=\"avail\" id=\"avail\" required=\"required\" class=\"form-control\"  placeholder=\"pick date and time\"/>\n");
      out.write("             </div>  \n");
      out.write("          \n");
      out.write("          </div>         \n");
      out.write("             \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" name=\"specialization\" id=\"specialization\" required = \"required\"  class=\"form-control\"   placeholder=\"Enter your Specialization area\"/>                    \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" name=\"userName\" id=\"userName\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your UserName\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <input type=\"password\"  name=\"password\" id=\"password\" required=\"required\" class=\"form-control\"   placeholder=\"Enter your password\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"password\"  name=\"confirmpassword\" id=\"confirmpassword\" required=\"required\" class=\"form-control\"   placeholder=\"Re-Enter the password\"/>\n");
      out.write("                </div>  \n");
      out.write("             \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("              \n");
      out.write("                 <input type=\"submit\" class=\"btn btn-block btn-lg btn-primary\" value=\"Register\"/>\n");
      out.write("                \n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("                          </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
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
