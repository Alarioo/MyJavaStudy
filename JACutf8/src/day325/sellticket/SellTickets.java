package day325.sellticket;
/*
数据安全问题
是否多线程
是否有共享数据
是否有多条语句操作共享数据
 */
public class SellTickets<sellTickets> implements Runnable{
    private static int ticketsNumber=100;
    // private  int ticketsNumber=100;      // 普通方法
    //private Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            if(Thread.currentThread().getName().equals("1")){
                // 同步代码块 代码块内代码只能有一个线程在执行
                synchronized (SellTickets.class){       //同步静态方法
                //synchronized (this) {     // 同步普通方法
                    if (ticketsNumber > 0) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("窗口" + Thread.currentThread().getName() + "卖出第" + ticketsNumber + "张票");
                        ticketsNumber--;
                    }
                }
            }else{
                sell();
            }

        }
    }
    public static synchronized void sell(){     //同步静态方法
    //public synchronized void sell(){  //同步普通方法
        if (ticketsNumber > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "卖出第" + ticketsNumber + "张票");
            ticketsNumber--;
        }
    }
}
