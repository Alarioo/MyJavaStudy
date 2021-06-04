package day356.functionalInterface.function;

import java.util.function.Function;
/*
    R apply(T t);将此函数应用于给定的参数。
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before)返回一个组合函数，该函数首先将 before函数应用于其输入，然后将此函数应用于结果。
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {返回首先将此函数应用于其输入的 after函数，然后将 after函数应用于结果。
    static <T> Function<T, T> identity() {返回一个始终返回其输入参数的函数。
 */
public class functionDemo {
    public static void main(String[] args) {
        String str="aaa,23";
        System.out.println(getStart(str,s -> s.split(",")[1],Integer::parseInt,i->i+6));
    }
    public static int getStart(String s,Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
}
