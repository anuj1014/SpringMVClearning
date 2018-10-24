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
    <form:errors path="student1.*"/>
    <table>
        <tr>
            <td>Student Name</td>
            <td><input type="text" name="studentName" required="required"></td>
        </tr>
        <tr>
            <td>City</td>
            <td><input type="text" name="city"></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><input type="text" name="country" required="required"></td>
        </tr>
        <tr>
            <td>Pincode</td>
            <td><input type="number" name="pincode"></td>
        </tr>
        <tr>
            <td>Hobbies</td>
            <td><select multiple name="hobbies" required="required">
                <option value="Cricket">Cricket</option>
                <option value="Football">Football</option>
                <option value="Hockey">Hockey</option>
                <option value="Music">Music</option>
            </select></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <input name = "gender" type="radio"  value="Male">Male</input>
                <input name = "gender" type="radio" value="Female">Female</input>
            </td>
        </tr>
        <tr>
            <td>Department</td>
            <td><input type="text" name="courseDetails.department"></td>
        </tr>
        <tr>
            <td>Year</td>
            <td><input type="text" name="courseDetails.year" required="required"></td>
        </tr>

    </table>
    <button name="submit" type="submit" value="Submit">Submit</button>
</form>
</body>
</html>
