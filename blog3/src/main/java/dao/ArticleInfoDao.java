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
}
