package day356.methodCitation.classInstanceCitation;

public class classInstanceCitationDemo {
    public static void main(String[] args) {
        //lamda
        useMySubString((s,x,y) -> s.substring(x,y),"substring",1,4);
        //类引用实例方法
        useMySubString(String::substring,"substring",1,4);
    }
    public static void useMySubString(myString my,String str,int x,int y){
        String s=my.mySubString(str,x,y);
        System.out.println(s);
    }
}
