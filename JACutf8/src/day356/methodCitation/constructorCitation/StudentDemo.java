package day356.methodCitation.constructorCitation;

public class StudentDemo {
    public static void main(String[] args) {
        //lamda表达式
        useStudentBuilder((name,age)->new Student(name,age));
        //引用构造器
        useStudentBuilder(Student::new);
    }
    public static void useStudentBuilder(StudentBuilder sb){
        Student st=sb.build("wakit luo",24);
        System.out.println(st.getName()+","+st.getAge());
    }
}
