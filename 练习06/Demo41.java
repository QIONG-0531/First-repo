import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo41 {
    public static void main(String[] args) {
        //创建一个读写锁
        ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock  readLock=readWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock=readWriteLock.writeLock();
        //创建线程池
        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));
        //任务一：读锁
        executor.execute(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"进入了读锁时间:"+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    readLock.unlock();
                }
            }
        });
        //
        executor.execute(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"进入了读锁时间:"+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    readLock.unlock();
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"进入了写锁时间:"+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    writeLock.unlock();
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"进入了写锁时间:"+new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    writeLock.unlock();
                }
            }
        });
    }
}
