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

        <table bgcolor="#ff7f50" border="<textarea name="area" id="" cols="30" rows="10"></textarea>">
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
            <tr>
                <td>Gender</td>
                <td>${student.gender}</td>
            </tr>
            <tr>
                <td>Department</td>
                <td>${student.courseDetails.department}</td>
            </tr>
            <tr>
                <td>Year</td>
                <td>${student.courseDetails.year}</td>
            </tr>
        </table>
    </body>
</html>
