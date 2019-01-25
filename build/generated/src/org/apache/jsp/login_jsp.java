package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;
import model.Products;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Shop thời trang nam cao cấp </title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/logo.ico\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/bridge-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/dark-red-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/default-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/green-theme.css\" />   \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/purple-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/red-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/yellow-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/lite-blue-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/orange-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/default-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/theme-color/pink-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/Assment.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/main.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/responsive.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        <script src=\"js/jquery-1.9.1.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topSlider.jsp", out, false);
      out.write("\n");
      out.write("        <article style=\" margin-top: 25%;height:600px;width: 100%\">\n");
      out.write("            <marquee> <h2>CHÀO MỪNG BẠN ĐẾN VỚI WEBSITE ADAMSHOP</h2></marquee> \n");
      out.write("\n");
      out.write("            <div style=\"margin-left: 200px;margin-top:100px;width: 450px;height: 250px;border: 1px dodgerblue dotted;border-radius: 20px\">\n");
      out.write("                <h4 style=\"margin-left: 30px;color: blueviolet\">Vui lòng đăng nhập username và password</h4>\n");
      out.write("                <form action=\"LoginAccController\" method=\"post\" style=\"padding: 50px\">\n");
      out.write("                    UserName: <input style=\"margin-left: 20px\" type=\"text\" name=\"txtUsername\" value=\"\"/><br/><br/>\n");
      out.write("                    PassWord: <input style=\"margin-left: 20px\" type=\"password\" name=\"txtPass\" value=\"\"/><br/><br/>\n");
      out.write("                    <input type=\"submit\" value=\"Login\" name=\"btAction\"/>\n");
      out.write("                    <input style=\"margin-left: 20px\" type=\"reset\" value=\"Reset\"/>\n");
      out.write("                </form>\n");
      out.write("                 <h5 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.erroMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script src=\"js/assignment.js\"></script>\n");
      out.write("<script>\n");
      out.write("                        var indexCurrent = 3;      // Chỉ số hình đầu tiên hiển thị ở slide\n");
      out.write("                        var loop = true;  // Bật lặp slide \n");
      out.write("                        var showbutton = true;  // Hiện 2 button điều hướng\n");
      out.write("                        var duration = 4000;   // Thời gian chờ chuyển hình (tính theo đơn vị milisecond)\n");
      out.write("\n");
      out.write("                        initSlider();\n");
      out.write("</script>\n");
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
