package day196_220.arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder();
        ArrayList<Integer> arr=new ArrayList<Integer>(); //这里泛型需为基本类型的包装类
        arr=input(arr);
        System.out.println("输入的数组为"+tostr(arr));
        ArrayList<Integer> arr2=Buble(arr);
        System.out.println("冒泡排序后为"+tostr(arr2));
    }
    public static ArrayList<Integer> input(ArrayList<Integer> arr){
        Scanner sc=new Scanner(System.in);
        String in="true";
        int i=0;
        System.out.println("输入数组第"+(i+1)+"个整数元素或以end停止输入");
        in=sc.nextLine();
        if(in.equals("end")){
            System.exit(0);
        }
        do{
            i++;
            arr.add(Integer.parseInt(in));
            System.out.println("输入数组第"+(i+1)+"个整数元素或以end停止输入");
            in=sc.nextLine();
        }while (!in.equals("end"));
        return arr;
    }
    public static String tostr(ArrayList<Integer> arr){
        String s="{";
        int l=arr.size();
        for(int i=0;i<l-1;i++){
            s=s+arr.get(i)+',';
        }
        s=s+arr.get(l-1)+'}';
        return s;
    }
    public static ArrayList<Integer> Buble(ArrayList<Integer> arr){
        int temp;
        int l=arr.size();
        for(int i=0;i<l-1;i++){
            for (int j=l-1;j>i;j--){
                if(arr.get(j)<arr.get(j-1)){
                   temp=arr.get(j);
                   arr.set(j, arr.get(j-1));
                   arr.set(j-1,temp);
                }
            }
        }
        return arr;
    }
}
