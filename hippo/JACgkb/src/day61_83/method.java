package day61_83;

public class method {
    public static void main(String[] args) {
        kk();
        byte c =number((byte)3,(byte)5);
        System.out.println(c);
    }
    public static void kk(){         //无返回值方法
        System.out.println("kk");
    }
    public static byte number(byte a,byte b){        //有返回值方法
        if (a>b){
            return a;
        }else{
            return b;
        }

    }
}
