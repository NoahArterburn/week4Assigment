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
	<p>${stats.getmainUN2()} - Total with Tax 
		<br /> 
		${stats.getholdf()} - The total Tax 
		<br /> 
		${stats.getusernumber()} - Original price 
		<br /> 
		${stats.getHas99cents()} - if original number is 99 cents
		<br /> 
		${stats.getDecimal()} - if original is exact change
		<br />
	</p>
	<a href="index.jsp">Restart?</a>
</body>
</html>