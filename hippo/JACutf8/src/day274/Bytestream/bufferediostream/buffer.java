package day274.Bytestream.bufferediostream;

import java.io.*;


public class buffer {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\bufferediostream\\bo.txt"));
        bo.write("咕噜咕噜哦130+".getBytes());
        bo.flush();
        //缓存读取要刷新才写入
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream("JACutf8\\src\\day274\\Bytestream\\bufferediostream\\bo.txt"));
        bo=new BufferedOutputStream(new FileOutputStream("JACutf8\\src\\day274\\Bytestream\\bufferediostream\\boo.txt"));
        //字节组
//        byte[] b=new byte[1024];
//        int len;
//        while ((len=bi.read(b))!=-1){
//            System.out.print(new String(b,0,len));
//        }
      //单个字节
        int by;
        while ((by=bi.read())!=-1){
            bo.write(by);
        }
        bo.close();
        bi.close();
    }
}
