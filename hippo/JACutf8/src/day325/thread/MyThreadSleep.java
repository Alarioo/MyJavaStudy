package day325.thread;

public class MyThreadSleep extends Thread{

    public MyThreadSleep(){

    }
    public MyThreadSleep(String name){
        super(name);
    }
    @Override
    public  void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);        //getName
            try {
                sleep(10);                  // public static native void sleep(long millis) throws InterruptedException;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
