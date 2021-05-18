package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) {
        //创建一个固定个数的线程池
        ExecutorService executorService=Executors.newFixedThreadPool(10);
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
