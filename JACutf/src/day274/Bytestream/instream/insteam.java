package day274.Bytestream.instream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class insteam {
    public static void main(String[] args) throws IOException {
        File f=new File("JACutf8\\src\\day274\\Bytestream\\iostream\\output2.txt");
        FileInputStream fi=new FileInputStream(f);
        int b;
        while((b=fi.read())!=-1){
            System.out.print((char)b);
        }
        fi.close();
    }
}
