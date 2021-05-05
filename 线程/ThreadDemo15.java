package thread;

public class ThreadDemo15 {
    public static void main(String[] args) throws InterruptedException {
        char[] chars = {'A', 'B', 'C'};
        for(int i=0;i<10;i++) {
            Thread[] threads = new Thread[3];
            for (int j = 0; j < 3; j++) {
                final int n = j;
                threads[j] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.print(chars[n]);
                    }
                });
            }
            for (Thread thread : threads) {
                thread.start();
            }
            for (Thread thread : threads) {
                thread.join();
            }
            System.out.println();
        }
    }
}
