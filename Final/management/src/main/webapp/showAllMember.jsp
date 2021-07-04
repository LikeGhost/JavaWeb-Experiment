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
        <th>用户姓名</th>
        <th>手机号</th>
        <th>性别</th>
        <th>年龄</th>
        <th>楼号+房号</th>
        <th>工作单位名称</th>
        <th>车牌号</th>
        <th>是否为业主</th>
        <th>修改住户信息</th>
        <th>删除住户信息</th>
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
            <td><a href="${pageContext.request.contextPath}/member/preChangeMember.do?mId=${member.MId}">修改</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
