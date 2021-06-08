package day386.ReflectDemo;

public class student {
    //私有 默认 公共 变量
    private String name;
    int age;
    public String address;

    //构造方法
    public student(){};

    private student(int age) {
        this.age = age;
    }

    student(String name){
        this.name=name;
    }


    public student(String name, int age,String addres) {
        this.name = name;
        this.age = age;
        this.address=addres;
    }
    //成员方法
    public void method1(){
        System.out.println("method1");
    }

    void method2(){
        System.out.println("method2");
    }

    private void method3(String s){
        System.out.println("method3:"+s);
    }

    //重写toString
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addres='" + address + '\'' +
                '}';
    }
}
