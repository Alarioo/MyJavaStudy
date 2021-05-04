package day126_152;

public class MyStudent {
    //定义成员变量
    private  String name;
    private int age;
    public MyStudent(){
    }
    //构造方法
    public MyStudent(String name){
        this.name=name;
    }
    //成员方法
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName() {
        return name;
    }
    public int  getAge(){
        return age;
    }

}
