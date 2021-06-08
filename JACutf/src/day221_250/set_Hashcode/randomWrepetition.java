package day221_250.set_Hashcode;
import java.util.Random;
import java.util.HashSet;
public class randomWrepetition {
    public static void main(String[] args){
        Random r=new Random();
        HashSet<Integer> hs=new HashSet<>();
        int n=0;
        while(hs.size()<10){
            Integer i=r.nextInt(100)+1;
            hs.add(i);
        }
        for(Integer k: hs){
            System.out.println(k);;
        }
    }
}
