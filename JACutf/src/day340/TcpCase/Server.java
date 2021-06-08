package day340.TcpCase;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器的Socketd对象
        ServerSocket ss=new ServerSocket(53000);
        //Socket accept() 侦听要连接到此套接字并接受它
        Socket s = ss.accept();
        //通过Socket 获取输入流读取数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("JACutf8\\src\\day340\\TcpCase\\ipCopy.txt"));

        //创建线程
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter ack=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        ack.write("服务器成功接收");
        ack.newLine();
        ack.flush();

        //释放资源
        bw.close();
        ss.close();
    }
}

