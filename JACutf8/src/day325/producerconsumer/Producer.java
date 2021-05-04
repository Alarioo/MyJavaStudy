package day325.producerconsumer;

public class Producer  implements Runnable{
    Box box;
    public Producer(){};
    public Producer(Box box){
        this.box=box;
    }
    @Override
    public void run(){
        while(true){
            for (int i=1;i<=10;i++) {
                box.put(i);
            }
        }
    }
}
