package day386.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/*
    1.Collection体系默认方法。stream()
        Map体系间接得到
    2.数组通过Stream接口的静态方法 of (T ... Value)
 */
public class CreateStream {
    public static void main(String[] args) {
        //1
        List<String> l=new ArrayList<>();
        Stream<String> ls=l.stream();
        //2
        Map<String,Integer> m=new HashMap<>();
        Stream<String> stream = m.keySet().stream();        //键集合生成流
        Stream<Integer> stream1 = m.values().stream();      //值集合生成流
        Stream<Map.Entry<String, Integer>> stream2 = m.entrySet().stream();        //键值对生成流
        //3
        String[] str={"A","B","C"};
        Stream<String> str1 = Stream.of(str);
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
    }
}
