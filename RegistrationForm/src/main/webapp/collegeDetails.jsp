<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="redirecttocollege" method="get">
	<a href="index.jsp">Student form</a>
	<a href="classDetails.jsp">Class form</a>
	<a href="collegeDetails.jsp">College Form</a>
	<a href="universityDetails.jsp">University Form</a><br><br>
	College Id <input type="text" name="collegeId"><br><br>
	College Name <input type="text" name="collegeName"><br><br>
	Location <input type="text" name="location"><br><br>
	<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>