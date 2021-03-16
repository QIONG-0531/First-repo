import java.sql.*;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";
        String password="111111";
        Connection connection= DriverManager.getConnection(url,username,password);

        //3.执行sql语句
        String sql="select * from student";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }
    }
}
