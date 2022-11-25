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
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>所有用户信息</title>
</head>
<body>

<table border="1">
    <tr>
        <td>ID</td>
        <td>账号</td>
        <td>密码</td>
        <td>修改</td>
    </tr>
    <c:forEach var="person" items="${requestScope.person}" varStatus="status">
        <tr>
            <td>${person.id}</td>
            <td>${person.username}</td>
            <td>${person.password}</td>
            <td><a href="/update?id=${person.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>