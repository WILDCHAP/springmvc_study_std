package com.wildchap.servlet;

import org.springframework.web.servlet.HttpServletBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        String method = req.getParameter("method");
        if(method.equals("add")){
            req.getSession().setAttribute("msg", "执行了add方法");
        }else if(method.equals("delete")){
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        //视图转发(req.getRequestDispatcher)和重定向(resp)
        req.getRequestDispatcher("/WEB-INF/jsp/hellow.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
