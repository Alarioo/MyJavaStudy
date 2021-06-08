package day196_220;

public class SystemDemo {
    public static void main(String[] args){
        long begin=System.currentTimeMillis(); //记录当前距离1970.1.1毫秒值
        System.out.println(begin);
        System.out.println("开始");
        int j=0;
        for(int i=1;i<1000000;i++){
            j+=1;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
        System.exit(0);//返回0正常结束java虚拟机 不会执行下面代码
        System.out.println("结束");
    }
}
