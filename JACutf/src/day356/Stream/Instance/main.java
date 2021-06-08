package day356.Stream.Instance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<String> ls1=new ArrayList<>();
        ls1.add("a111");
        ls1.add("c111");
        ls1.add("aa");
        List<String> ls2=new ArrayList<>();
        ls2.add("b222");
        ls2.add("b22");
        ls2.add("aa");
/*        //以“a”开头,且长度大于3
        Stream<String> s1=ls1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()>3);
        //跳过第1个，且以“b”开头
        Stream<String> s2=ls2.stream().skip(1).filter(s -> s.startsWith("b"));
        //合并流
        Stream<String> s3=Stream.concat(s1,s2);
        //通过map将流映射成对象
        Stream<Str> s4=s3.map(Str::new);
        //遍历输出,已经重写toSTRING
        s4.forEach(p -> System.out.println(p));*/
        Stream.concat(ls1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()>3),
                ls2.stream().skip(1).filter(s -> s.startsWith("b"))).
                map(Str::new).forEach(p -> System.out.println(p));
    }
}
