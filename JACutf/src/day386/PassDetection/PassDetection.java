package day386.PassDetection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class PassDetection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        Class<? extends ArrayList> c = arr.getClass();
        Method m = c.getMethod("add", Object.class);  //反射获得方法参数是Object类型
        m.invoke(arr,"dsd");    //越过原始对象泛型检查
        for (Object o:arr){
            System.out.println(o);
        }
    }
}
