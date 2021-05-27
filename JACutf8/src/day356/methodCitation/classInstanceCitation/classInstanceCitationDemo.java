package day356.methodCitation.classInstanceCitation;

public class classInstanceCitationDemo {
    public static void main(String[] args) {
        //lamda
        useMySubString((s,x,y) -> s.substring(x,y));
        //类引用实例方法
        useMySubString(String::substring);
    }
    public static void useMySubString(myString my){
        String s=my.mySubString("substring",1,4);
        System.out.println(s);
    }
}
