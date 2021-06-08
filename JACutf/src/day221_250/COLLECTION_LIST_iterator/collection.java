package day221_250.COLLECTION_LIST_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//COLLECTION 无法直接创建
/*
* void add
* boolean remove(object)
* void clear()
* boolean isEmpty()
* int size
* boolean contains
* */
public class collection {
    public static void main(String[] args){
        Collection <String> c=new ArrayList<String>();//多态创建collection
        c.add("a");
        c.add("b");
        c.add("c");

        Iterator<String> it=c.iterator();   //迭代器创建
        int i=0;
        while(it.hasNext()){            //hasNext 判断是否还有其它元素
            i++;
            String s= it.next();
            System.out.println(s);    // 返回下一个元素
        }

        show(c);
        //remove
        c.remove("c");
        show(c);
        //size
        System.out.println(c.size());
        //contains
        System.out.println(c.contains("a"));
        //clear
        c.clear();
        //isEmpty
        System.out.println(c.isEmpty());
    }
    public static void show(Collection A){
        System.out.println(A);
    }
}
