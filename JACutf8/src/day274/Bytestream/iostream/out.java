package day274.Bytestream.iostream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class out {
    public static void main(String[] args) throws IOException {

        FileOutputStream fo=new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\iostream\\output.txt");   //字符创建
        /*
        void write(int b);
        void write(byte[] b);
        void write(byte[] b,int off,int len);    //off后len长度
         */
        fo.write(97);
        fo.close();
        FileOutputStream fo1=new FileOutputStream(new File("JACutf8\\src\\day274\\Bytestream\\iostream\\output2.txt")); //file 创建
        /*
            换行 windows  \r\n
                linux     \n
                ios         \r
         */
        String s="get\r\n真不错\r\nbyte";
        fo1.write(s.getBytes(StandardCharsets.UTF_8));    //byte[] getByte(String s)
        byte[] b={97,98,99,100};
        fo1.write(b);
        fo1.write(b,1,2);
        fo1.close();

        //追加输入 构造FileOutputStream时增加Boolean参数 true为在尾部写入
        File f2=new File("JACutf8\\src\\day274\\Bytestream\\iostream\\output3.txt");
        Scanner sc=new Scanner(System.in);
        FileOutputStream fo2=new FileOutputStream(f2,true);
        s=sc.nextLine();
        fo2.write(s.getBytes());
        fo2.close();
    }
}
