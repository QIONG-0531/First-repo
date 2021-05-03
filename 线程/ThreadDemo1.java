package thread;

public class ThreadDemo1 {
     static long count=10_0000_0000;

    public static void main(String[] args) throws InterruptedException {
        //多线程
        concurrency();
        //单线程
        serial();
    }

    private static void serial() {
        long stime=System.currentTimeMillis();
        int a=0;
        for(int i=0;i<count;i++){
            a++;
        }
        int b=0;
        for(int i=0;i<count;i++){
            b++;
        }
        int c=0;
        for(int i=0;i<count;i++){
            c++;
        }
        long etime=System.currentTimeMillis();
        System.out.println("单线程执行时间："+(etime-stime));
    }

    private static void concurrency() throws InterruptedException {
        long stime=System.currentTimeMillis();
        int a=0;
        for(int i=0;i<count;i++){
            a++;
        }
        //创建线程
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int b=0;
                for(int i=0;i<count;i++){
                    b++;
                }
            }
        });
        t1.start();//执行线程
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                int c=0;
                for(int i=0;i<count;i++){
                    c++;
                }
            }
        });
        t2.start();
        t1.join();//要等待两个子线程都执行完
        t2.join();
        long etime=System.currentTimeMillis();
        System.out.println("多线程执行时间："+(etime-stime));

    }
}
