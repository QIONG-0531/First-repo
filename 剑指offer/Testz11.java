public class Testz11 {
    //输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    public int NumberOf1(int n) {
//         int count=0;
//      while(n!=0){
//          count++;
//          n=n&(n-1);//求整数二进制中1的个数
//      }
//         return count;


        int count=0;
        int flag=1;
        while(flag!=0){
            if((n&flag)!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }
}
