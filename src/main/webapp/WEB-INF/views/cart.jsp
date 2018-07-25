<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<head>
    <title>Cart</title>
</head>

<c:forEach var="p" items="${cart.productList}">
    <h2>${p.name}</h2>
    <button type="button" class="btn btn-dark">Delete</button>
</c:forEach>


<%@include file="footer.jsp"%>