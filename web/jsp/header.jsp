<%-- 
    Document   : header
    Created on : Jan 21, 2019, 3:29:56 PM
    Author     : Win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" media="screen" href="css/Assment.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/responsive.css" />
        <link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css" />
    </head>
    <body>
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
    </body>
</html>
