package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {
    public static void main(String[] args) {
        //创建带缓存的线程池
        //应用场景：短期有大量任务的时候使用newCachedThreadPool
        ExecutorService executorService=Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            //执行任务
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
