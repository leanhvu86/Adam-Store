

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet"  href="css/bootstrap.css">
        <link rel="stylesheet"  href="css/bootstrap.min_1.css">
        <link rel="stylesheet"  href="css/style.css">
        <link rel="stylesheet"  href="css/main.css">
        <title>Quản lý cửa hàng</title>
        <script>
            function Redirect() {
                window.location = "index.jsp";
            }
        </script>
        
    </head>
    <body>
         
        <div class="container" >
            <!-- HEADER -->
            <div class="header" >
                <div class="col-md-12" style="background: #323757;height: 100px;position: relative">
                    <div class="col-md-10">

                        <div class="nav-text">
                            <i class="fa fa-product" aria-hidden="true"></i>
                            <h5 style="position: absolute;color: white;top: 55%;left: 4%">Admin Page</h5>

                        </div>
                        <img onclick="return Redirect();" alt="eShop" style="width: 130px;height: 40px; position: absolute;top:75%;left: 20%" src="${pageContext.request.contextPath}/Image/ADAM.png">
                        <a style="position: absolute;color: white;top: 40px;right:10px;">Xin chào: ${sessionScope.USER}</a>
                    </div>
                    <div class="col-md-2"><a href="logOut.htm" class="btn btn-danger btn-sm" style="margin-top: 3em">Đăng xuất</a></div>
                </div>

            </div>


            <br/>

            <div class="" style="margin-top: 8em;margin-left: 17em">

                <a href="listB.htm" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Quản lý sản phẩm</a>
                <a href="listAccCus.htm" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Quản lý khách hàng</a>
                <a href="listOder.htm" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Quản lý đơn hàng</a>
            </div>

            <aside style="width: 20%;float: left;margin-top: 5%">

                <div class="col-md-2" style="width: 100%;float: left">
                    <div class="panel panel-primary" >
                        <!--<div class="panel-heading">Products Manager</div>-->
                        <div class="list-group" style="width: 100%;float: left">
                            <span  class="list-group-item active panel-heading">Sản phẩm</span>
                            <a href="listB.htm" id="productManager" class="list-group-item list-group-item-warning">Quản lý sản phẩm</a>
                            <a href="initInsertB.htm" id="addManager" class="list-group-item ">Thêm sản phẩm mới</a>
                            <a href="listCate.htm" id="kindManager" class="list-group-item ">Loại sản phẩm</a>
                            <a href="listBrand.htm" id="brandManager" class="list-group-item">Quản lí thương hiệu</a>

                        </div>
                    </div>
                </div>

                <div class="col-md-2" style="width: 100%;float: left">
                    <div class="panel panel-primary" style="margin-top: 45px">
                        <!--<div class="panel-heading">Products Manager</div>-->
                        <div class="list-group">
                            <span class="list-group-item active panel-heading">Danh sách khách hàng</span>
                            <a href="listCustomerType.htm" id="customerManager" class="list-group-item ">Quản lý khách hàng</a>
                            <a href="listCustomerType.htm" id="typeCustomer" class="list-group-item ">Quản lý kiểu khách hàng</a>

                        </div>
                    </div>
                </div>
                <div class="col-md-2" style="width:100%;float: left">
                    <div class="panel panel-primary" style="margin-top: 45px">
                        <!--<div class="panel-heading">Products Manager</div>-->
                        <div class="list-group">
                            <span class="list-group-item active panel-heading">Quản lí đơn hàng</span>


                            <a href="listCustomerType.htm" id="orderApproved" class="list-group-item ">Quản lý đơn hàng đã xác nhận</a>
                            <a href="listCustomerType.htm" id="orderManager" class="list-group-item ">Quản lý đơn hàng cần xác nhận</a>

                        </div>
                    </div>
            </aside>
            <article>
                <div class="col-md-10  panel panel-default" style="margin-top: 30px;float: left;width: 80%">

                    <!--//table-->
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Mã</th>
                                <th>Tên</th>
                                <th>Loại</th>
                                <th>Giá</th>

                                <th>Color</th> 
                                <th>Tồn kho</th>  
                                <th>Đã bán</th>  
                                <th>Chi tiết</th>
                                <th>Xóa</th>
                            </tr>
                        </thead>

                        <tbody>

                            <%
                                Products listSPHot = new Products();
                                List<Product> list1 = listSPHot.showProduct("");
                                for (Product sp : list1) {
                                    out.println("<tr>");
                                    out.println("<td>" + sp.getCode() + "</td>");
                                    out.println("<td>" + sp.getName() + "</td>");
                                    out.println("<td>" + sp.getType() + "</td>");
                                    out.println("<td>" + sp.getPrice() + "</td>");
                                    out.println("<td>" + sp.getColor() + "</td>");
                                    out.println("<td>" + sp.getQuantity() + "</td>");
                                    out.println("<td>" + sp.getSold() + "</td>");
                                    out.println("<td><a href=\"detailB.htm\" class=\"btn btn-info btn-sm\">Xem thông tin</a></td>");
                                    out.println("<td><a href=\"deleteB.htm\" class=\"btn btn-danger btn-sm\" onclick=\"return alert('Bạn chắc chắn muốn xóa?')\">Xóa</a></td>");
                                    out.println(" </tr>");
                                }
                            %>






                        </tbody>
                    </table>
                    <!--            <div>
                                    <mytag:PaginationTaglib max="12" steps="12" offset="${offset}" count="${count}" 
                                                            uri="listB.htm" next="&raquo;" previous="&laquo;"/>
                                </div>-->

                </div>
            </article>
        </div>

    </body>

</html>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    console.log(list1);
</script>