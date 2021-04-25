package day196_220;

import java.util.Arrays;

public class split {
    public static void main(String[] args){
        String str="22 32 43 44 95 30";
        String[] s=str.split(" ");      //public String[] split(String regex,int limit); 分隔符 regex 分limit段
        int l=s.length;
        int[] a=new int[l];
        for(int i=0;i<l;i++){
            a[i]=Integer.parseInt(s[i]);    //String to int
        }
        Arrays.sort(a);
        System.out.println(ints(a));
    }
    public  static String ints(int[] a){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<a.length;i++){
            if(i==a.length-1){
                sb.append(a[i]);
            }else {
                sb.append(a[i]+",");
            }
        }
        return sb.toString();
    }
}
