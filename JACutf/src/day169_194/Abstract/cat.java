package day169_194.Abstract;
//抽象类不能直接实列化 必须重写所有抽象方法或者本身是抽象类
public class cat extends animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
