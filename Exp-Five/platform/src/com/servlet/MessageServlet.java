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
import java.util.Date;

@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String status = request.getParameter("status");
        String forward = "error.jsp";

        switch (status) {
            case "insertMessage":
                Message newMessage = new Message();
                newMessage.setTitle(request.getParameter("title"));
                newMessage.setContent(request.getParameter("content"));
                newMessage.setWriter(((Person) request.getSession().getAttribute("person")).getName());
//              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                newMessage.setWriteDate(new Date());
                DAOFactory.getMessageDAOInstance().insertMessage(newMessage);
                response.setHeader("refresh", "0;URL=messageServlet?status=selectAll");
                break;
            case "selectAll":
                request.getSession().setAttribute("allMessage", DAOFactory.getMessageDAOInstance().getAllMessage());
                request.getRequestDispatcher("message.jsp").forward(request, response);
                break;
            case "deleteMessage":
                Message deleteMessage = new Message();
                deleteMessage.setMessageId(Integer.parseInt(request.getParameter("messageId")));
                DAOFactory.getMessageDAOInstance().deleteMessage(deleteMessage);
                response.setHeader("refresh", "0;URL=messageServlet?status=selectAll");
                break;
            case "logout":
                request.getSession().removeAttribute("person");
                response.setHeader("refresh","0;URL=login.jsp");
                break;

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
