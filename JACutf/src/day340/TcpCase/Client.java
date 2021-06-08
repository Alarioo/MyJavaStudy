package day340.TcpCase;

import java.io.*;
import java.net.Socket;
/*
复制文件
*/
public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端的SOCKET对象
        Socket s= new Socket("10.100.110.180",53000);
        //输入流读取问价
        BufferedReader br=new BufferedReader(new FileReader("JACutf8\\src\\day340\\ip"));
        //获取输出流，写数据 包装成Bufferedwrite
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();}
        //结束传输标记
        s.shutdownOutput();
        //接收服务器反馈
        BufferedReader ack=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String back=ack.readLine();
        System.out.println("服务器反馈:"+back);
        //释放资源
        br.close();
        s.close();
    }
}