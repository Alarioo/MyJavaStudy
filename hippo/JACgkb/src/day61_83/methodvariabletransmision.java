package day61_83;

public class methodvariabletransmision {
    public static void main(String[] args) {
        int n=100;
        int[] arr=new int[3];
        int[] arr2={1,2,3};
        System.out.println(n);
        change(n);                              //基本数据类型方法都在栈内存内生成消失，方法中形参不影响类定义实参
        System.out.println(n);
        System.out.println(arr[1]);
        change(arr);                            //引用数据类型修改涉及堆内存数据，栈内存内容消失后堆内存改变人存在
        System.out.println(arr[1]);
    }
    public static void change(int n){
        n = 200;
    }
    public static void change(int[] arr){
        arr[0] = 100;
    }
/*    public static void change(int[] dd){
        dd[1]=200;
    }*/
}
