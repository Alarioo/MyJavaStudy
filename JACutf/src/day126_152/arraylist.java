package day126_152;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();  //右侧<>内数据类型在jdk后课省略
        //在末尾加元素
        al.add("array");
        //在指定位置加元素
        al.add(1,"list");
        System.out.println(al);
        //修改指定位置的值
        String st=al.set(0,"list");
        System.out.println(al);
        //返回指定位置的值
        String gs=al.get(0);
        System.out.println(gs);
        //删除指定位置的值
        String rs=al.remove(0);
        System.out.println(rs);
        //删除指定元素
        Boolean s=al.remove("list");
        System.out.println(s);
        //返回当前数组大小
        int i=al.size();
        System.out.println(i);
    }

}
