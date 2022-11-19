<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	boolean isPrime(int n){
	for(int i = 2; i <= Math.sqrt(n); i++){
		if(n % i == 0) return false;
	}
	return true;
	}
%>
<%
	
%>
<%
	String num = request.getParameter("n");

	int pf;
	if(num == null || num.isEmpty()){
		num = "0";
	}
	int n = Integer.parseInt(num);

%>
<body>
<form action="prime.jsp" method="post">
	请输入一个整数：<input type="text" name="n"><input type="submit" value="筛选">
	<table border="1">
		<%
		int nn = 0;
			for(int a = 3; a <= n/ 2; a += 2){
				if(isPrime(a) && isPrime(n - a)){
					nn++;
					if(nn == 4){
						break;
					}
					%>
						<tr>
							<td><%=nn %></td>
							<td><%=n%>=<%=a%>+<%=n-a%></td>
						</tr>
					
					<%
				}
			}
		%>
	</table>
</form>
</body>
</html>