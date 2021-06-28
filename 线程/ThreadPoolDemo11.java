package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo11 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(1000));
        for(int i=0;i<1000;i++){
            final int finalI=i;
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    Date date=new Date(finalI*1000);
                    myFormatTime(date);
                }
            });
        }
    }
    /**
     * 时间格式化方法
     * date待格式化的时间
     */
    //加锁来保证线程安全
    private  static void myFormatTime(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
        String result=simpleDateFormat.format(date);
        System.out.println(Thread.currentThread().getName()+
                "格式化时间："+result);
    }
}
