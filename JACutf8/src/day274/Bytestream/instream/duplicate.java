package day274.Bytestream.instream;

import java.io.*;
//单字节赋值
public class duplicate {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\instream\\output2_d.txt",true);
        FileInputStream  fi=new FileInputStream("JACutf8\\src\\day274\\Bytestream\\iostream\\output2.txt");
        int b;
        while((b=fi.read())!=-1){
            fo.write(b);
        }
        fo.close();
        fi.close();
    }
}
