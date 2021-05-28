<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/27
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>登录页面</title>
  </head>
  <body>
  <h1>登陆页面</h1>
  <form action="/platform/loginServlet" method="post">
    账号：<input type="text" name="id" >
    <br>
    密码：<input type="password" name="password">
    <br>
    <input type="submit" value="登录">
  </form>
<%--  <%--%>
<%--    if(session.getAttribute("loginError")!=null){--%>
<%--      out.print("登陆失败");--%>
<%--      session.removeAttribute("loginError");--%>
<%--    }--%>

<%--  %>--%>

<!--  使用jstl来减少逻辑控制语句-->
  <c:if test="${not empty loginError}">
    <c:out value="登陆失败"></c:out>
    <c:remove var="loginError" />
  </c:if>
  </body>
</html>
