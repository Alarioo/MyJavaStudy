import java.util.Scanner;
public class IfDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("�����һ����");
        int a=sc.nextInt();
        System.out.println("����ڶ�����");
        int b=sc.nextInt();
        if (a==b){
            System.out.println("a=b");
        }else{
            System.out.println("a!=b");
        }
        if (a%2==0){
            System.out.println(a+"��ż��");
        }else{
            System.out.println(a+"������");
        }
    }
}