package thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//计数器（只能执行一次）
public class ThreadDemo29 {
    public static void main(String[] args) throws InterruptedException {
     CountDownLatch countDownLatch=new CountDownLatch(3);
        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        for(int i=0;i<3;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"开跑");
                    int num=new Random().nextInt(5);
                    num+=1;
                    try {
                        Thread.sleep(num*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"到达终点");
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("比赛结束，宣布排名");
    }
}
