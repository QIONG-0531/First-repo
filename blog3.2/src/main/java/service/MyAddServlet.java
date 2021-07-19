package service;

import dao.ArticleInfoDao;
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

public class MyAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        String msg="";
        int state=-1;
        if(title!=null  && content!=null) {
            HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("userinfo") != null) {
                UserInfo userInfo =(UserInfo)session.getAttribute("userinfo");
                int uid=userInfo.getId();
                ArticleInfoDao articleInfoDao = new ArticleInfoDao();
                try {
                    int res = articleInfoDao.insert(title, content,uid);
                    if (res > 0) {
                        state = 200;
                    } else {
                        msg = "数据库操作失败";
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else {
                msg = "非法登录";
            }
        }else{
                msg="参数不正确";
            }
        HashMap<String,Object> map=new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        ResultJSONUtils.writeJSON(response,map);
    }
}
