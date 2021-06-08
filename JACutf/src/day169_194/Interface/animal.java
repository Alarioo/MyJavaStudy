package day169_194.Interface;
public abstract class animal{
    //变量
    String name;
    //构造
    public animal() {
    }

    public animal(String name) {
        this.name = name;
    }
    //读写
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    //方法
    public abstract void eat();
}
