package utils;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
    private static MysqlDataSource dataSource=null;
    public static Connection getConnect() throws SQLException {
        if(dataSource==null){
            dataSource=new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java17?charactionEncoding=utf-8&useSSL=true");
            dataSource.setUser("root");
            dataSource.setPassword("111111");
        }
        return dataSource.getConnection();
    }
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) throws SQLException {
        if(resultSet!=null) resultSet.close();
        if(statement!=null) statement.close();
        if(connection!=null) connection.close();

    }
}
