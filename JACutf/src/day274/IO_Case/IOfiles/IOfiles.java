package day274.IO_Case.IOfiles;

import java.io.*;

public class IOfiles {
    public static void main(String[] args) throws IOException{
        File fi=new File("JACutf8\\src\\day274\\zcontent");
        File fo=new File("JACutf8\\src\\day274\\IO_Case\\IOfiles");
        copy(fi,fo);
    }
    public static void copy(File srcf,File desf) throws IOException {
            if (srcf.isDirectory()) {
                File fd = new File(desf.getPath(), srcf.getName());
                if(!fd.exists()) {
                    System.out.println("创建文件夹:" + fd.getPath());
                    fd.mkdir();
                }
                File[] fs = srcf.listFiles();
                for (File f : fs) {
                    copy(f, fd);
                }
            }else {
                File ff = new File(desf.getPath(), srcf.getName());
                copyFile(srcf, ff);
            }
    }
   public static void copyFile(File fi,File fo) throws IOException{
        BufferedInputStream br=new BufferedInputStream(new FileInputStream(fi));
        BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream(fo));
        byte[] by =new byte[1024];
        int len;
        while((len=br.read(by))!=-1){
            bw.write(by);
        }
        System.out.println("复制文件:"+fo.getPath());
        br.close();
        bw.close();
   }
}
