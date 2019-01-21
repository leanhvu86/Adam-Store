<%-- 
    Document   : index
    Created on : Jan 17, 2019, 12:29:04 PM
    Author     : Win
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Shop thời trang nam cao cấp </title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="Image/logo.ico">
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/bridge-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/dark-red-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/default-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/green-theme.css" />   
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/purple-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/red-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/yellow-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/lite-blue-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/orange-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/default-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/theme-color/pink-theme.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/Assment.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/responsive.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css" />
        <script src="js/jquery-1.9.1.min.js"></script>
    </head>
    <div class="container">

        <header>
            <div id="demo-2" style='margin-left: 10px'>
                <input type="search" placeholder="Search">
            </div>

            <div class="top-menu">

                <a href="#" title="Tài khoản">Tài khoản</a>
                <a href="#" title="Yêu thích">Yêu thích</a>
                <a href="#" title="Giỏ hàng">Giỏ hàng</a>
                <a href="#" title="Login">Login</a>
                <img style="width: 28px;height: 20px;" src="${pageContext.request.contextPath}/Image/VN.png" title="Vietnamese">
                <img style="width: 28px;height: 20px;" src="${pageContext.request.contextPath}/Image/UK.png" title="English">
            </div>

        </header>
        <nav>
            <img style="width: 150px;height: 50px;" id="img_logo" src="${pageContext.request.contextPath}/Image/ADAM.png" title="SHOP MEN">
            <ul id="menu">

                <li class="main-menu"><a href="Gopy.html">Góp ý</a> </li>
                <li class="main-menu" Style="width:auto"><a href="Tintuc&lienhe.html">Fantage</a></li>
                <li class="main-menu"><a href="Gioithieu.html">Men's Fashion</a>
                    <ul class="menu-1">
                        <li id="sub-1"><a href="Gioithieu.html" title="Giới thiệu">Jacket</a></li>
                        <li id="sub-1"><a href="LichsuWellspring.html" title="Lịch sử phát triển">Tuxedo</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Shose</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Trourse</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Sportwear</a></li>
                    </ul>
                </li>
                <li class="main-menu"><a href="index.html">Trang chủ</a> </li>
            </ul>

        </nav>
        <nav style="margin-top: 0px;">
            <div class="slider-container">
                <div class="slider">

                    <img src="${pageContext.request.contextPath}/Image/slide/anh1.png" title="Slide 1" />
                    <img src="${pageContext.request.contextPath}/Image/slide/anh2.png" title="Slide 2" />
                    <img src="${pageContext.request.contextPath}/Image/slide/anh3.png" title="Slide 3" />
                    <img src="${pageContext.request.contextPath}/Image/slide/anh4.jpg" title="Slide 4" />
                    <img src="${pageContext.request.contextPath}/Image/slide/anh5.jpg" title="Slide 5" />
                    <button type="button" onclick="getPrevImage()" class="btn" id="btnPrev">&lsaquo;</button>
                    <button type="button" onclick="getNextImage()" class="btn" id="btnNext">&rsaquo;</button>
                    <h1 id="titleSlider">Slide Title 1</h1>
                </div>

            </div>
        </nav>
        <aside style=" margin-top: 25%;">
            <div class="left-sidebar" >
                <h2>Category</h2>
                <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">

                                    Tuxedo
                                </a>
                            </h4>
                        </div>
                        <div id="sportswear" class="panel-collapse collapse">

                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#mens">

                                    Jacket
                                </a>
                            </h4>
                        </div>
                        <div id="mens" class="panel-collapse collapse">

                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#womens">

                                    Shose
                                </a>
                            </h4>
                        </div>

                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#womens">

                                    Trousers
                                </a>
                            </h4>
                        </div>

                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#womens">

                                    Sport wear
                                </a>
                            </h4>
                        </div>

                    </div>
                </div><!--/category-products-->



            </div>
            <div class="left-sidebar" style="margin-top: 200px">
                <h2>Shop By Color</h2>
                <div class="aa-color-tag">
                    <a class="aa-color-green" href="#"></a>
                    <a class="aa-color-yellow" href="#"></a>
                    <a class="aa-color-pink" href="#"></a>
                    <a class="aa-color-purple" href="#"></a>
                    <a class="aa-color-brown" href="#"></a>
                    <a class="aa-color-red" href="#"></a>
                    <a class="aa-color-gray" href="#"></a>
                    <a class="aa-color-black" href="#"></a> 
                    <a class="aa-color-orchid" href="#"></a>
                    <a class="aa-color-white" href="#"></a>
                    <a class="aa-color-cyan" href="#"></a>
                    <a class="aa-color-blue" href="#"></a>
                </div>                            
            </div>
            <div class="left-sidebar" style="margin-top: 20px">
                <h2>Recently Views</h2>
                <div class="aa-recently-views">
                    <ul>
                        <li>
                            <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP001.jpg"></a>
                            <div class="aa-cartbox-info">
                                <h4><a>Giầy Âu</a></h4>
                                <p>5000000 VND</p>
                            </div>                    
                        </li>
                        <li>
                            <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP004.jpg"></a>
                            <div class="aa-cartbox-info">
                                <h4><a>Giầy công sở</a></h4>
                                <p>6000000 VND</p>
                            </div>                    
                        </li>
                        <li>
                            <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP003.jpg"></a>
                            <div class="aa-cartbox-info">
                                <h4><a>Áo gió</a></h4>
                                <p>7000000 VND</p>
                            </div>                    
                        </li>                                      
                    </ul>
                </div>                            
            </div>
            <div class="left-sidebar">
                <h2>MY PLACE :</h2>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.840982060836!2d105.87215834926775!3d21.039047785924048!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135abd786acc8dd%3A0x82326e3bf4cae18a!2sWellspring+Bilingual+School!5e0!3m2!1sen!2s!4v1539138367924"
                        width="200" height="150" frameborder="0" style="border:0;" allowfullscreen></iframe>
            </div>
        </aside>
        <article style=" margin-top: 25%;">

            <section>

                <div class="row" >
                    <div class="col-sm-3">
                        <div class="col-sm-9 padding-right">
                            <div class="features_items"><!--features_items-->
                                <h2 class="title text-center">Features Items</h2>
                                <!--                                <div class="col-sm-4">
                                                                    <div class="product-image-wrapper">
                                                                        <div class="single-products">
                                                                            <div class="productinfo text-center">
                                                                                <img src="${pageContext.request.contextPath}/Image/SP001.jpg" alt="" />
                                                                                <h2>$56</h2>
                                                                                <p>Easy Polo Black Edition</p>
                                                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                            </div>
                                                                            <div class="product-overlay">
                                                                                <div class="overlay-content">
                                                                                    <h2>$56</h2>
                                                                                    <p>Easy Polo Black Edition</p>
                                                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                                </div>
                                                                            </div>
                                                               S         </div>
                                                                        <div class="choose">
                                                                            <ul class="nav nav-pills nav-justified">
                                                                                <li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                
                                                                            </ul>
                                                                        </div>
                                                                    </div>
                                                                </div>-->
                                <%
                                    Products listSP = new Products();
                                    List<Product> list = listSP.showProduct("");
                                    for (Product sp : list) {
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

                                        out.println(" </ul>");
                                        out.println(" </div>");
                                        out.println(" </div>");
                                        out.println(" </div>");
                                    }
                                %>
                            </div><!--features_items-->
                        </div>
                    </div>


                </div>

            </section>
        </article>

        <footer>
            <div style="position: absolute;
                 bottom: 5%;left: 5%;">
                <div class="imfo">

                    <a class="text">95 Yên Phụ-P.Trung Trực-Q.Ba Đình-HN </a>
                    <a class="text"> Telephone: +84 24 7305 8668</a>
                    <a class="text"> Email: shopmen@gmail.com</a>
                    <a class="text">Website: shopmen.com.vn</a>
                </div>

            </div>
            <div>
                <table class="subcribe">

                    <form action="">
                        <tr>
                            <td class="text-footer">Đăng ký nhận thông tin tại đây:</td>
                        </tr>
                        <tr>
                            <td style="text-align:left;">
                                <input type="text" name="email" id="email" placeholder="Your Email"></td>
                        </tr>
                        <tr>
                            <td style="text-align:left;color:rgb(57, 133, 184);"><input class="button" type="submit" value="SUBCRIBE"></td>

                        </tr>



                    </form>

                </table>
                <div class="aa-footer-social">
                    <a href="#"><img src="${pageContext.request.contextPath}/Image/fb.png" alt="" /></a>
                    <a href="#"><img src="${pageContext.request.contextPath}/Image/twiter.png" alt="" /></a>
                    <a href="#"><img src="${pageContext.request.contextPath}/Image/google.png" alt="" /></a>
                    <a href="#"><img src="${pageContext.request.contextPath}/Image/ytube.png" alt="" /></a>
                </div>
            </div>
            <hr>
            <a class="text-footer" id="all-right">Shop Men &#169; 2017. All right reserved</a>
        </footer>
    </div>
</body>
</html>
<script src="js/assignment.js"></script>
<script>
                        var indexCurrent = 3;      // Chỉ số hình đầu tiên hiển thị ở slide
                        var loop = true;  // Bật lặp slide 
                        var showbutton = true;  // Hiện 2 button điều hướng
                        var duration = 4000;   // Thời gian chờ chuyển hình (tính theo đơn vị milisecond)

                        initSlider();
</script>
