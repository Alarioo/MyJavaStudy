package Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrTest {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet re=null;
        try{
            con=JdbcUtilsTransaction.getConnection();
            System.out.println(con);
            con.setAutoCommit(false);   //关闭自动提交默认开始事务

            String sql = "UPDATE `account` SET `balance` =`balance`+100 WHERE `name` = '账户1'";
            ps=con.prepareStatement(sql);
            ps.executeUpdate();

            //int x=1/0;  //插入改行事务无法执行完成 rollback()

            String sql2 = "UPDATE `account` SET `balance` =`balance`-100 WHERE `name` = 'b'";
            ps=con.prepareStatement(sql2);
            int i =ps.executeUpdate();
            if (i>0){
                System.out.println("事务成功！");
            }

            String sql3= "SELECT * FROM `account` WHERE `NAME` = '账户1'";
            ps=con.prepareStatement(sql3);
            re=ps.executeQuery();

            con.commit(); //执行完成提交

            while(re.next()){
                System.out.println("账户1"+re.getObject("name")+":"+re.getObject("balance"));
            }
        }catch (SQLException e){
/*            try{
                con.rollback();     //如果失败回滚事务   默认执行
            }catch (SQLException e1){
                e1.printStackTrace();
            }*/
            e.printStackTrace();
        }finally {
            JdbcUtilsTransaction.getRelease(con,ps,re);
        }

    }
}