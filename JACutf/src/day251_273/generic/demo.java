package day251_273.generic;

public class demo {
    public static void main(String[] args) {
        gen <Integer> g1=new gen<Integer>(1);
        gen <String> g2=new gen<String>("sd");
        //泛型类
        System.out.println(g1.getT());
        System.out.println(g2.getT());
        //泛型方法
        g2.show(true);
        g2.show(12);
        g2.show("sda");
        //泛型接口
        g2.ishow("oooo");
    }
}
