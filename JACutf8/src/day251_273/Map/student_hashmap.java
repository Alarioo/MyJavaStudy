package day251_273.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class student_hashmap {
    public static void main(String[] args){
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("b",2);
        //自定义对象 对equals和hashCode重写 不重写无法实现同键覆盖
        HashMap<student,String> h=new HashMap<>();
        h.put(s1,"兰溪");
        h.put(s2,"赏花");
        h.put(s3,"上海");     //与s2键值相同覆盖
        System.out.println(h);
        System.out.println("---------");
        it(h);
    }
        public static void it(HashMap<student,String> h){
            Set<Map.Entry<student,String>> set=h.entrySet();
            for(Map.Entry<student,String > me:set ){
                System.out.println(me.getKey().name+","+me.getKey().age+"@"+me.getValue());
            }
        }

}
