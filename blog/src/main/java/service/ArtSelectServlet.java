package service;

import dao.ArticleInfoDao;
import dao.vo.ArticleInfoVO;
import models.ArticleInfo;
import utils.WriteUtils;

import javax.jws.Oneway;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class ArtSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int succ = -1;
        String msg = "";
        ArticleInfo articleInfo = null;
        int id = Integer.parseInt(request.getParameter("id"));
        if (id > 0) {
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            // 执行数据库查询
            try {
                articleInfo = articleInfoDao.select(id);
                succ = 1;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "参数有误！";
        }
        HashMap<String, Object>map=new HashMap<>();
           map.put("succ",succ);
           map.put("msg",msg);
           map.put("article",articleInfo);
        WriteUtils.writeMap(response,map);
    }
}
