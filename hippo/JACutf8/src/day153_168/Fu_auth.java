package day153_168;

public class Fu_auth extends Ye{
    //父构造
    public Fu_auth(){
        System.out.println("访问父无参构造");
    }

    public Fu_auth(String name, int age) {
        super(name, age);
        System.out.println("访问父有参构造");
    }
    //父方法
    public void show(){
        super.show();   //yeshow
        System.out.println("fu");
        show4();
        System.out.println("由父类本类调用");
    }
    protected void show2(){};
    void show3(){};
    private void show4(){
        System.out.println("pshow调用");
    }
    public static void main(String[] args){
        Fu_auth f=new Fu_auth();
        f.show();           //public
        f.show2();          //protected
        f.show3();          //void
        f.show4();          //
    }

}
