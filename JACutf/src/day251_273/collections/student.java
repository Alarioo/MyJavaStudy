package day251_273.collections;

public class student implements Comparable<student> {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(student s) {
        int n = this.age - s.age;                   //先按年龄排
        int n2 = n == 0 ? this.name.compareTo(s.name) : n;     //年龄同比姓名  S
        return n2;
    }
}
//     @Override
//        public int compare(student_treeset s1,student_treeset s2){
//        int n=s1.getAge()-s2.getAge();
//         return n==0? s1.getName().compareTo(s2.getName()):n;
//     }
//    }
/*
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);

 */