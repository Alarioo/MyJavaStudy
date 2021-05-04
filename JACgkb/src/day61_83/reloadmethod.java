package day61_83;

public class reloadmethod {                                 //重载 同一类中同名方法但参数类型数量不同的情况
    public static void main(String[] args) {                //主方法
        System.out.println(compare(1,2));
        System.out.println(compare((byte) 1,(byte) 2));
        System.out.println(compare( 100L, 200L));
    }
    public static byte compare(byte a,byte b){
        return (byte) (a+b);                                //涉及算术操作非默认数据都要标明数据类型
    }
    public static int compare(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
   }
    public static long compare(long a,long b){
        return Math.max(a, b);
    }
}

