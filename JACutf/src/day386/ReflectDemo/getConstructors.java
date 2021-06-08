package day386.ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    Class
        public Constructor<?>[] getConstructors()                                    返回一个包含公共构造器对象的数组，
        public Constructor<T> getConstructor(Class<?>... parameterTypes)             返回一个公共的指定构造函数。
        public Constructor<?>[] getDeclaredConstructors()                            返回所有构造器对象的数组，
        public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)     返回一个任意指的定构造函数。
    Constructor
        public T newInstance(Object ... initargs)                                    通过构造器构造实例
    public void setAccessible(boolean flag)                                      将此反射对象的accessible标志设置为指示的布尔值,true可以访问私有内容
 */
public class getConstructors  {
    public static void main(String[] args) throws Exception {
        //获得构造器数组
        Class<?> c = Class.forName("day386.ReflectDemo.student");
        System.out.println("getConstructors()-------------");
        Constructor<?>[] cons1 = c.getConstructors();
        show(cons1);
        System.out.println("getDeclaredConstructors------------------");
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        show(cons2);
        //获取指定构造器并生成实例对象
        System.out.println("getConstructor-------------");
        Class[] parameters=new Class[3];
        parameters[0]= String.class;
        parameters[1]= int.class;
        parameters[2]= String.class;
        Constructor<?> con1 = c.getConstructor(parameters);             //返回指定公共构造器
        System.out.println(con1.newInstance("a",1,"here"));     //newInstance 创建实例对象
        Constructor<?> con2 = c.getConstructor();
        System.out.println(con2.newInstance());
        System.out.println("getDeclaredConstructor--------------");
        Constructor<?> con3 = c.getDeclaredConstructor(int.class);       //返回任意指定公共构造器
        con3.setAccessible(true);                                        //提高权限，访问私有内容
        System.out.println(con3.newInstance(2));
    }
    public static void show(Constructor<?>[] cons) {
        for (Constructor<?> con: cons){
            System.out.println(con);
        }
    }
}
