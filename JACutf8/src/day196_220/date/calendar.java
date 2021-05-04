package day196_220.date;

import java.util.Calendar;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Calendar ca=Calendar.getInstance();//多态形式创建
        System.out.println(ca);
        System.out.println(ca.get(Calendar.YEAR)+"年"+(ca.get(Calendar.MONTH)+1)+"月");//取某项值
        ca.add(Calendar.MONTH,-1);                  //加减某项值
        ca.set(2021,3,14);          //设置 int year,int month,int date
        Scanner sc=new Scanner(System.in);
        System.out.println("输入任意年份");
        int y= sc.nextInt();
        ca.set(y,2,1);          //设置3月1日
        ca.add(Calendar.DATE,-1);       //减一天到二月末
        System.out.println(y+"年2月有"+ca.get(Calendar.DATE)+"天");
    }

}
