package day61_83;

public class methodvariabletransmision {
    public static void main(String[] args) {
        int n=100;
        int[] arr=new int[3];
        int[] arr2={1,2,3};
        System.out.println(n);
        change(n);                              //�����������ͷ�������ջ�ڴ���������ʧ���������ββ�Ӱ���ඨ��ʵ��
        System.out.println(n);
        System.out.println(arr[1]);
        change(arr);                            //�������������޸��漰���ڴ����ݣ�ջ�ڴ�������ʧ����ڴ�ı��˴���
        System.out.println(arr[1]);
    }
    public static void change(int n){
        n = 200;
    }
    public static void change(int[] arr){
        arr[0] = 100;
    }
/*    public static void change(int[] dd){
        dd[1]=200;
    }*/
}
