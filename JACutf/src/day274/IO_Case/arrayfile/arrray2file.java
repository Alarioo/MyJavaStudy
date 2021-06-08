package day274.IO_Case.arrayfile;

import java.io.*;
import java.util.ArrayList;

public class arrray2file {
    public static void main (String[] args) throws IOException {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("集合");
        ar.add("到");
        ar.add("文件");
        BufferedWriter bw=new BufferedWriter(new FileWriter("JACutf8\\src\\day274\\IO_Case\\arrayfile\\arrray2file.txt"));
        for(String s:ar){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
