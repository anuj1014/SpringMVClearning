<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 9/30/2018
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login Form</title>
    </head>

    <body>
        <form method="post" action="/login">
            Name:
             <input type="text" name="name"><br>
            Password:
            <input type="password" name="password"><br>
            <button type="submit" name="login">Login</button><br>
        </form>
    </body>
</html>
