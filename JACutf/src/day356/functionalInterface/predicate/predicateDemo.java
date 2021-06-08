package day356.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
     boolean test(T t);
     default Predicate<T> and(Predicate<? super T> other) {
     default Predicate<T> negate() {
     default Predicate<T> or(Predicate<? super T> other) {
     static <T> Predicate<T> isEqual(Object targetRef) {
     static <T> Predicate<T> not(Predicate<? super T> target){
 */
public class predicateDemo {
    public static void main(String[] args) {
        System.out.println(check(3,i->i>0));
        System.out.println(checkNegate(3,i->i>0));
        System.out.println(checkAnd(3,i->i>0,i->i<3));
        System.out.println(checkOr(3,i->i>0,i->i<3));
        //挑选
        String[] str={"aaa,1","bb,4","ccccc,7","eee,5"};
        ArrayList<String> arr=new ArrayList<>();
        for(String s:str){
            if(select(s,s1->s1.split(",")[0].length()>2,s1->Integer.parseInt(s1.split(",")[1])>4)){
                arr.add(s);
            }
        }
        if(arr!=null){
            for (String s:arr){
                System.out.println(s);
            }
        }
    }
    public static boolean select(String s,Predicate<String> p1,Predicate<String> p2){
        return p1.and(p2).test(s);
    }
    public static boolean check(Integer i,Predicate<Integer> p1){
        return p1.test(i);
    }
    public static boolean checkNegate(Integer i,Predicate<Integer> p1){
        //return !p1.test(i);
        return p1.negate().test(i);
    }
    public static boolean checkAnd(Integer i,Predicate<Integer> p1,Predicate<Integer> p2){
        return p1.and(p2).test(i);
    }
    public static boolean checkOr(Integer i,Predicate<Integer> p1,Predicate<Integer> p2){
        return p1.or(p2).test(i);
    }
}
