<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/4
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showAllRecord</title>
</head>
<body>
<h1>通行记录</h1>
<form action="${pageContext.request.contextPath}/record/findRecordByMNameAndCId.do" method="post">
    <input type="text" name="mName">
    <input type="hidden" name="cId" value="${cId}">
    <input type="submit" value="搜索">
</form>
<c:if test="${ not empty recordList}">

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
            <th>修改通行记录</th>
            <th>删除通行记录</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="record" items="${recordList}">
            <form action="${pageContext.request.contextPath}/record/changRecord.do" method="post">
                <tr>
                    <td>${record.mName}</td>
                    <td>${record.mPhone}</td>
                    <td>${record.mSex}</td>
                    <td>${record.mAge}</td>
                    <td>${record.mHouseNumber}</td>
                    <td>${record.mWorkUnit}</td>
                    <td>${record.mCarNumber}</td>
                    <td>
                        <c:if test="${record.mCId==cId and record.mIsHousehold==true}">
                            是
                            <input type="hidden" name="rIsHosehold" value="1">
                        </c:if>
                        <c:if test="${record.mCId!=cId or record.mIsHousehold!=true}">
                            否
                            <input type="hidden" name="rIsHosehold" value="0">
                        </c:if>
                    </td>
                    <td>
                        <select name="rIsOutCity">
                            <c:if test="${record.rIsOutCity==false}">
                                <option value="0">否</option>
                                <option value="1">是</option>
                            </c:if>
                            <c:if test="${record.rIsOutCity==true}">
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </c:if>
                        </select>
                    </td>
                    <td>
                        <select name="rIsFromForei">
                            <c:if test="${record.rIsFromForei==false}">
                                <option value="0">否</option>
                                <option value="1">是</option>
                            </c:if>
                            <c:if test="${record.rIsFromForei==true}">
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </c:if>
                        </select>
                    </td>
                    <td><input type="datetime-local" name="rNowTime" value="${record.rNowTime}"></td>

                    <input type="hidden" name="rId" value="${record.rId}">
                    <input type="hidden" name="mId" value="${record.mId}">
                    <input type="hidden" name="cId" value="${record.cId}">

                    <td><input type="submit" value="修改"></td>
                    <td><a href="${pageContext.request.contextPath}/record/deleteRecord.do?rId=${record.rId}&cId=${record.cId}">删除</a></td>
                </tr>
            </form>


        </c:forEach>
        </tbody>
    </table>

</c:if>
</body>
</html>
