//��������ȡ���
import java.util.Scanner;
public class threeguys {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("�����һ������");
        int g1=sc.nextInt();
        System.out.println("����ڶ�������");
        int g2=sc.nextInt();
        System.out.println("�������������");
        int g3=sc.nextInt();
        int max=g1>g2?g1:g2;
        max=max>g3? max:g3;
        /*
        int temp=g1>g2?g1:g2;
        max=temp>g3? max:g3;
        */
        System.out.println("�������������ֵΪ"+max);
    }
}
