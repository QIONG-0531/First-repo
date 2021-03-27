package org.example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        //1.获取仓库资源
        MysqlDataSource dataSource=new MysqlDataSource();
        //设置三信息
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/java17?");
        dataSource.setUser("root");
        dataSource.setPassword("111111");
        //2.获取连接
        Connection connection=dataSource.getConnection();
        //3.拼接sql语句
        String sql="select * from student where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,2);
        //4.查询sql
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
            System.out.printf("id:%d,name:%s",
                    resultSet.getInt(1),resultSet.getString(2));
        }
    }
}
