package day386.Stream;

import java.util.ArrayList;
import java.util.List;

/*
    Stream<T> filter(Predicate<? super T> predicate);
    Stream<T> skip(long n); 返回由此流的元素组成的流，截断长度不超过 maxSize 。
    Stream<T> limit(long maxSize); 在丢弃流的第一个 n元素后，返回由此流的其余元素组成的流。
    public static IntStream concat(IntStream a, IntStream b) 创建一个延迟连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
    Stream<T> distinct(); 返回由此流的不同元素（根据 Object.equals(Object) ）组成的流。
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
        ls.stream().filter( s->s.startsWith("a")).filter( s->s.length()>2).forEach(System.out::println);
        //ls.stream().skip().limit().distinct().sorted().map().mapToInt().concat()
    }
}
