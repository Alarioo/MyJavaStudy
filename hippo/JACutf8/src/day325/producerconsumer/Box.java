package day325.producerconsumer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box  {
    private int milk;
    private boolean state=false;
    public synchronized void put(int milk){
        if (state) {
            try{
                wait();             // void wait() 写在同步方法中 导致当前线程等待 知道另一个线程调用该对象的notify()或notifyAll()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");
        state=true;
        notifyAll();                //唤醒正在等待对象监视器的单个线程
    }
    public synchronized void get(){
        if (!state) {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者将第"+milk+"瓶奶从奶箱取走");
        state=false;
        notifyAll();
    }
}
