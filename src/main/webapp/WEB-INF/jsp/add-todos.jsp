<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 10/2/2018
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <title>Welcome Bro...</title>
    </head>

    <body>
        <p>Welcome ${name} ...... "${password}"</p><br>
        <h>Add a Todo</h>

        <form:form method="post" commandName="todo">
            <fieldset>
                <form:label path="id">Id</form:label>
                <form:input path="id" type="number" required="required"/>
            </fieldset>

            <fieldset>
                <form:label path="user">User</form:label>
                <form:input path="user" type="text" required="required"/>

            </fieldset>
            <button name="add" value="submit">Submit</button>
        </form:form>

    </body>
</html>

<context:component-scan base-package="com.tutorials.Controller"/>