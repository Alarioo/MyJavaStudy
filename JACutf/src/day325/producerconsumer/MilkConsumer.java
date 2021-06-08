package day325.producerconsumer;

public class MilkConsumer implements Runnable{
    Box box;
    public MilkConsumer(){};
    public MilkConsumer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
