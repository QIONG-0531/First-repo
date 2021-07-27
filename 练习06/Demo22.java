public class Demo22 {
    public int addDigits(int num) {
        int n=sum(num);
        while(n/10>0){
            n=sum(n);
        }
        return n;
    }
    public int sum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
