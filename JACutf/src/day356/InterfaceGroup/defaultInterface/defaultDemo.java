package day356.InterfaceGroup.defaultInterface;

public class defaultDemo {
    public static void main(String[] args) {
        new defaultInterface(){
            @Override
            public void show1() { System.out.println("内部类重写show1,后show2"); }
        }.show2();
        new defaultImp().show1();
        new defaultImp().show2();
    }

}
