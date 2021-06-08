package day196_220.arrays;
import java.util.Arrays;
//与Math类类似都是工具类 直接通过类名使用方法 public static
public class arraysdemo {
    public static void main(String[] args) {
        int[] a={1,4,6,7,3,2};
        System.out.println("排序前"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后"+Arrays.toString(a));
    }
}
