
package day61_83;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//输出数组内存地址
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = 100;   //赋值
        arr[1] = 200;
        System.out.println(arr);//输出数组内存地址
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] arr2=arr;     //赋值栈内存地址，arr与arr2指向同一堆内存内容
        arr2[0] = 111;   //赋值
        arr2[1] = 222;
        System.out.println(arr2);//输出数组内存地址
        int max=arr[2];
        for (int i = 1; i < arr2.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("arr中最大值为"+max);
    }

}