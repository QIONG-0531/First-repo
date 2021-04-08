package service;

import dao.ArticleInfoDao;
import models.ArticleInfo;
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
import java.util.List;

public class ArtListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int state=-1;
        String msg="";
        List<ArticleInfo> list=null;
        //权限验证
        HttpSession session=request.getSession(false);
        if(session==null || session.getAttribute("userinfo")==null){
            msg="用户未登录";
            state=100;
        }else{
            //数据库查询
            UserInfo userInfo=(UserInfo) session.getAttribute("userinfo");
            int uid=userInfo.getId();
            ArticleInfoDao articleInfoDao=new ArticleInfoDao();
            try {
                list=articleInfoDao.getArticleList(uid);
                state=200;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        HashMap<String,Object>map=new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        map.put("list",list);
        WriteUtils.writeMap(response,map);
    }
}
