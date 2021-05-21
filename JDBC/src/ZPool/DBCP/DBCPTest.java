package ZPool.DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCPTest {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet re=null;
        try{
            con= DBCPUtils.getConnection();   //数据源连接

            String sql="SELECT * FROM `users` WHERE `name`='用户0'";
            ps=con.prepareStatement(sql);
            re=ps.executeQuery();

            while(re.next()){
                System.out.print(re.getString("name")+","+re.getInt("age")+","
                        +"更新时间："+re.getObject("update_time"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            DBCPUtils.getRelease(con,ps,re);
        }
    }
}
