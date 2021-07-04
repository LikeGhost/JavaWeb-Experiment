<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/3
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>searchMember</title>

</head>
<body>
<h1>添加通行记录</h1>

<form action="${pageContext.request.contextPath}/member/findMemberByMName.do" method="post">
    <input type="text" value="${searchName}" name="mName">
    <input type="submit" value="搜索">
    <input type="hidden" name="cId" value="${param.cId}">
</form>
<c:if test="${ not empty memberList}">



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
                <th>一周内是否离开本城</th>
                <th>一月内是否来自境外</th>
                <th>通行进入时间</th>
                <th>添加通行记录</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="member" items="${memberList}">
            <form action="${pageContext.request.contextPath}/record/addRecordToCommunity.do" method="post">
                <tr>
                    <td>${member.MName}</td>
                    <td>${member.MPhone}</td>
                    <td>${member.MSex}</td>
                    <td>${member.MAge}</td>
                    <td>${member.MHouseNumber}</td>
                    <td>${member.MWorkUnit}</td>
                    <td>${member.MCarNumber}</td>
                    <td>

                        <c:if test="${member.CId==cId and member.MIsHousehold==true}">
                            是
                            <input type="hidden" name="rIsHosehold" value="1">
                        </c:if>
                        <c:if test="${member.CId!=cId or member.MIsHousehold!=true}">
                            否
                            <input type="hidden" name="rIsHosehold" value="0">
                        </c:if>
<%--                        <c:if test="${member.CId==cId and member.MIsHousehold==true}">--%>
<%--                           --%>
<%--                        </c:if>--%>
<%--                        <c:if test="${member.CId!=cId or member.MIsHousehold!=true}">--%>
<%--                            --%>
<%--                        </c:if>--%>
                    </td>


                    <td>
                        <select name="rIsOutCity">
                            <option value="0">否</option>
                            <option value="1">是</option>

                        </select>
                    </td>
                    <td>
                        <select name="rIsFromForei">
                            <option value="0">否</option>
                            <option value="1">是</option>
                        </select>
                    </td>


                    <td>
                        <input type="datetime-local" name="rNowTime">
                    </td>
                    <input type="hidden" name="mId" value="${member.MId}">
                    <input type="hidden" name="cId" value="${cId}">
                    <td><input type="submit" value="添加"></td>


                </tr>
            </form>
            </c:forEach>
            </tbody>
        </table>

</c:if>

</body>
</html>
