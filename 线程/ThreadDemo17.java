package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDemo17 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Date date=new Date(1000);
                myFormatTime(date);
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Date date=new Date(2*1000);
                myFormatTime(date);
            }
        });
        t2.start();
    }
    /**
     * 时间格式化方法
     * date待格式化的时间
     */
    private static void myFormatTime(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
        String result=simpleDateFormat.format(date);
        System.out.println(Thread.currentThread().getName()+
                "格式化时间："+result);
    }
}
