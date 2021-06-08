package day251_273;

public class variableparameter {
    public static void main(String[] args){
        sum1(1,2,3,4);
        sum2(1,2,3,4);
    }
    public  static void sum1(int...a){
        System.out.println(a);
        System.out.println("'----------");
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
    /*
    public  int sum(int...a，int b){
    编译错误可变参数放后面
     */
    public static void sum2(int b,int...a){
        System.out.println(a);
        System.out.println("'----------");
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(b);
        System.out.println(sum);
    }
}
