package thread;

public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前执行的线程："+Thread.currentThread().getName());
            }
        });
       t1.start();
    }
}
