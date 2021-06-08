package JDBCUtils;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driver = null;
    private static String url = null;
    private static String name = null;
    private static String password = null;

    static {
        try {
            //InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("JDBCUtils/db.properties");
            Properties p = new Properties();
            FileReader fr =new FileReader("JDBC\\src\\JDBCUtils\\db.properties");
            p.load(fr);
            fr.close();
           //p.load(in);
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            name = p.getProperty("name");
            password = p.getProperty("password");
            //加载驱动
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, name, password);
    }

    //释放连接
    public static void release(Connection con, Statement sta, ResultSet re) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (sta != null) {
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (re != null) {
            try {
                re.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
