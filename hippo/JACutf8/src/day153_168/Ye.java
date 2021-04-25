package day153_168;
//支持多层继承不支持多个继承
public class Ye {
    private String name;
    static int age,b;
    static {    //静态代码块只在初次加载执行 但不会给块内所有语句在堆内存分配地址
         b=1;
        System.out.println("静态");
    }
    //构造
    public Ye(){
        System.out.println("访问爷无参构造");
    }

    public Ye(String name, int age) {
        this.name = name;
        Ye.age = age;   //静态变量赋值
        System.out.println("访问爷有参构造");
    }
    //get and set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //method
    public void show(){
        System.out.println("Ye");
    }

}
