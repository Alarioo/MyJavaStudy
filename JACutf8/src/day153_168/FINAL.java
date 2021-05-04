package day153_168;
//权限修饰符 final修饰的 类 方法 变量 为最终变量 不可以被继承 重写 赋值
public class FINAL {
    public static void main(String[] args) {
        final int a=1;
        //a=2; 报错基本变量不能被再次赋值
        final Ye y=new Ye("ye",10);
        y.setAge(20);

        System.out.println(y.getAge());
        //y=new Ye();     引用类型变量final指地址值不能变 内部值可以变
    }

}
