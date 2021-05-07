import java.util.ArrayList;
import java.util.Scanner;

public class Test27 {
        public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                int n=in.nextInt();
                int count=0;
                for(int i=1;i<=n;i++){
                    if(flag(i)){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        public static boolean flag(int n){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=1;i<n;i++){
                if(n%i==0){
                    list.add(i);
                }
            }
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            if(sum==n) return true;
            return false;
        }
}
