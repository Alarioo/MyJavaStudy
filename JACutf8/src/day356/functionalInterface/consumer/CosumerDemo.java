package day356.functionalInterface.consumer;

import java.util.function.Consumer;


/*
public interface Consumer<T> {
    void accept(T t)
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };    //返回函数式接口
}
 */
public class CosumerDemo {
    public static void main(String[] args) {
        //split[i]
        opertor("Alario,23",str-> System.out.println("号码是："+str.split(",")[1]),(s)-> System.out.println(new StringBuilder(s).reverse().toString()));
        opertor("1234",System.out::println);
    }
    public static void opertor(String s, Consumer<String> con1, Consumer<String> con2){
/*      con1.accept(s);
        con2.accept(s);*/
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con1.andThen(con2));
        System.out.println(con1);
        con1.andThen(con2).accept(s);
    }
    //方法重载
    public static void opertor(String s,Consumer<String> con1){
        con1.accept(s);
    }
}
