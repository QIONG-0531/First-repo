package service;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.UserInfo;
import utils.DBUtils;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //权限验证
        HttpSession session=request.getSession(false);
        UserInfo userInfo=(UserInfo)session.getAttribute("userinfo");
        String msg="";
        int state=-1;
        List<ArticleInfo> list=null;
        if(session==null || userInfo==null){
            msg="用户未登录";
        }else{
            ArticleInfoDao articleInfoDao=new ArticleInfoDao();
            try {
                list=articleInfoDao.getArticle(userInfo.getId());
                state=200;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        HashMap<String,Object> map=new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        map.put("list",list);
        ResultJSONUtils.writeJSON(response,map);

    }
}
