<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@include file="header.jsp"%>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Sign Up</title>

    <link href="<c:url value="/resources/static/css/bootstrap.min.css"/>" rel="stylesheet">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <link href="<c:url value="/resources/static/css/signin.css"/>" rel="stylesheet">

</head>

<div class="container">

    <spring:form class="form-signin" action="/signup" modelAttribute="user">
        <h2 class="form-signin-heading">Please insert your info</h2>

        <spring:input path="firstName" type="text" class="form-control" placeholder="First name"/>
        <spring:input path="lastName" type="text" class="form-control" placeholder="Last name"/> <span id="msg"></span>
        <spring:input id="email" path="email" type="text" class="form-control" placeholder="Email address"/>
        <spring:input path="password" type="password" class="form-control" placeholder="Password"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
    </spring:form>

    <script>

        $("#email").blur(function(){
            var email = $("#email").val();

            json = {};
            json ["email"] = email;

            $.ajax({
                type : "POST",
                contentType : "application/json",
                url : "http://localhost:8080/email",
                data : JSON.stringify(json),
                dataType : 'json',
                timeout : 100000,
                success : function(data) {
                    $("#msg").html(data.msg);
                },
                error : function(e) {
                    $("#msg").html(data.msg);
                }
            });
        });

    </script>


</div>

<%@include file="footer.jsp"%>