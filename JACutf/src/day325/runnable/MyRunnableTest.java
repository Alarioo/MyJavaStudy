package day325.runnable;

public class MyRunnableTest {
    public static void main(String[] args) {
        /*
        Runnable作为接口给implements的类留出继承其它父类的空间(java单继承)
        该段代码可通过构造，被多个线程Thread调用
         */
        MyRunnable mr=new MyRunnable();
        // public Thread(Runnable target, String name) {
        Thread t1=new Thread(mr,"高铁");
        Thread t2=new Thread(mr,"飞机");
        t1.start();
        t2.start();
    }
}
