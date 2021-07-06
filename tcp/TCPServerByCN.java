package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class TCPServerByCN {
    private static final int port=9003;
    static HashMap<String,String> map=new HashMap<>();
    static {
        map.put("cat","猫");
        map.put("dog","狗");
        map.put("hello","你好");
        map.put("sky","天空");
    }
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("英译汉服务器启动成功");

        Socket client=serverSocket.accept();
        System.out.println(String.format("已经有客户端连接了，客户端ip:%s,端口:%d",
                client.getInetAddress().getHostAddress(),client.getPort()));
        try(BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(client.getInputStream()))){
            while(true){
                String chinese=bufferedReader.readLine();
                if(chinese!=null && !chinese.equals("")){
                    System.out.println("收到客户端信息："+chinese);
                    String english=map.get(chinese);
                    bufferedWriter.write(english+"\n");
                    bufferedWriter.flush();
                }
            }
        }
    }
}
