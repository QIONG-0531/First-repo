public class Test18 {
    //机器人走方格
    public int countWays(int x, int y) {
        if(x<1 || y<1) return 0;
        if(x==1 || y==1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }
    public int countWays2(int x, int y) {
        int[][]dp=new int[x][y];
        dp[0][0]=1;
        for(int i=0;i<x;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<y;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[x-1][y-1];
    }
}
