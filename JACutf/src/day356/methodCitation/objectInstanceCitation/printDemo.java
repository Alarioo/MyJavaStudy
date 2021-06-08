package day356.methodCitation.objectInstanceCitation;

public class printDemo {
    public static void main(String[] args) {
        //lamda表达式
        printUpper(s -> System.out.println(s.toUpperCase()));
        //通过其它对象的实例方法
        PrintString ps=new PrintString();
        printUpper(ps::print);
        //变成引用类的方法 带static 无需new对象
        printUpper(PrintString::print2);
    }
    public static void printUpper(Printer p){
        p.printUpperCase("upper");
    }
}
