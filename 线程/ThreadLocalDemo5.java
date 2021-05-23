package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo5 {
    //简单写法
    private static ThreadLocal<String> threadLocal=
            ThreadLocal.withInitial(()->"java");
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                //get ThreadLocal
                String  result=threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"得到的结果1："+result);
            }
        });
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                //get ThreadLocal
                String result=threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"得到的结果2："+result);
            }
        });
    }
}
