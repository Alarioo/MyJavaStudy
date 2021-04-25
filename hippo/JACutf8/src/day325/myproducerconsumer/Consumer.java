package day325.myproducerconsumer;

public class Consumer  implements Runnable{
    Box box;

    public  Consumer(){};
    public Consumer(Box box) {
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
