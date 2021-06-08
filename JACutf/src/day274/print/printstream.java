package day274.print;

import java.io.*;
//outoutstream 子类
public class printstream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps =new PrintStream("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\printsteam\\print.txt");
        //父类方法转码
        ps.write(97);
        //特有方法 不转吗
        ps.println("sda");
        ps.close();
    }

}
