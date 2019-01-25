package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;
import model.Products;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topSlider.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <article style=\" margin-top: 25%;\">\n");
      out.write("\n");
      out.write("                    <section>\n");
      out.write("\n");
      out.write("                        <div class=\"row\" >\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"col-sm-9 padding-right\">\n");
      out.write("                                    <div class=\"features_items\"><!--features_items-->\n");
      out.write("                                        <h2 class=\"title text-center\">Hàng mới</h2>\n");
      out.write("\n");
      out.write("                                    ");

                                        Products listSP = new Products();
                                        List<Product> list = listSP.showProduct("");
                                        for (Product sp : list) {
                                            out.print("<form action=\"ControllerCartBean\">");
                                            out.print(" <div class=\"col-sm-4\">");
                                            out.print(" <div class=\"product-image-wrapper\">");
                                            out.print("<div class=\"single-products\">");
                                            out.print("<div class=\"productinfo text-center\">");
                                            out.println(" <img style=\"width:100% ; height:auto;\" src=\"/Shop/Image/" + sp.getCode() + ".jpg\"/>");
                                            out.println(" <h2>" + sp.getPrice() + " VND</h2>");
                                            out.println("<p>" + sp.getName() + "</p>");
                                        
                                            out.println("<input class=\"btn btn-default add-to-cart\" type=\"submit\" value=\"Add to Cart\" name=\"action\"><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/cart.png\"/>");
                                            out.println("</div>");
                                            out.println(" <div class=\"product-overlay\">");
                                            out.println("<div class=\"overlay-content\">");
                                            out.println(" <h2>" + sp.getPrice() + " VND</h2>");
                                            out.println("<p>" + sp.getName() + "</p>");
                                            out.println("<input class=\"btn btn-default add-to-cart\" type=\"submit\" value=\"Add to Cart\" name=\"action\"><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/cart.png\"/>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println("  <div class=\"choose\">");
                                            out.println("     <ul class=\"nav nav-pills nav-justified\">");
                                            out.println("   <li><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/add.png\"/><a>Add to wishlist</a></li>");

                                            out.println(" </ul>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println("</form>");
                                        }
                                    
      out.write("\n");
      out.write("                                </div><!--features_items-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <section>\n");
      out.write("                    <div class=\"row\" >\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"col-sm-9 padding-right\">\n");
      out.write("                                <div class=\"features_items\"><!--features_items-->\n");
      out.write("                                    <h2 class=\"title text-center\">Hàng bán chạy</h2>\n");
      out.write("\n");
      out.write("                                    ");

                                        Products listSPHot = new Products();
                                        List<Product> list1 = listSPHot.showProductListTop();
                                        for (Product sp : list1) {
                                             out.print("<form action=\"ControllerCartBean\">");
                                            out.print(" <div class=\"col-sm-4\">");
                                            out.print(" <div class=\"product-image-wrapper\">");
                                            out.print("<div class=\"single-products\">");
                                            out.print("<div class=\"productinfo text-center\">");
                                            out.println(" <img style=\"width:100% ; height:auto;\" src=\"/Shop/Image/" + sp.getCode() + ".jpg\"/>");
                                            out.println(" <h2>" + sp.getPrice() + " VND</h2>");
                                            out.println("<p>" + sp.getName() + "</p>");
                                            out.println("<input class=\"btn btn-default add-to-cart\" type=\"submit\" name=\"action\" value=\"Add to cart\"><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/cart.png\"/>");
                                            out.println("</div>");
                                            out.println(" <div class=\"product-overlay\">");
                                            out.println("<div class=\"overlay-content\">");
                                            
                                            out.println(" <h2>" + sp.getPrice() + " VND</h2>");
                                            out.println("<p>" + sp.getName() + "</p>");
                                            out.println("<input class=\"btn btn-default add-to-cart\" type=\"submit\" name=\"action\" value=\"Add to cart\"><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/cart.png\"/>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println("  <div class=\"choose\">");
                                            out.println("     <ul class=\"nav nav-pills nav-justified\">");
                                            out.println("   <li><img style=\"width:20px ; height:20px;\" src=\"/Shop/Image/product-detail/add.png\"/><a>Add to wishlist</a></li>");
                                            out.println("<input type=\"hidden\" name=\"txtCode\" value=\""
							+ sp.getCode() + "\" /> <input type=\"hidden\" name=\"txtName\" value=\"" + sp.getName()
							+ "\" /> <input type=\"hidden\" name=\"txtPrice\" value=\"" + sp.getPrice()
							+ "\" />");
                                            out.println(" </ul>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println(" </div>");
                                            out.println("</form>");
                                        }
                                    
      out.write("\n");
      out.write("                                </div><!--hot_items-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </article>\n");
      out.write("            <aside style=\"margin-top: 25%;\">\n");
      out.write("                <div class=\"left-sidebar\" style=\"height: 200px ; border-bottom: 1px dotted lightgray;\">\n");
      out.write("                    <form action=\"ControllerCartBean\">\n");
      out.write("                    <h2>Giỏ hàng:</h2>\n");
      out.write("                    <div style=\"padding-left:  50px;\">\n");
      out.write("                    <a>Tổng sản phẩm: 3</a><br><br>\n");
      out.write("                    <a>Tổng tiền: 3.000.000 VND</a><br><br>\n");
      out.write("                   <input type=\"submit\" value=\"View Cart\" name=\"action\" /></div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left-sidebar\" >\n");
      out.write("                    <h2>Sản phẩm của bạn</h2>\n");
      out.write("                    <div class=\"aa-recently-views\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP001.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Giầy Âu</a></h4>\n");
      out.write("                                    <p>5000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP004.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Giầy công sở</a></h4>\n");
      out.write("                                    <p>6000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP003.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Áo gió</a></h4>\n");
      out.write("                                    <p>7000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>                                      \n");
      out.write("                        </ul>\n");
      out.write("                    </div>                            \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                                <div class=\"left-sidebar\" >\n");
      out.write("                    <h2>Sản phẩm gần đây</h2>\n");
      out.write("                    <div class=\"aa-recently-views\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP007.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Giầy Âu</a></h4>\n");
      out.write("                                    <p>5000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP008.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Giầy công sở</a></h4>\n");
      out.write("                                    <p>6000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP009.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Áo gió</a></h4>\n");
      out.write("                                    <p>7000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li> \n");
      out.write("                             <li>\n");
      out.write("                                <a href=\"#\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Image/SP010.jpg\"></a>\n");
      out.write("                                <div class=\"aa-cartbox-info\">\n");
      out.write("                                    <h4><a>Áo gió</a></h4>\n");
      out.write("                                    <p>7000000 VND</p>\n");
      out.write("                                </div>                    \n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>                            \n");
      out.write("                </div>\n");
      out.write("                                 <div class=\"left-sidebar\">\n");
      out.write("                    <h2>Vị trí của tôi:</h2>\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.840982060836!2d105.87215834926775!3d21.039047785924048!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135abd786acc8dd%3A0x82326e3bf4cae18a!2sWellspring+Bilingual+School!5e0!3m2!1sen!2s!4v1539138367924\"\n");
      out.write("                            width=\"200\" height=\"150\" frameborder=\"0\" style=\"border:0;\" allowfullscreen></iframe>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"pop-up\">\n");
      out.write("                    <img src=\"Image/slideanh.gif\" title=\"Adam store\" style=\"width: 100%;height: auto\">\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"js/assignment.js\"></script>\n");
      out.write("<script>\n");
      out.write("    var indexCurrent = 3; // Chỉ số hình đầu tiên hiển thị ở slide\n");
      out.write("    var loop = true; // Bật lặp slide \n");
      out.write("    var showbutton = true; // Hiện 2 button điều hướng\n");
      out.write("    var duration = 4000; // Thời gian chờ chuyển hình (tính theo đơn vị milisecond)\n");
      out.write("\n");
      out.write("    initSlider();\n");
      out.write("</script>");
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
