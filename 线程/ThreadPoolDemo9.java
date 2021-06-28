package thread;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadPoolDemo9 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(10,10,60, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(10));
       // 执行方式一：execute
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行了execute方法");
            }
        });
        //执行方式二：submit
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行了submit方法，使用的是Runnable对象");
            }
        });
        //执行一个带返回值的任务
        Future<Integer> future=threadPoolExecutor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int num=new Random().nextInt(10);
                System.out.println("执行submit方法，随机数：" + num);
                return num;
            }
        });

    }
}
