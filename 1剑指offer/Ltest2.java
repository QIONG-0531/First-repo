import java.util.ArrayList;

public class Ltest2 {
    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int maxlen=1;
        int begin=0;
        int len=s.length();
        boolean[][]dp=new boolean[len][len];
        //初始化所有长度为1的都是回文串
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        //根据长度开始循环
        for(int l=2;l<=len;l++){
            //根据起始位置开始循环
            for(int i=0;i<len;i++){
                //可以得到终止位置
                int j=l+i-1;
                if(j>=len){
                    break;
                }else{
                    if(s.charAt(i)!=s.charAt(j)){
                        dp[i][j]=false;
                    }else{
                        if(j-i<2){
                            dp[i][j]=true;
                        }else{
                            dp[i][j]=dp[i+1][j-1];
                        }
                    }
                }
                if(dp[i][j] && (j-i+1)>maxlen){
                    maxlen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxlen);
    }
    public static void main(String[] args) {
        String str="ac";
        System.out.println(longestPalindrome(str));
    }
}
