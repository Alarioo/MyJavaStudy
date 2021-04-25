package day169_194.multistates;

public class cat extends animal{
    int age=20;
    int weight;
    public cat() {
        super();
    }

    public cat(String name) {
        super(name);
    }
    public  void play(){
        System.out.println("play");
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
