package com.servlet;

import com.factory.PersonDAOFactory;
import com.vo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Person loginPerson=new Person();
        loginPerson.setId( req.getParameter("id"));
        loginPerson.setPassword(req.getParameter("password"));
        Person person=PersonDAOFactory.getPersonDAOInstance().login(loginPerson);
        if(person!=null){
            System.out.println("登陆成功"+person.getName());
        }
        else{
            System.out.println("登陆失败");
        }
    }

}
