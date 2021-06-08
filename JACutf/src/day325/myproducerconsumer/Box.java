package day325.myproducerconsumer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box  {
    private int bottles;
    Lock lo1=new ReentrantLock();
    Lock lo2=new ReentrantLock();
    public int getBottles() {
        return bottles;
    }

/*    public synchronized void setBottles(String user){
        try {
            lo.lock();
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(user.equals("生产商")){
                if(bottles<3){
                    bottles=3;
                    System.out.println(Thread.currentThread().getName()+"生产牛奶,奶箱现有"+bottles+"瓶奶");
                }else{
                    System.out.println("生产商上门发现奶箱满了");
                }
            }else if(bottles>0){
                    bottles--;
                    System.out.println(Thread.currentThread().getName() + "取走牛奶,奶箱现有" + bottles + "瓶奶");
            }else{
                System.out.println("消费者发现奶箱空了");

            }
        }finally {
            //System.out.println(user+"unlock");
            lo.unlock();
        }
    }*/

    public synchronized void putBottles() {
            if (bottles<5) {
                bottles++;
                System.out.println(Thread.currentThread().getName()+"生产牛奶,奶箱现有"+bottles+"瓶奶");
            } else  {
                notifyAll();
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public synchronized void takeBottles(){
            if (bottles>0) {        //写在lock内
                bottles--;
                System.out.println(Thread.currentThread().getName() + "取走牛奶,奶箱现有" + bottles + "瓶奶");
            } else {
                notifyAll();
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
