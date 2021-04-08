package dao;

import dao.vo.ArticleInfoVO;
import models.ArticleInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfoDao {
    public List<ArticleInfo> getArticleList(int uid) throws SQLException {
        List<ArticleInfo> list=new ArrayList<>();
        Connection connection= DBUtils.getConnect();
        String sql="select * from articleinfo where uid=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,uid);
        ResultSet resultSet=statement.executeQuery();
        while (resultSet.next()){
            ArticleInfo articleInfo=new ArticleInfo();
            articleInfo.setId(resultSet.getInt("id"));
            articleInfo.setTitle(resultSet.getString("title"));
            articleInfo.setCreatetime(resultSet.getDate("createtime"));
            articleInfo.setRcount(resultSet.getInt("rcount"));
            articleInfo.setUpdatetime(resultSet.getDate("updatetime"));
            articleInfo.setContent(resultSet.getString("content"));
            list.add(articleInfo);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }
    public int ArtDelById(int id) throws SQLException {
        int retsult=0;
        Connection connection=DBUtils.getConnect();
        String sql="delete from articleinfo where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        retsult=statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return retsult;
    }
    public int add(String title,String content,int uid) throws SQLException {
        int retsult=0;
        Connection connection=DBUtils.getConnect();
        String sql="insert into articleinfo(title,content,uid) values(?,?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,uid);
        retsult=statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return retsult;
    }

    public int update(String title, String content, int id) throws SQLException {
        int retsult=0;
        Connection connection=DBUtils.getConnect();
        String sql="update articleinfo set title=?,content=? where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,id);
        retsult=statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return retsult;
    }

    public ArticleInfoVO select(int id) throws SQLException {
        ArticleInfoVO articleInfo=new ArticleInfoVO();
        Connection connection=DBUtils.getConnect();
        String sql="select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id where a.id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            articleInfo.setTitle(resultSet.getString("title"));
            articleInfo.setContent(resultSet.getString("content"));
            articleInfo.setCreatetime(resultSet.getDate("createtime"));
            articleInfo.setRcount(resultSet.getInt("rcount"));
            articleInfo.setUsername(resultSet.getString("username"));
        }
        DBUtils.close(connection, statement, resultSet);
        return articleInfo;
    }

    public List<ArticleInfoVO> getList() throws SQLException {
        List<ArticleInfoVO>list=new ArrayList<>();
        Connection connection=DBUtils.getConnect();
        String sql="select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id";
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
            ArticleInfoVO articleInfoVO=new ArticleInfoVO();
            articleInfoVO.setId(resultSet.getInt("id"));
            articleInfoVO.setTitle(resultSet.getString("title"));
            articleInfoVO.setRcount(resultSet.getInt("rcount"));
            articleInfoVO.setRcount(resultSet.getInt("rcount"));
            articleInfoVO.setUsername(resultSet.getString("username"));
            list.add(articleInfoVO);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    public List<ArticleInfoVO> getListByCpage(int cpage, int psize) throws SQLException {
        List<ArticleInfoVO>list=new ArrayList<>();
        Connection connection=DBUtils.getConnect();
        String sql="select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id limit ?,?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,(cpage-1)*psize);
        statement.setInt(2,psize);
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
            ArticleInfoVO articleInfoVO=new ArticleInfoVO();
            articleInfoVO.setId(resultSet.getInt("id"));
            articleInfoVO.setTitle(resultSet.getString("title"));
            articleInfoVO.setRcount(resultSet.getInt("rcount"));
            articleInfoVO.setCreatetime(resultSet.getDate("createtime"));
            articleInfoVO.setUsername(resultSet.getString("username"));
            list.add(articleInfoVO);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    public int upcount(int id) throws SQLException {
        int result=0;
        Connection connection=DBUtils.getConnect();
        String sql="update articleinfo set rcount=rcount+1 where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        result=statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return result;

    }
}
