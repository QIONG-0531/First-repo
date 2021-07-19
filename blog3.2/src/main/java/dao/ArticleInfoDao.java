package dao;

import models.ArticleInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfoDao {
    public List<ArticleInfo> getArticle(int id) throws SQLException {
        List<ArticleInfo> list=new ArrayList<>();
        if(id>0){
            Connection connection= DBUtils.getConnect();
            String sql="select * from articleinfo where uid=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                ArticleInfo articleInfo=new ArticleInfo();
                articleInfo.setContent(resultSet.getString("content"));
                articleInfo.setTitle(resultSet.getString("title"));
                articleInfo.setId(resultSet.getInt("id"));
                articleInfo.setRcount(resultSet.getInt("rcount"));
                articleInfo.setCreate_time(resultSet.getDate("create_time"));
                articleInfo.setUpdate_time(resultSet.getDate("update_time"));
                list.add(articleInfo);
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return list;
    }

    public int delArticle(int id) throws SQLException {
        int res=0;
        if(id>0){
            Connection connection=DBUtils.getConnect();
            String sql="delete from articleinfo where id=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            res=statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return res;
    }

    public int insert(String title, String content,int uid) throws SQLException {
        Connection connection=DBUtils.getConnect();
        String sql="insert into articleinfo(title,content,uid) values(?,?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,uid);
        int res=statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return res;
    }

    public int update(String title, String content, int id) throws SQLException {
        int res=0;
        if(title!=null && content!=null){
            Connection connection=DBUtils.getConnect();
            String sql="update articleinfo set title=? ,content=? where id=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,title);
            statement.setString(2,content);
            statement.setInt(3,id);
            res=statement.executeUpdate();
            DBUtils.close(connection,statement,null);

        }
        return res;
    }

    public ArticleInfo showArt(int id) throws SQLException {
        ArticleInfo articleInfo=new ArticleInfo();
        if(id>0){
            Connection connection=DBUtils.getConnect();
            String sql="select * from articleinfo where id=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                articleInfo.setTitle(resultSet.getString("title"));
                articleInfo.setContent(resultSet.getString("content"));

            }
            DBUtils.close(connection,statement,resultSet);
        }
        return articleInfo;
    }
}
