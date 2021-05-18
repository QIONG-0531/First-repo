package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool5 {
    public static void main(String[] args) {
        //创建单个线程的线程池

        /**
         * 创建单个线程池有什么作用？
         * 1.可以避免频发创建和消耗线程带来的性能开销
         * 2.有任务队列可以存储多余的任务
         * 3.当有大量的任务不能处理的时候，可以友好的执行拒绝策略
         * 4.线程池可以更好的管理任务
         */

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
    }
}
