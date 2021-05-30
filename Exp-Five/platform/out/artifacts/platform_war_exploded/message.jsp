<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/29
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>欢迎登陆，${person.getName()}</h1>
<a href="messageServlet?status=logout">注销</a>
<hr>
<a href="insertMessage.jsp">添加新帖子</a>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>帖子ID</th>
        <th>标题</th>
        <th>内容</th>
        <th>作者</th>
        <th>最后修改时间</th>
        <th>删除</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="revert" items="${allMessage}">
        <tr>
            <td>${revert.getMessageId()}</td>
            <td><a href="revertServlet?status=showRevert&messageId=${revert.getMessageId()}">${revert.getTitle()}</a></td>
            <td>${revert.getContent()}</td>
            <td>${revert.getWriter()}</td>
            <td>${revert.getWriteDate()}</td>
            <td>
                <c:if test="${person.getName()==revert.getWriter()}">
                    <a href="messageServlet?status=deleteMessage&messageId=${revert.getMessageId()}">删除</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>

    </tbody>

</table>
</body>
</html>
