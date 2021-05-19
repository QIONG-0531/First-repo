package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.example.exception.AppException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class Util {
    private static final ObjectMapper M=new ObjectMapper();
    private static final MysqlDataSource DS=new MysqlDataSource();
    static {
        DS.setURL("jdbc:mysql://localhost:3306/image_system");
        DS.setUser("root");
        DS.setPassword("111111");
        DS.setUseSSL(false);
        DS.setCharacterEncoding("UTF-8");

    }
    //把java对象序列化为json字符串
    public static String  serialize(Object  o){
        try {
            return M.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new AppException("java对象序列化失败",e);
        }
    }

    //获取数据库连接
    public static Connection getConnection(){
        try {
            return DS.getConnection();
        } catch (SQLException e) {
            throw new AppException("获取数据库连接失败",e);
        }
    }

    //关闭数据库连接
    public static void close(Connection c, Statement s, ResultSet rs){
            try {
                if(rs!=null)  rs.close();
                if(s!=null) s.close();
                if(c!=null) c.close();
            } catch (SQLException e) {
                throw new AppException("释放数据库资源失败",e);
            }
        }
    public static void close(Connection c, Statement s){
        try {
            if(s!=null) s.close();
            if(c!=null) c.close();
        } catch (SQLException e) {
            throw new AppException("释放数据库资源失败",e);
        }
    }
    }

