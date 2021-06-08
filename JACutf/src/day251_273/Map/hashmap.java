package day251_273.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"c");
        h.put(1,"a");       //覆盖前值
        h.put(2,"b");
        h.put(3,"c");
        it(h);
        System.out.println("---------");
        it2(h);
        System.out.println(h);
        System.out.println("h.get(2)\t"+h.get(2));
        System.out.println("h.keySet()\t"+h.keySet());
        System.out.println("h.values()\t"+h.values());
        System.out.println("h.containsKey(1)\t"+h.containsKey(1));
        System.out.println("h.containsValue(\"a\")\t"+h.containsValue("a"));
        System.out.println("h.size()\t"+h.size());
        h.remove(2);
        System.out.println("h.remove(2)\t"+h);
        h.clear();
        System.out.println("h.clear();h.isEmpty()\t"+h.isEmpty());
    }
    //遍历方法一 键集合 对应 值集合
    public static void it(HashMap<Integer,String> h){
        System.out.println("Set<Integer> s=h.keySet();");
        Set<Integer> s=h.keySet();
        for(int i:s){
            System.out.println(i+","+h.get(i));
        }
    }
    //遍历方法2 返回键值对象集合
    public static void it2(HashMap<Integer,String> h){
        System.out.println("Set<Map.Entry<Integer,String>> s=h.entrySet();");
        Set<Map.Entry<Integer,String>> s=h.entrySet();  //键值对集合
        for(Map.Entry<Integer,String> me:s){
            System.out.println(me.getKey()+","+me.getValue());
        }
    }

}
