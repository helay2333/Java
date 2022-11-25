<%--
  Created by IntelliJ IDEA.
  User: zzzy0
  Date: 2022/11/25
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%!
        boolean isPrime(int n){
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    %>

    <%
        String num=request.getParameter("num");
        if(num==null||num.isEmpty()){
            num="0";
        }
        int n=Integer.parseInt(num);
    %>
</head>
<body>
<form action="test2.jsp" method="post">
    请输入一个整数：<input type="text" name="num"><input type="submit" value="筛选"><br>
    <table border="1">
        <%
            int t=0;
            for(int m=n;m>=2;m--){
                if(isPrime(m)){
                    t+=1;
        %>
        <tr>
            <td><%=t %></td>
            <td><%=m %></td>
        </tr>
        <%
                }
                if(t==7)break;
            }
        %>
    </table>
</form>
</body>
</html>
