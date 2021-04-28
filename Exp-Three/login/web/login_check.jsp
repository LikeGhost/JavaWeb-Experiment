
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: 11540
  Date: 2021/4/22
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>检查登录正确性</title>
</head>
<body>
<%
if(request.getParameter("userId")!=null&&request.getParameter("userPassword")!=null){
    if (request.getParameter("userId").equals("")|| request.getParameter("userPassword").equals("")) {
        out.print("请输入正确的账号或密码");
        response.setHeader("refresh", "2;URL=login.jsp");
    } else {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai";
            String user = "root";
            String password = "123456";
            String userId = request.getParameter("userId");
            String userPassword = request.getParameter("userPassword");
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "select * from t_user where userid=? and password =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, userPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                out.print("<div>" + resultSet.getString(2) + "，欢迎登录</div>");
                session.setAttribute("flag","ok");
                if(application.getAttribute("count")==null)
                    application.setAttribute("count","0");
                String count=(String) application.getAttribute("count");
                int cnt= Integer.parseInt(count)+1;
                application.setAttribute("count",Integer.toString(cnt));

                response.setHeader("refresh", "2;URL=main.jsp");


            }
            else {
%>
<%

                out.print("请输入正确的账号或密码");
                response.setHeader("refresh", "2;URL=login.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
else{
                    out.print("尚未登陆，正在跳转登陆界面..");
                    response.setHeader("refresh", "2;URL=login.jsp");
                }

%>

</body>
</html>
