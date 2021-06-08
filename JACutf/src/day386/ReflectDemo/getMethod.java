package day386.ReflectDemo;

import java.lang.reflect.Method;
/*

 */
public class getMethod {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("day386.ReflectDemo.student");
        System.out.println("getMethods----------------------------------");
        Method[] ms1 = c.getMethods();
        show(ms1);
        System.out.println("getDeclaredMethods----------------------------------");
        Method[] ms2 = c.getDeclaredMethods();
        show(ms2);

        Object obj = c.getConstructor().newInstance();

        Method m1 = c.getMethod("method1");
        m1.invoke(obj);
        Method m3 = c.getDeclaredMethod("method3", String.class);
        m3.setAccessible(true);
        m3.invoke(obj,"parameter");


    }
    public static void show(Method[] ms){
        for(Method m:ms){
            System.out.println(m);
        }
    }
}
