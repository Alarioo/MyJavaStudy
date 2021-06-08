package day221_250.set_Hashcode;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args){
        student_treeset s1= new student_treeset("a",1);
        student_treeset s2= new student_treeset("b",3);
        student_treeset s3= new student_treeset("c",2);
        student_treeset s4= new student_treeset("c",2);
        student_treeset s5= new student_treeset("d",2);
        //由对象继承Comparable 重写compare 无参构造
       TreeSet<student_treeset> ts=new TreeSet<>();
        //带参构造 匿名内部类重写参数接口CompareTo中方法compare
//        TreeSet<student_treeset> ts = new TreeSet<student_treeset>(new Comparator<student_treeset>() {
//            public int compare(student_treeset s1, student_treeset s2) {
//                int n = s1.getAge() - s2.getAge();
//                return n == 0 ? s1.getName().compareTo(s2.getName()) : n;
//            }
//      });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (student_treeset s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
