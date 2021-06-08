package day221_250.set_Hashcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");           //set 不包含重复元素
        set.add("c");
        //set没有索引方法不能用for循环 可用增强for和迭代器
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
