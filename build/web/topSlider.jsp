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
</body>
</html>
<script src="js/assignment.js"></script>
<script>
                        var indexCurrent = 3; // Chỉ số hình đầu tiên hiển thị ở slide
                        var loop = true; // Bật lặp slide 
                        var showbutton = true; // Hiện 2 button điều hướng
                        var duration = 4000; // Thời gian chờ chuyển hình (tính theo đơn vị milisecond)

                        initSlider();
</script>