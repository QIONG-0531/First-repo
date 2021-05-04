package thread;

public class ThreadDemo12 {
    // 全局变量
    private static int number = 0;
    // 循环的最大次数
    private static final int maxSize = 100000;

    public static void main(String[] args) throws InterruptedException {
        // 声明锁对象
        Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    // 实现加锁
                    synchronized (lock) {
                        // 代码1
                        number++;
                    }
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    synchronized (lock) {
                        number--;
                    }
                }
            }
        });
        t2.start();

        // 等待两个线程执行完成
        t1.join();
        t2.join();

        System.out.println("最终执行结果：" + number);
    }

}
