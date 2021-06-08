package day196_220;

public class MathDemo {
    public static void main(String[] args) {
        //返回绝对值
        System.out.println(Math.abs(-88));
        System.out.println("------");
        //返回大于或者等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.36));
        System.out.println(Math.ceil(12.56));
        System.out.println("------");
        //返回较大或较小
        System.out.println(Math.max(1,2));
        System.out.println(Math.min(1,2));
        System.out.println("------");
        //四舍五入
        System.out.println(Math.floor(1.3));
        System.out.println("------");
        //mi
        System.out.println(Math.pow(2,3));
        System.out.println("------");
        //随机[0,1)
        System.out.println((int)(Math.random()*100)+1);
    }
}
