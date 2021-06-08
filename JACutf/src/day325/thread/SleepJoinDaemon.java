package day325.thread;

import java.util.Scanner;

public class SleepJoinDaemon {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        MyThreadSleep ms1=new MyThreadSleep("A");
        MyThreadSleep ms2=new MyThreadSleep("B");
        MyThreadSleep ms3=new MyThreadSleep("C");
        System.out.println("Threadsleep------结束后任意键继续");
        ms1.start();                             //写在run方法中 线程停止几毫秒执行
        ms2.start();
        ms3.start();
        sc.nextLine();
        System.out.println("join------结束后任意键继续");
        MyThread m1=new MyThread("a");
        MyThread m2=new MyThread("b");
        MyThread m3=new MyThread("c");
        m1.start();
        m2.start();
        m2.join();      //等该开始的进程结束其它才继续执行public final void join() throws InterruptedException
        m3.start();
        sc.nextLine();
        System.out.println("Daemon------");
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(10);
        MyThread md1=new MyThread("支线1");
        MyThread md2=new MyThread("支线2");
        md1.setDaemon(true);                //setDaemon 在主线程结束后会 很快 结束
        md2.setDaemon(true);
        md1.start();
        md2.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }



    }
    public static void join(){

    }
}
