<%--
  Created by IntelliJ IDEA.
  User: zzzy0
  Date: 2022/11/25
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String num=request.getParameter("num");
    int pf;
    if(num==null||num.isEmpty()){
        num="0";
    }
    int n=Integer.parseInt(num);
    pf=n*n*n;
%>
<body>
<form action="test1.jsp" method="post">
    请输入一个整数：<input type="text" name="num"><input type="submit" value="计算平方"><br>
    它的平方是：<%= pf %>
</form>

</body>
</html>
