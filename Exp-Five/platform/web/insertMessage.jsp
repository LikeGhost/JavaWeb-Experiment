<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/30
  Time: 2:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发帖</title>
</head>
<body>
<h1>发帖</h1>
<hr>
<form action="messageServlet?status=insertMessage" method="post">
    <table>
        <tr>
            <td>标题：</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>发帖人：</td>
            <td><label>${person.getName()}</label></td>
        </tr>
        <tr>
            <td>内容：</td>
            <td><textarea name="content" cols="30" rows="10"></textarea></td>

        </tr>
        <tr><td><input type="submit" value="发布"></td></tr>

    </table>
</form>
<a href="messageServlet?status=selectAll">返回帖子列表</a>
</body>
</html>
