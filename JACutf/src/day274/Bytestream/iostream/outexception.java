package day274.Bytestream.iostream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class outexception {
    public static void main(String[] args){
        FileOutputStream fo=null;           //*1
        try{
            fo=new FileOutputStream(new File("z\\JACutf8\\src\\day274\\iostream\\outEXC.txt"));
            String s="exc\r\n";
            fo.write(s.getBytes());
            fo.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fo != null) {    //*1  避免空指针
                try {
                    fo.close();
                } catch (IOException e) {   //close异常
                    e.printStackTrace();
                }
            }
        }
    }
}
