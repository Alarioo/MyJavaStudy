package day221_250.COLLECTION_LIST_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* boolean add(index i,E e)
* set(index i,E e)
* remove(index i,E e)
* get(index i,E e)
* */
//iterator生成后不能对list add 但是listiterator可以add 还可以反向
public class lisT {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();

        l.add("b");
        l.add("c");
        l.add(0, "a");
        show(l);
        l.set(1,"a");
        show(l);
        l.remove(1);
        show2(l);
        System.out.println(l.get(1));

    }

    public static void show(List<String> l) {
        Iterator<String> it = l.iterator();
        String s = "";
        while (it.hasNext()) {
            s = s + it.next() + ",";
        }
        System.out.println(s);
    }
    public static void show2(List<String> l) {
        String s = "";
        for(int i=0;i<l.size();i++){
            s=s+l.get(i)+",";
        }
        System.out.println(s);
    }
}