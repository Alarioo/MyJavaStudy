package day103_125;

public class NewMethodDemo {
    private int age;
    private String name;
    //无参构造若无其他有参构造可省略
    public NewMethodDemo(){
    }
    //有参构造
    public NewMethodDemo(int a){
        age=a;
    }
    public NewMethodDemo(int a,String n){
        age=a;
        name=n;
    }
    //成员方法
    public void show(){
        System.out.println(age+name);
    }
}
