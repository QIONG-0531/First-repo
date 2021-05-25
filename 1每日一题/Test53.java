import java.util.Scanner;

public class Test53 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            if(n==0) return;
            System.out.println(num(n));
        }
    }
    public static int num(int n){
        int count=0;
        while(n!=1){
            if(n%3==0){
                n=n/3;
            }else{
                n=n/3+1;
            }
            count++;
        }
        return count;
    }
}
