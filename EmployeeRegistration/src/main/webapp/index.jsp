<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">

<form action="EmpRegistration" method="post">

<table>

<tr>
<td>First name</td>
<td> <input type="text" name="Fname" id="Fname"></td>
</tr>
<tr>
    <td>Last name</td>
    <td> <input type="text" name="Lname" id="Lname"></td>
    </tr>

    <tr>
        <td>User name</td>
        <td> <input type="text" name="Uname" id="Uname"></td>
        </tr>

    <tr>
        <td>Password</td>
        <td> <input type="password" name="pass" id="pass"></td>
        </tr>


        <tr>
            <td>Address</td>
            <td> <input type="text" name="Add" id="Add"></td>
            </tr>

            <tr>
                <td>contact</td>
                <td> <input type="number" name="contact" id="contact"></td>
                </tr>


                <tr>
                    <td><input type="submit" value="Register"></td>
                    <td><input type="reset" value="clear"></td>
                </tr>







</table>
</form>

</div>

</body>
</html>