package day196_220.object;
//ctrl+B查看源码
public class objectdemo {
    public static void main(String[] args) {
        student s1=new student("卡卡罗特");
        System.out.println(s1); //  若不重写的默认输出day0314.object.student@49e4cb85
        System.out.println(s1.toString());
        student s2=new student("卡卡罗特");
        System.out.println(s1==s2);     //比较的是地址值
        System.out.println(s1.equals(s2));
    }
    /*  toString 源码 重写前
        public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }
        public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
        public String toString() {          默认返回字符串表示形式不利于阅读
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    */


    /* equals源码  比的是地址需要重写
    public boolean equals(Object obj) {
        return (this == obj);
    }
     */
}
