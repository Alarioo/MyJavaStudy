package day325.runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i); //不是Thread类没有getName()
        }
    }
}