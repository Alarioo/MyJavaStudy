package day356.Lamda.withReturn;

public class Compute {
    public static void main(String[] args) {
    usesubtract(new Comuputeable() {
        @Override
        public int subtract(int o1, int o2) {
            return o1-o2;
        }
    });
    usesubtract((int o1,int o2)->{return o2-o1;});
    System.out.println("省略类型和retuen");
    usesubtract((o1,o2)->o1-o2);
    System.out.println("先创建接口");
    Comuputeable r=((o1,o2)-> o1-o2-o2);
    usesubtract(r);
    System.out.println("新线程");
    new Thread(()-> System.out.println("新线程的Lamda表达式.start重写Runable接口")).start();
    }
    public static void usesubtract(Comuputeable c){
        int re=c.subtract(100,200);
        System.out.println(re);
    }
}
