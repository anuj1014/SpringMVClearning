<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 10/2/2018
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Welcome Bro...</title>
    </head>

    <body>
        <p>Welcome ${name} ...... "${password}"</p><br

        <p> Your Todos are </p> <br>

        <table>
            <thead>
            <tr>
                <td>Id</td>
                <td>User</td>
                <td>Description</td>
                <td>IsDone</td>
                <td></td>
            </tr>
            </thead>

            <tbody>

            <c:forEach items= "${todos}" var="todovar">
                <%--${todovar.id} ${todovar.user} ${todovar.desc}<br>--%>
                <TR>
                        <td>${todovar.id}<td>
                        <td>${todovar.user}</td>
                        <td>${todovar.desc}</td>
                        <td>${todovar.done}</td>
                    <td><a href="/delete-todos?id=${todovar.id}"><button value="Delete">Delete</button></a></td>
                </TR><br>

            </c:forEach>
            </tbody>
        </table>


        <button value="Add"><a href="add-todos">Add</a> </button>
    </body>
</html>
<context:component-scan base-package="com.tutorials.Controller"/>