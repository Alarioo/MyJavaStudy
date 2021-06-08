package day386.ClassLoderDemo;

public class ClassLoderDemo {
    public static void main(String[] args) {
        ClassLoader c1 = ClassLoader.getSystemClassLoader();    //返回用于委派的系统类加载器
        System.out.println(c1);
        ClassLoader c2 = c1.getParent();            //返回父类加载器进行委派
        System.out.println(c2);
        ClassLoader c3 = c2.getParent();        //  Bootstrap类加载器:它是虚拟机的内置类加载器，通常表示为null ，并且没有父级。
        System.out.println(c3);
    }
}
