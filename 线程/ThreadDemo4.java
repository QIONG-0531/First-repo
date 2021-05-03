package thread;

public class ThreadDemo4 {
    private static final char[]chars={'A','B','C','D'};
    public static void main(String[] args) throws InterruptedException {
        for(char ch:chars){
            Thread t1=new Thread(()-> System.out.print(ch));
            Thread t2=new Thread(()-> System.out.print(ch));
            t1.start();
            Thread.sleep(1000);
            t2.start();
            Thread.sleep(1000);
        }
    }
}
