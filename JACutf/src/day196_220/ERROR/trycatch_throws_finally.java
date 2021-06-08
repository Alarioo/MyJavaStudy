package day196_220.ERROR;

public class trycatch_throws_finally {
    public static void main  (String[] args) {
        int[] i={1,2,3};
        System.out.println(show(i));
        try {
            System.out.println("try");
            method();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("method异常：数组超界");
        }
    }
    public static int show (int[] a){
        System.out.println("开始");
        try{
        System.out.println(a[3]);
            return 1;   //正常执行finally返回i   异常执行finaly及下面的的代码返回0 需要一个return出口
        }      //new ArrayIndexOutOfBoundsException();
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("show异常：数组超界");
            //输出异常后代码仍可以往下执行
//            e.printStackTrace();    //  最详细一场输出
//            System.out.println(e.getMessage());         //简短字符串
//            System.out.println(e.toString());       //详细字符串
           // return 2;
        }finally {          //finally 必执行且先于return 的值 return的值被放在临时栈中
            System.out.println("finally");
        }
        System.out.println("结束");
        return 0;
    }
    //throw只是暂时不结束程序抛出异常 调用环节仍需处理异常
    public static void method () throws ArrayIndexOutOfBoundsException {
        int[] a={1,2,3,};
        System.out.println(a[3]);
        System.out.println("method");
    }
}
