package Transaction;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class JdbcUtilsTransaction {
    private static String driver=null;
    private static String url=null;
    private static String name=null;
    private static String password=null;
    static{
        try {
            InputStream in = JdbcUtilsTransaction.class.getClassLoader().getResourceAsStream("Transaction/Tr.properties");
            Properties p=new Properties();
            p.load(in);
            driver =p.getProperty("driver");
            url = p.getProperty("url");
            name = p.getProperty("name");
            password = p.getProperty("password");
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,name,password);
    }

    public  static void getRelease(Connection con,PreparedStatement ps,ResultSet re){
        try{
            if(con!=null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            if(ps!=null){
                ps.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            if(re!=null){
                re.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
