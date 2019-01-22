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
       
        <article style=" margin-top: 25%;height: 700px">

            <div style="margin-left: 200px;margin-top:  200px;width: 350px;height: 250px;border: 1px dodgerblue dotted;border-radius: 20px">
                <form style="padding: 20px 30px">
                    <h3 style="color: blueviolet"> Login</h3>
              Username:  <input type="text" id="name" style="width: 200px"/><br><br><br>
               Password: <input type="password" id="password" style="width: 200px"/><br><br><br>
               <input type="submit" value="Đăng nhập" >
                </form>
            </div>
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
