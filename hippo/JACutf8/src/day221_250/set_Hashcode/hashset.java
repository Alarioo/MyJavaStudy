package day221_250.set_Hashcode;

import java.util.HashSet;
import java.util.Set;

//jdk根据对象的地址或者字符串或者数字算出来的int类型的数值
//Object类中的方法 public static int hashCode()
public class hashset {
    public static void main(String[] args){
        //已在studengt类中重写hashCode
        student_hashset s1= new student_hashset("a",1);
        student_hashset s2= new student_hashset("b",2);
        student_hashset s3= new student_hashset("a",1);
        //student student=new student("a" ,1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());//不同对象hashcode不同
        System.out.println(s3.hashCode());
        //不同对象默认hashcode不同
        System.out.println("java".hashCode());
        System.out.println("demo".hashCode());
        System.out.println("代码".hashCode());
        System.out.println("字符".hashCode());
        //有些字符串hashcode相同
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        //已对hascode equals 重写 以实现元素不重复
        Set<student_hashset> hs=new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        for(student_hashset s: hs){
            System.out.println(s.name+","+s.age);
        }
    }
}
