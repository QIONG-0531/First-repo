package thread;

public class ThreadDemo22 {
    private static int count = 0;
    private static final int MAXSIZE = 100000;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAXSIZE; i++) {
                    count++;
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < MAXSIZE; i++) {
                    count--;
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
