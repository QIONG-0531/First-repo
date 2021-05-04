package thread;

public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                // System.out.println(Thread.interrupted());
                System.out.println(Thread.currentThread().isInterrupted());
            }
        });
        thread.start();
        thread.interrupt();
        //thread.join();

    }
}
