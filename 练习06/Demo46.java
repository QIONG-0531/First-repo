import java.util.Scanner;

public class Demo46 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int n=0;
            for(int i=0;i<str.length();i++){
                n+=str.charAt(i)-'0';
            }
            int ret=root(n);
            System.out.println(String.valueOf(ret));
        }
    }
    public static int root(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        if(sum/10==0) return sum;
        return root(sum);
    }
}
