import com.mysql.jdbc.UpdatableResultSet;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import sun.security.krb5.internal.APRep;
import sun.security.krb5.internal.APReq;

import javax.jws.soap.SOAPBinding;
import javax.sql.DataSource;
import java.sql.*;

public class TestDemo {
    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
      //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.创建连接
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";//数据库名称
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);

        //3.执行sql语句
        String sql="select * from student";
        Statement statement=connection.createStatement();
        //结果集
        ResultSet resultSet=statement.executeQuery(sql);

        //4.处理结果集
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }
    }

    public static void main2(String[] args) throws ClassNotFoundException, SQLException{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.创建连接
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";//数据库名称
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);

        //3.执行sql语句
        String sql="select * from student";
        Statement statement=connection.createStatement();
        //结果集
        ResultSet resultSet=statement.executeQuery(sql);

        //4.处理结果集
        User user=new User();//封装
        while(resultSet.next()){
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            System.out.println(user);
        }

    }
    public static void main3(String[] args) throws ClassNotFoundException, SQLException{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.创建连接
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";//数据库名称
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);

        //3.执行sql语句
        int uid=2;
        String uname="李白";
        String sql="select * from student where id='"+uid+"'  and name='"+uname+"'";
        Statement statement=connection.createStatement();
        //结果集
        ResultSet resultSet=statement.executeQuery(sql);

        //4.处理结果集
        User user=new User();//封装
        while(resultSet.next()){
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            System.out.println(user);
        }

    }

    public static void main4(String[] args) throws SQLException{
        //1。获取数据源
        DataSource dataSource=new MysqlDataSource();
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";//数据库名称
        String password="111111";//数据库密码
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection=dataSource.getConnection();
        String sql="select * from student where id= ? ";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,3);
        //结果集
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
        }
    }

    public static void main(String[] args) throws SQLException{
        DataSource dataSource=new MysqlDataSource();
        String url="jdbc:mysql://127.0.0.1:3306/ebook?useSSL=false";
        String username="root";//数据库名称
        String password="111111";//数据库密码
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection=dataSource.getConnection();
       /* String sql="insert into borrow_info(book_id,student_id,start_time,end_time) " +
                "values( (select id from book where name=?)," +
                "(select id from student where name=?),?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,"诗经");
        preparedStatement.setString(2,"貂蝉");
        preparedStatement.setString(3,"2019-09-25 17:50:00");
        preparedStatement.setString(4,"2019-10-25 17:50:00");

        int ret=preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("插入成功");
        }*/


       /* String sql="select * from borrow_info  where book_id in(select id from book where category_id=(select id from category  where name=?))";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,"计算机");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) +" "+resultSet.getInt(2)
                   +" "+ resultSet.getInt(3)+" "+resultSet.getString(4)
                    +" "+resultSet.getString(5));
            System.out.println();
        }*/
       /* String sql="update book set  price=? where name=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setDouble(1,61.20);
        preparedStatement.setString(2,"深入理解Java虚拟机");*/
        String sql = " delete  from borrow_info  where id=(select id from " +
                "(select max(id)  id from borrow_info ) r)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        int ret=preparedStatement.executeUpdate();

        if(ret!=0){
            System.out.println("更新成功");
        }
        preparedStatement.close();
        connection.close();

    }
}
