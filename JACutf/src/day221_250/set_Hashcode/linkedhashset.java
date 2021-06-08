package day221_250.set_Hashcode;

import java.util.LinkedHashSet;

//与hashset不同通过链表实现输出有序
public class linkedhashset {
    public static void main(String[] args){
        student_hashset s1= new student_hashset("a",1);
        student_hashset s2= new student_hashset("b",2);
        student_hashset s3= new student_hashset("c",3);
        LinkedHashSet<student_hashset> lhs=new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
    }
}

