package day340.Threads;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s=s;
    }
    @Override
    public void run(){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            //避免重名
            int count=0;
            File f=new File("JACutf8\\src\\day340\\Threads\\ipCopy"+count+".txt");
            while(f.exists()) {
                count++;
                f=new File("JACutf8\\src\\day340\\Threads\\ipCopy"+count+".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //反馈
            BufferedWriter ack=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            ack.write("线程"+count+"结束");
            ack.newLine();
            ack.flush();

            //释放内存
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
