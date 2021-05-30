package com.servlet;

import com.factory.DAOFactory;
import com.vo.Message;
import com.vo.Person;
import com.vo.Revert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/revertServlet")
public class RevertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String status=request.getParameter("status");

        switch (status) {
            case "insertRevert":
                Revert revert = new Revert();
                revert.setContent(request.getParameter("content"));
                revert.setMessageId(((Message) request.getSession().getAttribute("message")).getMessageId());
                revert.setWriteDate(new Date());
                revert.setWriter(((Person) request.getSession().getAttribute("person")).getName());
                System.out.println(revert);
                DAOFactory.getRevertDAOFactory().insertRevert(revert);
                response.setHeader("refresh", "0;URL=revertServlet?status=showRevert&messageId=" + revert.getMessageId());
                break;
            case "deleteRevert":
                Revert deleteRevert = new Revert();
                deleteRevert.setRevertId(Integer.parseInt(request.getParameter("revertId")));
                DAOFactory.getRevertDAOFactory().deleteRevert(deleteRevert);
                response.setHeader("refresh", "0;URL=revertServlet?status=showRevert&messageId=" + request.getParameter("messageId"));
                break;
            case "showRevert":
                Message searchMessage = new Message();
                searchMessage.setMessageId(Integer.parseInt(request.getParameter("messageId")));
                searchMessage = DAOFactory.getMessageDAOInstance().searchMessage(searchMessage);
                List<Revert> list = DAOFactory.getRevertDAOFactory().getAllRevert(searchMessage);
                request.getSession().setAttribute("message", searchMessage);
                request.getSession().setAttribute("allRevert", list);
                request.getRequestDispatcher("revert.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
