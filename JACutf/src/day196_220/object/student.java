package day196_220.object;

public class student {
    String name;

    public student(String name) {
        this.name = name;
    }

    public student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    //重写超类object中的toString方法
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                '}';
    }
    //重equals
    @Override
    public boolean equals(Object o) {   //向上转型为object s2
        if (this == o) return true;         //this -----s1
        if (o == null || getClass() != o.getClass()) return false; //是否为null或不为同一类（字节码文件）

        student student = (student) o;  //向下转型  student s2

        return name != null ? name.equals(student.name) : student.name == null; //A?B:C 如果A真执行B否则执行C
    }
}