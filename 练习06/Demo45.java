import java.util.Scanner;

public class Demo45 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                StringBuilder sb=new StringBuilder();
                sb.append(code(arr[i]));
                while(sb.length()<4){
                    sb.insert(0,0);
                }
                System.out.print(sb.toString());
            }
            System.out.println();
        }
    }
    public static int code(int num){
        int f0=1;
        int f1=1;
        int f2=0;
        if(num==0 || num==1) return 1;
        for(int i=2;i<=num;i++){
            f2=(f0+f1)%10000;
            f0=f1;
            f1=f2;

        }
        return f2;
    }
}
