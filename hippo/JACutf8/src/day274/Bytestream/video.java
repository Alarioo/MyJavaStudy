package day274.Bytestream;


import java.io.*;


/*
E:\学习资料\课程\2019-2020(2)\最优控制视频
 */
public class video {
    public static void main(String[] args) throws IOException {

        File f1=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\zcontent\\video\\2_2.mp4");
        File f2=new File("JACutf8\\src\\day274\\Bytestream\\2_2.mp4");
        System.out.println("单字节耗时："+method1(f1,f2)+"毫秒");
        System.out.println("字节数组1024耗时："+method2(f1,f2)+"毫秒");
        System.out.println("缓存单字节耗时："+method3(f1,f2)+"毫秒");
        System.out.println("缓存字节数组1024耗时："+method4(f1,f2)+"毫秒");
    }
    public static long  method1(File f1,File f2) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fi=new FileInputStream(f1);
        FileOutputStream fo=new FileOutputStream(f2);
        int b;
        while((b=fi.read())!=-1){
            fo.write(b);
        }
        long t;
        long end=System.currentTimeMillis();
        return t=end-start;
    }
    public static long  method2(File f1,File f2) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fi=new FileInputStream(f1);
        FileOutputStream fo=new FileOutputStream(f2);
        byte[] b=new byte[1024];
        int len;
        while((len=fi.read(b))!=-1){
            fo.write(b);
        }
        long t;
        long end=System.currentTimeMillis();
        return t=end-start;
    }
    public static long  method3(File f1,File f2) throws IOException {
        long start=System.currentTimeMillis();
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(f2));
        int b;
        while((b=bi.read())!=-1){
            bo.write(b);
        }
        long t;
        long end=System.currentTimeMillis();
        return t=end-start;
    }
    public static long  method4(File f1,File f2) throws IOException {
        long start=System.currentTimeMillis();
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(f2));
        byte[] b=new byte[1024];
        int len;
        while((len=bi.read(b))!=-1){
            bo.write(b);
        }
        long t;
        long end=System.currentTimeMillis();
        return t=end-start;
    }
}
