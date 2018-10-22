<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Anuj Chaudhary
  Date: 10/21/2018
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <h1>Student Registration Form</h1><br>
    <form method="post" action="/StudentDetails">
        <table>
            <tr>
                <td>Student Name</td>
                <td><input type="text" name="studentName"></td>
            </tr>
            <tr>
                <td>City</td>
                <td><input type="text" name="city"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td><input type="text" name="country"></td>
            </tr>
            <tr>
                <td>Pincode</td>
                <td><input type="number" name="pincode"></td>
            </tr>
            <tr>
                <td>Hobbies</td>
                <td><select multiple name="hobbies">
                    <option value="Cricket">Cricket</option>
                    <option value="Football">Football</option>
                    <option value="Hockey">Hockey</option>
                    <option value="Music">Music</option>
                </select></td>
            </tr>
        </table>
        <button name="submit" type="submit" value="Submit">Submit</button>
    </form>
</body>
</html>
