package day274.objectstream;

import java.io.Serializable;
//Serializable 标志 没有要重写的方法
public class student implements Serializable {
    private static final long serialVersionUID=21L;        //给定UID这样当对象类文件被修改，读取数据任不会出问题
    public String name;
    public  transient int age;     //关键字transient  字段的赋值不会被序列化 而以数据类型默认值参与序列化
    public student(){};
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);

 */