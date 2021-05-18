package thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool3 {
    public static void main(String[] args) {
        //创建执行定时任务的线程池
        ScheduledExecutorService scheduledExecutorService=
                Executors.newScheduledThreadPool(2);
        System.out.println("设置定时任务："+new Date());
        //执行定时任务

        //参数一:线程执行的任务；参数二:延迟一段时间执行；参数三:定时任务频率的设置;参数四:参数二和参数三的单位
        //scheduleAtFixedRate:以上次任务的开始时间（加上固定频率)作为下一次任务的开始时间
        //不管任务的执行过程时间，都以固定的频率执行
        /*scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务:"+new Date());
            }
        },1,3, TimeUnit.SECONDS);*/


        //schedule只会执行一次
        /*scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务:"+new Date());
            }
        },1,TimeUnit.SECONDS);*/


        //scheduleWithFixedDelay：以上次任务的结束时间作为下一次任务的开始时间
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行任务："+new Date());
            }
        },1,3,TimeUnit.SECONDS);
    }
}
