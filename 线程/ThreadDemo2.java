package thread;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ThreadDemo2 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("子线程名称："+
                    Thread.currentThread().getName());
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("子线程名称："+
                    Thread.currentThread().getName());
        }
    }
    /*Thread thread=new Thread(){
        @Override
        public void run() {
            System.out.println("子线程名称："+
                    Thread.currentThread().getName());
        }
    };*/
    Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("子线程名称："+
                    Thread.currentThread().getName());
        }
    });
    Thread t2=new Thread(()->{
        System.out.println("子线程名称："+
                Thread.currentThread().getName());
    });
    static class Mycallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            //产生一个随机数
            int num= new Random().nextInt(10);
            System.out.println(String.format("线程:%s,产生的随机数:%d",
                    Thread.currentThread().getName(),num));
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建Callable子对象
        Mycallable mycallable=new Mycallable();
        //2.使用FutureTask接收Callable
        FutureTask<Integer>futureTask=new FutureTask<>(mycallable);
        //3.创建线程并设置任务
        Thread thread=new Thread(futureTask);
        //执行线程
        thread.start();
        //得到线程的执行结果
        int num=futureTask.get();
        System.out.println("线程返回的结果："+num);
    }


    public static void main1(String[] args) throws InterruptedException {
        /*String content="就立刻这是金发女科长的女";
        for(char ch:content.toCharArray()){
            System.out.print(ch);
            Thread.sleep(100); //休眠100毫秒
            TimeUnit.SECONDS.sleep(1);//休眠1秒
            TimeUnit.HOURS.sleep(1);//休眠1小时
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));//休眠1秒，将1秒转化为1000毫秒
            Thread.sleep(TimeUnit.HOURS.toMillis(1));//休眠1小时，将1小时转化为毫秒单位
*/

    }
}
