import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int num=random.nextInt(100);
        while(true){
            int guess=scanner.nextInt();
            if(guess>num){
                System.out.println("猜大了");
            }
            else if(guess<num){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜对了");
                break;
            }

        }
    }
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int age=scanner.nextInt();//输入时不能先输入数字，再输入字符串
        System.out.println(name+age);
    }
}
