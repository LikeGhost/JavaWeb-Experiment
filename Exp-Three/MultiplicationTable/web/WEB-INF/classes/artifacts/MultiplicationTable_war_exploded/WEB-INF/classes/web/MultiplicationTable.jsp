
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body style="margin: 0; padding: 0;">
<%
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
%>
<div style="float: left; color: darkgreen; background-color:darkseagreen;padding: 12px;width: 80px;border:1px solid">
    <%="" + j + "x" + i + "=" + i * j%>
</div>
<% }%>
<div style="clear: both"></div>
<% }
%>


</body>
</html>
