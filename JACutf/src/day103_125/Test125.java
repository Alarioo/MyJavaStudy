package day103_125;
import java.util.Scanner;
public class Test125 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String in=sc.nextLine();
        String ss=re(in);
        System.out.println(ss);
    }
    public static String re(String s){
        String rs=new String();
        int l=s.length();
        for(int i=l;i>=1;i--){
            rs+=s.charAt(i-1);
        }
        return rs;
    }
}
