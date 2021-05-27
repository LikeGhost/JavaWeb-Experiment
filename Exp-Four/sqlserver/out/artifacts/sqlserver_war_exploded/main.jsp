<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/28
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
  </head>
  <body>
  <form action="doStuSearch.jsp" method="post" target="actionFrame">
    <input type="text" name="key">
    <input type="submit" value="查询">
  </form>
  <a href="doStuShow.jsp" target="actionFrame">显示全部学生</a>
  <a href="doStuInsert.jsp" target="actionFrame">插入学生</a>
  <br/>
  <iframe style="width: 1000px;height: 1000px" frameborder="0" name="actionFrame"></iframe>
  </body>
</html>
