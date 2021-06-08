package day221_250.set_Hashcode;

public class student_hashset {
    public String name;
    public  int age;
    public student_hashset(){};
    public student_hashset(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int f(){
        System.out.println(age*10);
        return age;
    }
    @Override       //重写比较对象内容 默认== ；String默认重写
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        student_hashset student = (student_hashset) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override      //使内容相同对象hascode相同
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

}
/*源码
    public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            hash = h = isLatin1() ? StringLatin1.hashCode(value)
                                  : StringUTF16.hashCode(value);
        }
        return h;
    }
 */