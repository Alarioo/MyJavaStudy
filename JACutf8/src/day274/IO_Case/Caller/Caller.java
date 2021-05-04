package day274.IO_Case.Caller;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Caller {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\src\\day274\\IO_Case\\Caller\\names.txt"));
        ArrayList<String> ar=new ArrayList<>();
        Random r=new Random();
        String line;
        while((line=br.readLine())!=null){
            ar.add(line);
        }
        System.out.println("第一个出场的是："+ar.get(r.nextInt(ar.size())));
    }
}
