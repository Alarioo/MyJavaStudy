package day386.ReflectDemo;

import java.lang.reflect.Field;
/*
    Class
        public Field[] getFields()                      获取变量
        public Field[] getDeclaredFields()
        public Field getField(String name)
        public Field getDeclaredField(String name)
    Filed
        public void set(Object obj, Object value)     变量赋值（对象，值）
 */
public class getFiled {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("day386.ReflectDemo.student");
        System.out.println("getFields---------------------------------------------");
        Field[] fs1 = c.getFields();
        show(fs1);
        System.out.println("getDeclaredFields-----------------------------------------");
        Field[] fs2 = c.getDeclaredFields();
        show(fs2);

        Object obj=c.getConstructor().newInstance();

        System.out.println("getField------------------------------------------");
        Field addressFiled = c.getField("address");
        addressFiled.set(obj,"here");
        System.out.println(obj);
        System.out.println("getDeclaredField---------------------------------------------");
        Field nameFiled = c.getDeclaredField("name");
        nameFiled.setAccessible(true);
        nameFiled.set(obj,"a");
        System.out.println(obj);
    }
    public static void show(Field[] fs){
        for (Field f:fs){
            System.out.println(f);
        }
    }
}
