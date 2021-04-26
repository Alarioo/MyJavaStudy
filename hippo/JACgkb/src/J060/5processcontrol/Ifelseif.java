import java.util.Scanner;
public class Ifelseif {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个0-100的值");
        int n=sc.nextInt();
        if(n<0||n>100){
            System.out.println("输入异常");
        }else if(n<60){
            System.out.println("小于60");
        }else if(n<80){
            System.out.println("小于80");
        }else if(n<=90){
            System.out.println("小于等于90");
        }else{  //else
            System.out.println("大于90");
        }
    }
}
