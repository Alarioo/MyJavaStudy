package day356.InterfaceGroup.privateInterface;

public interface privateInterface{
    private void p1(){
        System.out.println("pshow");
        System.out.println("pshow");
    }
    private static void p2(){
        System.out.println("psshow");
        System.out.println("psshow");
    }
    default void show1(){
        System.out.println("defaultshow");
        p1();
        p2();
        System.out.println("------------------------");
    }
    static  void show2(){
        System.out.println("staticshow");
        p2();
        System.out.println("------------------------");
    }
}
