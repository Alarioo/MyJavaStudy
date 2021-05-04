package day103_125;

public class Test124 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String ss=change(arr);
        System.out.println(ss);

    }
    public static String change(int[] a){
        int l=a.length;
        String s="{";
        for(int i=0;i<l-1;i++){
            s =s+ a[i]+',';
            //System.out.println((char)(44));
//          s +=a[i]+',';  //先完成 a[i]+',':字节(char)+整数(int) 转为(int) ','为char 44 1+44=45
        }
        s=s+a[l-1]+'}';
        return s;
    }
}
