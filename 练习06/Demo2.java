import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner in=new Scanner(System.in);
        int toGuess=random.nextInt(100);
        while(true){
            System.out.println("请输入猜测的数字：");
            int num=in.nextInt();
            if(num<toGuess){
                System.out.println("猜小了");
            }else if(num>toGuess){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        in.close();
    }
}
