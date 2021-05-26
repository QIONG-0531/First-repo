package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDemo18 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            final int finalI=i;
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    Date date=new Date(finalI*1000);
                    myFormatTime(date);
                }
            });
            t1.start();
        }
    }
    /**
     * 时间格式化方法
     * date待格式化的时间
     */
    private static void myFormatTime(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
        String result=simpleDateFormat.format(date);
        System.out.println(Thread.currentThread().getName()+
                "格式化时间："+result);
    }
}
