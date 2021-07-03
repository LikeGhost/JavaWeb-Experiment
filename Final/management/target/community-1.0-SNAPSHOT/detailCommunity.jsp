<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/7/3
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>社区详情</title>
</head>
<body>
<%out.print(request.getParameter("cId"));%>
${requestScope.cId}
<iframe style="width: 1500px;height: 600px" frameborder="0" name="actionFrame" src="${pageContext.request.contextPath}/community/findCommunity.do?cId=${cId}&status=showDetailCommunity"></iframe>
<a href="${pageContext.request.contextPath}/community/findCommunity.do?cId=${cId}&status=showDetailCommunity" target="actionFrame">查看社区详情</a>
<a href="${pageContext.request.contextPath}/community/findCommunity.do?cId=${cId}&status=addMemberToCommunity"  target="actionFrame">添加社区用户</a>
<a href="${pageContext.request.contextPath}/member/showAllMemberBycId.do?cId=${cId}" target="actionFrame">显示社区所有成员</a>
<a href="${pageContext.request.contextPath}/community/findCommunity.do?cId=${cId}&status=addRecordToCommunity">添加通行记录</a>
</body>
</html>
