package day274.print;

import java.io.*;
//字符打印流
public class printwriter {
    public static void main(String[] args) throws IOException {
        //PrintWriter (File file) 使用指定的文件创建一个没有自动行刷新的新PrintWriter。
        PrintWriter pw=new PrintWriter("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\print\\print.txt");
        //pw.flush(); //字符流要flush
        pw.write("a实打实");
        //PrintWriter(OutputStream out, boolean autoFlush) 字节
        //PrintWriter(Writer out, boolean autoFlush)  字符    自动刷新
        PrintWriter pwa=new PrintWriter(new FileWriter("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\print\\print.txt"),true);
        //PrintWriter pwa=new PrintWriter(new FileOutputStream("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\print\\print.txt") , true);
        pwa.println("萨达瓦卡");
        pwa.write("d"); //仍要手动刷新
       // pwa.flush();
        pw.close();
        pwa.close();
    }
}
