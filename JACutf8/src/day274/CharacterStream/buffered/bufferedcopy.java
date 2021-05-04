package day274.CharacterStream.buffered;

import java.io.*;

public class bufferedcopy {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\student.java"));      //构造 filereader 或 inputstreamreader
        BufferedWriter bw=new BufferedWriter(new FileWriter("JACutf8\\student_copy.java"));
        /*        char[] ch=new char[1024];
        int len;
        while((len=br.read(ch))!=-1){
            bw.write(ch);
        }
        int b;
        while((b=br.read())!=-1){
            bw.write(b);
        }*/
        String line;
        while((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
