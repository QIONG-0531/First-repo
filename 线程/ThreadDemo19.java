package thread;

public class ThreadDemo19 {
    //懒汉模式
    static class Singleton{
        //1.将构造函数设置为私有的
        private Singleton(){
        }
        //2.设置一个静态的类变量，为第三部返回使用
        private static volatile Singleton singleton=null;
        //3.为外部提供获取单例的方法
        private static Singleton getInstance(){
            if(singleton==null){
                synchronized (Singleton.class){
                    if(singleton==null){
                        singleton=new Singleton();
                    }
                }
            }
            return singleton;
        }
    }
     static Singleton s1=null;
     static Singleton s2=null;
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
