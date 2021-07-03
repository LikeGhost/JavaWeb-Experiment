<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/6/20
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showAllCommunity</title>
</head>
<body>
<h1>社区列表</h1>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>社区名称</th>
        <th>省份</th>
        <th>城市</th>
        <th>街道</th>
        <th>电话</th>
        <th>修改社区信息</th>
        <th>删除社区信息</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="community" items="${communityList}">
        <tr>
<%--            <td><a href="${pageContext.request.contextPath}/community/detailCommunity.do?cId=${community.cId}" target="_blank">${community.cName}</a></td>--%>
            <td><a href="/management/detailCommunity.jsp?cId=${community.cId}" target="_blank">${community.cName}</a></td>
            <td>${community.cProvince}</td>
            <td>${community.cCity}</td>
            <td>${community.cStreet}</td>
            <td>${community.cTel}</td>
            <td><a href="${pageContext.request.contextPath}/community/findCommunity.do?cId=${community.cId}&status=changeCommunity">修改</a> </td>
            <td><a href="${pageContext.request.contextPath}/community/deleteCommunity.do?cId=${community.cId}">删除</a> </td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
