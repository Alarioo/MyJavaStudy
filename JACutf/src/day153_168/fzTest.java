package day153_168;
/*
                    构造        方法调用
        .变量      （参数）     .成员方法（）
super
this
无     优先方法类 后本类 最后父类
 */
public class fzTest {
    //void main(String[] args) {   没有public访问权限降低
    public static void main(String[] args) {
        Zi_auth z=new Zi_auth();
        z.show();
        System.out.println(z);
        z=new Zi_auth();
        System.out.println(z);
        //z.pshow();    无法访问父类private
        Zi_auth zz=new Zi_auth("a",1);
        zz.show();
        zz.setAge(2);
        System.out.println(zz.getAge());
        z.show();           //public
        z.show2();          //protected
        z.show3();          //void
        //  z.show4();          //private

    }

}
