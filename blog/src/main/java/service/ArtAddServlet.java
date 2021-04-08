package service;

import dao.ArticleInfoDao;
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

public class ArtAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int succ=-1;
          String msg="";
          String title=request.getParameter("title");
          String content=request.getParameter("content");
        if(title!=null && content!=null) {
            HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("userinfo") != null) {
                UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");
                int uid = userInfo.getId();
                ArticleInfoDao articleInfoDao = new ArticleInfoDao();
                try {
                    succ = articleInfoDao.add(title, content, uid);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else{
                msg="非法登录";
            }
        }else{
            msg="参数不正确";
        }
        HashMap<String,Object> map=new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        WriteUtils.writeMap(response,map);
    }
}
