package day274.CharacterStream.buffered;

import java.io.*;


public class new_read_line {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("JACutf8\\src\\day274\\CharacterStream\\buffered\\new_read.txt"));
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\src\\day274\\CharacterStream\\buffered\\new_read.txt"));
        for(int i=10;i>0;i--){
            bw.write("写入"+i);
            bw.newLine();                       //换行
        }
        bw.flush();
        String line;
        while((line=br.readLine())!=null){    //读完返回null 只读内容不读终止符（如换行）
            System.out.print(line);
        }
        br.close();
        bw.close();
    }
}
