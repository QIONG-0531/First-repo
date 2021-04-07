package dao;

import models.UserInfo;
import utils.DButils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public boolean add(UserInfo userInfo) throws SQLException {
        boolean ret=false;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null) {
            Connection connection = DButils.getconnect();
            String sql = "insert into  userinfo(username,password) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userInfo.getUsername());
            statement.setString(2, userInfo.getPassword());
            ret = statement.executeUpdate()>=1?true:false;
            DButils.close(connection,statement,null);
        }
        return ret;
    }


    public UserInfo select(UserInfo userInfo) throws SQLException {
        UserInfo user=new UserInfo();
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null){
            Connection connection=DButils.getconnect();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
            DButils.close(connection,statement,resultSet);
        }
        return user;
    }
}
