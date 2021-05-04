package day169_194.multistates;
//多态编译父类但可执行重写方法
public class demo {
    public static void main(String[] args) {
        animal c=new cat();
        System.out.println(c.age); //输出animal参数
        //c.weight=10;
        c.eat();
        //c.play();
        animal d=new dog();
        d.eat();

        animaloprate a=new animaloprate();
        a.ao(c);
        a.ao(d);

        cat ca=(cat) c; //  向下转换
        ca.play();
    }
}
