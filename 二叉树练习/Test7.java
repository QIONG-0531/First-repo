import java.util.Scanner;

public class Test7 {
    //输出一个最小的步数变为Fibonacci数
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int f0=0;
        int f1=1;
        int f2=0;
        while(f1<n){
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        if(Math.abs(f0-n)>Math.abs(f1-n)){
            System.out.println(Math.abs(f1-n));
        }
        else{
            System.out.println(Math.abs(f0-n));
        }


    }
}
