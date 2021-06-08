package day169_194.Abstract;

public class Demo {
    public static void main(String[] args) {
        animal c=new BorderCollie();//多态创建
        //c.sleep();
        c.eat();

        cat cc=new cat();//非多态创建
        cc.sleep();
        cc.eat();
    }
}
