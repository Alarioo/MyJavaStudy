package ZPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCP {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;  //防止SQL注入
        ResultSet re=null;
        try{
            con= DBCPUtils.getConnection();

            String sql0="UPDATE `users` SET `age`=100 WHERE `name`='用户0';";
            ps=con.prepareStatement(sql0);
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("修改成功！");
            }


            //编写sql  参数用？占位
            String sql="SELECT * FROM `users` WHERE `name`=?";
            //预编译
            ps=con.prepareStatement(sql);
            //设置参数
            ps.setObject(1,"用户0");
            //执行参数
            re=ps.executeQuery();


            while(re.next()){
                System.out.print(re.getString("name")+","+re.getInt("age")+",");
                System.out.println("更新时间："+re.getObject("update_time"));
            }
        }catch(SQLException e){
            e.printStackTrace();

        }finally {
            DBCPUtils.getRelease(con,ps,re);
        }
    }
}
