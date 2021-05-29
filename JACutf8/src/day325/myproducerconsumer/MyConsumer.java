package day325.myproducerconsumer;

public class MyConsumer  implements Runnable{
    Box box;
    public  MyConsumer(){};
    public MyConsumer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            box.takeBottles();
        }
    }
}
