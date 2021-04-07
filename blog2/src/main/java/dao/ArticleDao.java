package dao;

import models.ArticleInfo;
import utils.DButils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao {
    public List<ArticleInfo> selectByUid(int uid) throws SQLException {
        List<ArticleInfo>list=new ArrayList<>();
        if(uid>0){
            Connection connection= DButils.getconnect();
            String sql="select * from articleinfo where uid=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,uid);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                ArticleInfo articleInfo=new ArticleInfo();
                articleInfo.setTitle(resultSet.getString("title"));
                articleInfo.setContent(resultSet.getString("content"));
                articleInfo.setUpdatetime(resultSet.getDate("updatetime"));
                articleInfo.setRcount(resultSet.getInt("rcount"));
                articleInfo.setCreatetime(resultSet.getDate("createtime"));
                articleInfo.setId(resultSet.getInt("id"));
                list.add(articleInfo);
            }
            DButils.close(connection,statement,resultSet);
        }
        return list;
    }

    public int deleteById(int id) throws SQLException {
        int result=0;
        Connection connection=DButils.getconnect();
        String sql="delete from articleinfo where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,id);
        result=statement.executeUpdate();
        DButils.close(connection,statement,null);
        return result;
    }

    public int addByUid(String title, String content, int uid) throws SQLException {
        int result=0;
        if(title!=null &&content!=null && uid>0){
            Connection connection=DButils.getconnect();
            String sql="insert into articleinfo(title,content,uid)values(?,?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,title);
            statement.setString(2,content);
            statement.setInt(3,uid);
            result=statement.executeUpdate();
            DButils.close(connection,statement,null);
        }
        return result;
    }
}
