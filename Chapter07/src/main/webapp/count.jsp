<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i = 20; i < 20 + 10; i++) {			
			%>
			i = <%= i %><br>
			<%		
		}
	%>
	该阿
</body>
</html>