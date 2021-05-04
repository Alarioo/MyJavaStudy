package day274.IO_Case.IOperson;

import java.io.*;
import java.util.ArrayList;

public class in {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\src\\day274\\IO_Case\\IOperson\\person.txt"));
        ArrayList<person> ar=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            String[] str=line.split(",|：");   // 用 |  区分多个换行符
            ar.add(new person(str[0],Integer.parseInt(str[2])));    //string2int
        }
        for(person p:ar){
            System.out.println(p.getName()+","+p.getFightingCapacity());
        }
    }

}
