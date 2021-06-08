package day325.thread;

public abstract class ThreadTest {
    public static void main(String[] args) {
    MyThread m1=new MyThread();
    m1.setName("高铁");
    MyThread m2=new MyThread("飞机");     //带参构造 重写类构造
     //run
/*    System.out.println("直接调用run");
    m1.run();
    m2.run();*/
       //start
/*    System.out.println("start---------");
    m1.start();         //启动
    m2.start();*/
        // currentThread
/*    System.out.println("------------");
    //public static native Thread currentThread(); 获取当前线程
    System.out.println(Thread.currentThread().getName());*/
        System.out.println("优先级---------");         //优先级只代表概率
//        System.out.println(m1.MAX_PRIORITY);       //10 最高优先级
//        System.out.println(m1.MIN_PRIORITY);       //1  最低优先级
//        System.out.println(m1.NORM_PRIORITY);      //5   默认
        m1.setPriority(10);
        m2.setPriority(1);
        System.out.println(m1.getPriority());
        m1.start();
        m2.start();
    }
}
