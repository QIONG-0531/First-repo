import java.util.Scanner;
    public class  Test17 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            int f0=0;
            int f1=1;
            int f2=0;
            while(f2<n){
                f2=f0+f1;
                f0=f1;
                f1=f2;
            }
            int min=Math.min(n-f0,f1-n);
            System.out.print(min);
        }
    }
