package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.UserInfoDao;
import models.UserInfo;
import utils.DBUtils;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.HashMap;

public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         int state=-1;
         String msg="";
         if(username==null || password==null){
             msg="参数不正确";
         }else{
             //操作数据库
             UserInfo userInfo=new UserInfo();
             userInfo.setUsername(username);
             userInfo.setPassword(password);
             UserInfoDao userInfoDao=new UserInfoDao();
             try {
                 int ret=userInfoDao.add(userInfo);
                 if(ret>0){
                     state=200;
                 }else{
                     state=100;
                 }
             } catch (SQLException throwables) {
                 throwables.printStackTrace();
             }
         }

        HashMap<String,Object> map=new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        ResultJSONUtils.writeJSON(response,map);
    }
}
