import java.util.Scanner;
//import jdk.internal.net.http.frame.ContinuationFrame;
public class Jumpcontrol {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("�����������0������");
        int s=sc.nextInt();
        if(s>0){
            System.out.println("С�ڵ���"+s+"����������");
            //int n=0;
            for(int i=1;i<=s;i++){
                if(i%2==0){
                    continue;  //ֱ��������һ��ѭ��
                    //break;   //����ѭ��
                }
                System.out.println(i);
            }    
        }else{
            System.out.println("�����쳣");
        }
    }
}
