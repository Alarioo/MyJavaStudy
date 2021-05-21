package ZPool.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class c3p0Untils {
    private static DataSource ds;
    // private static ComboPooledDataSource cp; 代码版配置  extends to DataSource
    static {
        try{
            /*       代码版配置 数据源cp  可由Properties导入
            cp=new ComboPooledDataSource(...);
            cp.setDriverClass(...);
            cp.setJdbcUrl(...);
            cp.setUser(...);
            cp.setPassword(...);
            cp.setMaxPoolSize(...);
            .....*/
            //工厂模式创建
            ds=new ComboPooledDataSource("MYSQL"); //() 则为默认config在.xml文件中定义
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
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
