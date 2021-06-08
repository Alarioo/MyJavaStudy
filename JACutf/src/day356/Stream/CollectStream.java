package day356.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    collect(Collector<? super T,A,R> collector)
    static <T> Collector<T,?,List<T>> toList()
    static <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
    static <T> Collector<T,?,Set<T>> toSet()
 */
public class CollectStream {
    public static void main(String[] args) {
        // toList
        List<String> ls=new ArrayList<>();
        ls.add("aaaa");
        ls.add("bb");
        ls.add("ccc");
        List<String> ls2=ls.stream().filter(s -> s.length()>2).collect(Collectors.toList());
        System.out.println(".collect(Collectors.toList())-------------------");
        for (String s:ls2){
            System.out.println(s);
        }
        // toSet
        Set<String> se=new HashSet<>();
        se.add("22");
        se.add("25");
        se.add("29");
        Set<String> se2=se.stream().filter(s -> Integer.parseInt(s)>25).collect(Collectors.toSet());
        System.out.println(".collect(Collectors.toSet())-------------------------");
        for (String s:se2){
            System.out.println(s);
        }
        // toMap
        String[] str={"a,222","v,23","b,233"};
        Stream<String> s1=Stream.of(str).filter(s -> Integer.parseInt(s.split(",")[1])>100);
        Map<String,Integer> hm = s1.collect(Collectors. toMap(s -> s.split(",")[0],s->Integer.parseInt(s.split(",")[1])));
        System.out.println("s1.collect(Collectors. toMap(f1,f2)-----------------");
        Set<String> key=hm.keySet();
        for(String s:key){
            System.out.println(s+","+hm.get(s));
        }
    }
}
