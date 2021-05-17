public class Test47 {
    public int jumpFloorII(int target) {
        int[]dp=new int[target+1];
        dp[1]=1;
        for(int i=2;i<=target;i++){
            for(int j=1;j<i;j++){
                dp[i]+=dp[j];
            }
            dp[i]=dp[i]+1;
        }
        return dp[target];
    }
}
