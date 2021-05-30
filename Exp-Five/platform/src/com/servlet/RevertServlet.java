package com.servlet;

import com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement;
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
import java.lang.annotation.Repeatable;
import java.util.Date;

@WebServlet("/revertServlet")
public class RevertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String status=request.getParameter("status");
        if(status.equals("insertRevert")){
            Revert revert = new Revert();
            revert.setContent(request.getParameter("content"));
            revert.setMessageId(((Message)request.getSession().getAttribute("message")).getMessageId());
            revert.setWriteDate(new Date());
            revert.setWriter(((Person)request.getSession().getAttribute("person")).getName());
            System.out.println(revert);
            DAOFactory.getRevertDAOFactory().insertRevert(revert);
            response.setHeader("refresh","0;URL=messageServlet?status=revert&messageId="+revert.getMessageId());
        }
        else if(status.equals("deleteRevert")){
            Revert deleteRevert = new Revert();
            deleteRevert.setRevertId(Integer.parseInt(request.getParameter("revertId")));
            DAOFactory.getRevertDAOFactory().deleteRevert(deleteRevert);
            response.setHeader("refresh","0;URL=messageServlet?status=revert&messageId="+request.getParameter("messageId"));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
