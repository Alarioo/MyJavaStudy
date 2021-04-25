package day274.CharacterStream;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//utf-8 2字节1中文   GBK 3字节1中文
public class code {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="编码";
        //编码过程
        byte[] b1=s.getBytes("UTF-8");
        System.out.println("UTF-8"+Arrays.toString(b1));
        byte[] b2=s.getBytes("GBK");
        System.out.println("GBK"+Arrays.toString(b2));
        //解码过程
        System.out.println("UTF-8"+new String(b1,"UTF-8"));
        System.out.println("GBK"+new String(b2,"GBK"));

    }
}
