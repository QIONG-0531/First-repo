package thread;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo3 {
    //创建并初始化ThreadLocal
    private static ThreadLocal<Integer> threadLocal=
            new ThreadLocal(){
                @Override
                protected Object initialValue() {
                    int num=new Random().nextInt(10);
                    System.out.println("执行了initialValue生成了："+num);
                    return num;
                }
            };

    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                //get ThreadLocal
                int result=threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"得到的结果1："+result);
            }
        });
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                //get ThreadLocal
                int result=threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"得到的结果2："+result);
            }
        });
    }
}
