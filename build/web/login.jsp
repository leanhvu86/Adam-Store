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

        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="topSlider.jsp"></jsp:include>
        <article style=" margin-top: 25%;height:600px;width: 100%">
            <marquee> <h2>CHÀO MỪNG BẠN ĐẾN VỚI WEBSITE ADAMSHOP</h2></marquee> 

            <div style="margin-left: 200px;margin-top:100px;width: 450px;height: 250px;border: 1px dodgerblue dotted;border-radius: 20px">
                <h4 style="margin-left: 30px;color: blueviolet">Vui lòng đăng nhập username và password</h4>
                <form action="LoginAccController" method="post" style="padding: 50px">
                    UserName: <input style="margin-left: 20px" type="text" name="txtUsername" value=""/><br/><br/>
                    PassWord: <input style="margin-left: 20px" type="password" name="txtPass" value=""/><br/><br/>
                    <input type="submit" value="Login" name="btAction"/>
                    <input style="margin-left: 20px" type="reset" value="Reset"/>
                </form>
                 <h5 style="color: red">${sessionScope.erroMsg}</h5>
            </div>
        </article>

        <jsp:include page="footer.jsp"></jsp:include>
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
