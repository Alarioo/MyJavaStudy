package JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        ResultSet re=null;
        try{
            con=JdbcUtils.getConnection();
            st=con.createStatement();
            String sql="SELECT * FROM `users`";
            re = st.executeQuery(sql);
            while(re.next()){
                System.out.print("name:"+re.getObject("name")+","
                        +"birthday:"+re.getObject("birthday"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(con,st,re);
        }

    }
}
