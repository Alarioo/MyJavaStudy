public class Operator {
    public static void main(String[] args){
        int a=7;
        int b=3;
        System.out.println("a+b="+(int)(a+b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //加减乘除余
        System.out.println(7.0/3);/* 整数操作只得到整数需由浮点数参与才得到小数
        含多个数据类型表达式右侧会自动提升到最高等级数据类型,因此左侧被赋值变量类型要对应
        等级：byte,short,char>int>long>float>double
        */
        //字符操作是对应其ASCII码
        char c1='A'; //65
        char c2='a'; //97
        char c3='0'; //48
        int j= c1-c2;
        System.out.println(j);
        //字符串操作   出现字符串后变为拼接
        System.out.println(9+99+"牛");
        System.out.println("牛"+9+99);
        System.out.println("牛"+(int)(99+9));
        // += -+ *+ /= %= 包含隐强制变换
        short s=1;
        /*
        s=s+1; 报错 右侧升级为int 左侧为short
        */
        s+=1;
        System.out.println("s+=1:"+s);
        s=(short)(s+1);
        System.out.println("s=(short)(s+1):"+s);
        //自增减 在变量前比赋值优先级高，在变量后反之
        int j1=s++;  //3
        System.out.println("j1=s++:"+j1);
        System.out.println("s="+s);
        int j2=++s; //5
        System.out.println("j2=++s:"+j2);
        //关系运算符 == != < <= > >=
        int j3=5;
        System.out.println(j1<j3);
        //逻辑运算符 &与 |或 ^异或 ！费
        System.out.println(!(j1<j3));
        //短路逻辑运算符  && 短路与 ||短路或 确定非或真后后面代码不执行
        System.out.println((s++>100)&&(s++>1)); 
        System.out.println(s);
        //三元表达式  关系表达式？表达式1 ：表达式2 真输出1假输出2
        int a1=10;
        int a2=20;
        int max=a1>a2 ? a1 :a2;
        System.out.println(max);
    }
}
