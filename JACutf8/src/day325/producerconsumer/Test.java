package day325.producerconsumer;

public class Test {
    public static void main(String[] args){
        Box box=new Box();
        Producer producer=new Producer(box);
        MilkConsumer milkConsumer =new MilkConsumer(box);
        Thread t1=new Thread(producer);
        Thread t2=new Thread(milkConsumer);
        t1.start();
        t2.start();
    }
}
