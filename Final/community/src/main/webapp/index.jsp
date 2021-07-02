<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/6/20
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>社区</title>
</head>
<body>
<iframe style="width: 1500px;height: 600px" frameborder="0" name="actionFrame"></iframe>
<div>
    <a href="${pageContext.request.contextPath}/community/showAllCommunity.do" target="actionFrame">查找所有社区记录</a>
    <a href="addCommunity.jsp" target="actionFrame">添加社区</a>
</div>


</body>
</html>
