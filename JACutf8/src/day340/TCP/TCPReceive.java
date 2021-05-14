package day340.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class TCPReceive {
    public static void main(String[] args) throws IOException {
        //创建服务器的Socketd对象
        ServerSocket ss=new ServerSocket(58888);

        //Socket accept() 侦听要连接到此套接字并接受它
            System.out.println("accepting...");
            Socket s = ss.accept();
            //通过Socket 获取输入流读取数据，并把数据显示在控制台
            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            String data = new String(bys, 0, len);
            System.out.println("服务器端:" + data);
/*      while 语句中  无法执行反馈模块为什么 ？
        等待客户端信息 添加结束判断语句
        信息发送是阻塞式的，接收端一直等待
        void shutdownInput(); 结束语句
        */
/*          while((len=is.read(bys))!=-1){
            System.out.println(len);
            String data=new String(bys,0,len);
            System.out.println("服务器端:"+data);
        }*/
            //给出反馈
            OutputStream os = s.getOutputStream();
            os.write("服务器端接受数据成功".getBytes());
            //释放资源
            ss.close();
    }
}
