<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String num = request.getParameter("num");

	int pf;
	if(num == null || num.isEmpty()){
		num = "0";
	}
	int n = Integer.parseInt(num);
	pf = n * n;
%>
<body>
<form action="" method="post">
	请输入一个整数：<input type="text" name="num"/><input type="submit" value="计算平方"/><br>
	它的平方是：<%=pf %>
</form>
</body>
</html>