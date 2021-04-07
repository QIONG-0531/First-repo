package service;

import dao.ArticleDao;
import models.ArticleInfo;
import models.UserInfo;
import utils.Writeutils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArtListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ArticleInfo>list=new ArrayList<>();
        String msg="";
        HttpSession session=request.getSession(false);
        int uid=0;
        if(session!=null && session.getAttribute("userinfo")!=null){
            UserInfo userInfo=(UserInfo)session.getAttribute("userinfo");
            uid=userInfo.getId();
            ArticleDao articleDao=new ArticleDao();
            try {
                list=articleDao.selectByUid(uid);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else{
            msg="非法登录";
        }
        HashMap<String,Object>map=new HashMap<>();
        map.put("list",list);
        map.put("msg",msg);
        Writeutils.writeMap(response,map);
    }
}
