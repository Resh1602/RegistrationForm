<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="redirecttoclass" method="get">
	<a href="index.jsp">Student form</a>
	<a href="classDetails.jsp">Class form</a>
	<a href="collegeDetails.jsp">College Form</a>
	<a href="universityDetails.jsp">University Form</a><br><br>
	Class Division <input type="text" name="cDivision"><br><br>
	Course <input type="text" name="course"><br><br>
	Strength <input type="text" name="strength"><br><br>
	<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>