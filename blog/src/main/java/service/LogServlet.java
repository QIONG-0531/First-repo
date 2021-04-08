package service;

import dao.UserInfoDao;
import models.UserInfo;
import utils.WriteUtils;

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
          String username=request.getParameter("username");
          String password=request.getParameter("password");
          int state=-1;
          String msg="";
          if(username!=null && password!=null){
              UserInfo userInfo=new UserInfo();
              userInfo.setUsername(username);
              userInfo.setPassword(password);
              UserInfoDao userInfoDao=new UserInfoDao();
             /* try {
                  boolean res=userInfoDao.isLogin(userInfo);
                  if(res){
                      state=200;
                  }else{
                      state=100;
                  }
              } catch (SQLException throwables) {
                  throwables.printStackTrace();
              }*/
              try {
                  userInfo=userInfoDao.getId(userInfo);
                  if(userInfo.getId()>=1){
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
              msg="参数不正确";
          }
        HashMap<String,Object>map=new HashMap<>();
          map.put("state",state);
          map.put("msg",msg);
        WriteUtils.writeMap(response,map);
    }
}
