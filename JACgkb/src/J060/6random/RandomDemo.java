import java.util.Random;
import java.util.Scanner;
public class RandomDemo{
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int n=r.nextInt(100)+1;//
        System.out.println("���������һ��0-100������");    
        int i=0; 
        while(true){
            System.out.println("��");
            int g=sc.nextInt();
            if(g==n){
                System.out.println("��ϲ�¶���");
                break;
            }else if(g<n){
                System.out.println("��С��");
            }else{
                System.out.println("����");
            }
        }
    }
}