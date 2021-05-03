package thread;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程："+
                        Thread.currentThread().getName());
            }
        });
        System.out.println("守护线程："+thread.isDaemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("守护线程："+thread.isDaemon());
    }

}
