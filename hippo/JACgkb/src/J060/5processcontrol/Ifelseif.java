import java.util.Scanner;
public class Ifelseif {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("����һ��0-100��ֵ");
        int n=sc.nextInt();
        if(n<0||n>100){
            System.out.println("�����쳣");
        }else if(n<60){
            System.out.println("С��60");
        }else if(n<80){
            System.out.println("С��80");
        }else if(n<=90){
            System.out.println("С�ڵ���90");
        }else{  //else
            System.out.println("����90");
        }
    }
}
