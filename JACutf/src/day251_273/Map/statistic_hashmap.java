package day251_273.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class statistic_hashmap {
    public static void main(String[] args){
        System.out.println("请输入任意字符串");
        Scanner sc=new Scanner(System.in);
        String  str=sc.nextLine();
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }
        it(h);
    }
    public static void it(HashMap<Character,Integer> h){
        StringBuilder sb=new StringBuilder();
        Set<Character> s=h.keySet();
        for(Character c:s){
            sb.append(c+"("+h.get(c)+")");
        }
        System.out.println(sb.toString());
    }
}
