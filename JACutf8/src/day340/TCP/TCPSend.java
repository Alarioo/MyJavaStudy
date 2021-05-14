package day340.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    1.创建客户端SOCKET
    2.获取输出流，写数据
    3.释放资源
 */
public class TCPSend {
    public static void main(String[] args) throws IOException {
        //创建客户端的SOCKET对象
        Socket s= new Socket("10.100.110.180",58888);
        //获取输出流，写数据
        //OutputStream getOutputStream()
        OutputStream os=s.getOutputStream();
        os.write("TCP客户端信息".getBytes());
        //接收服务器反馈
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("客服端："+data);
/*        while((len=is.read(bys))!=-1){
            String data=new String(bys,0,len);
            System.out.println("客服端："+data);
        }*/
        //释放资源
        s.close();

    }
}
