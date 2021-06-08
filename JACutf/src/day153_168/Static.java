package day153_168;

public class Static {
    public static void main(String[] args) {
        //静态修饰变量共享
        Ye.age=10;  //通过类名调用 推荐
        Ye y1=new Ye();
        Ye y2=new Ye();
        System.out.println(y1.getAge());
        System.out.println(y2.getAge());
        y1.age=20;      //通过对象调用
        System.out.println(y1.getAge());
        System.out.println(y2.getAge());
        System.out.println(Ye.b);//静态代码块内赋值
        //show();   静态方法只能访问静态方法变量 非静态都可以 但是new出来的对象例外 被分配了单独内存空间
    }
    public void show(){
        System.out.println("a");
        //System.out.println(this.b);
    }
}

