public class ConversionDemo{
    public static void main(String[] args){
        //�Զ�����ת�� 
        /*
            byte>short>
                        >int>long>float>double
                  char>
        */
        int i=8;
        long l=i;
        byte b=10;
        //char c =b;    byte����תchar����short��char
        //ǿ������ת��
        int k = (int)99.99;   //���ݶ�ʧ
        System.out.println(k);
    }
}