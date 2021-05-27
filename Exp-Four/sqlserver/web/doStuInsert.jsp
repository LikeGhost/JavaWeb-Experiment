<%@ page import="database.SqlServerTools" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="javax.swing.plaf.synth.SynthTableUI" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="database.StudentDB" %>
<%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/28
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>插入学生</title>
</head>
<body>

<form action="doStuInsert.jsp" method="post">
    学号：<input type="text" name="sno">
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
    <input type="submit" value="添加">
</form>
<%request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="student" scope="page" class="students.Student"/>
<jsp:setProperty name="student" property="sno"/>
<jsp:setProperty name="student" property="sname"/>
<jsp:setProperty name="student" property="mno"/>
<jsp:setProperty name="student" property="memo"/>
<%
    //if(session.getAttribute("login")!=null){

    if (request.getParameter("sno") != null &&
            request.getParameter("sname") != null &&
            request.getParameter("sex") != null &&
            request.getParameter("mno") != null &&
            request.getParameter("birdate") != null &&
            request.getParameter("memo") != null) {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            student.setBirdate(sdf.parse(request.getParameter("birdate")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        student.setSex(Boolean.parseBoolean(request.getParameter("sex")));

        StudentDB.insertStudent(student);
        out.print("成功插入姓名为：" + student.getSname() + "的学生记录");
    }

    // }
%>
</body>
</html>
