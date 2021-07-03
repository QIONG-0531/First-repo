import java.util.HashSet;

public class Demo11 {
    public boolean isHappy(int n) {
        n=getNext(n);
        HashSet<Integer> set=new HashSet<>();
        while(n!=1  && !set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    public int getNext(int n){
        int ret=0;
        while(n!=0){
            ret+=(n%10)*(n%10);
            n=n/10;
        }
        return ret;
    }
}
