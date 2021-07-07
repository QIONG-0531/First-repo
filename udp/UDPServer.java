package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    //端口号
    private static final int port=9001;
    //接收数据容器的大小
    private static final int bleng=1024;
    public static void main(String[] args) throws IOException {
        //1.创建一个UDP服务器
        DatagramSocket socket=new DatagramSocket(port);
        while(true){
            DatagramPacket clientPacket=new DatagramPacket(new byte[bleng],bleng);
            //2.等待客户端连接
            socket.receive(clientPacket);
            //执行此代码表示已经有客户端连接
            //3.拿到客户端的请求信息
            String msg=new String(clientPacket.getData());
            System.out.println("接收到客户端的消息:"+msg);
            //给客户端反馈一个消息
            String serMsg="收到了";
            //构建客户端发送数据包
            DatagramPacket serPacket=new DatagramPacket(serMsg.getBytes(),
                    serMsg.getBytes().length,clientPacket.getAddress(),
                    clientPacket.getPort());
            //给客户端发送消息
            socket.send(serPacket);
        }
    }
}
