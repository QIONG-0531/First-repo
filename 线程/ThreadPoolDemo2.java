package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //自定义线程工厂
        ThreadFactory threadFactory=new MyThreadFactory();
        ExecutorService executorService=Executors.newFixedThreadPool(10,threadFactory);
        for (int i = 0; i < 10; i++) {
            //执行任务
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName()+","+
                            "优先级:"+Thread.currentThread().getPriority());
                }
            });
        }
    }
    private static int count=1;
    static class MyThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread thread=new Thread(r);
            //自定义线程池的名称规则
            thread.setName("mypool-"+count++);
            //设置优先级
            thread.setPriority(10);
            return thread;
        }
    }
}
