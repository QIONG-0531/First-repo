package thread;

public class ThreadLocalDemo1 {
    //创建ThreadLocal
    private static ThreadLocal<String> threadLocal=new ThreadLocal<>();

    public static void main(String[] args) {
        //定义公共任务
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                //得到线程名称
                String tname=Thread.currentThread().getName();
                System.out.println(tname+"设置值:"+tname);
                try {
                    //set ThreadLocal
                    threadLocal.set(tname);
                    //执行ThreadLocal打印
                    printThreadLocal();
                }finally {
                    //移除ThreadLocal
                    threadLocal.remove();
                }
            }
        };
        Thread t1=new Thread(runnable,"线程1");
        t1.start();
        Thread t2=new Thread(runnable,"线程2");
        t2.start();

    }
    private static void printThreadLocal() {
      //从ThreadLocal中获取值
        String result=threadLocal.get();
        System.out.println(Thread.currentThread().getName()+"中取值："+result);
    }
}
