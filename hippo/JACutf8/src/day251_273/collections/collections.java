package day251_273.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collections {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(30);
        l.add(40);
        l.add(10);
        l.add(25);
        System.out.println("l:"+l);
        Collections.sort(l);
        System.out.println("sort:"+l);
        Collections.reverse(l);
        System.out.println("reverse:"+l);
        Collections.shuffle(l);
        System.out.println("shuffle:"+l);
        System.out.println("------------");
        student s1= new student("aa",26);
        student s2= new student("abb",23);
        student s3= new student("c",25);
        student s4= new student("ac",23);
        List<student> ls=new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        Collections.sort(ls , new Comparator<student>(){
            @Override
            public  int compare(student s1,student s2){
                int n1=s1.getAge()-s2.getAge();
                int n=n1==0?s1.getName().compareTo(s2.getName()):n1;
                return n;
            }
        });
        for(student s:ls){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
