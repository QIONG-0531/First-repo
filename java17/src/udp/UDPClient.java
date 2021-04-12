package udp;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    //服务器IP
    private static final String ip="152.136.255.32";
    //服务器的端口号
    private  static final int port=9001;
    //数据包的大小
    private static final int bleng=1024;
    public static void main(String[] args) throws IOException {
        //1.创建客户端
        DatagramSocket socket=new DatagramSocket();
        //让用户输入发送的消息
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("->");
            //接收到用户输入的信息
            String msg=scanner.nextLine();
            //2.构建发送数据包
            DatagramPacket datagramPacket=new DatagramPacket(
                    msg.getBytes(),msg.getBytes().length,
                    InetAddress.getByName(ip),
                    port
            );
            //3.发送消息
            socket.send(datagramPacket);
            //接收服务器端的消息
            DatagramPacket serPacket=new DatagramPacket(
                    new byte[bleng],bleng
            );
            socket.receive(serPacket);
            System.out.println("收到服务器端信息："+new String(serPacket.getData()));
        }
    }
}
