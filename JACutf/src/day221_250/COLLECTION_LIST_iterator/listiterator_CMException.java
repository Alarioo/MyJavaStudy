package day221_250.COLLECTION_LIST_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiterator_CMException {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add(1,"e");
        //show(l);
        show2(l);
    }
//    public static void show(List<String> l) {   //ConcurrentModificationException
//        Iterator<String> it = l.iterator();
//        l.add("d");     //list add 后modcount改变
//        it.next();      //next 判断excepmodcount是否等于modcount
//    }
    public static void show2(List<String> l) {
        ListIterator<String> lit=l.listIterator();
        while (lit.hasNext()) {
            lit.next();
        }
        lit.add("f");       //ListIterator的add不会改变exceptmodcount
        System.out.println(l);
        String s=lit.previous();    //反向遍历 若无next在前指针向0
        while (lit.hasPrevious()) {
            s=s+lit.previous()+",";
        }
        System.out.println(s);
    }

}
