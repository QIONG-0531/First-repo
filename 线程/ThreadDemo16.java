package thread;

public class ThreadDemo16 {
    public static void main(String[] args) {
        Object lock1=new Object();
        Object lock2=new Object();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                String name=Thread.currentThread().getName();
                synchronized (lock1){
                    System.out.println(name+"get lock1");
                    //休眠一秒，为了让t2先得到lock2
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+"wait lock2");
                    synchronized (lock2){
                        System.out.println(name+"get lock2");
                    }
                }
            }
        },"t1");

        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                String name=Thread.currentThread().getName();
                synchronized (lock2){
                    System.out.println(name+"get lock2");
                    //休眠一秒，为了让t1先得到lock1
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+"wait lock1");
                    synchronized (lock1){
                        System.out.println(name+"get lock1");
                    }
                }
            }
        },"t2");
        t2.start();
    }
}
