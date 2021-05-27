package thread;

import java.util.concurrent.atomic.AtomicReference;

public class ThreadDemo24 {
    //演示ABA问题
    private static AtomicReference money=new AtomicReference(1000);
    public static void main(String[] args) throws InterruptedException {
        //转账100
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(1000,0);
                System.out.println("线程1执行转账"+result);
            }
        });
        t1.start();
        t1.join();
        //账户增加了100
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(0,1000);
                System.out.println("线程3转入100元"+result);
            }
        });
        t3.start();
        t3.join();
        //转账100元
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(1000,0);
                System.out.println("线程2执行转账"+result);
            }
        });
        t2.start();
        t2.join();
    }
}
