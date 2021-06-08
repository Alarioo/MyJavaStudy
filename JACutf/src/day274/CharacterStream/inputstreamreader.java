package day274.CharacterStream;

import java.io.*;

public class inputstreamreader {
    public static void main(String[] args) throws IOException {
        InputStreamReader is=new InputStreamReader(new FileInputStream("JACutf8\\src\\day274\\reader.txt"));  //构造fileoutputstream
//        int b;                                //一次一个字符
//        while((b=is.read())!=-1){
//            System.out.print((char)b);
//
        char[] ch=new char[1024];           //一次一个字符数组
        int len;
        while((len=is.read(ch))!=-1){
            System.out.print(new String(ch,0,len));
        }
    }
}
