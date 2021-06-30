public class Demo7 {
    public static void main(String[] args) {
        int n=13;
        System.out.println(trailingZeroes(n));
    }
    public static int trailingZeroes(int n) {
        int ret=mul(n);
        System.out.println(ret);
        int count=0;
        while(ret%5==0){
            count++;
            ret/=5;
        }
        return count;
    }
    public  static int mul(int n){
        if(n==1){
            return 1;
        }
        return n*mul(n-1);
    }
}
