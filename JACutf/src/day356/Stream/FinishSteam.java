package day356.Stream;

import java.util.ArrayList;
import java.util.List;
/*
  void forEach(Consumer<? super T> action); 对此流的每个元素执行操作。
  long count(); 返回此流中元素的数量。
 */
public class FinishSteam {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("aa");
        ls.add("bb");
        ls.add("aa");
        System.out.println("forEach--------------");
        ls.stream().forEach(System.out::println);
        System.out.println("count--------------");
        System.out.println(ls.stream().count());
    }
}
