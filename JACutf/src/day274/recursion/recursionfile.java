package day274.recursion;


import java.io.File;

public class recursionfile {
    public static void main(String[] args) {
        File f=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src");
        fun(f);
    }
    public static void fun(File file){
        File[] fs=file.listFiles();
        if(fs!=null){
            for(File f:fs){
                if(f.isFile()){
                    System.out.println(f.getAbsolutePath());
                }else{
                    fun(f);
                }
            }
        }
    }
//    public static File fun(File file){
//        File[] fs=file.listFiles();
//            if(File!=null){
//        for(File f:fs){
//            if(f.isFile()){
//                System.out.println(f.getAbsolutePath());
//            }else{
//                return fun(f);
//            }
//        }}
//        return null;
//    }
}
