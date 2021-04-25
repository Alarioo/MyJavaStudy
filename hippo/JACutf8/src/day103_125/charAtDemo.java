package day103_125;
import java.util.Scanner;
public class charAtDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int B=0;
        int b=0;
        int n=0;
        System.out.println("请输入一串只包含字母数字的字符串");
        String s=sc.nextLine();
        for (int i=0;i<s.length();i++){                         //字符串。length()
            char ch=s.charAt(i);              //先提出来
            if (ch>='A'&&ch<='Z') {           //字符串.charAt(i)
                B++;
            }else if(ch>='a'&&ch<='z'){
                b++;
            }else if(ch>='0'&& ch<='9'){
                n++;
            }else{
                System.out.println("输入异常");
            }
        }
        System.out.println("大写字母数："+B);
        System.out.println("小写字母数："+b);
        System.out.println("数字数："+n);
    }
}
