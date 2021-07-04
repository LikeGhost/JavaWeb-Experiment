<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/4
  Time: 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>changeMember</title>
  </head>
  <body>

  <form action="${pageContext.request.contextPath}/member/changeMember.do" method="post">
    <table>
      <tbody>
      <tr>
        <td>用户姓名</td>
        <td><input type="text" name="mName" value="${member.MName}"></td>
      </tr>
      <tr>
        <td>手机号</td>
        <td><input type="text" name="mPhone" value="${member.MPhone}"></td>
      </tr>
      <tr>
        <td>性别</td>
        <td><select name="mSex" >
          <c:choose >
            <c:when test="${member.MSex== '男'}">
              <option value="男">男</option>
              <option value="女">女</option>
            </c:when>
            <c:when test="${member.MSex== '女'}">
              <option value="女">女</option>
              <option value="男">男</option>
            </c:when>
          </c:choose>
        </select></td>
      </tr>
      <tr>
        <td>年龄</td>
        <td><input type="number" name="mAge" value="${member.MAge}"></td>
      </tr>
      <tr>
        <td>楼号+房号</td>
        <td><input type="text" name="mHouseNumber" value="${member.MHouseNumber}"></td>
      </tr>
      <tr>
        <td>工作单位名称</td>
        <td><input type="text" name="mWorkUnit" value="${member.MWorkUnit}"></td>
      </tr>
      <tr>
        <td>车牌号</td>
        <td><input type="text" name="mCarNumber" value="${member.MCarNumber}"></td>
      </tr>
      <tr>
        <td>是否为业主</td>
        <td><select name="mIsHousehold">
          <c:choose >
            <c:when test="${member.MIsHousehold== true}">
              <option value="1">是</option>
              <option value="0">否</option>
            </c:when>
            <c:when test="${member.MIsHousehold== false}">
              <option value="0">否</option>
              <option value="1">是</option>
            </c:when>
          </c:choose>
        </select></td>
      </tr>
      <tbody>

    </table>
    <input type="hidden" name="cId" value="${member.CId}">
    <input type="hidden" name="mId" value="${member.MId}">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
