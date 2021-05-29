package com.servlet;

import com.factory.DAOFactory;
import com.vo.Person;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String urlPath=req.getContextPath();
        Person loginPerson=new Person();

//
//        loginPerson.setId( req.getParameter("id"));
//        loginPerson.setPassword(req.getParameter("password"));

        //使用BeanUtils工具直接封装数据
        Map<String, String[]> map = req.getParameterMap();
        try {
            BeanUtils.populate(loginPerson, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(loginPerson);

        Person person= DAOFactory.getPersonDAOInstance().login(loginPerson);
        if(person!=null){
            req.getSession().setAttribute("person",person);
            req.getSession().setAttribute("allMessage",DAOFactory.getMessageDAOInstance().getAllMessage());
            req.getRequestDispatcher("message.jsp").forward(req,resp);
        }
        else{
            req.getSession().setAttribute("loginError","true");
            resp.sendRedirect(urlPath+"/login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
