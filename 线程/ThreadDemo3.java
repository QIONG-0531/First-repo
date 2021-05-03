package thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
           int num= new Random().nextInt(10);
            System.out.println(String.format("线程：%s,生产了随机数：%d",
                    Thread.currentThread().getName(),num));
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建Callable子对象
        MyCallable callable=new MyCallable();
        //2.使用FutureTask接收
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        //3.创建线程并设置任务
        Thread thread=new Thread(futureTask);
        //执行线程
        thread.start();
        //得到线程的执行结果
        int num=futureTask.get();
        System.out.println("线程返回结果："+num);
    }
}
