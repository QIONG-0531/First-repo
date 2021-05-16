import java.util.Scanner;

public class Test44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n=in.nextInt();
            int[]num=new int[n];
            for(int i=0;i<n;i++){
                num[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                StringBuffer sb=new StringBuffer();
                sb.append(Fib(num[i]));
                while(sb.length()<4){
                        sb.insert(0,0);
                }
                System.out.print(sb);
                }
            System.out.println();
            }
        }
    public static int Fib(int n){
        if(n==0 || n==1) return 1;
        int f0=1;
        int f1=1;
        int f2=0;
        for(int i=2;i<=n;i++){
            f2=(f0+f1)%10000;
            f0=f1;
            f1=f2;
        }
        return f2;
    }
}
