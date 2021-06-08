package day221_250.zengqiaofor;

import java.util.ArrayList;
//本质迭代器
public class zengqiangfor {
    public static void main(String[] args) {
        ArrayList<student> ar=new ArrayList<>();
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        for(student s:ar){
            System.out.println(s.name+","+s.age);
        }
    }
}
