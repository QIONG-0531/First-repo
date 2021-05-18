package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //创建一个异步根据当前CPU生产的线程池
        ExecutorService service= Executors.newWorkStealingPool();
        for(int i=0;i<10;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名："+Thread.currentThread().getName());
                }
            });
        }
        //等待线程池执行完成
        while (!service.isTerminated()){
        }
    }
}
