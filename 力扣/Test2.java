public class Test2 {
    public int reverse(int x) {
        int ret=0;
        while(x!=0){
            int tmp=ret;
            ret=ret*10+x%10;
            x=x/10;
            if(ret/10!=tmp) return 0;
        }
        return ret;
    }
}
