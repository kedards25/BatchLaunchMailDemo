package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Send Mail</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br/><br/><br/><br/>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                <h2>Request for batch launch</h2><br/>\n");
      out.write("                <form action=\"SendMail\" method=\"get\" id=\"myID\">\n");
      out.write("                    <div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <!--    <label for=\"facName\">Faculty Name</label>-->\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"facName\" name=\"facName\" placeholder=\"Enter your name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <!--    <label for=\"email\">Email address:</label>-->\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Enter your mailId\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <!--    <label for=\"crsName\">Course Name:</label>-->\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"crsName\" name=\"crsName\" placeholder=\"Subject you are taking\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <!--    <label for=\"crsName\">Course Name:</label>-->\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"stdId\" placeholder=\"Enter Student Id\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"stdName\" placeholder=\"Enter Student names\">  \n");
      out.write("                        <div class=\"input-group-append\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-primary btn-sm\" onclick=\"showValues()\">Add</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <br><br>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Student Id</th>\n");
      out.write("                                    <th>Full Name</th>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"tbdy\">\n");
      out.write("                                        \n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <br/>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-outline-primary\">Send Mail</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("           function showValues()\n");
      out.write("            {\n");
      out.write("                var nm = document.getElementById(\"stdName\");\n");
      out.write("                var name = nm.value;\n");
      out.write("                var stdId = document.getElementById(\"stdId\");\n");
      out.write("                var stId = stdId.value;\n");
      out.write("                var tblRw = \"<tr><td name='tblData_Id'>\" + stId + \"</td><td name='tblData_nm'>\" + name + \"</td></tr>\";\n");
      out.write("                $(\"#tbdy\").append(tblRw);\n");
      out.write("                nm.value = \"\";\n");
      out.write("                stdId.value = \"\";\n");
      out.write("                $(stdId).focus();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getValues()\n");
      out.write("            {  \n");
      out.write("                var x = document.getElementsByName(\"tblData_Id\");\n");
      out.write("                var y = document.getElementsByName(\"tblData_nm\");\n");
      out.write("                for (i = 0; i < x.length; i++)\n");
      out.write("                {\n");
      out.write("                    console.log(x[i].innerHTML);\n");
      out.write("                   // window.location.replace(\"SendMail?=id\"+x[i]);\n");
      out.write("                }\n");
      out.write("                for (j = 0; j < y.length; j++)\n");
      out.write("                {\n");
      out.write("                    console.log(y[j].innerHTML);\n");
      out.write("                    //     window.location.replace(\"SendMail?=name\"+x[j]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
