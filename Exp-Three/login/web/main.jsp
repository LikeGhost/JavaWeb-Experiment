<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/22
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<%
    if (session.getAttribute("flag")!=null) {
        out.print("这里是首页。");
%>
<a href="logout.jsp">注销</a>
<% }
    else {
    out.print("尚未登陆，正在跳转登陆界面..");
    response.setHeader("refresh", "2;URL=login.jsp");
    session.invalidate();
}
%>

</body>
</html>
