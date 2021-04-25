package day169_194.Inner;

public class demo {
    public static void main(String[] args) {
        //public 内部类可以直接创建
        outter.inner oi=new outter().new inner();
        oi.show();
        //private 通过定义方法调用
        outter o=new outter();//private无法直接调用
        o.method();
        //匿名内部类(继承了该类或者实现雷该接口的匿名对象)      对于以接口或对象作为形参的方法无需创建新的类
        //方法一
        new jump(){
            @Override
            public void ju() {
                System.out.println("跳高");
            }
        }.ju();
        //方法二
        jump j=new jump() {
            @Override
            public void ju() {
                System.out.println("跳高高");
            }
        };
        //应用 接口对象为形参的情况 不用new一个继承或实现对象
        jumpop jum=new jumpop();
        jum.method(new jump() {
            @Override
            public void ju() {
                System.out.println("跳超高");
            }
        });
    }
}
