package day274.System;

import java.io.*;
import java.util.Scanner;
//标准输入流
public class in {
    public static void main(String[] args)throws IOException {
        //public static final InputStream in;  System 的字段  InputStream类变量   对应于键盘输入或主机环境或用户指定的另一个输入源
        //public static final PrintStream out;  System 的字段 PrintStream类变量
        InputStream is=System.in;
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        System.out.println("输入文本");
        System.out.println(br.readLine());
        System.out.println("输入整数");
        System.out.println(Integer.parseInt(br.readLine()));
        //java Scanner 类用于包装System.in 方便输入
        Scanner sc=new Scanner(is);
        is.close();
    }
}
