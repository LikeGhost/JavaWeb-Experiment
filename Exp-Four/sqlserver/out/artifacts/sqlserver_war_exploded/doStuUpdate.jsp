<%@ page import="students.Student" %>
<%@ page import="database.StudentDB" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.nio.channels.SeekableByteChannel" %>
<%@ page import="javax.swing.text.Style" %>
<%@ page import="javax.script.ScriptEngineFactory" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/5/10
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改学生信息</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<form action="doStuUpdate.jsp" method="post">

    学号：<input name="sno" readonly="true" value="<%=request.getParameter("sno")%>">
    <br>
    姓名：<input type="text" name="sname">
    <br>
    性别：<select name="sex">
    <option value="true">男</option>
    <option value="false">女</option>
</select>
    <br>
    专业：<select name="mno">
    <option value="01">计算机科学</option>
    <option value="02">软件工程</option>
    <option value="03">网络工程</option>
    <option value="04">智能技术</option>
</select>
    <br>
    生日：<input type="text" name="birdate">
    <br>
    简介：<textarea name="memo" cols="30" rows="10"></textarea>
    <br>
    <input type="submit" value="修改">
</form>
<%

    if (session.getAttribute("student") != null) {

        Student student = (Student) session.getAttribute("student");


        student.setSname(request.getParameter("sname"));
        student.setSex(Boolean.parseBoolean(request.getParameter("sex")));
        student.setMno(request.getParameter("mno"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {

            student.setBirdate(sdf.parse(request.getParameter("birdate")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        student.setSex(Boolean.parseBoolean(request.getParameter("sex")));
        student.setMemo(request.getParameter("memo"));

        StudentDB.updateStudent(student);
        out.print("成功修改姓名为：" + student.getSname() + "的学生记录");

        response.setHeader("refresh", "1;URL=doStuShow.jsp");
    }
    if (request.getParameter("sno") != null&&session.getAttribute("flag")==null) {
        session.setAttribute("student", StudentDB.getStudentBySno(request.getParameter("sno")));
        session.setAttribute("flag","true");
    }

%>
</body>
</html>
