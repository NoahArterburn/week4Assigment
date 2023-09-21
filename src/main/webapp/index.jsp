<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Iowa sales tax calculator</h1>
	<form action="calculateTax" method="post">
		Enter price to add sales tax: <input
			type="number" placeholder="0.00" step="0.01" min="0" max="200" name="usernumber"> 
			<input type="submit" value="Calculate" />
	</form>
	<a href="Index2.jsp">Username Creator</a>
</body>
</html>