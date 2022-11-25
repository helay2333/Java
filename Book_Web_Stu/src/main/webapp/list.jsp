<%--
  Created by IntelliJ IDEA.
  User: zzzy0
  Date: 2022/11/25
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.zxx.excu.User" %>
<%@ page isELIgnored= %>
<%@ taglib uri="http://"false"java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>所有用户信息</title>
</head>
<body>

<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>成绩</td>
    </tr>
    <c:forEach var="user" items="${requestScope.users}" varStatus="status">
        <tr>
            <td>${user.studentNum}</td>
            <td>${user.name}</td>
            <td>${user.score}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>