package thread;

public class TestDemo11 {
    private static volatile int number = 0;
    // 循环的最大次数
    private static final int maxSize = 100000;

    public static void main(String[] args) throws InterruptedException {

        // ++
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    number++;
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxSize; i++) {
                    number--;
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
