package day325.threadsecure;

import java.util.*;

public class ThreadSecure {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuffer sbf=new StringBuffer();
        ArrayList<String> ar=new ArrayList<>();
        Vector<String> ve=new Vector<>();
        Hashtable<String,String> ht=new Hashtable<>();
        HashMap<String,String> hm=new HashMap<>();
        List<String> li=Collections.synchronizedList(new ArrayList<>()); //包装成线程安全list
        Map<String,String> m=Collections.synchronizedMap(new HashMap<>());
    }
}
