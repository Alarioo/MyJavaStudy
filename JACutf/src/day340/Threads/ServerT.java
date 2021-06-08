package day340.Threads;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerT {
    public static void main(String[] args) throws IOException {
        //创建服务器的Socketd对象
        ServerSocket ss=new ServerSocket(53200);
        //创建线程
        while(true) {
            //Socket accept() 侦听新线程
            Socket s = ss.accept();
            //给客户端开新线程
            new Thread(new ServerThread(s)).start();
        }
    }
            }

