import java.util.Scanner;
//import jdk.internal.net.http.frame.ContinuationFrame;
public class Jumpcontrol {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入任意大于0的整数");
        int s=sc.nextInt();
        if(s>0){
            System.out.println("小于等于"+s+"的正奇数有");
            //int n=0;
            for(int i=1;i<=s;i++){
                if(i%2==0){
                    continue;  //直接跳到下一个循环
                    //break;   //技术循环
                }
                System.out.println(i);
            }    
        }else{
            System.out.println("输入异常");
        }
    }
}
