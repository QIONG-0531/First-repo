package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static final int port=9002;
    public static void main(String[] args) throws IOException {
        //1.创建TCP服务器端
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("服务器启动成功");
        //2.等待客户端连接
        Socket client=serverSocket.accept();
        System.out.println(String.format("有客户端连接了，客户端ip:%s,端口:%d",
                      client.getInetAddress().getHostAddress(),client.getPort() ));

        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(client.getOutputStream())))
        {
            while(true){
                //3.接收客户端的消息
                String msg=bufferedReader.readLine();
                if(msg!=null && !msg.equals("")){
                    System.out.println("收到客户端信息："+msg);
                    //4.返回给客户端相响应信息
                    String serMsg="我收到了";
                    bufferedWriter.write(serMsg+"\n");
                    //刷新缓冲区
                    bufferedWriter.flush();
                }
            }
        }
    }
}
