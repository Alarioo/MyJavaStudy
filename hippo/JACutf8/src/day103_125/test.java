package day103_125;

import java.util.Scanner;
import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
       // String s="0";
        String a=new String();
        while (true){
            Scanner sc=new Scanner(System.in);
            a=sc.nextLine();
            add(al,a);
            for(int i=0;i< al.size();i++){
                System.out.println(al.get(i));
                System.out.println(a);
            }
        }


    }
    public static void add(ArrayList<String> al,String a){
        //Scanner sc=new Scanner(System.in);
        al.add(a);
    }
}
