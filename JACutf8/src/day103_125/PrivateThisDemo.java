package day103_125;

public class PrivateThisDemo {
    private int age;
    String name;

    public int getAge() {
        return age;
    }
    public void showAge(){
        System.out.println(name+":"+(int)age);
    }
    public void setAge(int age){
        if(age<0||age>120){
            System.out.println("输入数据有误");
        }else{
            this.age=age;         //这里方法形参与成员变量相同加this指向成员变量，被哪个对象调用this.age指向哪个对象堆内存地址
        }
    }
}
