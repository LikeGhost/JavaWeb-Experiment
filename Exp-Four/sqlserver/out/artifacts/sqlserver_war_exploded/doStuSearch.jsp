<%@ page import="database.SqlServerTools" %>
<%@ page import="database.StudentDB" %>
<%@ page import="java.util.List" %>
<%@ page import="students.Student" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/11
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模糊查询</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String key=request.getParameter("key");
    List<Student> list=null;
    if(key.contains("性别：")){
        if(key.contains("男"))list= StudentDB.getStudentLike(true);
        else if(key.contains("女"))list=StudentDB.getStudentLike(false);
    }
    else list = StudentDB.getStudentLike(request.getParameter("key"));
    if (list.size() == 0) {
        out.print("暂无学生信息。");
    } else {
%>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>专业号</th>
        <th>生日</th>
        <th>备注</th>
        <th>修改</th>
        <th>删除</th>
    </tr>
    </thead>
    <tbody>
    <%

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Student student : list) {
    %>
    <tr>
        <td><%=student.getSno()%>
        </td>
        <td><%=student.getSname()%>
        </td>
        <td><%=student.isSex() ? "男" : "女"%>
        </td>
        <td><%=student.getMno()%>
        </td>
        <td><%=sdf.format(student.getBirdate())%>
        </td>
        <td><%=student.getMemo()%>
        </td>
        <td>
            <a href="doStuUpdate.jsp?sno=<%=student.getSno()%> ">修改</a>
        </td>
        <td>
            <a href="doStuDelete.jsp?sno=<%=student.getSno()%> ">删除</a>
        </td>
    </tr>
    <% }
    }

    %>
    </tbody>
</table>

</body>
</html>
