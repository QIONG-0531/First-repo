package dao;

import models.UserInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {
    //userinfo的数据操作方法
    public boolean add(UserInfo userInfo)throws SQLException {
        boolean result=false;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null) {
            //正常参数
            Connection connection = DBUtils.getConnection();
            String sql = "insert into userinfo(username,password) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userInfo.getUsername());
            statement.setString(2, userInfo.getPassword());
            result = statement.executeUpdate() >= 1 ? true : false;
            DBUtils.close(connection, statement, null);
        }
        return result;
    }
    public boolean isLogin(UserInfo userInfo) throws SQLException {
        boolean result=false;
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null
           && !userInfo.getUsername().equals("") && !userInfo.getPassword().equals("")){
            Connection connection=DBUtils.getConnection();
            String sql="select * from userinfo where username=? and password=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                result=true;
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return result;
    }
    public UserInfo getUserInfo(UserInfo userInfo) throws SQLException {
        UserInfo user=new UserInfo();
        if(userInfo.getUsername()!=null && userInfo.getPassword()!=null
                && !userInfo.getUsername().equals("") && !userInfo.getPassword().equals("")){
            Connection connection=DBUtils.getConnection();
            String sql="select * from userinfo where username=?" +
                    "and password=? and state=1";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
        }
        return user;
    }
}
