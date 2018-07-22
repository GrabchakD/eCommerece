<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@include file="header.jsp"%>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Sign Up</title>

    <link href="<c:url value="/resources/static/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<c:url value="/resources/static/css/signin.css"/>" rel="stylesheet">

</head>

<div class="container">


    <spring:form class="form-signin" action="/signup" modelAttribute="user">
        <h2 class="form-signin-heading">Please insert your info</h2>

        <spring:input path="firstName" type="text" class="form-control" placeholder="First name"/>
        <spring:input path="lastName" type="text" class="form-control" placeholder="Last name"/>
        <spring:input path="email" type="text" class="form-control" placeholder="Email address"/>
        <spring:input path="password" type="password" class="form-control" placeholder="Password"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
    </spring:form>

</div>

<%@include file="footer.jsp"%>