import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo40 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ThreadPoolExecutor threadPoolExecutor=
                new ThreadPoolExecutor(10,10,1,
                        TimeUnit.MINUTES,new LinkedBlockingQueue<>(1000));
        for(int i=0;i<10;i++){
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    String dateString=simpleDateFormat.format(new Date());
                    try {
                        Date parseDate=simpleDateFormat.parse(dateString);
                        String dateString2=simpleDateFormat.format(parseDate);
                        System.out.println(dateString.equals(dateString2));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        String
    }
}
