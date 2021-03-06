<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@include file="header.jsp"%>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Login</title>

    <link href="<c:url value="/resources/static/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<c:url value="/resources/static/css/signin.css"/>" rel="stylesheet">


<div class="container">

    <spring:form class="form-signin" action="/login" modelAttribute="user">
        <h2 class="form-signin-heading">Please sign in</h2>

        <spring:input path="email" type="text" class="form-control" placeholder="Email address"/>
        <spring:input path="password" type="password" class="form-control" placeholder="Password"/>

        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </spring:form>

</div>

<%@include file="footer.jsp"%>