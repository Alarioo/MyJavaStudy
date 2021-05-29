package day356.methodCitation.comparatorDEMO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("ddddd");
        s1.add("aaaa");
        s1.add("bbbbbbbbb");
        System.out.println("排序前："+s1);
        Collections.sort(s1);
        System.out.println("排序后："+s1);
        Collections.sort(s1,getComparator());       //函数式接口作为返回值
        System.out.println("重写比较器:"+s1);
    }
    public static Comparator<String> getComparator(){
/*        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };*/
        return (o1,o2)->o1.length()-o2.length();
    }
}
