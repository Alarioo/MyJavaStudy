
package day61_83;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//��������ڴ��ַ
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = 100;   //��ֵ
        arr[1] = 200;
        System.out.println(arr);//��������ڴ��ַ
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] arr2=arr;     //��ֵջ�ڴ��ַ��arr��arr2ָ��ͬһ���ڴ�����
        arr2[0] = 111;   //��ֵ
        arr2[1] = 222;
        System.out.println(arr2);//��������ڴ��ַ
        int max=arr[2];
        for (int i = 1; i < arr2.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("arr�����ֵΪ"+max);
    }

}