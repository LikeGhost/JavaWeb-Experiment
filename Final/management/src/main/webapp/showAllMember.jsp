<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/3
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showAllMember</title>
</head>
<body>
<h1>${community.cName}住户列表</h1>
<table border="1" cellspacing="0">


    <thead>
    <tr>
        <td>用户姓名</td>
        <td>手机号</td>
        <td>性别</td>
        <td>年龄</td>
        <td>楼号+房号</td>
        <td>工作单位名称</td>
        <td>车牌号</td>
        <td>是否为业主</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="member" items="${memberList}">

        <tr>
            <td>${member.MName}</td>
            <td>${member.MPhone}</td>
            <td>${member.MSex}</td>
            <td>${member.MAge}</td>
            <td>${member.MHouseNumber}</td>
            <td>${member.MWorkUnit}</td>
            <td>${member.MCarNumber}</td>
            <td>
                <c:if test="${member.MIsHousehold==1}" var="grade" scope="session">是</c:if>
                <c:if test="${member.MIsHousehold==0}" var="grade" scope="session">否</c:if>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
