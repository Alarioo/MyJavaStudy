package day274.objectstream;

import java.io.*;
//对象序列化流
public class objectoutputstream {
    public static void main(String[] args)throws IOException{
        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\objectstream\\student.txt"));
        student s1=new student("sa",21);
        oo.writeObject(s1);
        oo.close();
    }
}
