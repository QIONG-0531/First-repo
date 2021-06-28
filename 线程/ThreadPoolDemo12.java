package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo12 {
    /**
     * 1.实现2个任务的时间格式化
     * 2.实现10个任务的时间格式化
     * 3.实现1000个任务的时间格式化-->使用线程池，
     * @param args
     */
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
    //创建一个ThreadLocal
    private static ThreadLocal<SimpleDateFormat> threadLocal=
            new ThreadLocal<>();

    private  static void myFormatTime(Date date) {
        //设置一个私有变量
        threadLocal.set(new SimpleDateFormat("mm:ss"));
        //得到ThreadLocal
        SimpleDateFormat simpleDateFormat=threadLocal.get();
        //Date date=new Date(1000);
        String result=simpleDateFormat.format(date);
        System.out.println("时间："+result);
    }
}
