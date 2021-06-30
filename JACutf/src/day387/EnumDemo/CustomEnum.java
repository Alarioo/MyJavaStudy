package day387.EnumDemo;
//自定义枚举类

/**
 * @author alario
 * @create 2021
 */
public class CustomEnum {
    public static void main(String[] args) {
        Status s1=Status.Receive;
        Status s2=Status.Revise;
        Status s3=Status.Accept;
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }
}

class Status{
    private final String name;
    private final int  order;
    //私有化构造器
    private Status (String name,int order){
        this.name=name;
        this.order=order;
    }

    public static Status Receive = new Status("receive",1);
    public static Status Revise = new Status("revise",2);
    public static Status Accept = new Status("accept",3);

    public String getName(){
        return this.name;
    }

    public int getOrder(){
        return this.order;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}