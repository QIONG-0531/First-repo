public class Demo12 {
    public int countPrimes(int n) {
        //设置一个标记数组，默认值为0，即都为质数
        int[]isPrime=new int[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]==0){ //是质数
                count++;
                //开始标记合数，从i*i开始
                if((long)i*i<n){
                    for(int j=i*i;j<n;j+=i){
                        isPrime[j]=1;
                    }
                }
            }
        }
        return count;
    }

}
