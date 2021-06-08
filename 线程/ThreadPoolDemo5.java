package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo5 {
    private static int count=1;
    public static void main(String[] args) {
        //创建线程工厂
        ThreadFactory threadFactory=new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread=new Thread(r);
                thread.setName("myThreadPool-"+count++);
                return thread;
            }
        };
         //丢弃最老的任务
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(8),
                        threadFactory,new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i <10 ; i++) {
            final int fianlI=i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(fianlI+"线程名："+Thread.currentThread().getName());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
