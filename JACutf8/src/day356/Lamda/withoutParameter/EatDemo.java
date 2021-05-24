package day356.Lamda.withoutParameter;

public class EatDemo {
    public static void main(String[] args){
        //实现类继承接口
        EatClass ec=new EatClass();
        ec.eat();
        //匿名内部类
        useeat( new Eatble(){
            @Override
            public void eat() {
                System.out.println("内部类重写eat");
            };
        });
        /*lamda表达式
        (形式参数)->{代码块}
        */
        useeat(()->{
            System.out.println("lamda表达式");
        });
        useeat(()-> System.out.println("只有一行可以省去{}"));
    }
    public static void useeat(Eatble e){
        e.eat();
    }
}
