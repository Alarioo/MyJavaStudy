package day103_125;

public class StringDemo {
    public static void main(String[] args){
        //分配唯一堆内存地址
        String s=new String();
        System.out.println(s);     //空字符串
        char[] chs={'a','b','c'};
        String s1=new String(chs);     //字符数组
        System.out.println(s1);
        byte[] bys={97,98,100};
        String s2=new String(bys);   //字节数组即字符串对应的底层原理 输出字节对应的ASCII码
        System.out.println(s2);
        //在常量池中
        String s3="abc";              //直接赋值
        System.out.println(s3);
        int i=123;
        String s4=String.valueOf(i); //int------String

    }
}
