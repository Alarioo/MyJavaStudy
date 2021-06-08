package day169_194.Abstract;
//抽象类
public abstract class animal {
    int age;
    //构造方法

    public animal() {
    }

    public animal(int age) {
        this.age = age;
    }

    //抽象方法
    public abstract void eat();
    //具体方法
    public void sleep(){
        System.out.println("睡觉");
    }
}
