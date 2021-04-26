public class ConversionDemo{
    public static void main(String[] args){
        //自动类型转换 
        /*
            byte>short>
                        >int>long>float>double
                  char>
        */
        int i=8;
        long l=i;
        byte b=10;
        //char c =b;    byte不能转char类似short，char
        //强制类型转换
        int k = (int)99.99;   //数据丢失
        System.out.println(k);
    }
}