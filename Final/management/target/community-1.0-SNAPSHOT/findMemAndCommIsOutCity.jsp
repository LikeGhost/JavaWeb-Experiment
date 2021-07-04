<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/5
  Time: 2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>findMemAndCommIsOutCity</title>
</head>
<body>
<h1>一周内离开本城的用户</h1>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>用户姓名</th>
        <th>手机号</th>
        <th>社区街道</th>
        <th>社区名称</th>
        <th>楼号+房号</th>
        <th>社区电话</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="memAndComm" items="${memAndCommList}">
        <c:forEach var="comunity" items="${memAndComm.communities}">
            <tr>
                <td>${memAndComm.member.MName}</td>
                <td>${memAndComm.member.MPhone}</td>
                <td>${comunity.cStreet}</td>
                <td>${comunity.cName}</td>
                <td>${memAndComm.member.MHouseNumber}</td>
                <td>${comunity.cTel}</td>
            </tr>
        </c:forEach>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
