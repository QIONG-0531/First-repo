package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo4 {
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
         //默认拒绝策略，不执行任务抛出异常
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(1),
                        threadFactory,new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i <3 ; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
