package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

    private static final ObjectMapper M = new ObjectMapper();

    private static final MysqlDataSource DS = new MysqlDataSource();

    static {
        DS.setURL("jdbc:mysql://localhost:3306/image_system");
        DS.setUser("root");
        DS.setPassword("111111");
        DS.setUseSSL(false);
        DS.setCharacterEncoding("UTF-8");
    }

    /**
     * 把java对象序列化为json字符串（Servlet响应输出的body需要json字符串）
     */
    public static String serialize(Object o){
        try {
            return M.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("序列化java对象失败："+o, e);
        }
    }

    public static Connection getConnection(){
        try {
            return DS.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("数据库连接获取失败", e);
        }
    }

    public static void close(Connection c, Statement s, ResultSet rs){
        try {
            if(rs != null) rs.close();
            if(s != null) s.close();
            if(c != null) c.close();
        } catch (SQLException e) {
            throw new RuntimeException("释放数据库资源失败", e);
        }
    }

    public static void close(Connection c, Statement s){
        close(c, s, null);
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(DS.getConnection());
    }
}
