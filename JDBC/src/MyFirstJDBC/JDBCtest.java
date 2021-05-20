package MyFirstJDBC;

import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1。加载驱动
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 不推荐
        Class.forName("com.mysql.cj.jdbc.Driver");  //固定写法加载驱动

        //2。用户信息url
            //useUnicode=true(支持中文编码)&characterEncoding=utf8(设置字符集utf8)&useSSl=true(使用安全连接)"
        String url="jdbc:mysql://localhost:3306/myjdbc?useUnicode=true&characterEncoding=utf8&useSSl=true";
        String name="root";
        String password="123456";

        //3.连接成功数据库对象 Connection 代表数据库 如事务操作：connection.rollback()   .createStatement()  .setAutoCommit();
        Connection connection= DriverManager.getConnection(url,name,password);

        //4.执行SQL的对象 Statement
        Statement statement= connection.createStatement();

        //5.执行SQL语句
        /*        statement.execute();    执行任意sql语句
                    statement.executeUpdate();  删除更新插入  返回受影响行数
        */
        String sql="SELECT * FROM `users`";
        ResultSet result= statement.executeQuery(sql);  //返回结果集,封装了所有查询结果

        while(result.next()){
            System.out.println("id:"+result.getObject("id"));
            System.out.println("name:"+result.getObject("name"));
            System.out.println("password:"+result.getObject("password"));
            System.out.println("birthday:"+result.getObject("birthday"));
        }

        //6.释放连接
        result.close();
        statement.close();
        connection.close();
    }
}
