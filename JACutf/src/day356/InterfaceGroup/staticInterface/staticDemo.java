package day356.InterfaceGroup.staticInterface;

public class staticDemo {
    public static void main(String[] args) {
        staticImp s=new staticImp();
        s.show1();
        staticInterface.show2();    //静态方法只能由接口调用
    }
}
