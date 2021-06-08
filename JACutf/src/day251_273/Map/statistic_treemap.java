package day251_273.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
public class statistic_treemap {
    public static void main(String[] args){
        System.out.println("请输入任意字符串");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        TreeMap<Character,Integer> tm=new TreeMap<>();      //无参构造自然排序
        for (int i=0;i<str.length();i++){
            char key=str.charAt(i);
            if (tm.get(key)==null){
                tm.put(key,1);
            }else{
                int j=tm.get(key);
                j++;
                tm.put(key,j);
            }
        }
        it(tm);
    }
    public static void it(TreeMap<Character,Integer> tm){
        StringBuilder sb=new StringBuilder();
        Set<Character> s=tm.keySet();
        for(Character key:s){
            sb.append(key+"("+tm.get(key)+")");
        }
        System.out.println(sb.toString());
    }

}
