package com.servlet;

import com.factory.DAOFactory;
import com.vo.Message;
import com.vo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String status=request.getParameter("status");
        String forward="error.jsp";
        if(status.equals("insertMessage")){

            Message newMessage=new Message();
            newMessage.setTitle(request.getParameter("title"));
            newMessage.setContent(request.getParameter("content"));
            newMessage.setWriter(((Person)request.getSession().getAttribute("person")).getName());
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            newMessage.setWriteDate(new Date());
            System.out.println(DAOFactory.getMessageDAOInstance().insertMessage(newMessage));
            System.out.println(newMessage);
            forward="message.jsp";
        }
        else if(status.equals("selectAll")){
            System.out.println(request.getSession().getAttribute("person"));
           forward="message.jsp";
        }
        request.getRequestDispatcher(forward).forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
