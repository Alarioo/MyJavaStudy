package day274.Bytestream.instream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//复制图片
public class duplicate3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\instream\\批注 2019-10-01 104819_d.jpg");
        FileInputStream fi=new FileInputStream("JACutf8\\src\\day274\\批注 2019-10-01 104819.jpg");
        byte[] b=new byte[1024];
        int len;
        while(( len=fi.read(b))!=-1){
            fo.write(b);
        }
        fo.close();
        fi.close();
    }
}
