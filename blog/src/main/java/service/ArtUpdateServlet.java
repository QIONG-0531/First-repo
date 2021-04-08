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

public class ArtUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String title=request.getParameter("title");
             String content=request.getParameter("content");
             int id=Integer.parseInt(request.getParameter("id"));
             int succ=-1;
             String msg="";
             if(title!=null && content!=null && id>0){
                 HttpSession session=request.getSession(false);
                 if(session!=null && session.getAttribute("userinfo")!=null){
                     ArticleInfoDao articleInfoDao=new ArticleInfoDao();
                     try {
                         succ=articleInfoDao.update(title,content,id);
                     } catch (SQLException throwables) {
                         throwables.printStackTrace();
                     }
                 }else{
                     msg="非法操作，未登录";
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
