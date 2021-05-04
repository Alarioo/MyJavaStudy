package day126_152;
import day153_168.Zi_auth;
import day153_168.Fu_auth;
/*
这里指第一行类文件声明     不考虑之后的方法关系
权限修饰符       本类          同包           异包子类        异包无关类
public          true        true            true            true
protected       true        true            true
~               true        true
private         true
* */
public class authority extends Fu_auth{
    public static void main(String[] args) {
        Zi_auth z=new Zi_auth();
        z.show();   //public
        Fu_auth f=new Fu_auth();
        f.show();      //   public
        authority au=new authority();
        au.show();          //public
        au.show2();         //protected
    }
}
