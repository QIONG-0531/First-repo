package thread;

public class ThreadDemo9 {
    public static void main1(String[] args) {
        for(Thread.State state:Thread.State.values()){
            System.out.println(state);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("执行之前："+t1.getState());
        t1.start();
        System.out.println("启动之后："+t1.getState());
        Thread.sleep(100);
        System.out.println("休眠100毫秒之后："+t1.getState());
        t1.join();
        System.out.println("最终状态："+t1.getState());
    }
}
