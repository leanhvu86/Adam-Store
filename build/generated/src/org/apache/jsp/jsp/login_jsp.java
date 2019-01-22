package org.apache.jsp.jsp;

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
      out.write("        <header>\n");
      out.write("            <div id=\"demo-2\" style='margin-left: 10px'>\n");
      out.write("                <input type=\"search\" placeholder=\"Search\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"top-menu\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" title=\"Tài khoản\">Tài khoản</a>\n");
      out.write("                <a href=\"#\" title=\"Yêu thích\">Yêu thích</a>\n");
      out.write("                <a href=\"#\" title=\"Giỏ hàng\">Giỏ hàng</a>\n");
      out.write("                <a href=\"#\" title=\"Login\">Login</a>\n");
      out.write("                <img style=\"width: 28px;height: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/VN.png\" title=\"Vietnamese\">\n");
      out.write("                <img style=\"width: 28px;height: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/UK.png\" title=\"English\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <nav>\n");
      out.write("            <img style=\"width: 150px;height: 50px;\" id=\"img_logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/ADAM.png\" title=\"SHOP MEN\">\n");
      out.write("            <ul id=\"menu\">\n");
      out.write("\n");
      out.write("                <li class=\"main-menu\"><a href=\"Gopy.html\">Góp ý</a> </li>\n");
      out.write("                <li class=\"main-menu\" Style=\"width:auto\"><a href=\"Tintuc&lienhe.html\">Fantage</a></li>\n");
      out.write("                <li class=\"main-menu\"><a href=\"Gioithieu.html\">Men's Fashion</a>\n");
      out.write("                    <ul class=\"menu-1\">\n");
      out.write("                        <li id=\"sub-1\"><a href=\"Gioithieu.html\" title=\"Giới thiệu\">Jacket</a></li>\n");
      out.write("                        <li id=\"sub-1\"><a href=\"LichsuWellspring.html\" title=\"Lịch sử phát triển\">Tuxedo</a></li>\n");
      out.write("                        <li id=\"sub-1\"><a href=\"Thongdieptruong.html\" title=\"Tổng quan\">Shose</a></li>\n");
      out.write("                        <li id=\"sub-1\"><a href=\"Thongdieptruong.html\" title=\"Tổng quan\">Trourse</a></li>\n");
      out.write("                        <li id=\"sub-1\"><a href=\"Thongdieptruong.html\" title=\"Tổng quan\">Sportwear</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"main-menu\"><a href=\"index.html\">Trang chủ</a> </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <nav style=\"margin-top: 0px;\">\n");
      out.write("            <div class=\"slider-container\">\n");
      out.write("                <div class=\"slider\">\n");
      out.write("\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/slide/anh1.png\" title=\"Slide 1\" />\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/slide/anh2.png\" title=\"Slide 2\" />\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/slide/anh3.png\" title=\"Slide 3\" />\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/slide/anh4.jpg\" title=\"Slide 4\" />\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/slide/anh5.jpg\" title=\"Slide 5\" />\n");
      out.write("                    <button type=\"button\" onclick=\"getPrevImage()\" class=\"btn\" id=\"btnPrev\">&lsaquo;</button>\n");
      out.write("                    <button type=\"button\" onclick=\"getNextImage()\" class=\"btn\" id=\"btnNext\">&rsaquo;</button>\n");
      out.write("                    <h1 id=\"titleSlider\">Slide Title 1</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("       \n");
      out.write("        <article style=\" margin-top: 25%;\">\n");
      out.write("\n");
      out.write("            <div style=\"width: 300px;height: 200px;border: 1px dodgerblue dotted;border-radius: 20px\">\n");
      out.write("                <form>\n");
      out.write("                <h2> Login</h2>\n");
      out.write("                <input type=\"text\" id=\"name\" style=\"width: 100px\"/><br><br><br>\n");
      out.write("                <input type=\"password\" id=\"password\" style=\"width: 100px\"/><br><br><br>\n");
      out.write("                <input type=\"submit\" >\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div style=\"position: absolute;\n");
      out.write("                 bottom: 5%;left: 5%;\">\n");
      out.write("                <div class=\"imfo\">\n");
      out.write("\n");
      out.write("                    <a class=\"text\">95 Yên Phụ-P.Trung Trực-Q.Ba Đình-HN </a>\n");
      out.write("                    <a class=\"text\"> Telephone: +84 24 7305 8668</a>\n");
      out.write("                    <a class=\"text\"> Email: shopmen@gmail.com</a>\n");
      out.write("                    <a class=\"text\">Website: shopmen.com.vn</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <table class=\"subcribe\">\n");
      out.write("\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"text-footer\">Đăng ký nhận thông tin tại đây:</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"text-align:left;\">\n");
      out.write("                                <input type=\"text\" name=\"email\" id=\"email\" placeholder=\"Your Email\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"text-align:left;color:rgb(57, 133, 184);\"><input class=\"button\" type=\"submit\" value=\"SUBCRIBE\"></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <div class=\"aa-footer-social\">\n");
      out.write("                    <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/fb.png\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/twiter.png\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/google.png\" alt=\"\" /></a>\n");
      out.write("                    <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/ytube.png\" alt=\"\" /></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <a class=\"text-footer\" id=\"all-right\">Shop Men &#169; 2017. All right reserved</a>\n");
      out.write("        </footer>\n");
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
