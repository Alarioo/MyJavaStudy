package ZPool.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class c3p0Test {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet re=null;
        try{
            con = c3p0Untils.getConnection();

            String sql="SELECT * FROM `users` WHERE `name`='用户0' ";
            ps=con.prepareStatement(sql);
            re=ps.executeQuery();
            while(re.next()){
                System.out.print(re.getString("name")+","+re.getInt("age")+",");
                System.out.println("更新时间："+re.getObject("update_time"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            c3p0Untils.getRelease(con,ps,re);
        }
    }
}
