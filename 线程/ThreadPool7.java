package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool7 {
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

        //原始创建线程池的方式
        /**
         * 参数一：核心线程的数量，线程池正常情况下数量（正式员工的数量）
         * 参数二：最大线程数量，当有大量的任务的时候可以创建的最多的线程数（临时工）
         * 参数三：最大线程存活时间（临时工的存活时间）
         * 参数四：配合参数三一起使用，时间单位
         * 参数五：任务队列
         * 参数六：线程工厂
         * 参数七：拒绝策略
         *
         * 注意事项：最大线程数必须大于等于核心线程数
         */
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(2,2,60,TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(1),threadFactory);
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
