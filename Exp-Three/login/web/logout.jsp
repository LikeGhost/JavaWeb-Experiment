<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/22
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>注销中..</title>
  </head>
  <body>
  <%
    session.invalidate();
    String count=(String) application.getAttribute("count");
    int cnt=Integer.parseInt(count)-1;
    application.setAttribute("count",Integer.toString(cnt));
    response.setHeader("refresh","2;URL=login.jsp");

  %>
  </body>
</html>
