package org.example.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("E:\\Frank\\个人资料\\head.jpg");
        FileOutputStream fos = new FileOutputStream("E://1.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while((len=is.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        is.close();
        fos.close();
    }
}
