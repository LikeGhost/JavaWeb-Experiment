<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/3
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addMember</title>
</head>
<body>
<h1>添加住户</h1>
<form action="${pageContext.request.contextPath}/member/addMemberToCommunity.do" method="post">
    <table>
        <tbody>
        <tr>
            <td>用户姓名</td>
            <td><input type="text" name="mName"></td>
        </tr>
        <tr>
            <td>手机号</td>
            <td><input type="text" name="mPhone"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><select name="mSex">
                <option value="男">男</option>
                <option value="女">女</option>
            </select></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="number" name="mAge"></td>
        </tr>
        <tr>
            <td>楼号+房号</td>
            <td><input type="text" name="mHouseNumber"></td>
        </tr>
        <tr>
            <td>工作单位名称</td>
            <td><input type="text" name="mWorkUnit"></td>
        </tr>
        <tr>
            <td>车牌号</td>
            <td><input type="text" name="mCarNumber"></td>
        </tr>
        <tr>
            <td>是否为业主</td>
            <td><select name="mIsHousehold">
                <option value="1">是</option>
                <option value="0">否</option>
            </select></td>
        </tr>
        <tbody>

    </table>
    <input type="hidden" name="cId" value="${param.cId}">
    <input type="submit" value="提交">
</form>

</body>
</html>
