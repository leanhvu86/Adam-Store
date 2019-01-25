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
          <script>
            function Redirect() {
                window.location = "login.jsp";
            }
        </script>
    </head>
    <body>
        <header>
            <div id="demo-2" style='margin-left: 10px'>
                <input type="search" placeholder="Search">
            </div>

            <div class="top-menu">

                <a href="login.jsp" title="Tài khoản">Tài khoản</a>
                <a href="#" title="Yêu thích">Yêu thích</a>
                <a href="#" title="Giỏ hàng">Giỏ hàng</a>
                <a href="login.jsp" title="Login">Login</a>
                <img style="width: 28px;height: 20px;" src="${pageContext.request.contextPath}/Image/VN.png" title="Vietnamese">
                <img style="width: 28px;height: 20px;" src="${pageContext.request.contextPath}/Image/UK.png" title="English">
            </div>

        </header>
        <nav>
            <img style="width: 150px;height: 50px;" id="img_logo" src="${pageContext.request.contextPath}/Image/ADAM.png" title="SHOP MEN">
            <ul id="menu">

                <li class="main-menu"><a href="Gopy.html">Góp ý</a> </li>
                <li class="main-menu" Style="width:auto"><a href="Tintuc&lienhe.html">Fantage</a></li>
                <li class="main-menu"><a href="Gioithieu.html">Catalog</a>
                    <ul class="menu-1">
                        <li id="sub-1"><a href="Gioithieu.html" title="Giới thiệu">Jacket</a></li>
                        <li id="sub-1"><a href="LichsuWellspring.html" title="Lịch sử phát triển">Tuxedo</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Shose</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Trourse</a></li>
                        <li id="sub-1"><a href="Thongdieptruong.html" title="Tổng quan">Sportwear</a></li>
                    </ul>
                </li>
                <li class="main-menu"><a href="index.jsp">Trang chủ</a> </li>
            </ul>
        </nav>
    </body>
</html>
<script src="js/assignment.js"></script>
