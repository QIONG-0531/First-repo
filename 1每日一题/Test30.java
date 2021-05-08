import java.util.Scanner;

public class Test30 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int monthCount = in.nextInt();
                System.out.println(getTotalCount(monthCount));
            }
            in.close();
        }

        public static int getTotalCount(int monthCount){
            if(monthCount==1 || monthCount==2){
                return 1;
            }
           // 第n个月的总兔子数 = 第n-1个月的总兔子数 + 第n-2个月的总兔子数

            //因为第n-1个月的兔子不会再生，但这部分兔子也是第n个月的兔子中的一部分

           // 而第n-2个月的所有兔子，各自都会再产生一只兔子，所以这是第n个月兔子中的另一部分
            return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
        }
    }

