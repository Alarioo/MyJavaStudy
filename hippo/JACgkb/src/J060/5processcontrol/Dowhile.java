public class Dowhile {
    public static void main(String[] args){
        //do while
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<6);
        System.out.println("--------");
        //while
        int k=1;
        while(k<6){
            System.out.println(k);
            k++;
        }
        System.out.println("--------");       
        //for
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
        System.out.println("--------");  
        //System.out.println(i);   报错 i属于for循环内
        //do{}while(true);死循环格式
        //for(;;){};死循环格式
        //while(true){};死循环格式
        //ctrl+c跳出死循环
    }
}
