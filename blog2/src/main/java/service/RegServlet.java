package service;

import dao.UserDao;
import models.UserInfo;
import utils.Writeutils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int state=-1;
          String msg="";
          //接收参数
          String username=request.getParameter("username");
          String password=request.getParameter("password");
          if(username==null || password==null ){
              //数据库操作
              msg="参数不全";
          }else{
              UserInfo userInfo=new UserInfo();
              userInfo.setUsername(username);
              userInfo.setPassword(password);
              UserDao userDao=new UserDao();
              try {
                  boolean res=userDao.add(userInfo);
                  if(res){
                      state=200;
                  }else{
                      state=100;
                  }
              } catch (SQLException throwables) {
                  throwables.printStackTrace();
              }
          }
        HashMap<String,Object>map=new HashMap<>();
          map.put("state",state);
          map.put("msg",msg);
          Writeutils.writeMap(response,map);
    }
}
