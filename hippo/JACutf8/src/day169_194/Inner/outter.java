package day169_194.Inner;
/*内部类*/
public class outter {
    private int i=10;
    public class inner{    //内部类可以访问外部类
      public void  show(){
          System.out.println("show"+i);
      }
    }
    private class inner_p{
        public void show_p(){
            System.out.println("show_p"+i);
        }
    }
//    public inner_p newinner_p(String s){
//        inner_p ss=new inner_p();
//        return ss;
//    }
    public void method(){
        inner_p i=new inner_p();
        i.show_p();
    }
}
