package day169_194.Interface;
//可实现多个接口
public class cat extends animal implements jump,swim{
    //构造
    public cat(){
        super();
    }
    public cat(String name){
        super(name);
    }
    //重写抽象接口
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumpp() {
        System.out.println("猫跳高");
    }

    @Override
    public void swimm() {
        System.out.println("猫游泳");
    }
}
