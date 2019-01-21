package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\"  href=\"css/style.css\">\n");
      out.write("        <title>Quản lý cửa hàng</title>\n");
      out.write("        <script>\n");
      out.write("            function changeContent() {\n");
      out.write("                $('#content').load('resultSearch.htm');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <div class=\"header\" >\n");
      out.write("            <div class=\"col-md-12\" style=\"background: #323757;height: 100px;position: relative\">\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                    <div class=\"nav-text\">\n");
      out.write("                        <i class=\"fa fa-product\" aria-hidden=\"true\"></i>\n");
      out.write("                        <h4 style=\"position: absolute;color: white;top: 55%;left: 4%\">Admin Page</h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <img alt=\"eShop\" style=\"width: 130px;height: 40px; position: absolute;top:55%;left: 20%\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/image/logoA.png\">\n");
      out.write("                    <a style=\"position: absolute;color: white;top: 40px;right:10px;\">Xin chào: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emp.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"><a href=\"logOut.htm\" class=\"btn btn-danger btn-sm\" style=\"margin-top: 3em\">Đăng xuất</a></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"\" style=\"margin-top: 8em;margin-left: 17em\">\n");
      out.write("                <a href=\"listB.htm\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Quản lý sản phẩm</a>\n");
      out.write("                <a href=\"listAccCus.htm\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Quản lý khách hàng</a>\n");
      out.write("                <a href=\"listOder.htm\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Quản lý đơn hàng</a>\n");
      out.write("            </div>\n");
      out.write("            <aside style=\"width: 20%;float: left;margin-top: 5%\">\n");
      out.write("                <div class=\"col-md-2\" style=\"width: 100%;float: left\">\n");
      out.write("                    <div class=\"panel panel-primary\" >\n");
      out.write("                        <!--<div class=\"panel-heading\">Products Manager</div>-->\n");
      out.write("                        <div class=\"list-group\" style=\"width: 100%;float: left\">\n");
      out.write("                            <span href=\"#\" class=\"list-group-item active panel-heading\">Sản phẩm</span>\n");
      out.write("                            <a href=\"listB.htm\" id=\"productManager\" class=\"list-group-item\">Quản lý sản phẩm</a>\n");
      out.write("                            <a href=\"initInsertB.htm\" id=\"addManager\" class=\"list-group-item \">Thêm sản phẩm mới</a>\n");
      out.write("                            <a href=\"listCate.htm\" id=\"kindManager\" class=\"list-group-item list-group-item-warning\">Loại sản phẩm</a>\n");
      out.write("                            <a href=\"listBrand.htm\" id=\"brandManager\" class=\"list-group-item\">Quản lí thương hiệu</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2\" style=\"width: 100%;float: left\">\n");
      out.write("                    <div class=\"panel panel-primary\" style=\"margin-top: 45px\">\n");
      out.write("                        <!--<div class=\"panel-heading\">Products Manager</div>-->\n");
      out.write("                        <div class=\"list-group\">\n");
      out.write("                            <span href=\"#\" class=\"list-group-item active panel-heading\">Danh sách khách hàng</span>\n");
      out.write("                            <a href=\"listCustomerType.htm\" id=\"customerManager\" class=\"list-group-item list-group-item-warning\">Quản lý khách hàng</a>\n");
      out.write("                            <a href=\"listCustomerType.htm\" id=\"typeCustomer\" class=\"list-group-item \">Quản lý kiểu khách hàng</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\" style=\"width:100%;float: left\">\n");
      out.write("                    <div class=\"panel panel-primary\" style=\"margin-top: 45px\">\n");
      out.write("                        <!--<div class=\"panel-heading\">Products Manager</div>-->\n");
      out.write("                        <div class=\"list-group\">\n");
      out.write("                            <span href=\"#\" class=\"list-group-item active panel-heading\">Quản lí đơn hàng</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"listCustomerType.htm\" id=\"orderApproved\" class=\"list-group-item \">Quản lý đơn hàng đã xác nhận</a>\n");
      out.write("                            <a href=\"listCustomerType.htm\" id=\"orderManager\" class=\"list-group-item list-group-item-warning\">Quản lý đơn hàng cần xác nhận</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </aside>\n");
      out.write("            <div id=\"content\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
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
