<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/27
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <form action="/platform/loginServlet" method="post">
    账号：<input type="text" name="id" >
    <br>
    密码：<input type="password" name="password">
    <br>
    <input type="submit" value="登录">
  </form>
  </body>
</html>
