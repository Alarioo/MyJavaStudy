package day196_220.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformat {
    public static void main(String[] args) throws ParseException {
        /*
        SimpleDateFormat
        Date --format(格式)->  String           String --parse-> Date -- getTime()-> long
         */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d=new Date();
        String s=sdf.format(d.getTime());       //格式化   Date String
        System.out.println(s);
        s="2021年03月15日 22:29:42";
        d=sdf.parse(s);                         //解析  String date
        System.out.println(d);
    }

}
