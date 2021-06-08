package day356.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream<T> filter(Predicate<? super T> predicate);
    Stream<T> skip(long n); 在丢弃流的第一个 n元素后，返回由此流的其余元素组成的流
    Stream<T> limit(long maxSize); 。返回由此流的元素组成的流，截断长度不超过 maxSize 。
    public static IntStream concat(IntStream a, IntStream b) 创建一个延迟连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
    Stream<T> distinct();去重 返回由此流的不同元素（根据 Object.equals(Object) ）组成的流。
    Stream<T> sorted(); 返回由此流的元素组成的流，按照自然顺序排序 或者Stream<T> sorted(Comparator<? super T> comparator)
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);  返回 DoubleStream其中包含将给定函数应用于此流的元素的结果。
    IntStream mapToInt(ToIntFunction<? super T> mapper);返回 IntStream其中包含将给定函数应用于此流的元素的结果。
    void forEach(Consumer<? super T> action);
 */
public class MidOpStream {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("aaaa");
        ls.add("bbb");
        ls.add("ab");
        ls.add("aac");
        //filters
        System.out.println("filter-----------------");
        ls.stream().filter( s->s.startsWith("a")).filter( s->s.length()>2).forEach(System.out::println);
        //skip().limit()
        System.out.println("limit----------------");
        ls.stream().limit(2).forEach(System.out::println);
        System.out.println("skip----------------");
        ls.stream().skip(2).forEach(System.out::println);
        //distinct().sorted()
        System.out.println("concat------------");
        Stream s1=ls.stream().limit(3);
        Stream s2=ls.stream().skip(2);
        //Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println("distinct----------------");
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
        //sorted
        System.out.println("自然排序--------");
        ls.stream().sorted().forEach(System.out::println);
        System.out.println("自定义长度与自然排序-----------");
        ls.stream().sorted((o1,o2)-> {
            int n = o1.length()-o2.length();
            int n2 = n==0?o1.compareTo(o2):n;
            return n2;}
        ).forEach(System.out::println);
        //map().mapToInt()
        ls.clear();
        ls.add("10");
        ls.add("20");
        ls.add("30");
        System.out.println("map---------------------");
        ls.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("mapToInt-------------------");
        int result = ls.stream().mapToInt(Integer::parseInt).sum();     //返回InStream类有 int sum();等方法
        System.out.println(result);
    }
}
