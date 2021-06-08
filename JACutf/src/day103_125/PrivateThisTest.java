package day103_125;

public class PrivateThisTest {
    public static void main(String[] args){
        PrivateThisDemo p=new PrivateThisDemo();
        System.out.println("输出默认值");
        System.out.println(p.name);
        //System.out.println(p.age);       //age被设为private只能在类中访问如下
        p.showAge();                       //通过方法输出
        System.out.println("赋值后");
        p.setAge(10);                        //有private方法赋值
        p.name="（￣。。￣）";                //无private普通对象名.属性赋值
        int nl=p.getAge();                  //有private   数据类型 变量=对象名.属性取值   getAge中this.age 指向p的堆内存地址
        String mz=p.name;                   //无private   数据类型 变量=对象名.属性取值
        System.out.println("年龄："+nl);
        System.out.println("名字："+mz);
    }
}
