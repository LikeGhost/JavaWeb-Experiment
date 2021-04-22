<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/22
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body style="margin: 0;padding: 0">

  <form action="login_check.jsp" method="post" >
    用户名：<input type="text" name="userId">
    <br>
    密码： <input type="password" name="userPassword">
    <br>
    <input type="submit" value="登录">
    <input type="submit" value="注册">
  </form>

  </body>
</html>
