import java.util.Random;
import java.util.Scanner;
public class RandomDemo{
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int n=r.nextInt(100)+1;//
        System.out.println("已随机产生一个0-100的整数");    
        int i=0; 
        while(true){
            System.out.println("猜");
            int g=sc.nextInt();
            if(g==n){
                System.out.println("恭喜猜对了");
                break;
            }else if(g<n){
                System.out.println("猜小了");
            }else{
                System.out.println("大了");
            }
        }
    }
}