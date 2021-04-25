package day103_125;

public class ClassObjectTest {
    public static void main(String[] args){
        //创建对象 类名 变量名 = new 类名（）
        ClassObjectDemo huawii=new ClassObjectDemo();
        ClassObjectDemo apple=new ClassObjectDemo();
        //设置对象变量初始值否则为数据类型默认值   对象名.属性=变量
        huawii.type="mate";
        huawii.price=1000;
        apple.type="iphone";
        apple.price=1000;
        //输出对象变量属性          对象目.变量
        System.out.println(huawii.type);
        System.out.println(apple.type);
        //执行成员方法            对象名。方法()
        huawii.call();
        apple.call();
        double m=apple.act(0.8);
        System.out.println(m);
    }
}
