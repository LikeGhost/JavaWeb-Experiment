<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/30
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>帖子回复</title>
</head>
<body>
<a href="messageServlet?status=selectAll">返回主页</a>
<hr>
<h1>帖子详情</h1>
<table border="1" cellspacing="0">
    <tr>
        <td>帖子ID</td>
        <td>${message.getMessageId()}</td>
    </tr>
    <tr>
        <td>标题</td>
        <td>${message.getTitle()}</td>
    </tr>
    <tr>
        <td>楼主</td>
        <td>${message.getWriter()}</td>
    </tr>
    <tr>
        <td>内容</td>
        <td>${message.getContent()}</td>
    </tr>
    <tr>
        <td>发帖时间</td>
        <td>${message.getWriteDate()}</td>
    </tr>

</table>
<hr>
<h1>回帖详情</h1>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>楼层</th>
        <th>回帖ID</th>
        <th>内容</th>
        <th>作者</th>
        <th>回帖时间</th>
        <th>删除</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="revert" items="${allRevert}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${revert.getRevertId()}</td>
            <td>${revert.getContent()}</td>
            <td>${revert.getWriter()}</td>
            <td>${revert.getWriteDate()}</td>
            <td>
                <c:if test="${person.getName()==revert.getWriter()}">
                    <a href="revertServlet?status=deleteRevert&revertId=${revert.getRevertId()}&messageId=${message.getMessageId()}">删除</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>

    </tbody>

</table>
<hr>
<h1>回帖</h1>
<form action="revertServlet?status=insertRevert" method="post">
    回帖内容：<textarea name="content" cols="30" rows="10"></textarea>
    <br>
    <input type="submit" value="回帖">
</form>
</body>
</html>
