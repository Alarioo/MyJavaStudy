
package day103_125;
//创建类static
public class ClassObjectDemo {
    //定义成员属性
    String type;
    int price;
    //构造方法
    public ClassObjectDemo(){

    }

    //成员方法
    public void call(){
        System.out.println("用"+type+"打电话");
    }
    public double act(double a){
        double b=price*a;
        return b;
    }
}