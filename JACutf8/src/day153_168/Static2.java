package day153_168;

//没有new 实例化 所以没有执行static
public class Static2 {
    public static void main(String[] args) {
        //B b=new B();   加上这句输出ABC
        System.out.print(B.c);
    }
}

class A {
    static {
        System.out.print("A");
    }
}

class B extends A {
    static {
        System.out.print("B");
    }

    public final static String c = "C";
}
