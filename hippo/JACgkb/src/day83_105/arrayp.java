package day83_105;

public class arrayp {
    public static void main(String[] args){
        int[] arr={0,1,2,3,4,5};
        method(arr);
    }
    public static void method(int[] a){
        System.out.print("[");
        for (int i=0;i<a.length;i++){
            if (i<a.length-1){
                System.out.print(a[i]+",");     //System.out.print()Êä³ö²»»»ÐÐ
            }else{
                System.out.print(a[i]+"]");
            }
        }
    }
}
