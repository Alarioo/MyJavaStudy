package day196_220;

public class integer {
    public static void main(String[] args) {
        //构造
        Integer i1=Integer.valueOf(32);
        System.out.println(i1);
        Integer i2=Integer.valueOf("23");//数字类的字符串也可以
        System.out.println(i2);
        int i=i2.intValue();                //String "23"------int 23
        int y=Integer.parseInt("24");           //法二 String-----int
        String s=String.valueOf(123);   //int--------String
        Integer i3=300;     //自动装箱 等价 Integer i3=Integer.valueOf("23");/
        if (i3!=null){          //判断对象是否为null
            i3 +=300;       //自动拆箱 等价   int i=i3.intValue();
        }


    }
}
