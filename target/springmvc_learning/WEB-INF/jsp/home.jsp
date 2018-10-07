<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 10/2/2018
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Welcome Bro...</title>
</head>
<body>
<p>Welcome ${name} ...... "${password}"</p><br>
<p><a href="list-todos.jsp">Todos manager</a></p>
</body>
</html>
<context:component-scan base-package="com.tutorials.Controller"/>