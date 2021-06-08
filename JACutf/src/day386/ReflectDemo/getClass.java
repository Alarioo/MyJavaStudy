package day386.ReflectDemo;

public class getClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<student> c1= student.class;
        System.out.println(c1);
        Class<student> c2= student.class;
        System.out.println(c1==c2); //一个类在内存中只有一个字节码文件
        //调用实例对象的getClass()方法
        student s = new student();
        Class<? extends student> c3 = s.getClass();
        System.out.println(c1==c3);
        //使用Class类中的静态forname(String className) 路径  配置文件
        Class<?> c4 = Class.forName("day386.ReflectDemo.student");
        System.out.println(c1==c4);
    }
}
