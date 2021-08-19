public class Demo66 {
    public static void main(String[] args) {
        Object lockA=new Object();
        Object lockB=new Object();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA){
                    try {
                        Thread.sleep(100);
                        System.out.println("获取到了lockA");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lockB){
                        System.out.println("获取到了lockB");
                    }

                }

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB){
                    try {
                        Thread.sleep(100);
                        System.out.println("获取到了lockB");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lockA){
                        System.out.println("获取到了lockA");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
