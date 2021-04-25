package day251_273.Map;

public class student {
    public String name;
    public  int age;
    public student(){};
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student student = (student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
/*
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);

 */