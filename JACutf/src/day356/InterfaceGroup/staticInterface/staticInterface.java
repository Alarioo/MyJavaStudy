package day356.InterfaceGroup.staticInterface;

public interface staticInterface {
    //public abstract void show1();
    void show1();
    //public static void show2();
    static void show2(){
        System.out.println("show2静态方法带方法体,只能由接口调用");
    };
}
