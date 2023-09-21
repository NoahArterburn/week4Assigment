<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<p>${stats.getDisplayName()} - Username
		<br /> 
		${stats.getFirstName()} - FirstName
		<br /> 
		${stats.getLastName()} - LastName 
		<br /> 
		${stats.getVowels()} - Vowels 
		<br /> 
		${stats.getEr()} - This is the amount of er's in first and last
		<br />
		${stats.getSon()} - This is the amount of son's in first and last
		<br />
	</p>
	<a href="index.jsp">Restart?</a>

</body>
</html>