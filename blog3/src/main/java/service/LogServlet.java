package service;

import dao.UserInfoDao;
import models.UserInfo;
import utils.ResultJSONUtils;

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
        String msg="";
        int state=-1;
        if(username==null || password==null){
            msg="参数不正确";
        }else{
            //正常的操作
            UserInfo userInfo=new UserInfo();
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            UserInfoDao userInfoDao=new UserInfoDao();
            try {
               /* boolean res=userInfoDao.isLogin(userInfo);
                if(res){
                    state=200;

                }*/
                userInfo=userInfoDao.getUserInfo(userInfo);
                if(userInfo.getId()>0){
                    state=200;
                    HttpSession session=request.getSession();
                    session.setAttribute("userinfo",userInfo);
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
