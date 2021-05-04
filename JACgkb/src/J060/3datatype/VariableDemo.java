/*
 变量类型  byte short int long float double char boolean 
 变量类型  变量名称 = 赋值
 */
public class VariableDemo{
    public static void main(String[] args){
        //byte -128~127
        byte b = 1;
        System.out.println(b);
        //short -32768~32767
        short s=100;
        System.out.println(s);
        //int -2^31~2^31-1
        int i=10000;
        System.out.println(i);
        //long     默认整数int 后面加l/L 防止整数过大
        long l=10000000000L;
        System.out.println(l);
        //float 默认浮点为double 后面加f/F  避免不兼容
        float f=13.14f;
        System.out.println(f);
        //double
        double d=2323;
        System.out.println(d);
        //char
        char c='r';
        System.out.println(c);
        //boolran
        boolean bo=true;
        System.out.println(bo);
    }
}//枫 晴天