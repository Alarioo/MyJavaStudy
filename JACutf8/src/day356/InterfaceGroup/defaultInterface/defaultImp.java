package day356.InterfaceGroup.defaultInterface;

public class defaultImp implements defaultInterface{
    @Override
    public void show1(){
        System.out.println("对象实现接口后重新");
    }
    //可以选择不重写
    @Override
    public void show2(){
        System.out.println("重写show2");
    }
}
