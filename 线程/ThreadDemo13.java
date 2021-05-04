package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo13 {
    // 全局变量
    private static int number = 0;
    // 循环的最大次数
    private static final int maxSize = 100000;

    public static void main(String[] args) throws InterruptedException {
        Lock lock=new ReentrantLock(true);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    // 加锁
                    lock.lock();
                    try {
                        //业务操作
                        number++;
                    }finally {
                        //释放锁
                        lock.unlock();
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    // 加锁
                    lock.lock();
                    try {
                        //业务操作
                        number--;
                    }finally {
                        //释放锁
                        lock.unlock();
                    }
                }
            }
        });
        t2.start();

        // 等待两个线程执行完成
        t1.join();
        t2.join();

        System.out.println("最终执行结果：" + number);
    }

}
