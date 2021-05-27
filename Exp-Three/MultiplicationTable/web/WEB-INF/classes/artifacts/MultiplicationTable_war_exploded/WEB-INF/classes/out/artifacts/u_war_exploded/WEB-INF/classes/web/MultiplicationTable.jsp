<%@ page import="javax.lang.model.element.ModuleElement" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/21
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body style="margin: 0px; padding: 0px;">
<%
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
%>
<div style="float: left; color: blue; background-color:deepskyblue;padding: 12px">
    <%="" + i + "x" + j + "=" + i * j%>
</div>
<% }%>
<div style="clear: both"></div>
<% }
%>


</body>
</html>
