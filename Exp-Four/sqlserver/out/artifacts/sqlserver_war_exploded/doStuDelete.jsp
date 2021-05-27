<%@ page import="students.Student" %>
<%@ page import="database.StudentDB" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/10
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>删除学生</title>
  </head>
  <body>
  <%
    Student student=StudentDB.getStudentBySno(request.getParameter("sno"));
    StudentDB.deleteStudent(request.getParameter("sno"));
    out.print("成功删除学号为："+student.getSno()+"的学生记录");
  %>
  </body>
</html>
