package ZPool;


import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;
import java.sql.*;


public class DBCPUtils {
    private static DataSource ds;
    static {
        try{
            InputStream in=DBCPUtils.class.getClassLoader().getResourceAsStream("ZPool/dbcpconfig.properties");
            Properties p=new Properties();
            p.load(in);
            //创建数据源  池化技术 性能提高 详见INTRO
            ds =BasicDataSourceFactory.createDataSource(p);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
            return ds.getConnection();      //通过数据源获得连接
    }
    public static void getRelease(Connection con,PreparedStatement ps,ResultSet re){
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
