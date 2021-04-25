package day274.objectstream;
import java.io.*;
//对象反序列话流
public class objectinputstream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi=new ObjectInputStream(new FileInputStream("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\objectstream\\student.txt"));
        Object  obj=oi.readObject();
        student s1=(student) obj;       //向下转型
        System.out.println(s1.name+s1.age);
        oi.close();
    }
}
