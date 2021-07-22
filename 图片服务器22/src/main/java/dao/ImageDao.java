package dao;

import utils.Utils;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageDao {
    public static int queryCount(String md5) throws SQLException {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try{
            connection=Utils.getConnection();
            String sql="select count(id) c from image_table where md5=?";
            statement=connection.prepareStatement(sql);
            statement.setString(1,md5);
            resultSet=statement.executeQuery();
            resultSet.next();
            return resultSet.getInt("c");

        } catch (SQLException e) {
            throw new RuntimeException("查询上传图片md5失败",e);
        }finally {
           Utils.close(connection,statement,resultSet);
        }
    }
}
