package service;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class MyDelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String msg="";
        int state=-1;
        if(id>0){
            ArticleInfoDao articleInfoDao=new ArticleInfoDao();
            try {
                int res=articleInfoDao.delArticle(id);
                if(res>0){
                    state=200;
                }else{
                    msg="数据库操作失败";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
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
