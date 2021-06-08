package day274.try_catch_finally;
import java.io.*;
public class try_catch_finally {
    public static void main(String[] args) throws IOException {
        File fi=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\zcontent\\txt\\Xinjiang cotton.txt");
        File fo=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\try_catch_finally\\copy.txt");
        //method1(fi,fo);
        //method2(fi,fo);
        //method3(fi,fo);
        method4(fi,fo);
    }
    //jdk9改进版
    public static void method4(File fi,File fo) throws IOException{
        FileReader fr=new FileReader(fi);
        FileWriter fw=new FileWriter(fo);
        try(fr;fw){
            char[] ch=new char[1024];
            int len=0;
            while((len=fr.read(ch))!=-1){
                fw.write(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //jdk7改进版(定义流对象)
    public static void method3(File fi,File fo){
        try (  FileReader fr=new FileReader(fi);
               FileWriter fw=new FileWriter(fo);){
                char[] ch=new char[1024];
                int len=0;
                while((len=fr.read(ch))!=-1){
                    fw.write(ch);
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //异常处理版
    public static void method2(File fi,File fo) throws IOException{
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader(fi);
            fw=new FileWriter(fo);
            char[] ch=new char[1024];
            int len=0;
            while((len=fr.read(ch))!=-1){
                fw.write(ch);
            }
            fr.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fr!=null){
                fr.close();
            }
            if(fw!=null){
                fw.close();
            }
        }


    }
    //抛异常版
    public static void method1(File fi,File fo) throws IOException{
        FileReader fr=new FileReader(fi);
        FileWriter fw=new FileWriter(fo);
        char[] ch=new char[1024];
        int len=0;
        while((len=fr.read(ch))!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();

    }
}
