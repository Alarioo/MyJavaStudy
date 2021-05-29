package day356.functionalInterface.consumer;

import java.util.function.Consumer;


/*
void accept(T t)
default Consumer<T> andThen (Consumer after)
 */
public class CosumerDemo {
    public static void main(String[] args) {
        opertor("123456",System.out::println,(s)-> System.out.println(new StringBuilder(s).reverse().toString()));
        opertor("1234",System.out::println);
    }
    public static void opertor(String s, Consumer<String> con1, Consumer<String> con2){
/*        con1.accept(s);
        con2.accept(s);*/
        con1.andThen(con2).accept(s);
    }
    //方法重载
    public static void opertor(String s,Consumer<String> con1){
        con1.accept(s);
    }
}
