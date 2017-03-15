<%@page import="Service.Service" %>
<%@page import="javax.servlet.ServletException" %>
<%@page import="javax.servlet.http.HttpServlet" %>
<%@page import="javax.servlet.http.HttpServletRequest" %>
<%@page import="javax.servlet.http.HttpServletResponse" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="java.util.ArrayList" %>
<%@page import="bean.PatientBean" %>

<%
    Service service = new Service();
    ArrayList<PatientBean> appointedPatientList = service.getAllPatient();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>

        <meta charset="UTF-8">
            <title>Doctor Home</title>
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <!-- Latest compiled and minified CSS -->
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

                    <!-- Optional theme -->
                    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

                        </head>
                        <style>
                            table {
                                margin-left: auto;
                                margin-right: auto;
                            }
                            tr {
                                
                                text-align: center;
                            }
                        </style>
                        <body>
                            <nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
                                <div class="container">
                                    <div class="navbar-header">
                                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>
                                        <a href="" class="navbar-brand">Smart Health Prediction</a>
                                    </div> <!-- navbar header-->
                                    <div class="collapse navbar-collapse" id="navbar-collapse">
                                        <ul class="nav navbar-nav">
                                            <li><a href="">My Profile</a></li>
                                        </ul>
                                        <ul class="nav navbar-nav navbar-right">
                                            <li><a class="" href="">Logout</a></li>
                                        </ul>
                                    </div>

                                </div> <!-- container-->

                            </nav> <!-- black nav bar-->
                            <!--jumbotron-->
                            <div class="jumbotron" style="padding-bottom:0px; margin-bottom:0px">
                                <div class="container text-center">
                                    <h1>Disease Prediction</h1>
                                    <p>Using Data Mining</p>
                                </div>
                            </div><!-- End jumbotron-->

                            <span style="text-align: center"><h2>Appointment Details</h2></span> 
                            <form  name="DoctorHomePage" id="" action="DoctorHomePage" method="get" onsubmit="">
                                <fieldset class="row1">
                                    <legend style="color: #066A75">
                                    </legend>
                                    <table border="1">
                                        <tr style="color: #066A75" style="border: #066A75" >
                                            <td style="color: #066A75" style="border: #066A75">Name</td>
                                            <td style="color: #066A75" style="border: #066A75">Age</td>
                                            <td style="color: #066A75" style="border: #066A75">Gender</td>
                                            <td style="color: #066A75" style="border: #066A75">Address</td>
                                            <td style="color: #066A75" style="border: #066A75">Email</td>
                                        </tr>
                                        <tr></tr>
                                        <%
                                            for (int i = 0; i < appointedPatientList.size(); i++) {
                                                PatientBean bean = appointedPatientList.get(i);
                                        %>
                                        <tr>
                                            <td style="color: #000"><%=bean.getName()%></td>
                                            <td style="color: #000"><%=bean.getAge()%></td>
                                            <td style="color: #000"><%=bean.getGender()%></td>
                                            <td style="color: #000"><%=bean.getAddress()%></td>
                                            <td style="color: #000"><%=bean.getEmail()%></td>

                                        </tr>
                                        <% }%>
                                    </table> 
                                </fieldset>
                            </form>
                            <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
                            <!-- Latest compiled and minified JavaScript -->
                            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous">
                            </script>
                        </body>
                        </html>