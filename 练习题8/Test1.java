import java.util.List;

public class Test1 {
    //求解汉诺塔问题(提示, 使用递归)
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanotaChild(A.size(),A,B,C);
    }
    public void hanotaChild(int count,List<Integer>A,List<Integer>B,List<Integer>C){
        if(count==1){
            C.add(A.remove(A.size()-1));
            return;
        }
        hanotaChild(count-1,A,C,B);
        hanotaChild(1,A,B,C);
        hanotaChild(count-1,B,A,C);

    }
    //青蛙跳台阶问题
    public int numWays(int n) {
        if(n==0 || n==1) return 1;
        int a=1;
        int b=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum%1000000007;
        }
        return b;

    }
}
