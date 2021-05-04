package day103_125;
import java.util.Scanner;
public class SignIn {
    public static void main(String[] args){
        String name="alario";
        String password="123456";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("输入用户名");
            String n=sc.nextLine();
            System.out.println("输入用户密码");
            String p=sc.nextLine();
            if (n.equals(name) && p.equals(password)){    //对象1.equals(对象2)
                System.out.println("输入正确 alario 75kg");
                break;
            }else{
                System.out.println("还有"+(int)(3-i)+"尝试机会");
            }
        }
    }
}
