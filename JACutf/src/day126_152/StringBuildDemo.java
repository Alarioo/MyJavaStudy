package day126_152;
import java.util.Scanner;
//Stringbuilder.append(任意数据类型)
public class StringBuildDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String s=sc.nextLine();
        System.out.println("反转后为："+myre(s));
        System.out.println("输入一行正整数数组(以任意除数字外的形式间隔开)");
        String ss=sc.nextLine();
        int[] arr=creat(ss);
        System.out.println("转为标准格式字符串为："+change(creat(ss)));
    }
    //有参构造 反转方法 转字符串
    public static String myre(String str){
        return new StringBuilder(str).reverse().toString();//链式编程
    }

    public  static int[] creat(String str){  //将非统一标准的字符串转为数组
        int k=0;                    //未知字符串中数字个数，计字符串中连续数字组个数
        int l=str.length();
        int[] arr=new int[l];   //数组无法添加按最多元素先定义  集合可解决该问题
        int n=0;                //当前连续数字组的整数值
        int j=0;                //考虑以多个字符间隔的情况
        char ch=' ';
        for (int i=0;i<l-1;i++){
             ch=str.charAt(i);          //将连续的数字字符串转化为整数型
            if(ch>='0'&&ch<='9'){
                n=n*10+(int)(ch)-48;
                j=1;
            }else if(j==1){
                arr[k]=n;                   //连续数字被隔开赋值
                k++;
                n=0;
                j=0;
            }
        }
        ch=str.charAt(l-1);           //末尾单独考虑
        if(ch>='0'&&ch<='9'){           //数字结尾直接复制
            n=n*10+(int)(ch)-48;
            arr[k]=n;
            k++;
        }else{
            arr[k]=n;                   //其他结尾 将最近的n赋值
            k++;
        }
        int[] arr2=new int[k];              //生成k个元素数组
        System.arraycopy(arr, 0, arr2, 0, k); //
        return arr2;
    }
    public static String change(int[] a){
        StringBuilder sb=new StringBuilder();  //无参创建 也可以有参创建
        //添加方法
        sb.append('{');
        int l=a.length;
        for(int i=0;i<l-1;i++){
            sb.append(a[i]).append(',');
        }
        sb.append(a[l-1]).append('}');
        ////对象转字符串
        return sb.toString();

    }
}
