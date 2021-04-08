package service;

import dao.ArticleInfoDao;
import dao.vo.ArticleInfoVO;
import utils.WriteUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int succ=-1;
        String msg="";
        List<ArticleInfoVO> list=null;
        int cpage=Integer.parseInt(req.getParameter("cpage"));
        int psize=Integer.parseInt(req.getParameter("psize"));
        ArticleInfoDao articleInfoDao=new ArticleInfoDao();
        try {
            list=articleInfoDao.getListByCpage(cpage,psize);
            succ=1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        HashMap<String,Object>map=new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        map.put("list",list);
        WriteUtils.writeMap(resp,map);

    }
}
