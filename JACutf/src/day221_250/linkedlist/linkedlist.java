package day221_250.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
/*
*增删列表首尾元素
*public void addFirst(E e)
*public void addlast(E e)
*public E getFirst()
*public E getLast()
*public E removeFirst()
*public E removeLast()
* */
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<student> ll=new LinkedList<>();
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);
        ListIterator<student> lit=ll.listIterator();
        System.out.println("增强for");
        for(student s: ll){
            System.out.println(s.name+","+s.age);
        }
        System.out.println("listiterator");
        while(lit.hasNext()){
            student s=lit.next();
            System.out.println(s.hashCode());
            System.out.println(s.name+","+s.age);
        }
        System.out.println("for循环");
        for(int i=0;i<ll.size();i++){
            student s=ll.get(i);
            System.out.println(s.name+","+s.age);
        }
        System.out.println(s1.equals(s2));
    }
}
