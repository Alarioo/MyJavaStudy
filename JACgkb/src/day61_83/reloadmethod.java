package day61_83;

public class reloadmethod {                                 //���� ͬһ����ͬ����������������������ͬ�����
    public static void main(String[] args) {                //������
        System.out.println(compare(1,2));
        System.out.println(compare((byte) 1,(byte) 2));
        System.out.println(compare( 100L, 200L));
    }
    public static byte compare(byte a,byte b){
        return (byte) (a+b);                                //�漰����������Ĭ�����ݶ�Ҫ������������
    }
    public static int compare(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
   }
    public static long compare(long a,long b){
        return Math.max(a, b);
    }
}

