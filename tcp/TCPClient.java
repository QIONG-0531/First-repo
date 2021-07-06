package tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private static final String ip="127.0.0.1";
    //private static final String ip="152.136.255.32";
    private static final int port=9004;
    public static void main(String[] args) throws IOException {
        //1.创建tcp客户端，并且连接到服务器端
        Socket socket=new Socket(ip,port);
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner=new Scanner(System.in))
        {
            while(true){
                System.out.println("英文：");
                String msg=scanner.nextLine();
                //2.发送消息给服务器端
                writer.write(msg+"\n");
                writer.flush();
                //3.接收服务器响应的内容
                String serMsg=reader.readLine();
                System.out.println("中文："+serMsg);
            }
        }

    }
}
