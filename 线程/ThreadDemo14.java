package thread;

public class ThreadDemo14 {
    public static void main1(String[] args) throws InterruptedException {
        Thread[]threads=new Thread[20];
        for(int i=0;i<20;i++){
           final int n=i;
            threads[i]=new Thread(new Runnable() {//内部类使用外部变量，必须用final修饰
                @Override
                public void run() {
                    System.out.println(n);
                }
            });
        }
        for(Thread thread:threads){
            thread.start();
        }
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("ok");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        System.out.println("2");
    }
}
