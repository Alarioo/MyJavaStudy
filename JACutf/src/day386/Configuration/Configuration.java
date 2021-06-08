package day386.Configuration;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Configuration {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //加载配置文件
        Properties p=new Properties();
        FileReader fr=new FileReader("JACutf8\\src\\day386\\Configuration\\Source.txt");
        p.load(fr);
        fr.close();
        //获得配置参数
        Class<?> c = Class.forName(p.getProperty("ClassPath"));        //类路径
        Method m = c.getDeclaredMethod(p.getProperty("MethodName"), String.class);      //成员方法
        //创建实例 ，方法
        Constructor<?> con = c.getConstructor();
        Object obj=con.newInstance();
        m.setAccessible(true);
        m.invoke(obj,p.getProperty("MethodParameter"));       //方法参数
    }
}
