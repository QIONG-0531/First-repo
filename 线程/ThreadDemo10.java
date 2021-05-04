package thread;

public class ThreadDemo10 {
    private static int count=0;
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100000 ; i++) {
                    count++;
                }
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    count--;
                }
            }
        });
        t2.start();
        System.out.println(count);
    }
    public static void main1(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    Thread.yield();
                    System.out.println("我是线程1");
                }
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是线程2");
                }
            }
        });
        t2.start();
    }
}
