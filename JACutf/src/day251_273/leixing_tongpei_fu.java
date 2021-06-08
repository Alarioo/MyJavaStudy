package day251_273;
import java.util.ArrayList;
import java.util.List;

/*
对泛型对象操作
List<String> l=new ArrayList<String>();
或者
List<Integer> l=new ArrayList<Integer>();
...
public static fun(List<?> l){
    ...
}

 */
public class leixing_tongpei_fu {
    public static void main(String[] args){
        //类型通配符<?>
        List<?> l1=new ArrayList<Object>();
        List<?> l2=new ArrayList<Number>();
        List<?> l3=new ArrayList<Integer>();

        //<? extends 类型>   类型及其子类
        //List<? extends Number> le1=new ArrayList<Object>();     //为父类 编译错误
        List<? extends Number> le2=new ArrayList<Number>();
        List<? extends Number> le3=new ArrayList<Integer>();

        //<? super 类型>      类型及其父类
        List<? super Number> ls1=new ArrayList<Object>();
        List<? super Number> ls2=new ArrayList<Number>();
       // List<? super Number> sl3=new ArrayList<Integer>();         //为子类 编译错误
    }
}
