package thread;

public class ThreadDemo27 {
    private static Object object=new Object();
    public static void main(String[] args) {
        synchronized (object){
            System.out.println("进入了方法");
            synchronized (object){
                System.out.println("重复进入了方法");
            }
        }
    }
}
