package thread;

public class ThreadLocalDemo9 {
    private static ThreadLocal  threadLocal=new InheritableThreadLocal();
    public static void main(String[] args) {
        threadLocal.set("java");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(threadLocal.get());
            }
        });
        t1.start();
    }
}
