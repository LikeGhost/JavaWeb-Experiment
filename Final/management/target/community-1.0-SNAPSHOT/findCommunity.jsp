<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/3
  Time: 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showAllMember</title>
</head>
<body>
<h1>${community.cName}</h1>
<table border="1" cellspacing="0">
    <tbody>
    <tr>
        <td>社区名称</td>
        <td><a href="${pageContext.request.contextPath}/member/showAllMemberBycId.do?cId=${community.cId}" target="_blank">${community.cName}</a></td>
    </tr>
    <tr>
        <td>省份</td>
        <td>${community.cProvince}</td>
    </tr>
    <tr>
        <td>城市</td>
        <td>${community.cCity}</td>
    </tr>
    <tr>
        <td>街道</td>
        <td>${community.cStreet}</td>
    </tr>
    <tr>
        <td>电话</td>
        <td>${community.cTel}</td>
    </tr>

    </tbody>

</table>
</body>
</html>
