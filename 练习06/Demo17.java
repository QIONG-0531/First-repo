public class Demo17 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        for(int i=n;i>1;i=i/2){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
}
