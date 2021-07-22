package test;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream("C:\\Users\\22987\\Pictures\\111.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\22987\\1.jpg");
        byte[] bytes=new byte[1024];
        int len;
        while((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        inputStream.close();
        fileOutputStream.close();


    }
}
