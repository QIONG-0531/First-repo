package dao;

import models.UserInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * userinfo的增删改查方法
 */
public class UserInfoDao {
    /**
     * 添加方法
     */
    public int add(UserInfo userInfo) throws SQLException {
        int result=0;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection=DBUtils.getConnect();
            String sql="insert into userinfo(username,password) values(?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            result= statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return result;
    }

    public boolean isLogin(UserInfo userInfo) throws SQLException {
        boolean ret=false;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection=DBUtils.getConnect();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                ret=true;
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return ret;
    }

    public UserInfo getUserInfo(UserInfo userInfo) throws SQLException {
        UserInfo user=new UserInfo();
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            //正常的操作
            Connection connection=DBUtils.getConnect();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setCreate_time(resultSet.getDate("create_time"));
                user.setUpdate_time(resultSet.getDate("update_time"));
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return user;
    }
}
