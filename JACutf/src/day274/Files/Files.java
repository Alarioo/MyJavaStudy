package day274.Files;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        //file封装方法三种  1 String path(path\\file)       2 String path,String file           3 File f,String file
        File f0=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\Files\\mkdirs\\sub");
        File f1=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\Files\\mkdir");
        File f2=new File("E:\\code\\javacode\\dagonghun\\hippo\\JACutf8\\src\\day274\\Files","f2_create.txt");
        File f3=new File(f1,"f3_create.txt");
        //file的方法     public boolean 没有同名返回true
        f0.mkdirs();            //创建多级目录 （文件夹）
        f1.mkdir();             //创建单级目录
        f2.createNewFile();     //已有目录下创建文件
        f3.createNewFile();
        /*
        public boolean  isDirectory();   封装File是否为目录
                        isFile();            是否为文件
                        exists();              是否存在
        public String   getAbsolutePath();     返回绝对路径
                        getPath();              返回封装路径
                        getName();              返回文件或目录（文件夹）名称
        public String[] list();                 路径该级下的所有文件名
        public File[]   listFile();          路径该级下的所有文件File格式
         */
        File f4=new File("hippo\\JACutf8\\src\\day274\\Files");  //相对目录与project下module同级
        System.out.println("f4.getAbsolutePath():"+f4.getAbsolutePath());
        System.out.println("f4.getPath()):"+f4.getPath());
        System.out.println("f4.getName():"+f4.getName());
        System.out.println("--------------\nf4.list():");
        for(String str: f4.list()){
            System.out.println(str);
        }
        System.out.println("--------------\nf4.listFile():");
        for(File f:f4.listFiles()){
            if(f.isDirectory()){
                System.out.println(f+" is Directory");
            }else{
                System.out.println(f+" is not Directory");
            }
        }
        System.out.println("---------------------");
        //删除
        File f5=new File("hippo\\JACutf8\\src\\day274\\Files\\delete");
        f5.mkdir();
        if(f5.exists()) System.out.println(f5.getName()+" exists");
        f5.delete();
    }
}
