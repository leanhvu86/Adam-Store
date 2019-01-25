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
    <body>
        <div class="container">
            <jsp:include page="header.jsp"></jsp:include>
            <jsp:include page="topSlider.jsp"></jsp:include>

                <article style=" margin-top: 35%;">
                  
                    <h1 style="color: teal;">Your Shopping Cart</h1>
                    <c:set var="SHOP" value="${sessionScope.SHOP}"/>
                <c:if test="${not empty SHOP}">
                    <table border="1" class="table">
                        <thead>
                            <tr>
                                <td>No.</td>
                                <td>Code</td>
                                <td>Name</td>
                                <td>Price</td>
                                <td>Quantity</td>
                                <td>Action</td>
                            </tr>
                        </thead>
                        <tbody>
                        <form action="ControllerCartBean" >
                            <c:set var="count" value="0" />
                            <c:forEach var="rows" items="${SHOP}">
                                <c:set var="count" value="${count +1}" />
                                <tr>
                                    <td>${count}</td>
                                    <td>${rows.value.sanpham.code}</td>
                                    <td>${rows.value.sanpham.name}</td>
                                    <td>${rows.value.sanpham.price}</td>
                                    <td>${rows.value.quantity}</td>
                                    <td><input type="checkbox" name="rmv" value="${rows.value.sanpham.code}" /></td>
                                </tr>
                            </c:forEach>
                            <tr>
                            <c:url var="add" value="ControllerCartBean">
                                <c:param name="action" value="AddMore" />
                            </c:url>
                            <td colspan="2"><a href="index.jsp">Add more</a></td>
                            <td><input type="submit" value="Remove" name="action"/></td>
                            </tr>
                        </form>
                        </tbody>
                    </table>
                </c:if>
            </article>
            <aside style="margin-top: 25%;">
                <div class="left-sidebar" style="height: 200px ; border-bottom: 1px dotted lightgray;">
                    <h2>Giỏ hàng:</h2>
                    <div style="padding-left:  50px;">
                        <a>Tổng sản phẩm: 3</a><br><br>
                        <a>Tổng tiền: 3.000.000 VND</a><br><br>
                        <input type="submit" value="View Cart" name="action" /></div>
                </div>
                <div class="left-sidebar" >
                    <h2>Sản phẩm của bạn</h2>
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

                <div class="left-sidebar" >
                    <h2>Sản phẩm gần đây</h2>
                    <div class="aa-recently-views">
                        <ul>
                            <li>
                                <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP007.jpg"></a>
                                <div class="aa-cartbox-info">
                                    <h4><a>Giầy Âu</a></h4>
                                    <p>5000000 VND</p>
                                </div>                    
                            </li>


                            <li>
                                <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP008.jpg"></a>
                                <div class="aa-cartbox-info">
                                    <h4><a>Giầy công sở</a></h4>
                                    <p>6000000 VND</p>
                                </div>                    
                            </li>
                            <li>
                                <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP009.jpg"></a>
                                <div class="aa-cartbox-info">
                                    <h4><a>Áo gió</a></h4>
                                    <p>7000000 VND</p>
                                </div>                    
                            </li> 
                            <li>
                                <a href="#" class="aa-cartbox-img"><img alt="img" src="${pageContext.request.contextPath}/Image/SP010.jpg"></a>
                                <div class="aa-cartbox-info">
                                    <h4><a>Áo gió</a></h4>
                                    <p>7000000 VND</p>
                                </div>                    
                            </li>
                        </ul>
                    </div>                            
                </div>
                <div class="left-sidebar">
                    <h2>Vị trí của tôi:</h2>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.840982060836!2d105.87215834926775!3d21.039047785924048!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135abd786acc8dd%3A0x82326e3bf4cae18a!2sWellspring+Bilingual+School!5e0!3m2!1sen!2s!4v1539138367924"
                            width="200" height="150" frameborder="0" style="border:0;" allowfullscreen></iframe>
                </div>
                <div id="pop-up">
                    <img src="Image/slideanh.gif" title="Adam store" style="width: 100%;height: auto">
                </div>
            </aside>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
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