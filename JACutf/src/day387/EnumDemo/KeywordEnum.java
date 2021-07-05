package day387.EnumDemo;
/*
 关键字enum
 关键字enum创建的枚举类继承class java.lang.Enum 默认重写toString
 */
public class KeywordEnum {
    public static void main(String[] args) {
        Status1 s1=Status1.Receive;
        Status1 s2=Status1.Revise;
        Status1 s3=Status1.Accept;
        System.out.println(s1+"\n"+s2+"\n"+s3);

        System.out.println(Status1.class.getSuperclass());

        //values() 获得枚举类型的对象数组;
        Status1[] Ss=Status1.values();
        for(Status1 s:Ss){
            System.out.println(s);
        }
        Thread.State[] Ts=Thread.State.values();    //线程状态
        for(Thread.State s:Ts){
            System.out.println(s);
        }

        //valueOf(String objName);  获取字节对应的枚举类对象
        Status1 p3=Status1.valueOf("Accept");
        System.out.println(p3.getName()+","+p3.getOrder());

        //toString() 返回当前枚举类对象常量名称
        System.out.println(s3);
        p3.show();
    }
}
/*
    情况一：在枚举类enum重写抽象方法
    情况二：让枚举类对象分别实现抽象方法
 */
interface Intef{
    void show();
}
enum Status1 implements Intef{
    Receive("receive",1){
        @Override
        public void show() {
            System.out.println("阶段一");
        }
    },   //这段代码放最前面 出最后一行用“;”,前面用“,”隔开
    Revise("revise",2){
        @Override
        public void show() {
            System.out.println("阶段二");
        }
    },
    Accept("accept",3){
        @Override
        public void show() {
            System.out.println("阶段三");
        }
    };
    /*
    public static Status receive = new Status("receive",1);
    public static Status revise = new Status("revise",2);
    public static Status accept = new Status("accept",3);
     */
    private final String name;
    private final int  order;
    Status1 (String name,int order){
        this.name=name;
        this.order=order;
    }
    public String getName(){
        return this.name;
    }

    public int getOrder(){
        return this.order;
    }

/*
 @Override
    public void show() {
        System.out.println("普通接口继承");
    }
 */
}

