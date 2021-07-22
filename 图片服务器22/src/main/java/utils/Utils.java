package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.org.apache.bcel.internal.generic.FADD;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Utils {
    public static void writeJSON(HttpServletResponse response, HashMap<String,Object> map) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper=new ObjectMapper();
        PrintWriter writer=response.getWriter();
        writer.println(mapper.writeValueAsString(map));

    }

    private static MysqlDataSource dataSource=null;
    public static Connection getConnection() throws SQLException {
        if(dataSource==null){
            dataSource=new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8");
            dataSource.setUser("root");
            dataSource.setPassword("111111");
            dataSource.setUseSSL(false);
            dataSource.setCharacterEncoding("utf-8");
        }
        return dataSource.getConnection();
    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if(resultSet!=null) resultSet.close();
        if(statement!=null) statement.close();
        if(connection!=null) connection.close();
    }

}
