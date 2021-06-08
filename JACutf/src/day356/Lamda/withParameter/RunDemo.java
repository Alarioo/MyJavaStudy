package day356.Lamda.withParameter;

public class RunDemo {
    public static void main(String[] args) {
        //匿名内部类
        userun(new Runable() {
            @Override
            public void run(String s) {
                System.out.println(s);
                System.out.println("多写一行");
            }
        });
        //lamda表达式
/*        userun((String s)->{
            System.out.println(s);
        });*/
        //只有一个参数时可以省略类型（） 代码块只有一条语句省略；{}
        userun(s-> System.out.println(s));
    }
    public static void userun(Runable r){
        r.run("userun");
    }
}
