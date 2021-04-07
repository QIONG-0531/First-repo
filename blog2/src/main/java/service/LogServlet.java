package service;

import dao.UserDao;
import models.UserInfo;
import utils.Writeutils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class LogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int state=-1;
         String msg="";
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         if(username!=null && password!=null){
             UserInfo userInfo=new UserInfo();
             userInfo.setUsername(username);
             userInfo.setPassword(password);
             UserDao userDao=new UserDao();
             try {
                 userInfo=userDao.select(userInfo);
                 if(userInfo.getId()>0){
                     state=200;
                     HttpSession session=request.getSession();
                     session.setAttribute("userinfo",userInfo);
                 }else{
                     state=100;
                 }
             } catch (SQLException throwables) {
                 throwables.printStackTrace();
             }
         }else{
             msg="参数不全";
         }
        HashMap<String,Object>map=new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        Writeutils.writeMap(response,map);
    }
}
