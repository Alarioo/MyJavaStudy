package day274.Bytestream.instream;

import java.io.*;

//字节组复制
public class duplicate2  {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\instream\\Xinjiang cotton_d.txt");
        FileInputStream fi=new FileInputStream("JACutf8\\src\\day274\\Xinjiang cotton.txt");
        fo.write("真不错\r\n".getBytes());
        byte[] b= new byte[1024];
        int len;
        while((len=fi.read(b))!=-1){
            //System.out.print(new String(b,0,len));
            fo.write(b,0,len);
        }
        fo.write("\n真不错".getBytes());
        fi.close();
        fo.close();
    }
}
