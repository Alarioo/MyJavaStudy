
package day83_105;

public class reversal {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={1,2,3,4};
        int[] arr3={1};
        r(arr);
        r(arr2);
        r(arr3);
        p(arr);
        p(arr2);
        p(arr3);
    }
    public static void r(int[] a){
        int t;
        int l=a.length;
        for(int i=0;i<l/2;i++){
            t=a[i];
            a[i]=a[l-1-i];
            a[l-1-i]=t;
        }
    }
    public static void p(int[] a){
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            if (i<a.length-1){
                System.out.print(a[i]+",");
            }else{
                System.out.print(a[i]+"]\n");
            }
        }
    }
}