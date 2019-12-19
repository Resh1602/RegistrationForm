<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="redirecttouniversity" method="get">
	<a href="index.jsp">Student form</a>
	<a href="classDetails.jsp">Class form</a>
	<a href="collegeDetails.jsp">College Form</a>
	<a href="universityDetails.jsp">University Form</a><br><br>
	University Id <input type="text" name="uId"><br><br>
	University Name <input type="text" name="uName"><br><br>
	Vice Chanceller <input type="text" name="vc"><br><br>
	<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>