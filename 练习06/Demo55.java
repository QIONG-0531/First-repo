import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo55 {
    public static int solve (int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isHighNum(i)){
                count++;
            }
        }
        return count;

    }
    public static boolean isHighNum(int n){
        List<Integer> list=new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n=n/10;
        }
        Collections.reverse(list);
        int[] a=new int[list.size()+1];
        for(int i=0;i<list.size();i++){
            a[i+1]=list.get(i);
        }
        int mid=(1+list.size())/2;
        for(int i=1;i<mid;i++){
            if(a[i]>=a[i+1]){
                return false;
            }
        }
        for(int i=mid;i<a.length-1;i++){
            if(a[i]<=a[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n=99;
        System.out.println(solve(n));
    }
}
