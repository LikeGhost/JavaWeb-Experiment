<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/2
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>changeCommunity</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/community/changeCommunity.do" method="post">
    <table>
      <input type="hidden" name="cId" value="${community.cId}">
      ${community.cId}
      <tr>
        <td>社区名称</td>
        <td><input type="text" name="cName" value="${community.cName}"></td>
      </tr>
      <tr>
        <td>省份</td>
        <td><input type="text" name="cProvince" value="${community.cProvince}"></td>
      </tr>
      <tr>
        <td>城市</td>
        <td><input type="text" name="cCity" value="${community.cCity}"></td>
      </tr>
      <tr>
        <td>街道</td>
        <td><input type="text" name="cStreet" value="${community.cStreet}"></td>
      </tr>
      <tr>
        <td>电话</td>
        <td><input type="text" name="cTel" value="${community.cTel}"></td>
      </tr>
    </table>
    <input type="submit" value="修改">
  </form>
  </body>
</html>
