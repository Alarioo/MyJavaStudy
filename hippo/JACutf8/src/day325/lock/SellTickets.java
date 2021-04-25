package day325.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SellTickets implements Runnable {
    private int ticketsNumber=100;
    private Lock lo=new ReentrantLock();
    public void run(){
        while (true){
            try{
                lo.lock();
                if(ticketsNumber>0){
                    System.out.println("窗口" + Thread.currentThread().getName() + "卖出第" + ticketsNumber + "张票");
                    ticketsNumber--;
                }

            }finally {
                lo.unlock();
            }


        }
    }
}
