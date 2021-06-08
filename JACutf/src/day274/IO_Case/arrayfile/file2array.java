package day274.IO_Case.arrayfile;

import java.io.*;
import java.util.ArrayList;

public class file2array {
    public static void main(String[] args) throws IOException{
        ArrayList<String> ar=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\src\\day274\\IO_Case\\arrayfile\\arrray2file.txt"));
        String line;
        while((line= br.readLine())!=null){
            ar.add(line);
        }
        for(int i=ar.size()-1;i>-1;i--){
            System.out.println(ar.get(i));
        }
    }
}
