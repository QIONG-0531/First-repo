package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo12 {
    private static ThreadLocal<MyThreadLocal>threadLocal=new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        for(int i=0;i<10;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    MyThreadLocal myThreadLocal=new MyThreadLocal();
                    threadLocal.set(myThreadLocal);
                    System.out.println(Thread.currentThread().getName()+
                            "设置了值");
                    threadLocal.remove();
                }
            });
            Thread.sleep(200);
        }
    }
    static class MyThreadLocal{
        private byte[]bytes=new byte[1*1024*1024];
    }
}
