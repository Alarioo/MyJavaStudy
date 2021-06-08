package day274.IO_Case.IOperson;

import java.io.*;
import java.util.ArrayList;

public class out {
    public static void main(String[] args) throws IOException {
        BufferedWriter br=new BufferedWriter(new FileWriter("JACutf8\\src\\day274\\IO_Case\\IOperson\\person.txt"));
        ArrayList<person> ar=new ArrayList<>();
        ar.add(new person("孙悟空",80));
        ar.add(new person("布尔玛",85));
        ar.add(new person("乌龙",75));
        ar.add(new person("雅木茶",78));
        for(person p:ar){
            br.write(p.getName()+",战斗力："+p.getFightingCapacity());
            br.newLine();
        }
        br.close();
    }
}
