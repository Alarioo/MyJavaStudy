public class Operator {
    public static void main(String[] args){
        int a=7;
        int b=3;
        System.out.println("a+b="+(int)(a+b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //�Ӽ��˳���
        System.out.println(7.0/3);/* ��������ֻ�õ��������ɸ���������ŵõ�С��
        ������������ͱ��ʽ�Ҳ���Զ���������ߵȼ���������,�����౻��ֵ��������Ҫ��Ӧ
        �ȼ���byte,short,char>int>long>float>double
        */
        //�ַ������Ƕ�Ӧ��ASCII��
        char c1='A'; //65
        char c2='a'; //97
        char c3='0'; //48
        int j= c1-c2;
        System.out.println(j);
        //�ַ�������   �����ַ������Ϊƴ��
        System.out.println(9+99+"ţ");
        System.out.println("ţ"+9+99);
        System.out.println("ţ"+(int)(99+9));
        // += -+ *+ /= %= ������ǿ�Ʊ任
        short s=1;
        /*
        s=s+1; ���� �Ҳ�����Ϊint ���Ϊshort
        */
        s+=1;
        System.out.println("s+=1:"+s);
        s=(short)(s+1);
        System.out.println("s=(short)(s+1):"+s);
        //������ �ڱ���ǰ�ȸ�ֵ���ȼ��ߣ��ڱ�����֮
        int j1=s++;  //3
        System.out.println("j1=s++:"+j1);
        System.out.println("s="+s);
        int j2=++s; //5
        System.out.println("j2=++s:"+j2);
        //��ϵ����� == != < <= > >=
        int j3=5;
        System.out.println(j1<j3);
        //�߼������ &�� |�� ^��� ����
        System.out.println(!(j1<j3));
        //��·�߼������  && ��·�� ||��·�� ȷ���ǻ���������벻ִ��
        System.out.println((s++>100)&&(s++>1)); 
        System.out.println(s);
        //��Ԫ���ʽ  ��ϵ���ʽ�����ʽ1 �����ʽ2 �����1�����2
        int a1=10;
        int a2=20;
        int max=a1>a2 ? a1 :a2;
        System.out.println(max);
    }
}
