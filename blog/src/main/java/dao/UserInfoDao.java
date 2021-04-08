package dao;

import models.UserInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {
    public int add(UserInfo userInfo) throws SQLException {
        int ret=0;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection= DBUtils.getConnect();
            String sql="insert into userinfo(username,password) values(?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ret=statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return ret;
    }
    public boolean isLogin(UserInfo userInfo) throws SQLException {
        boolean ret=false;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection=DBUtils.getConnect();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet =statement.executeQuery();
            if(resultSet.next()){
                ret=true;
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return ret;
    }
    public UserInfo getId(UserInfo userInfo) throws SQLException {
        UserInfo user=new UserInfo();
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection=DBUtils.getConnect();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet =statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setCreatetime(resultSet.getDate("createtime"));
                user.setUpdatetime(resultSet.getDate("updatetime"));
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return user;
    }

}
