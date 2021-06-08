package day196_220.ERROR;

import java.util.Scanner;

import static java.lang.System.*;

public class customerror {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        out.println("输入0至100正整数");
        int i= sc.nextInt();
        try {
            judge(i);
        } catch (Cusexception cus) {
           // out.println(cus.getMessage());
           cus.printStackTrace();
        }
    }
    public static void judge (int i) throws Cusexception{
        if(i<0||i>100){
            //throw 方法内部手动抛异常 否则会抛自定义异常
            throw new Cusexception("请输入0到100的数");   //有参构造 加入 detailmessage
        }else {
            out.println("正常");
        }
    }
}
