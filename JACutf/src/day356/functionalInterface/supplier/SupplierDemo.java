package day356.functionalInterface.supplier;

import java.util.function.Supplier;
/*
提供唯一抽象方法    T get();
 */
public class SupplierDemo {
    public static void main(String[] args) {
        int[] arr={2,4,5,2,4,8};
        int maxValue=getMax(()->{
            int max=arr[0];
            for(Integer i:arr){
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    public static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

}
