package day153_168;
//其它包的类前导入
import day126_152.MyStudent;
public class importdemo {
    public static void main(String[] args){
        //util包的类中包导入
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String name=sc.nextLine();
        MyStudent ms=new MyStudent(name);
        //其它包的类中导入
        day126_152.Student s=new day126_152.Student(name);
        System.out.println("ms "+ms.getName());
        System.out.println("s "+s.getName());
    }
}
