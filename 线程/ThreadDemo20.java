package thread;

public class ThreadDemo20 {
    //饿汉方式
    static class Singleton{
        private Singleton(){

        }
        private static Singleton singleton=new Singleton();
        public static Singleton getInstance(){
            return singleton;
        }
    }
    static Singleton s1= null;
    static Singleton s2= null;

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                s1=Singleton.getInstance();
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                s2=Singleton.getInstance();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(s1==s2);
    }
}
