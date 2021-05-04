package day274.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
java.lang.Object
java.util.Dictionary<K,​V>
java.util.Hashtable<Object,​Object>
java.util.Properties
 */
//存在意义可以与Io Properties可以保存到流中或从流中加载。 属性列表中的每个键及其对应的值都是一个字符串。
public class properties {
    public static void main(String[] args) throws IOException {
        //用hashmap方法   没有泛型 Map     都用Object
        System.out.println("hashmap------------");
        Properties p0=new Properties();
        p0.put(1,"ayi");
        p0.put(2,"ber");
        Set<Object> keys=p0.keySet();
        for(Object key:keys){
            System.out.println(key+","+p0.get(key));
        }
        //特有方法
        // Object setProperty(String key, String value)
        System.out.println("特有方法-------------");
        Properties p=new Properties();
        //Object setProperty(String key, String value)
        p.setProperty("01","ayi");
        p.setProperty("02","ber");
        //Set<String> stringPropertyNames() 返回不可修改键集
        Set<String> s=p.stringPropertyNames();
        for(String str:s){
            //String getProperty(String key)
             System.out.println(p.getProperty(str));
        }
        /*
         void store(Writer writer, String comments)
         void store(OutputStream out, String comments)
         */
        System.out.println("IO流--------------");
        FileWriter f=new FileWriter("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\Properties\\Class.txt");
        p.store(f,null);
        f.close();
        /*
        void load(Reader reader)
        void load(InputStream inStream)
         */
        FileReader fr=new FileReader("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\Properties\\Class.txt");
        p.load(fr);
        fr.close();
        System.out.println(p);
    }
}
