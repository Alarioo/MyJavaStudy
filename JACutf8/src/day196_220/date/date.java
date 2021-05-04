package day196_220.date;
import java.util.Date;
public class date {
    public static void main(String[] args) {
        Date d=new Date();  //无参构造
        System.out.println(d.getTime());        //.getTime()距1970.1.1毫秒
        d.setTime(2323);                        //setTime(long time)设置date
        System.out.println(d);                  //重写了toSTRING
        Date dd=new Date(System.currentTimeMillis());
        System.out.println(dd);                 //有参构造
    }
}
