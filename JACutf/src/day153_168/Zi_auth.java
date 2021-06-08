package day153_168;
//子类构造初始化前先会构造父类并初始化
public class Zi_auth extends Fu_auth {
    //构造
    public Zi_auth() {
        //super();默认执行
        System.out.println("访问子无参构造");
    }
    public Zi_auth(String name, int age) {
        super(name, age);
        System.out.println("访问子有参");
    }
    //方法重写在父类show方法的基础上添加



}
