package day274.CharacterStream;
import java.io.*;
public class copyjava {
    public static void main(String[] args) throws IOException {
        //复制src下文件会 public冲突  存在同名报错
        FileReader is=new FileReader("JACutf8\\student.java");      //InputStreamReader 的子类   public FileReader(File file)  public FileReader(File file)
        FileWriter ow=new FileWriter("JACutf8\\student_copy.java"); //OutputStreamReader 的子类
//        int b;
//        while((b=is.read())!=-1){
//            ow.write(b);
//        }

        char[] ch=new char[1024];
        int len;
        while((len=is.read(ch))!=-1){
            ow.write(ch,0,len);
        }
        ow.close();
        is.close();
    }
}
