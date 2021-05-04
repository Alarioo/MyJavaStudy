package day274.CharacterStream;

import java.io.*;
//有缓存 要flush
public class outputstreamwrite {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter ow=new OutputStreamWriter(new FileOutputStream("JACutf8\\src\\day274\\CharacterStream\\ow.txt"));
        String s="真不错";
        char[] ch={'o','的','k'};
        ow.write(97);   //字符写                                   int  c
        ow.write("\r\n");
        ow.write(s+"\r\n",1,2);    //字符串           String str,int off,int len
        ow.write("\r\n");
        ow.write(ch);   //字符组           char[] ch,int off,int len
        ow.flush();
        ow.close();
    }
}
