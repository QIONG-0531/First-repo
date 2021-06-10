package thread;

import java.util.concurrent.*;

public class ThreadPoolDemo7 {
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

        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(8),
                        threadFactory, new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                      //自定义拒绝策略，可以写到日志里面，也可以存储到数据库 ，也可以啥也不做
                        System.out.println("执行了拒绝策略");
                    }
                });
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
