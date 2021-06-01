public class LTest70 {
    public int climbStairs(int n) {
        int f1=1;
        int f2=2;
        int f3=0;
        if(n==1) return 1;
        if(n==2) return 2;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f2;
    }
}
