package day274.IO_Case.CountGame;

import java.io.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        Properties p=new Properties();
        FileWriter f=new FileWriter("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\IO_Case\\CountGame\\Times.txt");
        FileReader fr=new FileReader("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\IO_Case\\CountGame\\Times.txt");
        p.setProperty("count","3");
        p.store(f,null);
        int number=r.nextInt(100)+1;
        System.out.println(number);
        System.out.println("已随机生成0-100整数，您共有"+p.getProperty("count")+"次猜数字机会，请输入数字");
        while(Integer.parseInt(p.getProperty("count"))>0){
            int times=Integer.parseInt(p.getProperty("count"));
            int guess=sc.nextInt();
            p.load(fr);
            times=judge(number,guess,times);
            if(times==-1){
                System.out.println("恭喜猜对了");
            }else if(times==0){
                System.out.println("输入”大哥“增加次数或”结束“退出游戏");
                sc.nextLine();
                String s=sc.nextLine();
                if(s.equals("大哥")){
                    times=3;
                    System.out.println("您还有"+times+"次机会");
                }
            }
            p.setProperty("count",String.valueOf(times)); //String2int
            p.store(f,null);
        }
        f.close();
        fr.close();
    }
    //可以写成类文件 用static修饰方法 直接 类名.方法（参数） 调用
    public static int judge(int number,int guess,int times){
        if(times>0){
            if(guess<number){
                --times;
                System.out.println("猜小了，您还有"+times+"次机会");
            }else if(guess>number){
                --times;
                System.out.println("猜大了，您还有"+times+"次机会");
            }else{
                times=-1;
            }
        }
        return times;
    }
}
