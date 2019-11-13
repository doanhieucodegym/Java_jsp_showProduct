<%--
  Created by IntelliJ IDEA.
  User: doanh
  Date: 13-11-19
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Image</td>
    </tr>
    <c:forEach items="${productsaa}" var="product">
        <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
           <td>
               <img src="${product.getImage()}" height="200px" width="200px"/>
           </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
