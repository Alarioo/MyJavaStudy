package day340;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        //InetAddress address= InetAddress.getByName("192.168.153.1"); //通过ip地址或者主机名确定
        InetAddress address= InetAddress.getByName("LAPTOP-QE092D3P");
        //货取次IP地址的主机名
        String name=address.getHostName();
        //返回文本显示中的IP地址字符串
        String ip=address.getHostAddress();
        System.out.println(name);
        System.out.println(ip);
    }
}
