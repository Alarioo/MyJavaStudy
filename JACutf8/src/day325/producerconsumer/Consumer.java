package day325.producerconsumer;

public class Consumer  implements Runnable{
    Box box;
    public  Consumer(){};
    public Consumer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
