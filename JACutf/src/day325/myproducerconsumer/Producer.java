package day325.myproducerconsumer;

public class Producer  implements Runnable{
    Box box;
    public Producer(){};
    public Producer(Box box){
        this.box=box;
    }
    @Override
    public void run(){
        while(true){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            box.putBottles();
        }
    }
}
