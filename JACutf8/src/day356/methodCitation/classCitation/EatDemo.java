package day356.methodCitation.classCitation;

public class EatDemo {
    public static void main(String[] args) {
        //lamda表达式
        useEat(s-> System.out.println(s));
        //引用方法类
        useEat(System.out::println);
    }
    public static void useEat(eatble e){
        e.eat("apple");
    }
}

