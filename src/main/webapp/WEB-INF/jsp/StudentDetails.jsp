<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 10/21/2018
  Time: 9:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Student Details</title>
    </head>
    <body>
        <h1>Details of Student are :</h1>

        <table>
            <tr>
                <td>Student Name</td>
                <td>${student.studentName} ${studentName}</td>
            </tr>
            <tr>
                <td>City</td>
                <td>${student.city}</td>
            </tr>
            <tr>
                <td>Country</td>
                <td>${student.country}</td>
            </tr>
            <tr>
                <td>Pincode</td>
                <td>${student.pincode}</td>
            </tr>
            <tr>
                <td>Hobbies</td>
                <td>${student.hobbies}</td>
            </tr>
        </table>
    </body>
</html>
