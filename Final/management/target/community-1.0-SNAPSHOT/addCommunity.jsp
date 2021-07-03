
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>addCommunity</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/community/addCommunity.do" method="post">
    <table>
      <tr>
      <td>社区名称</td>
      <td><input type="text" name="cName"></td>
      </tr>
      <tr>
      <td>省份</td>
      <td><input type="text" name="cProvince"></td>
      </tr>
      <tr>
      <td>城市</td>
      <td><input type="text" name="cCity"></td>
      </tr>
      <tr>
      <td>街道</td>
      <td><input type="text" name="cStreet"></td>
      </tr>
      <tr>
      <td>电话</td>
      <td><input type="text" name="cTel"></td>
      </tr>
    </table>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
