//三个数中取最大
import java.util.Scanner;
public class threeguys {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数据");
        int g1=sc.nextInt();
        System.out.println("输入第二个数据");
        int g2=sc.nextInt();
        System.out.println("输入第三个数据");
        int g3=sc.nextInt();
        int max=g1>g2?g1:g2;
        max=max>g3? max:g3;
        /*
        int temp=g1>g2?g1:g2;
        max=temp>g3? max:g3;
        */
        System.out.println("三个数据中最大值为"+max);
    }
}
