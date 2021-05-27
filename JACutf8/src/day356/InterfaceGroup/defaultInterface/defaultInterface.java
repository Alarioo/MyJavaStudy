package day356.InterfaceGroup.defaultInterface;

public interface defaultInterface {
    //public abstract void show1();
    void show1();
    //public default void show2();
    default void show2(){
        System.out.println("show2默认方法带方法体,可以选择不重写");
    };

}
