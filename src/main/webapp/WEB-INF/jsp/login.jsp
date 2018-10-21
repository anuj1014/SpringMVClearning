<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 9/30/2018
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Login Form</title>
    </head>
    <body>
         <p>${errormessage}</p><br>
         <form method="post" action="/login">
                <table>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password"></td>
                    </tr>
                </table>
                <button type="submit" name="login">Login</button><br>
         </form>
    </body>
</html>
