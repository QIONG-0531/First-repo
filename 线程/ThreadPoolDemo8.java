package thread;

import java.util.concurrent.*;

public class ThreadPoolDemo8 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor
                = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10));
        for (int i = 0; i < 6; i++) {
            int finalI = i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format("编号：%d，线程名：%s",
                            finalI, Thread.currentThread().getName()));
                }
            });

        }
        threadPoolExecutor.shutdownNow();
    }
}
