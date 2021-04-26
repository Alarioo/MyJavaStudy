import java.util.Scanner;
public class IfDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数");
        int a=sc.nextInt();
        System.out.println("输入第二个数");
        int b=sc.nextInt();
        if (a==b){
            System.out.println("a=b");
        }else{
            System.out.println("a!=b");
        }
        if (a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }
    }
}