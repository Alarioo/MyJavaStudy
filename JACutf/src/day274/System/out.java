package day274.System;

import java.io.PrintStream;
//标准输出流
public class out {
    public static void main(String[] args) {
        //public static final printStream out;  System 的字段  PrintStream类变量   对应于键盘输入或主机环境或用户指定的另一个输入源
        PrintStream ps=System.out;
        ps.println("ps输出");
        System.out.println("sout输出");
        ps.close();
    }
}
